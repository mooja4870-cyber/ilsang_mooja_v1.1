package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u0007¢\u0006\u0002\u0010\u0005\u001a)\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"sendBlocking", "", "E", "Lkotlinx/coroutines/channels/SendChannel;", "element", "(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Object;)V", "trySendBlocking", "Lkotlinx/coroutines/channels/ChannelResult;", "(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/channels/ChannelsKt")
final /* synthetic */ class ChannelsKt__ChannelsKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1, reason: invalid class name */
    /* JADX INFO: compiled from: Channels.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", f = "Channels.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ E $element;
        final /* synthetic */ kotlinx.coroutines.channels.SendChannel<E> $this_sendBlocking;
        int label;

        AnonymousClass1(kotlinx.coroutines.channels.SendChannel<? super E> r2, E r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__ChannelsKt.AnonymousClass1> r4) {
                r1 = this;
                r1.$this_sendBlocking = r2
                r1.$element = r3
                r0 = 2
                r1.<init>(r0, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1
                kotlinx.coroutines.channels.SendChannel<E> r1 = r3.$this_sendBlocking
                E r2 = r3.$element
                r0.<init>(r1, r2, r5)
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke2(r2, r3)
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__ChannelsKt.AnonymousClass1) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.label
                switch(r1) {
                    case 0: goto L16;
                    case 1: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L11:
                r0 = r6
                kotlin.ResultKt.throwOnFailure(r7)
                goto L2c
            L16:
                kotlin.ResultKt.throwOnFailure(r7)
                r1 = r6
                kotlinx.coroutines.channels.SendChannel<E> r2 = r1.$this_sendBlocking
                E r3 = r1.$element
                r4 = r1
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r5 = 1
                r1.label = r5
                java.lang.Object r2 = r2.send(r3, r4)
                if (r2 != r0) goto L2b
                return r0
            L2b:
                r0 = r1
            L2c:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2, reason: invalid class name */
    /* JADX INFO: compiled from: Channels.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/channels/ChannelResult;", "", "E", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends kotlin.Unit>>, java.lang.Object> {
        final /* synthetic */ E $element;
        final /* synthetic */ kotlinx.coroutines.channels.SendChannel<E> $this_trySendBlocking;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        AnonymousClass2(kotlinx.coroutines.channels.SendChannel<? super E> r2, E r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__ChannelsKt.AnonymousClass2> r4) {
                r1 = this;
                r1.$this_trySendBlocking = r2
                r1.$element = r3
                r0 = 2
                r1.<init>(r0, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2 r0 = new kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2
                kotlinx.coroutines.channels.SendChannel<E> r1 = r3.$this_trySendBlocking
                E r2 = r3.$element
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends kotlin.Unit>> r3) {
                r1 = this;
                kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke2(r2, r3)
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<kotlin.Unit>> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2 r0 = (kotlinx.coroutines.channels.ChannelsKt__ChannelsKt.AnonymousClass2) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                switch(r1) {
                    case 0: goto L19;
                    case 1: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L11:
                r0 = r7
                r1 = 0
                kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L17
                goto L34
            L17:
                r1 = move-exception
                goto L3f
            L19:
                kotlin.ResultKt.throwOnFailure(r8)
                r1 = r7
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
                kotlinx.coroutines.channels.SendChannel<E> r3 = r1.$this_trySendBlocking
                E r4 = r1.$element
                kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L3b
                r2 = 0
                r5 = 1
                r1.label = r5     // Catch: java.lang.Throwable -> L3b
                java.lang.Object r3 = r3.send(r4, r1)     // Catch: java.lang.Throwable -> L3b
                if (r3 != r0) goto L32
                return r0
            L32:
                r0 = r1
                r1 = r2
            L34:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L17
                java.lang.Object r1 = kotlin.Result.m153constructorimpl(r1)     // Catch: java.lang.Throwable -> L17
                goto L49
            L3b:
                r0 = move-exception
                r6 = r1
                r1 = r0
                r0 = r6
            L3f:
                kotlin.Result$Companion r2 = kotlin.Result.Companion
                java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
                java.lang.Object r1 = kotlin.Result.m153constructorimpl(r1)
            L49:
                boolean r2 = kotlin.Result.m160isSuccessimpl(r1)
                if (r2 == 0) goto L58
                kotlinx.coroutines.channels.ChannelResult$Companion r2 = kotlinx.coroutines.channels.ChannelResult.Companion
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                java.lang.Object r2 = r2.m1682successJP2dKIU(r3)
                goto L62
            L58:
                kotlinx.coroutines.channels.ChannelResult$Companion r2 = kotlinx.coroutines.channels.ChannelResult.Companion
                java.lang.Throwable r3 = kotlin.Result.m156exceptionOrNullimpl(r1)
                java.lang.Object r2 = r2.m1680closedJP2dKIU(r3)
            L62:
                kotlinx.coroutines.channels.ChannelResult r1 = kotlinx.coroutines.channels.ChannelResult.m1667boximpl(r2)
                return r1
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @kotlin.ReplaceWith(expression = "trySendBlocking(element)", imports = {}))
    public static final /* synthetic */ void sendBlocking(kotlinx.coroutines.channels.SendChannel r3, java.lang.Object r4) {
            java.lang.Object r0 = r3.mo1656trySendJP2dKIU(r4)
            boolean r0 = kotlinx.coroutines.channels.ChannelResult.m1677isSuccessimpl(r0)
            if (r0 == 0) goto Lb
            return
        Lb:
            kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1
            r1 = 0
            r0.<init>(r3, r4, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r2 = 1
            kotlinx.coroutines.BuildersKt.runBlocking$default(r1, r0, r2, r1)
            return
    }

    public static final <E> java.lang.Object trySendBlocking(kotlinx.coroutines.channels.SendChannel<? super E> r6, E r7) {
            java.lang.Object r0 = r6.mo1656trySendJP2dKIU(r7)
            r1 = 0
            boolean r2 = r0 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r2 != 0) goto L17
            r2 = r0
            kotlin.Unit r2 = (kotlin.Unit) r2
            r3 = 0
            kotlinx.coroutines.channels.ChannelResult$Companion r4 = kotlinx.coroutines.channels.ChannelResult.Companion
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            java.lang.Object r4 = r4.m1682successJP2dKIU(r5)
            return r4
        L17:
            kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2 r0 = new kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2
            r1 = 0
            r0.<init>(r6, r7, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r2 = 1
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.runBlocking$default(r1, r0, r2, r1)
            kotlinx.coroutines.channels.ChannelResult r0 = (kotlinx.coroutines.channels.ChannelResult) r0
            java.lang.Object r0 = r0.m1679unboximpl()
            return r0
    }
}
