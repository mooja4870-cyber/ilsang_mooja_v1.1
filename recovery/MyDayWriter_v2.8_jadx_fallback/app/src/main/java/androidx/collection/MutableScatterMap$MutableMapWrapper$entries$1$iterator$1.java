package androidx.collection;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0010)\n\u0002\u0010'\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u0096\u0002J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR,\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"androidx/collection/MutableScatterMap$MutableMapWrapper$entries$1$iterator$1", "", "", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "iterator", "", "getIterator", "()Ljava/util/Iterator;", "setIterator", "(Ljava/util/Iterator;)V", "hasNext", "", "next", "remove", "", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MutableScatterMap$MutableMapWrapper$entries$1$iterator$1<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>>, kotlin.jvm.internal.markers.KMutableIterator {
    private int current;
    private java.util.Iterator<? extends java.util.Map.Entry<K, V>> iterator;
    final /* synthetic */ androidx.collection.MutableScatterMap<K, V> this$0;

    /* JADX INFO: renamed from: androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScatterMap.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", "K", "V", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1328}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.util.Map.Entry<K, V>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        long J$0;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        final /* synthetic */ androidx.collection.MutableScatterMap<K, V> this$0;
        final /* synthetic */ androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1<K, V> this$1;

        AnonymousClass1(androidx.collection.MutableScatterMap<K, V> r2, androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1<K, V> r3, kotlin.coroutines.Continuation<? super androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1.AnonymousClass1> r4) {
                r1 = this;
                r1.this$0 = r2
                r1.this$1 = r3
                r0 = 2
                r1.<init>(r0, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1 r0 = new androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1
                androidx.collection.MutableScatterMap<K, V> r1 = r3.this$0
                androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1<K, V> r2 = r3.this$1
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
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

        public final java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.util.Map.Entry<K, V>> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1 r0 = (androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1.AnonymousClass1) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
                r22 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r1 = r22
                int r2 = r1.label
                switch(r2) {
                    case 0: goto L3a;
                    case 1: goto L13;
                    default: goto Lb;
                }
            Lb:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L13:
                r2 = r22
                r5 = r23
                r6 = 0
                r7 = 0
                int r8 = r2.I$3
                int r9 = r2.I$2
                long r10 = r2.J$0
                int r12 = r2.I$1
                int r13 = r2.I$0
                java.lang.Object r14 = r2.L$3
                long[] r14 = (long[]) r14
                java.lang.Object r15 = r2.L$2
                androidx.collection.MutableScatterMap r15 = (androidx.collection.MutableScatterMap) r15
                r16 = 8
                java.lang.Object r3 = r2.L$1
                androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 r3 = (androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1) r3
                java.lang.Object r4 = r2.L$0
                kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
                kotlin.ResultKt.throwOnFailure(r5)
                goto Ld4
            L3a:
                r16 = 8
                kotlin.ResultKt.throwOnFailure(r23)
                r2 = r22
                r3 = r23
                java.lang.Object r4 = r2.L$0
                kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
                androidx.collection.MutableScatterMap<K, V> r5 = r2.this$0
                androidx.collection.ScatterMap r5 = (androidx.collection.ScatterMap) r5
                androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1<K, V> r6 = r2.this$1
                androidx.collection.MutableScatterMap<K, V> r7 = r2.this$0
                r8 = 0
                long[] r5 = r5.metadata
                int r9 = r5.length
                int r9 = r9 + (-2)
                r10 = 0
                if (r10 > r9) goto L108
            L58:
                r11 = r5[r10]
                r13 = r11
                r15 = 0
                r23 = r0
                long r0 = ~r13
                r18 = 7
                long r0 = r0 << r18
                long r0 = r0 & r13
                r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r0 = r0 & r18
                int r0 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
                if (r0 == 0) goto Lf8
                int r0 = r10 - r9
                int r0 = ~r0
                int r0 = r0 >>> 31
                int r0 = 8 - r0
                r1 = 0
                r13 = r11
                r12 = r10
                r10 = r13
                r14 = r5
                r15 = r7
                r13 = r9
                r9 = r0
                r5 = r3
                r3 = r6
                r6 = r8
                r0 = r23
                r8 = r1
            L84:
                if (r8 >= r9) goto Le1
                r18 = 255(0xff, double:1.26E-321)
                long r18 = r10 & r18
                r1 = 0
                r20 = 128(0x80, double:6.3E-322)
                int r7 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
                if (r7 >= 0) goto L93
                r7 = 1
                goto L94
            L93:
                r7 = 0
            L94:
                if (r7 == 0) goto Ld5
                int r1 = r12 << 3
                int r1 = r1 + r8
                r7 = 0
                r3.setCurrent(r1)
                androidx.collection.MutableMapEntry r1 = new androidx.collection.MutableMapEntry
                r23 = r5
                java.lang.Object[] r5 = r15.keys
                r18 = r6
                java.lang.Object[] r6 = r15.values
                r19 = r7
                int r7 = r3.getCurrent()
                r1.<init>(r5, r6, r7)
                r2.L$0 = r4
                r2.L$1 = r3
                r2.L$2 = r15
                r2.L$3 = r14
                r2.I$0 = r13
                r2.I$1 = r12
                r2.J$0 = r10
                r2.I$2 = r9
                r2.I$3 = r8
                r5 = 1
                r2.label = r5
                java.lang.Object r1 = r4.yield(r1, r2)
                if (r1 != r0) goto Lce
                return r0
            Lce:
                r5 = r23
                r6 = r18
                r7 = r19
            Ld4:
                goto Ld9
            Ld5:
                r23 = r5
                r18 = r6
            Ld9:
                long r10 = r10 >> r16
                r17 = 1
                int r8 = r8 + 1
                goto L84
            Le1:
                r23 = r5
                r18 = r6
                r17 = 1
                r1 = r16
                if (r9 != r1) goto Lf5
                r6 = r3
                r10 = r12
                r9 = r13
                r5 = r14
                r7 = r15
                r8 = r18
                r3 = r23
                goto Lfe
            Lf5:
                r5 = r23
                goto L109
            Lf8:
                r1 = r16
                r17 = 1
                r0 = r23
            Lfe:
                if (r10 == r9) goto L108
                int r10 = r10 + 1
                r16 = r1
                r1 = r22
                goto L58
            L108:
                r5 = r3
            L109:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }
    }

    MutableScatterMap$MutableMapWrapper$entries$1$iterator$1(androidx.collection.MutableScatterMap<K, V> r3) {
            r2 = this;
            r2.this$0 = r3
            r2.<init>()
            r0 = -1
            r2.current = r0
            androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1 r0 = new androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1
            r1 = 0
            r0.<init>(r3, r2, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            java.util.Iterator r0 = kotlin.sequences.SequencesKt.iterator(r0)
            r2.iterator = r0
            return
    }

    public final int getCurrent() {
            r1 = this;
            int r0 = r1.current
            return r0
    }

    public final java.util.Iterator<java.util.Map.Entry<K, V>> getIterator() {
            r1 = this;
            java.util.Iterator<? extends java.util.Map$Entry<K, V>> r0 = r1.iterator
            return r0
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            java.util.Iterator<? extends java.util.Map$Entry<K, V>> r0 = r1.iterator
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ java.lang.Object next() {
            r1 = this;
            java.util.Map$Entry r0 = r1.next()
            return r0
    }

    @Override // java.util.Iterator
    public java.util.Map.Entry<K, V> next() {
            r1 = this;
            java.util.Iterator<? extends java.util.Map$Entry<K, V>> r0 = r1.iterator
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r3 = this;
            int r0 = r3.current
            r1 = -1
            if (r0 == r1) goto Le
            androidx.collection.MutableScatterMap<K, V> r0 = r3.this$0
            int r2 = r3.current
            r0.removeValueAt(r2)
            r3.current = r1
        Le:
            return
    }

    public final void setCurrent(int r1) {
            r0 = this;
            r0.current = r1
            return
    }

    public final void setIterator(java.util.Iterator<? extends java.util.Map.Entry<K, V>> r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.iterator = r2
            return
    }
}
