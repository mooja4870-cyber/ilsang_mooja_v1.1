package kotlin.sequences;

/* JADX INFO: compiled from: SequenceBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\t\u0010\u0018\u001a\u00020\u0019H\u0096\u0002J\u000e\u0010\u001a\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001bJ\r\u0010\u001c\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u001fH\u0016¢\u0006\u0002\u0010 J\u0016\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010#J\u001c\u0010$\u001a\u00020\u00052\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@¢\u0006\u0002\u0010&R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0012\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lkotlin/sequences/SequenceBuilderIterator;", "T", "Lkotlin/sequences/SequenceScope;", "", "Lkotlin/coroutines/Continuation;", "", "()V", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "nextIterator", "nextStep", "getNextStep", "()Lkotlin/coroutines/Continuation;", "setNextStep", "(Lkotlin/coroutines/Continuation;)V", "nextValue", "Ljava/lang/Object;", "state", "", "Lkotlin/sequences/State;", "exceptionalState", "", "hasNext", "", "next", "()Ljava/lang/Object;", "nextNotReady", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "yield", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "yieldAll", "iterator", "(Ljava/util/Iterator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class SequenceBuilderIterator<T> extends kotlin.sequences.SequenceScope<T> implements java.util.Iterator<T>, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.jvm.internal.markers.KMappedMarker {
    private java.util.Iterator<? extends T> nextIterator;
    private kotlin.coroutines.Continuation<? super kotlin.Unit> nextStep;
    private T nextValue;
    private int state;

    public SequenceBuilderIterator() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.lang.Throwable exceptionalState() {
            r3 = this;
            int r0 = r3.state
            switch(r0) {
                case 4: goto L2c;
                case 5: goto L22;
                default: goto L5;
            }
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected state of the iterator: "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r3.state
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            goto L33
        L22:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Iterator has failed."
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            goto L33
        L2c:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
        L33:
            return r0
    }

    private final T nextNotReady() {
            r1 = this;
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r1.next()
            return r0
        Lb:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.coroutines.Continuation
    public kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            return r0
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> getNextStep() {
            r1 = this;
            kotlin.coroutines.Continuation<? super kotlin.Unit> r0 = r1.nextStep
            return r0
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r3 = this;
        L1:
            int r0 = r3.state
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L22;
                case 1: goto L11;
                case 2: goto L10;
                case 3: goto L10;
                case 4: goto Le;
                default: goto L9;
            }
        L9:
            java.lang.Throwable r0 = r3.exceptionalState()
            throw r0
        Le:
            r0 = 0
            return r0
        L10:
            return r2
        L11:
            java.util.Iterator<? extends T> r0 = r3.nextIterator
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L20
            r0 = 2
            r3.state = r0
            return r2
        L20:
            r3.nextIterator = r1
        L22:
            r0 = 5
            r3.state = r0
            kotlin.coroutines.Continuation<? super kotlin.Unit> r0 = r3.nextStep
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r3.nextStep = r1
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = kotlin.Result.m153constructorimpl(r1)
            r0.resumeWith(r1)
            goto L1
    }

    @Override // java.util.Iterator
    public T next() {
            r2 = this;
            int r0 = r2.state
            switch(r0) {
                case 0: goto L20;
                case 1: goto L20;
                case 2: goto L13;
                case 3: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Throwable r0 = r2.exceptionalState()
            throw r0
        La:
            r0 = 0
            r2.state = r0
            T r0 = r2.nextValue
            r1 = 0
            r2.nextValue = r1
            return r0
        L13:
            r0 = 1
            r2.state = r0
            java.util.Iterator<? extends T> r0 = r2.nextIterator
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.Object r0 = r0.next()
            return r0
        L20:
            java.lang.Object r0 = r2.nextNotReady()
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object r2) {
            r1 = this;
            kotlin.ResultKt.throwOnFailure(r2)
            r0 = 4
            r1.state = r0
            return
    }

    public final void setNextStep(kotlin.coroutines.Continuation<? super kotlin.Unit> r1) {
            r0 = this;
            r0.nextStep = r1
            return
    }

    @Override // kotlin.sequences.SequenceScope
    public java.lang.Object yield(T r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            r2.nextValue = r3
            r0 = 3
            r2.state = r0
            r0 = r4
            r1 = 0
            r2.nextStep = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L16
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r4)
        L16:
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L1d
            return r0
        L1d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    @Override // kotlin.sequences.SequenceScope
    public java.lang.Object yieldAll(java.util.Iterator<? extends T> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L9
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L9:
            r2.nextIterator = r3
            r0 = 2
            r2.state = r0
            r0 = r4
            r1 = 0
            r2.nextStep = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L1f
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r4)
        L1f:
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L26
            return r0
        L26:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }
}
