package kotlin.sequences;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u0004:\u0001\u000bBA\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\tH\u0096\u0002R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlin/sequences/FlatteningSequence;", "T", "R", "E", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function1;", "iterator", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "State", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FlatteningSequence<T, R, E> implements kotlin.sequences.Sequence<E> {
    private final kotlin.jvm.functions.Function1<R, java.util.Iterator<E>> iterator;
    private final kotlin.sequences.Sequence<T> sequence;
    private final kotlin.jvm.functions.Function1<T, R> transformer;

    /* JADX INFO: compiled from: Sequences.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlin/sequences/FlatteningSequence$State;", "", "()V", "DONE", "", "READY", "UNDEFINED", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class State {
        public static final int DONE = 2;
        public static final kotlin.sequences.FlatteningSequence.State INSTANCE = null;
        public static final int READY = 1;
        public static final int UNDEFINED = 0;

        static {
                kotlin.sequences.FlatteningSequence$State r0 = new kotlin.sequences.FlatteningSequence$State
                r0.<init>()
                kotlin.sequences.FlatteningSequence.State.INSTANCE = r0
                return
        }

        private State() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: renamed from: kotlin.sequences.FlatteningSequence$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: Sequences.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\t\u0010\u0011\u001a\u00020\u0010H\u0096\u0002J\u000e\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0013R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0004R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"kotlin/sequences/FlatteningSequence$iterator$1", "", "itemIterator", "getItemIterator", "()Ljava/util/Iterator;", "setItemIterator", "(Ljava/util/Iterator;)V", "iterator", "getIterator", "state", "", "getState", "()I", "setState", "(I)V", "ensureItemIterator", "", "hasNext", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 implements java.util.Iterator<E>, kotlin.jvm.internal.markers.KMappedMarker {
        private java.util.Iterator<? extends E> itemIterator;
        private final java.util.Iterator<T> iterator;
        private int state;
        final /* synthetic */ kotlin.sequences.FlatteningSequence<T, R, E> this$0;

        AnonymousClass1(kotlin.sequences.FlatteningSequence<T, R, E> r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                kotlin.sequences.Sequence r0 = kotlin.sequences.FlatteningSequence.access$getSequence$p(r2)
                java.util.Iterator r0 = r0.iterator()
                r1.iterator = r0
                return
        }

        private final boolean ensureItemIterator() {
                r5 = this;
                java.util.Iterator<? extends E> r0 = r5.itemIterator
                r1 = 1
                if (r0 == 0) goto Le
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto Le
                r5.state = r1
                return r1
            Le:
                java.util.Iterator<T> r2 = r5.iterator
                boolean r2 = r2.hasNext()
                if (r2 == 0) goto L3d
                java.util.Iterator<T> r2 = r5.iterator
                java.lang.Object r2 = r2.next()
                kotlin.sequences.FlatteningSequence<T, R, E> r3 = r5.this$0
                kotlin.jvm.functions.Function1 r3 = kotlin.sequences.FlatteningSequence.access$getIterator$p(r3)
                kotlin.sequences.FlatteningSequence<T, R, E> r4 = r5.this$0
                kotlin.jvm.functions.Function1 r4 = kotlin.sequences.FlatteningSequence.access$getTransformer$p(r4)
                java.lang.Object r4 = r4.invoke(r2)
                java.lang.Object r3 = r3.invoke(r4)
                java.util.Iterator r3 = (java.util.Iterator) r3
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto Le
                r5.itemIterator = r3
                r5.state = r1
                return r1
            L3d:
                r1 = 2
                r5.state = r1
                r1 = 0
                r5.itemIterator = r1
                r1 = 0
                return r1
        }

        public final java.util.Iterator<E> getItemIterator() {
                r1 = this;
                java.util.Iterator<? extends E> r0 = r1.itemIterator
                return r0
        }

        public final java.util.Iterator<T> getIterator() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.iterator
                return r0
        }

        public final int getState() {
                r1 = this;
                int r0 = r1.state
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.state
                r1 = 1
                if (r0 != r1) goto L6
                return r1
            L6:
                int r0 = r2.state
                r1 = 2
                if (r0 != r1) goto Ld
                r0 = 0
                return r0
            Ld:
                boolean r0 = r2.ensureItemIterator()
                return r0
        }

        @Override // java.util.Iterator
        public E next() {
                r2 = this;
                int r0 = r2.state
                r1 = 2
                if (r0 == r1) goto L23
                int r0 = r2.state
                if (r0 != 0) goto L16
                boolean r0 = r2.ensureItemIterator()
                if (r0 == 0) goto L10
                goto L16
            L10:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
            L16:
                r0 = 0
                r2.state = r0
                java.util.Iterator<? extends E> r0 = r2.itemIterator
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                java.lang.Object r0 = r0.next()
                return r0
            L23:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        public final void setItemIterator(java.util.Iterator<? extends E> r1) {
                r0 = this;
                r0.itemIterator = r1
                return
        }

        public final void setState(int r1) {
                r0 = this;
                r0.state = r1
                return
        }
    }

    public FlatteningSequence(kotlin.sequences.Sequence<? extends T> r2, kotlin.jvm.functions.Function1<? super T, ? extends R> r3, kotlin.jvm.functions.Function1<? super R, ? extends java.util.Iterator<? extends E>> r4) {
            r1 = this;
            java.lang.String r0 = "sequence"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "transformer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "iterator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.<init>()
            r1.sequence = r2
            r1.transformer = r3
            r1.iterator = r4
            return
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function1 access$getIterator$p(kotlin.sequences.FlatteningSequence r1) {
            kotlin.jvm.functions.Function1<R, java.util.Iterator<E>> r0 = r1.iterator
            return r0
    }

    public static final /* synthetic */ kotlin.sequences.Sequence access$getSequence$p(kotlin.sequences.FlatteningSequence r1) {
            kotlin.sequences.Sequence<T> r0 = r1.sequence
            return r0
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function1 access$getTransformer$p(kotlin.sequences.FlatteningSequence r1) {
            kotlin.jvm.functions.Function1<T, R> r0 = r1.transformer
            return r0
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<E> iterator() {
            r1 = this;
            kotlin.sequences.FlatteningSequence$iterator$1 r0 = new kotlin.sequences.FlatteningSequence$iterator$1
            r0.<init>(r1)
            java.util.Iterator r0 = (java.util.Iterator) r0
            return r0
    }
}
