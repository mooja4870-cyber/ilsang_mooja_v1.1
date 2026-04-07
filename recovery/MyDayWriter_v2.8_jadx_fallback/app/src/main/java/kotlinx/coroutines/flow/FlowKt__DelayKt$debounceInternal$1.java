package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "downstream", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {215, 418}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
final class FlowKt__DelayKt$debounceInternal$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $this_debounceInternal;
    final /* synthetic */ kotlin.jvm.functions.Function1<T, java.lang.Long> $timeoutMillisSelector;
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;

    FlowKt__DelayKt$debounceInternal$1(kotlin.jvm.functions.Function1<? super T, java.lang.Long> r2, kotlinx.coroutines.flow.Flow<? extends T> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1> r4) {
            r1 = this;
            r1.$timeoutMillisSelector = r2
            r1.$this_debounceInternal = r3
            r0 = 3
            r1.<init>(r0, r4)
            return
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r2, java.lang.Object r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r1 = this;
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            java.lang.Object r0 = r1.invoke(r2, r3, r4)
            return r0
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r4, kotlinx.coroutines.flow.FlowCollector<? super T> r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            r3 = this;
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1
            kotlin.jvm.functions.Function1<T, java.lang.Long> r1 = r3.$timeoutMillisSelector
            kotlinx.coroutines.flow.Flow<T> r2 = r3.$this_debounceInternal
            r0.<init>(r1, r2, r6)
            r0.L$0 = r4
            r0.L$1 = r5
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r0.invokeSuspend(r1)
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            r18 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r1 = r18
            int r2 = r1.label
            r4 = 0
            r6 = 1
            r7 = 0
            switch(r2) {
                case 0: goto L47;
                case 1: goto L2e;
                case 2: goto L17;
                default: goto Lf;
            }
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L17:
            r2 = r18
            r8 = r19
            r9 = 0
            r10 = 0
            java.lang.Object r11 = r2.L$2
            kotlin.jvm.internal.Ref$ObjectRef r11 = (kotlin.jvm.internal.Ref.ObjectRef) r11
            java.lang.Object r12 = r2.L$1
            kotlinx.coroutines.channels.ReceiveChannel r12 = (kotlinx.coroutines.channels.ReceiveChannel) r12
            java.lang.Object r13 = r2.L$0
            kotlinx.coroutines.flow.FlowCollector r13 = (kotlinx.coroutines.flow.FlowCollector) r13
            kotlin.ResultKt.throwOnFailure(r8)
            goto L141
        L2e:
            r2 = r18
            r8 = r19
            java.lang.Object r9 = r2.L$3
            kotlin.jvm.internal.Ref$LongRef r9 = (kotlin.jvm.internal.Ref.LongRef) r9
            java.lang.Object r10 = r2.L$2
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref.ObjectRef) r10
            java.lang.Object r11 = r2.L$1
            kotlinx.coroutines.channels.ReceiveChannel r11 = (kotlinx.coroutines.channels.ReceiveChannel) r11
            java.lang.Object r12 = r2.L$0
            kotlinx.coroutines.flow.FlowCollector r12 = (kotlinx.coroutines.flow.FlowCollector) r12
            kotlin.ResultKt.throwOnFailure(r8)
            goto Lc7
        L47:
            kotlin.ResultKt.throwOnFailure(r19)
            r2 = r18
            r8 = r19
            java.lang.Object r9 = r2.L$0
            r10 = r9
            kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
            java.lang.Object r9 = r2.L$1
            kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1 r11 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1
            kotlinx.coroutines.flow.Flow<T> r12 = r2.$this_debounceInternal
            r11.<init>(r12, r7)
            r13 = r11
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            r14 = 3
            r15 = 0
            r11 = 0
            r12 = 0
            kotlinx.coroutines.channels.ReceiveChannel r10 = kotlinx.coroutines.channels.ProduceKt.produce$default(r10, r11, r12, r13, r14, r15)
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
            r11.<init>()
            r12 = r11
            r11 = r10
            r10 = r12
            r12 = r9
        L72:
            T r9 = r10.element
            kotlinx.coroutines.internal.Symbol r13 = kotlinx.coroutines.flow.internal.NullSurrogateKt.DONE
            if (r9 == r13) goto L14a
            kotlin.jvm.internal.Ref$LongRef r9 = new kotlin.jvm.internal.Ref$LongRef
            r9.<init>()
            T r13 = r10.element
            if (r13 == 0) goto Ldb
            kotlin.jvm.functions.Function1<T, java.lang.Long> r13 = r2.$timeoutMillisSelector
            kotlinx.coroutines.internal.Symbol r14 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            T r15 = r10.element
            r16 = 0
            if (r15 != r14) goto L8d
            r15 = r7
        L8d:
            java.lang.Object r13 = r13.invoke(r15)
            java.lang.Number r13 = (java.lang.Number) r13
            long r13 = r13.longValue()
            r9.element = r13
            long r13 = r9.element
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 < 0) goto La1
            r13 = r6
            goto La2
        La1:
            r13 = 0
        La2:
            if (r13 == 0) goto Lcd
            long r13 = r9.element
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 != 0) goto Ldb
            kotlinx.coroutines.internal.Symbol r13 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            T r14 = r10.element
            r15 = 0
            if (r14 != r13) goto Lb3
            r14 = r7
        Lb3:
            r13 = r2
            kotlin.coroutines.Continuation r13 = (kotlin.coroutines.Continuation) r13
            r2.L$0 = r12
            r2.L$1 = r11
            r2.L$2 = r10
            r2.L$3 = r9
            r2.label = r6
            java.lang.Object r13 = r12.emit(r14, r13)
            if (r13 != r0) goto Lc7
            return r0
        Lc7:
            r10.element = r7
            r13 = r12
            r12 = r11
            r11 = r10
            goto Lde
        Lcd:
            r0 = 0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Debounce timeout should not be negative"
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        Ldb:
            r13 = r12
            r12 = r11
            r11 = r10
        Lde:
            boolean r10 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r10 == 0) goto Lfc
            r10 = 0
            T r14 = r11.element
            if (r14 == 0) goto Lf2
            long r14 = r9.element
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 <= 0) goto Lf0
            goto Lf2
        Lf0:
            r10 = 0
            goto Lf3
        Lf2:
            r10 = r6
        Lf3:
            if (r10 == 0) goto Lf6
            goto Lfc
        Lf6:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        Lfc:
            r10 = 0
            kotlinx.coroutines.selects.SelectImplementation r14 = new kotlinx.coroutines.selects.SelectImplementation
            kotlin.coroutines.CoroutineContext r15 = r2.getContext()
            r14.<init>(r15)
            r15 = 0
            r3 = r14
            kotlinx.coroutines.selects.SelectBuilder r3 = (kotlinx.coroutines.selects.SelectBuilder) r3
            r17 = 0
            T r4 = r11.element
            if (r4 == 0) goto L11d
            long r4 = r9.element
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1 r6 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1
            r6.<init>(r13, r11, r7)
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            kotlinx.coroutines.selects.OnTimeoutKt.onTimeout(r3, r4, r6)
        L11d:
            kotlinx.coroutines.selects.SelectClause1 r4 = r12.getOnReceiveCatching()
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2 r5 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2
            r5.<init>(r11, r13, r7)
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            r3.invoke(r4, r5)
            r2.L$0 = r13
            r2.L$1 = r12
            r2.L$2 = r11
            r2.L$3 = r7
            r3 = 2
            r2.label = r3
            java.lang.Object r3 = r14.doSelect(r2)
            if (r3 != r0) goto L13f
            return r0
        L13f:
            r9 = r10
            r10 = r15
        L141:
            r10 = r11
            r11 = r12
            r12 = r13
            r4 = 0
            r6 = 1
            goto L72
        L14a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }
}
