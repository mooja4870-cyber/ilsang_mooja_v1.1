package androidx.collection;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", "K", "V", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.collection.ScatterMap$MapWrapper$entries$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {701}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
final class ScatterMap$MapWrapper$entries$1$iterator$1<K, V> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.util.Map.Entry<? extends K, ? extends V>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
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

    ScatterMap$MapWrapper$entries$1$iterator$1(androidx.collection.ScatterMap<K, V> r2, kotlin.coroutines.Continuation<? super androidx.collection.ScatterMap$MapWrapper$entries$1$iterator$1> r3) {
            r1 = this;
            r1.this$0 = r2
            r0 = 2
            r1.<init>(r0, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            androidx.collection.ScatterMap$MapWrapper$entries$1$iterator$1 r0 = new androidx.collection.ScatterMap$MapWrapper$entries$1$iterator$1
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

    public final java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.util.Map.Entry<? extends K, ? extends V>> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
            androidx.collection.ScatterMap$MapWrapper$entries$1$iterator$1 r0 = (androidx.collection.ScatterMap$MapWrapper$entries$1$iterator$1) r0
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
                case 0: goto L36;
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
            java.lang.Object r14 = r2.L$2
            long[] r14 = (long[]) r14
            java.lang.Object r15 = r2.L$1
            androidx.collection.ScatterMap r15 = (androidx.collection.ScatterMap) r15
            r16 = 8
            java.lang.Object r3 = r2.L$0
            kotlin.sequences.SequenceScope r3 = (kotlin.sequences.SequenceScope) r3
            kotlin.ResultKt.throwOnFailure(r5)
            goto Lc0
        L36:
            r16 = 8
            kotlin.ResultKt.throwOnFailure(r23)
            r2 = r22
            r3 = r23
            java.lang.Object r5 = r2.L$0
            kotlin.sequences.SequenceScope r5 = (kotlin.sequences.SequenceScope) r5
            androidx.collection.ScatterMap<K, V> r6 = r2.this$0
            androidx.collection.ScatterMap<K, V> r7 = r2.this$0
            r8 = 0
            long[] r6 = r6.metadata
            int r9 = r6.length
            int r9 = r9 + (-2)
            r10 = 0
            if (r10 > r9) goto Lf1
        L50:
            r11 = r6[r10]
            r13 = r11
            r15 = 0
            r23 = r5
            long r4 = ~r13
            r18 = 7
            long r4 = r4 << r18
            long r4 = r4 & r13
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r18
            int r4 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r4 == 0) goto Le1
            int r4 = r10 - r9
            int r4 = ~r4
            int r4 = r4 >>> 31
            int r4 = 8 - r4
            r5 = 0
            r13 = r11
            r12 = r10
            r10 = r13
            r14 = r6
            r15 = r7
            r6 = r8
            r13 = r9
            r9 = r4
            r8 = r5
            r5 = r3
            r3 = r23
        L7b:
            if (r8 >= r9) goto Lcd
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r10 & r18
            r4 = 0
            r20 = 128(0x80, double:6.3E-322)
            int r7 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r7 >= 0) goto L8a
            r7 = 1
            goto L8b
        L8a:
            r7 = 0
        L8b:
            if (r7 == 0) goto Lc1
            int r4 = r12 << 3
            int r4 = r4 + r8
            r7 = 0
            androidx.collection.MapEntry r1 = new androidx.collection.MapEntry
            r23 = r4
            java.lang.Object[] r4 = r15.keys
            r4 = r4[r23]
            r18 = r5
            java.lang.Object[] r5 = r15.values
            r5 = r5[r23]
            r1.<init>(r4, r5)
            r2.L$0 = r3
            r2.L$1 = r15
            r2.L$2 = r14
            r2.I$0 = r13
            r2.I$1 = r12
            r2.J$0 = r10
            r2.I$2 = r9
            r2.I$3 = r8
            r4 = 1
            r2.label = r4
            java.lang.Object r1 = r3.yield(r1, r2)
            if (r1 != r0) goto Lbe
            return r0
        Lbe:
            r5 = r18
        Lc0:
            goto Lc3
        Lc1:
            r18 = r5
        Lc3:
            long r10 = r10 >> r16
            r17 = 1
            int r8 = r8 + 1
            r1 = r22
            goto L7b
        Lcd:
            r18 = r5
            r17 = 1
            r1 = r16
            if (r9 != r1) goto Lde
            r5 = r3
            r8 = r6
            r10 = r12
            r9 = r13
            r6 = r14
            r7 = r15
            r3 = r18
            goto Le7
        Lde:
            r5 = r18
            goto Lf2
        Le1:
            r1 = r16
            r17 = 1
            r5 = r23
        Le7:
            if (r10 == r9) goto Lf1
            int r10 = r10 + 1
            r16 = r1
            r1 = r22
            goto L50
        Lf1:
            r5 = r3
        Lf2:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }
}
