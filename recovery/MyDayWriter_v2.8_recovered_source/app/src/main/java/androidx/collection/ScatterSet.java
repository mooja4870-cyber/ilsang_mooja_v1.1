package androidx.collection;

/* JADX INFO: compiled from: ScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001<B\u0007\b\u0004¢\u0006\u0002\u0010\u0003J:\u0010\u0013\u001a\u00020\u00142!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00140\u0016H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010\u001a\u001a\u00020\u0014J:\u0010\u001a\u001a\u00020\u00142!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00140\u0016H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cJ\u0016\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u0005H\u0007J:\u0010\u001f\u001a\u00020\u00052!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00140\u0016H\u0087\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0013\u0010 \u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0018\u0010\"\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b#\u0010$J\u000e\u0010%\u001a\u00028\u0000H\u0086\b¢\u0006\u0002\u0010&J?\u0010%\u001a\u00028\u00002!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00140\u0016H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010'JA\u0010(\u001a\u0004\u0018\u00018\u00002!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00140\u0016H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010'J:\u0010)\u001a\u00020*2!\u0010+\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020*0\u0016H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010,\u001a\u00020*2!\u0010+\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020*0\u0016H\u0081\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\b\u0010.\u001a\u00020\u0005H\u0016J\u0006\u0010/\u001a\u00020\u0014J\u0006\u00100\u001a\u00020\u0014JR\u00101\u001a\u0002022\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002042\b\b\u0002\u00106\u001a\u0002042\b\b\u0002\u00107\u001a\u00020\u00052\b\b\u0002\u00108\u001a\u0002042\u0016\b\u0002\u00109\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u000204\u0018\u00010\u0016H\u0007J\u0006\u0010:\u001a\u00020\u0014J\b\u0010;\u001a\u000202H\u0016R\u0012\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\n\n\u0002\u0010\r\u0012\u0004\b\f\u0010\u0003R\u0018\u0010\u000e\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0003R\u0011\u0010\u0011\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\t\u0082\u0001\u0001=\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006>"}, d2 = {"Landroidx/collection/ScatterSet;", "E", "", "()V", "_capacity", "", "_size", "capacity", "getCapacity", "()I", "elements", "", "getElements$annotations", "[Ljava/lang/Object;", "metadata", "", "getMetadata$annotations", "size", "getSize", "all", "", "predicate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "element", "any", "asSet", "", "contains", "(Ljava/lang/Object;)Z", "count", "equals", "other", "findElementIndex", "findElementIndex$collection", "(Ljava/lang/Object;)I", "first", "()Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstOrNull", "forEach", "", "block", "forEachIndex", "index", "hashCode", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "none", "toString", "SetWrapper", "Landroidx/collection/MutableScatterSet;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ScatterSet<E> {
    public int _capacity;
    public int _size;
    public java.lang.Object[] elements;
    public long[] metadata;

    /* JADX INFO: compiled from: ScatterSet.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0090\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/collection/ScatterSet$SetWrapper;", "", "(Landroidx/collection/ScatterSet;)V", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "", "isEmpty", "iterator", "", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public class SetWrapper implements java.util.Set<E>, kotlin.jvm.internal.markers.KMappedMarker {
        final /* synthetic */ androidx.collection.ScatterSet<E> this$0;

        public SetWrapper(androidx.collection.ScatterSet r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(E r3) {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(java.util.Collection<? extends E> r3) {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                androidx.collection.ScatterSet<E> r0 = r1.this$0
                boolean r0 = r0.contains(r2)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(java.util.Collection<? extends java.lang.Object> r9) {
                r8 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                r0 = r9
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                androidx.collection.ScatterSet<E> r1 = r8.this$0
                r2 = 0
                java.util.Iterator r3 = r0.iterator()
            Lf:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L26
                java.lang.Object r4 = r3.next()
                r5 = r4
                r6 = 0
                boolean r7 = r1.contains(r5)
                if (r7 != 0) goto L23
                r1 = 0
                return r1
            L23:
                goto Lf
            L26:
                r0 = 1
                return r0
        }

        public int getSize() {
                r1 = this;
                androidx.collection.ScatterSet<E> r0 = r1.this$0
                int r0 = r0._size
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                androidx.collection.ScatterSet<E> r0 = r1.this$0
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<E> iterator() {
                r3 = this;
                androidx.collection.ScatterSet$SetWrapper$iterator$1 r0 = new androidx.collection.ScatterSet$SetWrapper$iterator$1
                androidx.collection.ScatterSet<E> r1 = r3.this$0
                r2 = 0
                r0.<init>(r1, r2)
                kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
                java.util.Iterator r0 = kotlin.sequences.SequencesKt.iterator(r0)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(java.lang.Object r3) {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(java.util.Collection<? extends java.lang.Object> r3) {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(java.util.Collection<? extends java.lang.Object> r3) {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Set, java.util.Collection
        public final /* bridge */ int size() {
                r1 = this;
                int r0 = r1.getSize()
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public java.lang.Object[] toArray() {
                r1 = this;
                r0 = r1
                java.util.Collection r0 = (java.util.Collection) r0
                java.lang.Object[] r0 = kotlin.jvm.internal.CollectionToArray.toArray(r0)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] r2) {
                r1 = this;
                java.lang.String r0 = "array"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = r1
                java.util.Collection r0 = (java.util.Collection) r0
                java.lang.Object[] r0 = kotlin.jvm.internal.CollectionToArray.toArray(r0, r2)
                return r0
        }
    }


    private ScatterSet() {
            r1 = this;
            r1.<init>()
            long[] r0 = androidx.collection.ScatterMapKt.EmptyGroup
            r1.metadata = r0
            java.lang.Object[] r0 = androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS
            r1.elements = r0
            return
    }

    public /* synthetic */ ScatterSet(kotlin.jvm.internal.DefaultConstructorMarker r1) {
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

    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.ScatterSet r1, java.lang.CharSequence r2, java.lang.CharSequence r3, java.lang.CharSequence r4, int r5, java.lang.CharSequence r6, kotlin.jvm.functions.Function1 r7, int r8, java.lang.Object r9) {
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

    public final boolean all(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r24) {
            r23 = this;
            r0 = r24
            java.lang.String r1 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            r2 = r23
            r3 = 0
            java.lang.Object[] r4 = r2.elements
            r5 = r2
            r6 = 0
            long[] r7 = r5.metadata
            int r8 = r7.length
            int r8 = r8 + (-2)
            r9 = 0
            if (r9 > r8) goto L7f
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
            if (r10 == 0) goto L7a
            int r10 = r9 - r8
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L3b:
            if (r12 >= r10) goto L76
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
            if (r13 == 0) goto L6d
            int r13 = r9 << 3
            int r13 = r13 + r12
            r14 = r13
            r15 = 0
            r19 = r11
            r11 = r4[r14]
            r21 = 0
            java.lang.Object r22 = r0.invoke(r11)
            java.lang.Boolean r22 = (java.lang.Boolean) r22
            boolean r22 = r22.booleanValue()
            if (r22 != 0) goto L69
            return r20
        L69:
            goto L6f
        L6d:
            r19 = r11
        L6f:
            long r17 = r17 >> r19
            int r12 = r12 + 1
            r11 = r19
            goto L3b
        L76:
            r19 = r11
            if (r10 != r11) goto L82
        L7a:
            if (r9 == r8) goto L81
            int r9 = r9 + 1
            goto L1a
        L7f:
            r16 = 1
        L81:
        L82:
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

    public final boolean any(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r24) {
            r23 = this;
            r0 = r24
            java.lang.String r1 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            r2 = r23
            r3 = 0
            java.lang.Object[] r4 = r2.elements
            r5 = r2
            r6 = 0
            long[] r7 = r5.metadata
            int r8 = r7.length
            int r8 = r8 + (-2)
            r9 = 0
            if (r9 > r8) goto L7f
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
            if (r10 == 0) goto L7a
            int r10 = r9 - r8
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L3b:
            if (r12 >= r10) goto L76
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
            if (r13 == 0) goto L6d
            int r13 = r9 << 3
            int r13 = r13 + r12
            r14 = r13
            r15 = 0
            r19 = r11
            r11 = r4[r14]
            r21 = 0
            java.lang.Object r22 = r0.invoke(r11)
            java.lang.Boolean r22 = (java.lang.Boolean) r22
            boolean r22 = r22.booleanValue()
            if (r22 == 0) goto L69
            return r20
        L69:
            goto L6f
        L6d:
            r19 = r11
        L6f:
            long r17 = r17 >> r19
            int r12 = r12 + 1
            r11 = r19
            goto L3b
        L76:
            r19 = r11
            if (r10 != r11) goto L82
        L7a:
            if (r9 == r8) goto L81
            int r9 = r9 + 1
            goto L1a
        L7f:
            r16 = 0
        L81:
        L82:
            return r16
    }

    public final java.util.Set<E> asSet() {
            r1 = this;
            androidx.collection.ScatterSet$SetWrapper r0 = new androidx.collection.ScatterSet$SetWrapper
            r0.<init>(r1)
            java.util.Set r0 = (java.util.Set) r0
            return r0
    }

    public final boolean contains(E r25) {
            r24 = this;
            r0 = r25
            r1 = r24
            r2 = 0
            r3 = 0
            if (r0 == 0) goto Ld
            int r5 = r0.hashCode()
            goto Le
        Ld:
            r5 = 0
        Le:
            r6 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r5 = r5 * r6
            int r6 = r5 << 16
            r3 = r5 ^ r6
            r5 = 0
            r5 = r3 & 127(0x7f, float:1.78E-43)
            int r6 = r1._capacity
            r7 = 0
            int r7 = r3 >>> 7
            r7 = r7 & r6
            r8 = 0
        L22:
            long[] r9 = r1.metadata
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
            r18 = r5
            long r4 = (long) r12
            long r4 = -r4
            r19 = 63
            long r4 = r4 >> r19
            long r4 = r4 & r15
            long r4 = r4 | r13
            r9 = r4
            r11 = 0
            r12 = r18
            long r13 = (long) r12
            r15 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r13 = r13 * r15
            long r13 = r13 ^ r9
            long r15 = r13 - r15
            r18 = r2
            r19 = r3
            long r2 = ~r13
            long r2 = r2 & r15
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r15
        L5d:
            r9 = r2
            r11 = 0
            r13 = 0
            int r20 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            r21 = 1
            if (r20 == 0) goto L6a
            r9 = r21
            goto L6b
        L6a:
            r9 = 0
        L6b:
            if (r9 == 0) goto L91
            r9 = r2
            r11 = 0
            r13 = r9
            r20 = 0
            int r22 = java.lang.Long.numberOfTrailingZeros(r13)
            int r13 = r22 >> 3
            int r13 = r13 + r7
            r9 = r13 & r6
            java.lang.Object[] r10 = r1.elements
            r10 = r10[r9]
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r0)
            if (r10 == 0) goto L87
            goto La3
        L87:
            r10 = r2
            r13 = 0
            r20 = 1
            long r20 = r10 - r20
            long r10 = r10 & r20
            r2 = r10
            goto L5d
        L91:
            r9 = r4
            r11 = 0
            r22 = r13
            long r13 = ~r9
            r20 = 6
            long r13 = r13 << r20
            long r13 = r13 & r9
            long r9 = r13 & r15
            int r9 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
            if (r9 == 0) goto Laa
        La2:
            r9 = -1
        La3:
            if (r9 < 0) goto La8
            r4 = r21
            goto La9
        La8:
            r4 = 0
        La9:
            return r4
        Laa:
            int r8 = r8 + 8
            int r9 = r7 + r8
            r7 = r9 & r6
            r5 = r12
            r2 = r18
            r3 = r19
            goto L22
    }

    public final int count() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }

    public final int count(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r23) {
            r22 = this;
            r0 = r23
            java.lang.String r1 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            r2 = 0
            r3 = r22
            r4 = 0
            java.lang.Object[] r5 = r3.elements
            r6 = r3
            r7 = 0
            long[] r8 = r6.metadata
            int r9 = r8.length
            int r9 = r9 + (-2)
            r10 = 0
            if (r10 > r9) goto L89
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
            if (r1 == 0) goto L80
            int r1 = r10 - r9
            int r1 = ~r1
            int r1 = r1 >>> 31
            r2 = 8
            int r1 = 8 - r1
            r13 = 0
        L3e:
            if (r13 >= r1) goto L79
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
            if (r19 == 0) goto L70
            int r14 = r10 << 3
            int r14 = r14 + r13
            r15 = r14
            r18 = 0
            r19 = r2
            r2 = r5[r15]
            r20 = 0
            java.lang.Object r21 = r0.invoke(r2)
            java.lang.Boolean r21 = (java.lang.Boolean) r21
            boolean r21 = r21.booleanValue()
            if (r21 == 0) goto L6c
            int r17 = r17 + 1
        L6c:
            goto L72
        L70:
            r19 = r2
        L72:
            long r11 = r11 >> r19
            int r13 = r13 + 1
            r2 = r19
            goto L3e
        L79:
            r19 = r2
            if (r1 != r2) goto L8d
            r2 = r17
            goto L82
        L80:
            r2 = r17
        L82:
            if (r10 == r9) goto L8b
            int r10 = r10 + 1
            r1 = r16
            goto L1b
        L89:
            r16 = r1
        L8b:
            r17 = r2
        L8d:
            return r17
    }

    public boolean equals(java.lang.Object r24) {
            r23 = this;
            r0 = r24
            r1 = 1
            r2 = r23
            if (r0 != r2) goto L8
            return r1
        L8:
            boolean r3 = r0 instanceof androidx.collection.ScatterSet
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            r3 = r0
            androidx.collection.ScatterSet r3 = (androidx.collection.ScatterSet) r3
            int r3 = r3.getSize()
            int r5 = r2.getSize()
            if (r3 == r5) goto L1c
            return r4
        L1c:
            r3 = r0
            androidx.collection.ScatterSet r3 = (androidx.collection.ScatterSet) r3
            r5 = r23
            r6 = 0
            java.lang.Object[] r7 = r5.elements
            r8 = r5
            r9 = 0
            long[] r10 = r8.metadata
            int r11 = r10.length
            int r11 = r11 + (-2)
            r12 = 0
            if (r12 > r11) goto L9d
        L30:
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
            if (r1 == 0) goto L8e
            int r1 = r12 - r11
            int r1 = ~r1
            int r1 = r1 >>> 31
            r2 = 8
            int r1 = 8 - r1
            r4 = 0
        L56:
            if (r4 >= r1) goto L89
            r19 = 255(0xff, double:1.26E-321)
            long r19 = r13 & r19
            r5 = 0
            r21 = 128(0x80, double:6.3E-322)
            int r17 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r17 >= 0) goto L66
            r5 = r18
            goto L67
        L66:
            r5 = r15
        L67:
            if (r5 == 0) goto L81
            int r5 = r12 << 3
            int r5 = r5 + r4
            r17 = r5
            r19 = 0
            r20 = r15
            r15 = r7[r17]
            r21 = 0
            boolean r22 = r3.contains(r15)
            if (r22 != 0) goto L7d
            return r20
        L7d:
            goto L83
        L81:
            r20 = r15
        L83:
            long r13 = r13 >> r2
            int r4 = r4 + 1
            r15 = r20
            goto L56
        L89:
            r20 = r15
            if (r1 != r2) goto La2
            goto L90
        L8e:
            r20 = r15
        L90:
            if (r12 == r11) goto La1
            int r12 = r12 + 1
            r2 = r23
            r5 = r16
            r1 = r18
            r4 = r20
            goto L30
        L9d:
            r18 = r1
            r16 = r5
        La1:
        La2:
            return r18
    }

    public final int findElementIndex$collection(E r24) {
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = 0
            r3 = 0
            if (r1 == 0) goto Ld
            int r5 = r1.hashCode()
            goto Le
        Ld:
            r5 = 0
        Le:
            r6 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r5 = r5 * r6
            int r6 = r5 << 16
            r3 = r5 ^ r6
            r5 = 0
            r5 = r3 & 127(0x7f, float:1.78E-43)
            int r6 = r0._capacity
            r7 = 0
            int r7 = r3 >>> 7
            r7 = r7 & r6
            r8 = 0
        L22:
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
            r18 = r5
            long r4 = (long) r12
            long r4 = -r4
            r19 = 63
            long r4 = r4 >> r19
            long r4 = r4 & r15
            long r4 = r4 | r13
            r9 = r4
            r11 = 0
            r12 = r18
            long r13 = (long) r12
            r15 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r13 = r13 * r15
            long r13 = r13 ^ r9
            long r15 = r13 - r15
            r18 = r2
            r19 = r3
            long r2 = ~r13
            long r2 = r2 & r15
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r15
        L5d:
            r9 = r2
            r11 = 0
            r13 = 0
            int r20 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r20 == 0) goto L68
            r20 = 1
            goto L6a
        L68:
            r20 = 0
        L6a:
            if (r20 == 0) goto L90
            r9 = r2
            r11 = 0
            r13 = r9
            r20 = 0
            int r21 = java.lang.Long.numberOfTrailingZeros(r13)
            int r13 = r21 >> 3
            int r13 = r13 + r7
            r9 = r13 & r6
            java.lang.Object[] r10 = r0.elements
            r10 = r10[r9]
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r1)
            if (r10 == 0) goto L86
            return r9
        L86:
            r10 = r2
            r13 = 0
            r20 = 1
            long r20 = r10 - r20
            long r10 = r10 & r20
            r2 = r10
            goto L5d
        L90:
            r9 = r4
            r11 = 0
            r20 = r13
            long r13 = ~r9
            r22 = 6
            long r13 = r13 << r22
            long r13 = r13 & r9
            long r9 = r13 & r15
            int r9 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r9 == 0) goto La3
        La1:
            r2 = -1
            return r2
        La3:
            int r8 = r8 + 8
            int r9 = r7 + r8
            r7 = r9 & r6
            r5 = r12
            r2 = r18
            r3 = r19
            goto L22
    }

    public final E first() {
            r19 = this;
            r0 = 0
            r1 = r19
            r2 = 0
            java.lang.Object[] r3 = r1.elements
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
            java.lang.String r2 = "The ScatterSet is empty"
            r1.<init>(r2)
            throw r1
    }

    public final E first(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r22) {
            r21 = this;
            r0 = r22
            java.lang.String r1 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            r2 = r21
            r3 = 0
            java.lang.Object[] r4 = r2.elements
            r5 = r2
            r6 = 0
            long[] r7 = r5.metadata
            int r8 = r7.length
            int r8 = r8 + (-2)
            r9 = 0
            if (r9 > r8) goto L81
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
            if (r1 == 0) goto L79
            int r1 = r9 - r8
            int r1 = ~r1
            int r1 = r1 >>> 31
            r2 = 8
            int r1 = 8 - r1
            r12 = 0
        L3c:
            if (r12 >= r1) goto L75
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
            if (r18 == 0) goto L6c
            int r13 = r9 << 3
            int r13 = r13 + r12
            r14 = r13
            r17 = 0
            r18 = r2
            r2 = r4[r14]
            r19 = 0
            java.lang.Object r20 = r0.invoke(r2)
            java.lang.Boolean r20 = (java.lang.Boolean) r20
            boolean r20 = r20.booleanValue()
            if (r20 == 0) goto L69
            return r2
        L69:
            goto L6e
        L6c:
            r18 = r2
        L6e:
            long r10 = r10 >> r18
            int r12 = r12 + 1
            r2 = r18
            goto L3c
        L75:
            r18 = r2
            if (r1 != r2) goto L85
        L79:
            if (r9 == r8) goto L84
            int r9 = r9 + 1
            r1 = r15
            r2 = r16
            goto L1a
        L81:
            r15 = r1
            r16 = r2
        L84:
        L85:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "Could not find a match"
            r1.<init>(r2)
            throw r1
    }

    public final E firstOrNull(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r22) {
            r21 = this;
            r0 = r22
            java.lang.String r1 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            r2 = r21
            r3 = 0
            java.lang.Object[] r4 = r2.elements
            r5 = r2
            r6 = 0
            long[] r7 = r5.metadata
            int r8 = r7.length
            int r8 = r8 + (-2)
            r9 = 0
            if (r9 > r8) goto L81
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
            if (r1 == 0) goto L79
            int r1 = r9 - r8
            int r1 = ~r1
            int r1 = r1 >>> 31
            r2 = 8
            int r1 = 8 - r1
            r12 = 0
        L3c:
            if (r12 >= r1) goto L75
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
            if (r18 == 0) goto L6c
            int r13 = r9 << 3
            int r13 = r13 + r12
            r14 = r13
            r17 = 0
            r18 = r2
            r2 = r4[r14]
            r19 = 0
            java.lang.Object r20 = r0.invoke(r2)
            java.lang.Boolean r20 = (java.lang.Boolean) r20
            boolean r20 = r20.booleanValue()
            if (r20 == 0) goto L69
            return r2
        L69:
            goto L6e
        L6c:
            r18 = r2
        L6e:
            long r10 = r10 >> r18
            int r12 = r12 + 1
            r2 = r18
            goto L3c
        L75:
            r18 = r2
            if (r1 != r2) goto L85
        L79:
            if (r9 == r8) goto L84
            int r9 = r9 + 1
            r1 = r15
            r2 = r16
            goto L1a
        L81:
            r15 = r1
            r16 = r2
        L84:
        L85:
            r1 = 0
            return r1
    }

    public final void forEach(kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r20) {
            r19 = this;
            r0 = r20
            java.lang.String r1 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            r2 = r19
            java.lang.Object[] r3 = r2.elements
            r4 = r19
            r5 = 0
            long[] r6 = r4.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            r8 = 0
            if (r8 > r7) goto L6d
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
            if (r11 == 0) goto L68
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L38:
            if (r13 >= r11) goto L64
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
            if (r17 == 0) goto L5b
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r14
            r16 = 0
            r17 = r12
            r12 = r3[r15]
            r0.invoke(r12)
            goto L5d
        L5b:
            r17 = r12
        L5d:
            long r9 = r9 >> r17
            int r13 = r13 + 1
            r12 = r17
            goto L38
        L64:
            r17 = r12
            if (r11 != r12) goto L6e
        L68:
            if (r8 == r7) goto L6d
            int r8 = r8 + 1
            goto L19
        L6d:
        L6e:
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
            java.lang.Object[] r3 = r1.elements
            r4 = r1
            r5 = 0
            long[] r6 = r4.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            r8 = 0
            if (r8 > r7) goto L68
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
            if (r11 == 0) goto L63
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L31:
            if (r13 >= r11) goto L61
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 0
            r17 = 128(0x80, double:6.3E-322)
            int r17 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            r18 = 0
            if (r17 >= 0) goto L43
            r17 = 1
            goto L45
        L43:
            r17 = r18
        L45:
            if (r17 == 0) goto L5d
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r14
            r16 = 0
            r17 = r3[r15]
            r19 = 0
            if (r17 == 0) goto L57
            int r18 = r17.hashCode()
        L57:
            int r0 = r0 + r18
        L5d:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L31
        L61:
            if (r11 != r12) goto L69
        L63:
            if (r8 == r7) goto L68
            int r8 = r8 + 1
            goto L12
        L68:
        L69:
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

    public final java.lang.String joinToString(java.lang.CharSequence r29, java.lang.CharSequence r30, java.lang.CharSequence r31, int r32, java.lang.CharSequence r33, kotlin.jvm.functions.Function1<? super E, ? extends java.lang.CharSequence> r34) {
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
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = r5
            r7 = 0
            r6.append(r1)
            r8 = 0
            r9 = r28
            r10 = 0
            java.lang.Object[] r11 = r9.elements
            r12 = r9
            r13 = 0
            long[] r14 = r12.metadata
            int r15 = r14.length
            int r15 = r15 + (-2)
            r1 = 0
            if (r1 > r15) goto Le5
        L3a:
            r16 = r14[r1]
            r18 = r16
            r20 = 0
            r21 = r7
            r22 = r8
            r7 = r18
            r18 = r9
            r19 = r10
            long r9 = ~r7
            r23 = 7
            long r9 = r9 << r23
            long r9 = r9 & r7
            r23 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r9 & r23
            int r7 = (r7 > r23 ? 1 : (r7 == r23 ? 0 : -1))
            if (r7 == 0) goto Lcf
            int r7 = r1 - r15
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = 0
            r10 = r9
            r9 = r22
        L68:
            if (r10 >= r7) goto Lc3
            r22 = 255(0xff, double:1.26E-321)
            long r22 = r16 & r22
            r20 = 0
            r24 = 128(0x80, double:6.3E-322)
            int r24 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r24 >= 0) goto L79
            r24 = 1
            goto L7b
        L79:
            r24 = 0
        L7b:
            if (r24 == 0) goto Lb2
            int r20 = r1 << 3
            int r20 = r20 + r10
            r22 = r20
            r23 = 0
            r24 = r8
            r8 = r11[r22]
            r25 = 0
            r26 = r5
            r5 = r32
            if (r9 != r5) goto L96
            r6.append(r3)
            goto Lf5
        L96:
            if (r9 == 0) goto L9b
            r6.append(r0)
        L9b:
            if (r4 != 0) goto La1
            r6.append(r8)
            goto Lac
        La1:
            java.lang.Object r27 = r4.invoke(r8)
            r0 = r27
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r6.append(r0)
        Lac:
            int r9 = r9 + 1
            goto Lb8
        Lb2:
            r26 = r5
            r24 = r8
            r5 = r32
        Lb8:
            long r16 = r16 >> r24
            int r10 = r10 + 1
            r0 = r29
            r8 = r24
            r5 = r26
            goto L68
        Lc3:
            r26 = r5
            r24 = r8
            r5 = r32
            r0 = r24
            if (r7 != r0) goto Lf0
            r8 = r9
            goto Ld5
        Lcf:
            r26 = r5
            r5 = r32
            r8 = r22
        Ld5:
            if (r1 == r15) goto Lef
            int r1 = r1 + 1
            r0 = r29
            r9 = r18
            r10 = r19
            r7 = r21
            r5 = r26
            goto L3a
        Le5:
            r26 = r5
            r21 = r7
            r18 = r9
            r19 = r10
            r5 = r32
        Lef:
            r9 = r8
        Lf0:
            r6.append(r2)
        Lf5:
            java.lang.String r0 = r26.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
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
            r10 = this;
            java.lang.String r0 = "["
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r0 = "]"
            r4 = r0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            androidx.collection.ScatterSet$toString$1 r0 = new androidx.collection.ScatterSet$toString$1
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
