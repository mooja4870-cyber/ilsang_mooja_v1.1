package androidx.collection;

/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", "K", "V", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.collection.MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1511}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3"})
final class MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.lang.Integer>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    final /* synthetic */ androidx.collection.MutableScatterMap<K, V> this$0;

    MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1(androidx.collection.MutableScatterMap<K, V> r2, kotlin.coroutines.Continuation<? super androidx.collection.MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1> r3) {
            r1 = this;
            r1.this$0 = r2
            r0 = 2
            r1.<init>(r0, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            androidx.collection.MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1 r0 = new androidx.collection.MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1
            androidx.collection.MutableScatterMap<K, V> r1 = r2.this$0
            r0.<init>(r1, r4)
            r0.L$0 = r3
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.lang.Integer> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            java.lang.Object r0 = r1.invoke2(r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlin.sequences.SequenceScope<? super java.lang.Integer> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
            androidx.collection.MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1 r0 = (androidx.collection.MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1) r0
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r0.invokeSuspend(r1)
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            r20 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r1 = r20
            int r2 = r1.label
            switch(r2) {
                case 0: goto L32;
                case 1: goto L13;
                default: goto Lb;
            }
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L13:
            r2 = r20
            r5 = r21
            r6 = 0
            r7 = 0
            int r8 = r2.I$3
            int r9 = r2.I$2
            long r10 = r2.J$0
            int r12 = r2.I$1
            int r13 = r2.I$0
            java.lang.Object r14 = r2.L$1
            long[] r14 = (long[]) r14
            java.lang.Object r15 = r2.L$0
            kotlin.sequences.SequenceScope r15 = (kotlin.sequences.SequenceScope) r15
            kotlin.ResultKt.throwOnFailure(r5)
            r16 = 8
            goto La4
        L32:
            kotlin.ResultKt.throwOnFailure(r21)
            r2 = r20
            r5 = r21
            java.lang.Object r6 = r2.L$0
            kotlin.sequences.SequenceScope r6 = (kotlin.sequences.SequenceScope) r6
            androidx.collection.MutableScatterMap<K, V> r7 = r2.this$0
            androidx.collection.ScatterMap r7 = (androidx.collection.ScatterMap) r7
            r8 = 0
            long[] r7 = r7.metadata
            int r9 = r7.length
            int r9 = r9 + (-2)
            r10 = 0
            if (r10 > r9) goto Lc6
        L4a:
            r11 = r7[r10]
            r13 = r11
            r15 = 0
            r16 = 8
            long r3 = ~r13
            r18 = 7
            long r3 = r3 << r18
            long r3 = r3 & r13
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r18
            int r3 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r3 == 0) goto Lbb
            int r3 = r10 - r9
            int r3 = ~r3
            int r3 = r3 >>> 31
            int r3 = 8 - r3
            r4 = 0
            r13 = r11
            r12 = r10
            r10 = r13
            r15 = r6
            r14 = r7
            r6 = r8
            r13 = r9
            r9 = r3
            r8 = r4
        L72:
            if (r8 >= r9) goto Laf
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r10
            r7 = 0
            r18 = 128(0x80, double:6.3E-322)
            int r18 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r18 >= 0) goto L80
            r3 = 1
            goto L81
        L80:
            r3 = 0
        L81:
            if (r3 == 0) goto La5
            int r3 = r12 << 3
            int r3 = r3 + r8
            r7 = 0
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r3)
            r2.L$0 = r15
            r2.L$1 = r14
            r2.I$0 = r13
            r2.I$1 = r12
            r2.J$0 = r10
            r2.I$2 = r9
            r2.I$3 = r8
            r1 = 1
            r2.label = r1
            java.lang.Object r1 = r15.yield(r4, r2)
            if (r1 != r0) goto La4
            return r0
        La4:
        La5:
            long r10 = r10 >> r16
            r17 = 1
            int r8 = r8 + 1
            r1 = r20
            goto L72
        Laf:
            r17 = 1
            r1 = r16
            if (r9 != r1) goto Lc7
            r8 = r6
            r10 = r12
            r9 = r13
            r7 = r14
            r6 = r15
            goto Lbf
        Lbb:
            r1 = r16
            r17 = 1
        Lbf:
            if (r10 == r9) goto Lc6
            int r10 = r10 + 1
            r1 = r20
            goto L4a
        Lc6:
        Lc7:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }
}
