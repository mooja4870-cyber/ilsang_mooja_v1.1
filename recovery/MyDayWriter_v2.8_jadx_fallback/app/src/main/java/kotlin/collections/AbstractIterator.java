package kotlin.collections;

/* JADX INFO: compiled from: AbstractIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH$J\b\u0010\n\u001a\u00020\tH\u0004J\t\u0010\u000b\u001a\u00020\fH\u0096\u0002J\u000e\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\fH\u0002R\u0012\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlin/collections/AbstractIterator;", "T", "", "()V", "nextValue", "Ljava/lang/Object;", "state", "", "computeNext", "", "done", "hasNext", "", "next", "()Ljava/lang/Object;", "setNext", "value", "(Ljava/lang/Object;)V", "tryToComputeNext", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AbstractIterator<T> implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMappedMarker {
    private T nextValue;
    private int state;

    public AbstractIterator() {
            r0 = this;
            r0.<init>()
            return
    }

    private final boolean tryToComputeNext() {
            r2 = this;
            r0 = 3
            r2.state = r0
            r2.computeNext()
            int r0 = r2.state
            r1 = 1
            if (r0 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    protected abstract void computeNext();

    protected final void done() {
            r1 = this;
            r0 = 2
            r1.state = r0
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r2 = this;
            int r0 = r2.state
            switch(r0) {
                case 0: goto L11;
                case 1: goto Lf;
                case 2: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "hasNext called when the iterator is in the FAILED state."
            r0.<init>(r1)
            throw r0
        Ld:
            r0 = 0
            goto L15
        Lf:
            r0 = 1
            goto L15
        L11:
            boolean r0 = r2.tryToComputeNext()
        L15:
            return r0
    }

    @Override // java.util.Iterator
    public T next() {
            r3 = this;
            int r0 = r3.state
            r1 = 1
            r2 = 0
            if (r0 != r1) goto Lb
            r3.state = r2
            T r0 = r3.nextValue
            return r0
        Lb:
            int r0 = r3.state
            r1 = 2
            if (r0 == r1) goto L1b
            boolean r0 = r3.tryToComputeNext()
            if (r0 == 0) goto L1b
            r3.state = r2
            T r0 = r3.nextValue
            return r0
        L1b:
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

    protected final void setNext(T r2) {
            r1 = this;
            r1.nextValue = r2
            r0 = 1
            r1.state = r0
            return
    }
}
