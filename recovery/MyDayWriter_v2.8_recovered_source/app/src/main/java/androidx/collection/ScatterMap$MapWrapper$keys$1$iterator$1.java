package androidx.collection;

/* JADX INFO: Add missing generic type declarations: [K] */
/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "K", "V", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.collection.ScatterMap$MapWrapper$keys$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {726}, m = "invokeSuspend", n = {"$this$iterator", "k$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
final class ScatterMap$MapWrapper$keys$1$iterator$1<K> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super K>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    final /* synthetic */ androidx.collection.ScatterMap<K, V> this$0;

    ScatterMap$MapWrapper$keys$1$iterator$1(androidx.collection.ScatterMap<K, V> r2, kotlin.coroutines.Continuation<? super androidx.collection.ScatterMap$MapWrapper$keys$1$iterator$1> r3) {
            r1 = this;
            r1.this$0 = r2
            r0 = 2
            r1.<init>(r0, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            androidx.collection.ScatterMap$MapWrapper$keys$1$iterator$1 r0 = new androidx.collection.ScatterMap$MapWrapper$keys$1$iterator$1
            androidx.collection.ScatterMap<K, V> r1 = r2.this$0
            r0.<init>(r1, r4)
            r0.L$0 = r3
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

    public final java.lang.Object invoke(kotlin.sequences.SequenceScope<? super K> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
            androidx.collection.ScatterMap$MapWrapper$keys$1$iterator$1 r0 = (androidx.collection.ScatterMap$MapWrapper$keys$1$iterator$1) r0
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r0.invokeSuspend(r1)
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            r21 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r1 = r21
            int r2 = r1.label
            switch(r2) {
                case 0: goto L3c;
                case 1: goto L13;
                default: goto Lb;
            }
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L13:
            r2 = r21
            r5 = r22
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            int r10 = r2.I$3
            int r11 = r2.I$2
            long r12 = r2.J$0
            int r14 = r2.I$1
            int r15 = r2.I$0
            r16 = 8
            java.lang.Object r3 = r2.L$2
            long[] r3 = (long[]) r3
            java.lang.Object r4 = r2.L$1
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r18 = r0
            java.lang.Object r0 = r2.L$0
            kotlin.sequences.SequenceScope r0 = (kotlin.sequences.SequenceScope) r0
            kotlin.ResultKt.throwOnFailure(r5)
            r1 = r18
            goto Lc1
        L3c:
            r18 = r0
            r16 = 8
            kotlin.ResultKt.throwOnFailure(r22)
            r0 = r21
            r2 = r22
            java.lang.Object r3 = r0.L$0
            kotlin.sequences.SequenceScope r3 = (kotlin.sequences.SequenceScope) r3
            androidx.collection.ScatterMap<K, V> r4 = r0.this$0
            r5 = 0
            java.lang.Object[] r6 = r4.keys
            r7 = 0
            long[] r4 = r4.metadata
            int r8 = r4.length
            int r8 = r8 + (-2)
            r9 = 0
            if (r9 > r8) goto Lf0
        L5a:
            r10 = r4[r9]
            r12 = r10
            r14 = 0
            r22 = r0
            long r0 = ~r12
            r15 = 7
            long r0 = r0 << r15
            long r0 = r0 & r12
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r19
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 == 0) goto Le4
            int r0 = r9 - r8
            int r0 = ~r0
            int r0 = r0 >>> 31
            int r0 = 8 - r0
            r1 = 0
            r15 = r8
            r14 = r9
            r12 = r10
            r11 = r0
            r10 = r1
            r0 = r3
            r3 = r4
            r4 = r6
            r1 = r18
            r6 = r5
            r5 = r2
            r2 = r22
        L85:
            if (r10 >= r11) goto Lce
            r8 = 255(0xff, double:1.26E-321)
            long r8 = r8 & r12
            r18 = 0
            r19 = 128(0x80, double:6.3E-322)
            int r19 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r19 >= 0) goto L94
            r8 = 1
            goto L95
        L94:
            r8 = 0
        L95:
            if (r8 == 0) goto Lc4
            int r8 = r14 << 3
            int r8 = r8 + r10
            r9 = 0
            r8 = r4[r8]
            r18 = 0
            r2.L$0 = r0
            r2.L$1 = r4
            r2.L$2 = r3
            r2.I$0 = r15
            r2.I$1 = r14
            r2.J$0 = r12
            r2.I$2 = r11
            r2.I$3 = r10
            r19 = r3
            r3 = 1
            r2.label = r3
            java.lang.Object r3 = r0.yield(r8, r2)
            if (r3 != r1) goto Lbc
            return r1
        Lbc:
            r8 = r9
            r9 = r18
            r3 = r19
        Lc1:
            goto Lc6
        Lc4:
            r19 = r3
        Lc6:
            long r12 = r12 >> r16
            r17 = 1
            int r10 = r10 + 1
            goto L85
        Lce:
            r19 = r3
            r17 = 1
            r3 = r16
            if (r11 != r3) goto Lf3
            r18 = r1
            r16 = r3
            r9 = r14
            r8 = r15
            r3 = r0
            r0 = r2
            r2 = r5
            r5 = r6
            r6 = r4
            r4 = r19
            goto Le8
        Le4:
            r17 = 1
            r0 = r22
        Le8:
            if (r9 == r8) goto Lf0
            int r9 = r9 + 1
            r1 = r21
            goto L5a
        Lf0:
            r6 = r5
            r5 = r2
            r2 = r0
        Lf3:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }
}
