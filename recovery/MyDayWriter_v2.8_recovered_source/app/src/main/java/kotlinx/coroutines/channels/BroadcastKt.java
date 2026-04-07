package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Broadcast.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u009b\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2-\b\u0002\u0010\n\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bj\u0004\u0018\u0001`\u00112/\b\u0001\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0013¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001a2\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00192\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¨\u0006\u001a"}, d2 = {"broadcast", "Lkotlinx/coroutines/channels/BroadcastChannel;", "E", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "start", "Lkotlinx/coroutines/CoroutineStart;", "onCompletion", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/BroadcastChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BroadcastKt {


    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BroadcastKt$broadcast$2, reason: invalid class name */
    /* JADX INFO: compiled from: Broadcast.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", f = "Broadcast.kt", i = {0, 1}, l = {52, 53}, m = "invokeSuspend", n = {"$this$broadcast", "$this$broadcast"}, s = {"L$0", "L$0"})
    static final class AnonymousClass2<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $channel;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        int label;

        AnonymousClass2(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.BroadcastKt.AnonymousClass2> r3) {
                r1 = this;
                r1.$channel = r2
                r0 = 2
                r1.<init>(r0, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                kotlinx.coroutines.channels.BroadcastKt$broadcast$2 r0 = new kotlinx.coroutines.channels.BroadcastKt$broadcast$2
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r2.$channel
                r0.<init>(r1, r4)
                r0.L$0 = r3
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super E> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.BroadcastKt$broadcast$2 r0 = (kotlinx.coroutines.channels.BroadcastKt.AnonymousClass2) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.label
                switch(r1) {
                    case 0: goto L34;
                    case 1: goto L22;
                    case 2: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L11:
                r1 = r8
                java.lang.Object r2 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
                java.lang.Object r3 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.ResultKt.throwOnFailure(r9)
                r7 = r3
                r3 = r2
                r2 = r7
                goto L7a
            L22:
                r1 = r8
                java.lang.Object r2 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
                java.lang.Object r3 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.ResultKt.throwOnFailure(r9)
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r0
                r0 = r9
                goto L59
            L34:
                kotlin.ResultKt.throwOnFailure(r9)
                r1 = r8
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlinx.coroutines.channels.ReceiveChannel<E> r3 = r1.$channel
                kotlinx.coroutines.channels.ChannelIterator r3 = r3.iterator()
            L42:
                r4 = r1
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r1.L$0 = r2
                r1.L$1 = r3
                r5 = 1
                r1.label = r5
                java.lang.Object r4 = r3.hasNext(r4)
                if (r4 != r0) goto L53
                return r0
            L53:
                r7 = r0
                r0 = r9
                r9 = r4
                r4 = r2
                r2 = r1
                r1 = r7
            L59:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L7b
                java.lang.Object r9 = r3.next()
                r5 = r2
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r2.L$0 = r4
                r2.L$1 = r3
                r6 = 2
                r2.label = r6
                java.lang.Object r9 = r4.send(r9, r5)
                if (r9 != r1) goto L76
                return r1
            L76:
                r9 = r0
                r0 = r1
                r1 = r2
                r2 = r4
            L7a:
                goto L42
            L7b:
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    public static final <E> kotlinx.coroutines.channels.BroadcastChannel<E> broadcast(kotlinx.coroutines.CoroutineScope r4, kotlin.coroutines.CoroutineContext r5, int r6, kotlinx.coroutines.CoroutineStart r7, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r8, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ProducerScope<? super E>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r9) {
            kotlin.coroutines.CoroutineContext r0 = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(r4, r5)
            kotlinx.coroutines.channels.BroadcastChannel r1 = kotlinx.coroutines.channels.BroadcastChannelKt.BroadcastChannel(r6)
            boolean r2 = r7.isLazy()
            if (r2 == 0) goto L16
            kotlinx.coroutines.channels.LazyBroadcastCoroutine r2 = new kotlinx.coroutines.channels.LazyBroadcastCoroutine
            r2.<init>(r0, r1, r9)
            kotlinx.coroutines.channels.BroadcastCoroutine r2 = (kotlinx.coroutines.channels.BroadcastCoroutine) r2
            goto L1c
        L16:
            kotlinx.coroutines.channels.BroadcastCoroutine r2 = new kotlinx.coroutines.channels.BroadcastCoroutine
            r3 = 1
            r2.<init>(r0, r1, r3)
        L1c:
            if (r8 == 0) goto L22
            r2.invokeOnCompletion(r8)
        L22:
            r2.start(r7, r2, r9)
            r3 = r2
            kotlinx.coroutines.channels.BroadcastChannel r3 = (kotlinx.coroutines.channels.BroadcastChannel) r3
            return r3
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    public static final <E> kotlinx.coroutines.channels.BroadcastChannel<E> broadcast(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r12, int r13, kotlinx.coroutines.CoroutineStart r14) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
            kotlinx.coroutines.CoroutineScope r0 = kotlinx.coroutines.CoroutineScopeKt.plus(r0, r1)
            r1 = 0
            kotlinx.coroutines.CoroutineExceptionHandler$Key r2 = kotlinx.coroutines.CoroutineExceptionHandler.Key
            kotlinx.coroutines.channels.BroadcastKt$broadcast$$inlined$CoroutineExceptionHandler$1 r3 = new kotlinx.coroutines.channels.BroadcastKt$broadcast$$inlined$CoroutineExceptionHandler$1
            r3.<init>(r2)
            kotlinx.coroutines.CoroutineExceptionHandler r3 = (kotlinx.coroutines.CoroutineExceptionHandler) r3
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            kotlinx.coroutines.CoroutineScope r4 = kotlinx.coroutines.CoroutineScopeKt.plus(r0, r3)
            r0 = r12
            kotlinx.coroutines.channels.BroadcastKt$broadcast$1 r1 = new kotlinx.coroutines.channels.BroadcastKt$broadcast$1
            r1.<init>(r12)
            r8 = r1
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            kotlinx.coroutines.channels.BroadcastKt$broadcast$2 r1 = new kotlinx.coroutines.channels.BroadcastKt$broadcast$2
            r2 = 0
            r1.<init>(r0, r2)
            r9 = r1
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            r10 = 1
            r11 = 0
            r5 = 0
            r6 = r13
            r7 = r14
            kotlinx.coroutines.channels.BroadcastChannel r13 = broadcast$default(r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
    }

    public static /* synthetic */ kotlinx.coroutines.channels.BroadcastChannel broadcast$default(kotlinx.coroutines.CoroutineScope r0, kotlin.coroutines.CoroutineContext r1, int r2, kotlinx.coroutines.CoroutineStart r3, kotlin.jvm.functions.Function1 r4, kotlin.jvm.functions.Function2 r5, int r6, java.lang.Object r7) {
            r7 = r6 & 1
            if (r7 == 0) goto L8
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        L8:
            r7 = r6 & 2
            if (r7 == 0) goto Ld
            r2 = 1
        Ld:
            r7 = r6 & 4
            if (r7 == 0) goto L13
            kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.LAZY
        L13:
            r6 = r6 & 8
            if (r6 == 0) goto L1a
            r4 = 0
            r6 = r4
            goto L1b
        L1a:
            r6 = r4
        L1b:
            r4 = r2
            r7 = r5
            r2 = r0
            r5 = r3
            r3 = r1
            kotlinx.coroutines.channels.BroadcastChannel r0 = broadcast(r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.BroadcastChannel broadcast$default(kotlinx.coroutines.channels.ReceiveChannel r0, int r1, kotlinx.coroutines.CoroutineStart r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 1
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lb
            kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.LAZY
        Lb:
            kotlinx.coroutines.channels.BroadcastChannel r0 = broadcast(r0, r1, r2)
            return r0
    }
}
