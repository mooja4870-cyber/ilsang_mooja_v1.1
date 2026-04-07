package kotlin.collections;

/* JADX INFO: compiled from: SlidingWindow.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001aH\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u0006\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001aD\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u000e\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¨\u0006\u000f"}, d2 = {"checkWindowSizeStep", "", "size", "", "step", "windowedIterator", "", "", "T", "iterator", "partialWindows", "", "reuseBuffer", "windowedSequence", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SlidingWindowKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.SlidingWindowKt$windowedIterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: SlidingWindow.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 2, 2, 3, 3}, l = {34, 40, 49, 55, 58}, m = "invokeSuspend", n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
    static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.util.List<? extends T>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.util.Iterator<T> $iterator;
        final /* synthetic */ boolean $partialWindows;
        final /* synthetic */ boolean $reuseBuffer;
        final /* synthetic */ int $size;
        final /* synthetic */ int $step;
        int I$0;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;

        AnonymousClass1(int r2, int r3, java.util.Iterator<? extends T> r4, boolean r5, boolean r6, kotlin.coroutines.Continuation<? super kotlin.collections.SlidingWindowKt.AnonymousClass1> r7) {
                r1 = this;
                r1.$size = r2
                r1.$step = r3
                r1.$iterator = r4
                r1.$reuseBuffer = r5
                r1.$partialWindows = r6
                r0 = 2
                r1.<init>(r0, r7)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r8, kotlin.coroutines.Continuation<?> r9) {
                r7 = this;
                kotlin.collections.SlidingWindowKt$windowedIterator$1 r0 = new kotlin.collections.SlidingWindowKt$windowedIterator$1
                int r1 = r7.$size
                int r2 = r7.$step
                java.util.Iterator<T> r3 = r7.$iterator
                boolean r4 = r7.$reuseBuffer
                boolean r5 = r7.$partialWindows
                r6 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r0.L$0 = r8
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.util.List<? extends T>> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlin.collections.SlidingWindowKt$windowedIterator$1 r0 = (kotlin.collections.SlidingWindowKt.AnonymousClass1) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                r2 = 0
                switch(r1) {
                    case 0: goto L52;
                    case 1: goto L3e;
                    case 2: goto L38;
                    case 3: goto L26;
                    case 4: goto L18;
                    case 5: goto L12;
                    default: goto La;
                }
            La:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L12:
                kotlin.ResultKt.throwOnFailure(r11)
                r7 = r10
                goto L191
            L18:
                java.lang.Object r1 = r10.L$1
                kotlin.collections.RingBuffer r1 = (kotlin.collections.RingBuffer) r1
                java.lang.Object r3 = r10.L$0
                kotlin.sequences.SequenceScope r3 = (kotlin.sequences.SequenceScope) r3
                kotlin.ResultKt.throwOnFailure(r11)
                r7 = r10
                goto L16f
            L26:
                java.lang.Object r1 = r10.L$2
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r3 = r10.L$1
                kotlin.collections.RingBuffer r3 = (kotlin.collections.RingBuffer) r3
                java.lang.Object r4 = r10.L$0
                kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
                kotlin.ResultKt.throwOnFailure(r11)
                r7 = r10
                goto L136
            L38:
                kotlin.ResultKt.throwOnFailure(r11)
                r7 = r10
                goto Le1
            L3e:
                int r1 = r10.I$0
                java.lang.Object r3 = r10.L$2
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r10.L$1
                java.util.ArrayList r4 = (java.util.ArrayList) r4
                java.lang.Object r5 = r10.L$0
                kotlin.sequences.SequenceScope r5 = (kotlin.sequences.SequenceScope) r5
                kotlin.ResultKt.throwOnFailure(r11)
                r7 = r10
                r6 = r5
                goto La6
            L52:
                kotlin.ResultKt.throwOnFailure(r11)
                java.lang.Object r1 = r10.L$0
                kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
                int r3 = r10.$size
                r4 = 1024(0x400, float:1.435E-42)
                int r3 = kotlin.ranges.RangesKt.coerceAtMost(r3, r4)
                int r4 = r10.$step
                int r5 = r10.$size
                int r4 = r4 - r5
                if (r4 < 0) goto Le3
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r3)
                r3 = 0
                java.util.Iterator<T> r6 = r10.$iterator
                r7 = r6
                r6 = r1
                r1 = r4
                r4 = r3
                r3 = r7
                r7 = r10
            L76:
                boolean r8 = r3.hasNext()
                if (r8 == 0) goto Lb9
                java.lang.Object r8 = r3.next()
                if (r4 <= 0) goto L85
                int r4 = r4 + (-1)
                goto L76
            L85:
                r5.add(r8)
                int r8 = r5.size()
                int r9 = r7.$size
                if (r8 != r9) goto L76
                r4 = r7
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r7.L$0 = r6
                r7.L$1 = r5
                r7.L$2 = r3
                r7.I$0 = r1
                r8 = 1
                r7.label = r8
                java.lang.Object r4 = r6.yield(r5, r4)
                if (r4 != r0) goto La5
                return r0
            La5:
                r4 = r5
            La6:
                boolean r5 = r7.$reuseBuffer
                if (r5 == 0) goto Laf
                r4.clear()
                r5 = r4
                goto Lb7
            Laf:
                java.util.ArrayList r4 = new java.util.ArrayList
                int r5 = r7.$size
                r4.<init>(r5)
                r5 = r4
            Lb7:
                r4 = r1
                goto L76
            Lb9:
                r1 = r5
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L192
                boolean r1 = r7.$partialWindows
                if (r1 != 0) goto Lce
                int r1 = r5.size()
                int r3 = r7.$size
                if (r1 != r3) goto L192
            Lce:
                r1 = r7
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                r7.L$0 = r2
                r7.L$1 = r2
                r7.L$2 = r2
                r2 = 2
                r7.label = r2
                java.lang.Object r1 = r6.yield(r5, r1)
                if (r1 != r0) goto Le1
                return r0
            Le1:
                goto L192
            Le3:
                kotlin.collections.RingBuffer r4 = new kotlin.collections.RingBuffer
                r4.<init>(r3)
                java.util.Iterator<T> r3 = r10.$iterator
                r7 = r4
                r4 = r1
                r1 = r3
                r3 = r7
                r7 = r10
            Lef:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L13c
                java.lang.Object r5 = r1.next()
                r3.add(r5)
                boolean r5 = r3.isFull()
                if (r5 == 0) goto Lef
                int r5 = r3.size()
                int r6 = r7.$size
                if (r5 >= r6) goto L111
                int r5 = r7.$size
                kotlin.collections.RingBuffer r3 = r3.expanded(r5)
                goto Lef
            L111:
                boolean r5 = r7.$reuseBuffer
                if (r5 == 0) goto L119
                r5 = r3
                java.util.List r5 = (java.util.List) r5
                goto L123
            L119:
                java.util.ArrayList r5 = new java.util.ArrayList
                r6 = r3
                java.util.Collection r6 = (java.util.Collection) r6
                r5.<init>(r6)
                java.util.List r5 = (java.util.List) r5
            L123:
                r6 = r7
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r7.L$0 = r4
                r7.L$1 = r3
                r7.L$2 = r1
                r8 = 3
                r7.label = r8
                java.lang.Object r5 = r4.yield(r5, r6)
                if (r5 != r0) goto L136
                return r0
            L136:
                int r5 = r7.$step
                r3.removeFirst(r5)
                goto Lef
            L13c:
                boolean r1 = r7.$partialWindows
                if (r1 == 0) goto L192
                r1 = r3
                r3 = r4
            L142:
                int r4 = r1.size()
                int r5 = r7.$step
                if (r4 <= r5) goto L175
                boolean r4 = r7.$reuseBuffer
                if (r4 == 0) goto L152
                r4 = r1
                java.util.List r4 = (java.util.List) r4
                goto L15c
            L152:
                java.util.ArrayList r4 = new java.util.ArrayList
                r5 = r1
                java.util.Collection r5 = (java.util.Collection) r5
                r4.<init>(r5)
                java.util.List r4 = (java.util.List) r4
            L15c:
                r5 = r7
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r7.L$0 = r3
                r7.L$1 = r1
                r7.L$2 = r2
                r6 = 4
                r7.label = r6
                java.lang.Object r4 = r3.yield(r4, r5)
                if (r4 != r0) goto L16f
                return r0
            L16f:
                int r4 = r7.$step
                r1.removeFirst(r4)
                goto L142
            L175:
                r4 = r1
                java.util.Collection r4 = (java.util.Collection) r4
                boolean r4 = r4.isEmpty()
                if (r4 != 0) goto L192
                r4 = r7
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r7.L$0 = r2
                r7.L$1 = r2
                r7.L$2 = r2
                r2 = 5
                r7.label = r2
                java.lang.Object r1 = r3.yield(r1, r4)
                if (r1 != r0) goto L191
                return r0
            L191:
            L192:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }
    }

    public static final void checkWindowSizeStep(int r4, int r5) {
            if (r4 <= 0) goto L6
            if (r5 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 != 0) goto L51
            r0 = 0
            java.lang.String r1 = " must be greater than zero."
            if (r4 == r5) goto L30
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Both size "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = " and step "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            goto L47
        L30:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "size "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
        L47:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L51:
            return
    }

    public static final <T> java.util.Iterator<java.util.List<T>> windowedIterator(java.util.Iterator<? extends T> r8, int r9, int r10, boolean r11, boolean r12) {
            java.lang.String r0 = "iterator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            boolean r0 = r8.hasNext()
            if (r0 != 0) goto L10
            kotlin.collections.EmptyIterator r0 = kotlin.collections.EmptyIterator.INSTANCE
            java.util.Iterator r0 = (java.util.Iterator) r0
            return r0
        L10:
            kotlin.collections.SlidingWindowKt$windowedIterator$1 r1 = new kotlin.collections.SlidingWindowKt$windowedIterator$1
            r7 = 0
            r4 = r8
            r2 = r9
            r3 = r10
            r6 = r11
            r5 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            java.util.Iterator r8 = kotlin.sequences.SequencesKt.iterator(r1)
            return r8
    }

    public static final <T> kotlin.sequences.Sequence<java.util.List<T>> windowedSequence(kotlin.sequences.Sequence<? extends T> r7, int r8, int r9, boolean r10, boolean r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            checkWindowSizeStep(r8, r9)
            kotlin.collections.SlidingWindowKt$windowedSequence$$inlined$Sequence$1 r1 = new kotlin.collections.SlidingWindowKt$windowedSequence$$inlined$Sequence$1
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            kotlin.sequences.Sequence r1 = (kotlin.sequences.Sequence) r1
            return r1
    }
}
