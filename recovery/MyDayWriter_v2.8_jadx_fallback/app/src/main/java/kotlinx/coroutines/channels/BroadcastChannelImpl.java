package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: BroadcastChannel.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u000245B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0017\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010!H\u0010¢\u0006\u0002\b\"J\u0012\u0010#\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016J\u001e\u0010&\u001a\u00020'2\n\u0010(\u001a\u0006\u0012\u0002\b\u00030\u00132\b\u0010)\u001a\u0004\u0018\u00010\rH\u0014J\u0016\u0010*\u001a\u00020'2\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0002J\u0016\u0010,\u001a\u00020'2\u0006\u0010)\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010-J\b\u0010.\u001a\u00020/H\u0016J#\u00100\u001a\b\u0012\u0004\u0012\u00020'012\u0006\u0010)\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R6\u0010\u0011\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0012j\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0012\u0006\u0012\u0004\u0018\u00010\r`\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001c\u001a\u0004\u0018\u00018\u00008F¢\u0006\f\u0012\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastChannelImpl;", "E", "Lkotlinx/coroutines/channels/BufferedChannel;", "Lkotlinx/coroutines/channels/BroadcastChannel;", "capacity", "", "(I)V", "getCapacity", "()I", "isClosedForSend", "", "()Z", "lastConflatedElement", "", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "onSendInternalResult", "Ljava/util/HashMap;", "Lkotlinx/coroutines/selects/SelectInstance;", "Lkotlin/collections/HashMap;", "subscribers", "", "value", "getValue$annotations", "()V", "getValue", "()Ljava/lang/Object;", "valueOrNull", "getValueOrNull$annotations", "getValueOrNull", "cancelImpl", "cause", "", "cancelImpl$kotlinx_coroutines_core", "close", "openSubscription", "Lkotlinx/coroutines/channels/ReceiveChannel;", "registerSelectForSend", "", "select", "element", "removeSubscriber", "s", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toString", "", "trySend", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "SubscriberBuffered", "SubscriberConflated", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BroadcastChannelImpl<E> extends kotlinx.coroutines.channels.BufferedChannel<E> implements kotlinx.coroutines.channels.BroadcastChannel<E> {
    private final int capacity;
    private java.lang.Object lastConflatedElement;
    private final java.util.concurrent.locks.ReentrantLock lock;
    private final java.util.HashMap<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object> onSendInternalResult;
    private java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> subscribers;

    /* JADX INFO: compiled from: BroadcastChannel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberBuffered;", "Lkotlinx/coroutines/channels/BufferedChannel;", "(Lkotlinx/coroutines/channels/BroadcastChannelImpl;)V", "cancelImpl", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class SubscriberBuffered extends kotlinx.coroutines.channels.BufferedChannel<E> {
        final /* synthetic */ kotlinx.coroutines.channels.BroadcastChannelImpl<E> this$0;

        public SubscriberBuffered(kotlinx.coroutines.channels.BroadcastChannelImpl r4) {
                r3 = this;
                r3.this$0 = r4
                int r0 = r4.getCapacity()
                r1 = 0
                r2 = 2
                r3.<init>(r0, r1, r2, r1)
                return
        }

        public boolean cancelImpl(java.lang.Throwable r7) {
                r6 = this;
                kotlinx.coroutines.channels.BroadcastChannelImpl<E> r0 = r6.this$0
                java.util.concurrent.locks.ReentrantLock r0 = kotlinx.coroutines.channels.BroadcastChannelImpl.access$getLock$p(r0)
                kotlinx.coroutines.channels.BroadcastChannelImpl<E> r1 = r6.this$0
                r2 = 0
                r3 = r0
                java.util.concurrent.locks.Lock r3 = (java.util.concurrent.locks.Lock) r3
                r3.lock()
                r4 = 0
                r5 = r6
                kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5     // Catch: java.lang.Throwable -> L1e
                kotlinx.coroutines.channels.BroadcastChannelImpl.access$removeSubscriber(r1, r5)     // Catch: java.lang.Throwable -> L1e
                boolean r1 = super.cancelImpl$kotlinx_coroutines_core(r7)     // Catch: java.lang.Throwable -> L1e
                r3.unlock()
                return r1
            L1e:
                r1 = move-exception
                r3.unlock()
                throw r1
        }

        @Override // kotlinx.coroutines.channels.BufferedChannel
        public /* bridge */ /* synthetic */ boolean cancelImpl$kotlinx_coroutines_core(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.cancelImpl(r2)
                return r0
        }
    }

    /* JADX INFO: compiled from: BroadcastChannel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberConflated;", "Lkotlinx/coroutines/channels/ConflatedBufferedChannel;", "(Lkotlinx/coroutines/channels/BroadcastChannelImpl;)V", "cancelImpl", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class SubscriberConflated extends kotlinx.coroutines.channels.ConflatedBufferedChannel<E> {
        final /* synthetic */ kotlinx.coroutines.channels.BroadcastChannelImpl<E> this$0;

        public SubscriberConflated(kotlinx.coroutines.channels.BroadcastChannelImpl r7) {
                r6 = this;
                r6.this$0 = r7
                kotlinx.coroutines.channels.BufferOverflow r2 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
                r4 = 4
                r5 = 0
                r1 = 1
                r3 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public boolean cancelImpl(java.lang.Throwable r3) {
                r2 = this;
                kotlinx.coroutines.channels.BroadcastChannelImpl<E> r0 = r2.this$0
                r1 = r2
                kotlinx.coroutines.channels.ReceiveChannel r1 = (kotlinx.coroutines.channels.ReceiveChannel) r1
                kotlinx.coroutines.channels.BroadcastChannelImpl.access$removeSubscriber(r0, r1)
                boolean r0 = super.cancelImpl$kotlinx_coroutines_core(r3)
                return r0
        }

        @Override // kotlinx.coroutines.channels.BufferedChannel
        public /* bridge */ /* synthetic */ boolean cancelImpl$kotlinx_coroutines_core(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.cancelImpl(r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2, reason: invalid class name */
    /* JADX INFO: compiled from: BroadcastChannel.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2", f = "BroadcastChannel.kt", i = {}, l = {288}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.Object $element;
        final /* synthetic */ kotlinx.coroutines.selects.SelectInstance<?> $select;
        int label;
        final /* synthetic */ kotlinx.coroutines.channels.BroadcastChannelImpl<E> this$0;

        AnonymousClass2(kotlinx.coroutines.channels.BroadcastChannelImpl<E> r2, java.lang.Object r3, kotlinx.coroutines.selects.SelectInstance<?> r4, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.BroadcastChannelImpl.AnonymousClass2> r5) {
                r1 = this;
                r1.this$0 = r2
                r1.$element = r3
                r1.$select = r4
                r0 = 2
                r1.<init>(r0, r5)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r5, kotlin.coroutines.Continuation<?> r6) {
                r4 = this;
                kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2 r0 = new kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2
                kotlinx.coroutines.channels.BroadcastChannelImpl<E> r1 = r4.this$0
                java.lang.Object r2 = r4.$element
                kotlinx.coroutines.selects.SelectInstance<?> r3 = r4.$select
                r0.<init>(r1, r2, r3, r6)
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
                kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2 r0 = (kotlinx.coroutines.channels.BroadcastChannelImpl.AnonymousClass2) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.label
                r2 = 0
                r3 = 1
                switch(r1) {
                    case 0: goto L1a;
                    case 1: goto L13;
                    default: goto Lb;
                }
            Lb:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L13:
                r0 = r12
                kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Throwable -> L18
                goto L30
            L18:
                r1 = move-exception
                goto L36
            L1a:
                kotlin.ResultKt.throwOnFailure(r13)
                r1 = r12
                kotlinx.coroutines.channels.BroadcastChannelImpl<E> r4 = r1.this$0     // Catch: java.lang.Throwable -> L32
                java.lang.Object r5 = r1.$element     // Catch: java.lang.Throwable -> L32
                r6 = r1
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6     // Catch: java.lang.Throwable -> L32
                r1.label = r3     // Catch: java.lang.Throwable -> L32
                java.lang.Object r4 = r4.send(r5, r6)     // Catch: java.lang.Throwable -> L32
                if (r4 != r0) goto L2f
                return r0
            L2f:
                r0 = r1
            L30:
                r1 = r3
                goto L4b
            L32:
                r0 = move-exception
                r11 = r1
                r1 = r0
                r0 = r11
            L36:
                kotlinx.coroutines.channels.BroadcastChannelImpl<E> r4 = r0.this$0
                boolean r4 = r4.isClosedForSend()
                if (r4 == 0) goto Lb5
                boolean r4 = r1 instanceof kotlinx.coroutines.channels.ClosedSendChannelException
                if (r4 != 0) goto L4a
                kotlinx.coroutines.channels.BroadcastChannelImpl<E> r4 = r0.this$0
                java.lang.Throwable r4 = r4.getSendException()
                if (r4 != r1) goto Lb5
            L4a:
                r1 = r2
            L4b:
                kotlinx.coroutines.channels.BroadcastChannelImpl<E> r4 = r0.this$0
                java.util.concurrent.locks.ReentrantLock r4 = kotlinx.coroutines.channels.BroadcastChannelImpl.access$getLock$p(r4)
                kotlinx.coroutines.channels.BroadcastChannelImpl<E> r5 = r0.this$0
                kotlinx.coroutines.selects.SelectInstance<?> r6 = r0.$select
                r7 = 0
                r8 = r4
                java.util.concurrent.locks.Lock r8 = (java.util.concurrent.locks.Lock) r8
                r8.lock()
                r4 = 0
                boolean r9 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()     // Catch: java.lang.Throwable -> Lb0
                if (r9 == 0) goto L79
                r9 = 0
                java.util.HashMap r10 = kotlinx.coroutines.channels.BroadcastChannelImpl.access$getOnSendInternalResult$p(r5)     // Catch: java.lang.Throwable -> Lb0
                java.lang.Object r10 = r10.get(r6)     // Catch: java.lang.Throwable -> Lb0
                if (r10 != 0) goto L70
                r2 = r3
            L70:
                if (r2 == 0) goto L73
                goto L79
            L73:
                java.lang.AssertionError r2 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> Lb0
                r2.<init>()     // Catch: java.lang.Throwable -> Lb0
                throw r2     // Catch: java.lang.Throwable -> Lb0
            L79:
                java.util.HashMap r2 = kotlinx.coroutines.channels.BroadcastChannelImpl.access$getOnSendInternalResult$p(r5)     // Catch: java.lang.Throwable -> Lb0
                java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> Lb0
                if (r1 == 0) goto L84
                kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lb0
                goto L88
            L84:
                kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()     // Catch: java.lang.Throwable -> Lb0
            L88:
                r2.put(r6, r3)     // Catch: java.lang.Throwable -> Lb0
                java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r1)     // Catch: java.lang.Throwable -> Lb0
                r1 = r6
                kotlinx.coroutines.selects.SelectImplementation r1 = (kotlinx.coroutines.selects.SelectImplementation) r1     // Catch: java.lang.Throwable -> Lb0
                r1 = r6
                kotlinx.coroutines.selects.SelectImplementation r1 = (kotlinx.coroutines.selects.SelectImplementation) r1     // Catch: java.lang.Throwable -> Lb0
                kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lb0
                kotlinx.coroutines.selects.TrySelectDetailedResult r1 = r1.trySelectDetailed(r5, r2)     // Catch: java.lang.Throwable -> Lb0
                kotlinx.coroutines.selects.TrySelectDetailedResult r2 = kotlinx.coroutines.selects.TrySelectDetailedResult.REREGISTER     // Catch: java.lang.Throwable -> Lb0
                if (r1 == r2) goto La7
                java.util.HashMap r1 = kotlinx.coroutines.channels.BroadcastChannelImpl.access$getOnSendInternalResult$p(r5)     // Catch: java.lang.Throwable -> Lb0
                r1.remove(r6)     // Catch: java.lang.Throwable -> Lb0
            La7:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lb0
                r8.unlock()
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
            Lb0:
                r1 = move-exception
                r8.unlock()
                throw r1
            Lb5:
                throw r1
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BroadcastChannelImpl$send$1, reason: invalid class name */
    /* JADX INFO: compiled from: BroadcastChannel.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.BroadcastChannelImpl", f = "BroadcastChannel.kt", i = {0, 0}, l = {227}, m = "send", n = {"this", "element"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ kotlinx.coroutines.channels.BroadcastChannelImpl<E> this$0;

        AnonymousClass1(kotlinx.coroutines.channels.BroadcastChannelImpl<E> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.BroadcastChannelImpl.AnonymousClass1> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                r3 = this;
                r3.result = r4
                int r0 = r3.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r3.label = r0
                kotlinx.coroutines.channels.BroadcastChannelImpl<E> r0 = r3.this$0
                r1 = 0
                r2 = r3
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r0 = r0.send(r1, r2)
                return r0
        }
    }

    public BroadcastChannelImpl(int r5) {
            r4 = this;
            r0 = 0
            r1 = 0
            r4.<init>(r1, r0)
            r4.capacity = r5
            int r0 = r4.capacity
            r2 = 1
            if (r0 >= r2) goto L12
            int r0 = r4.capacity
            r3 = -1
            if (r0 != r3) goto L13
        L12:
            r1 = r2
        L13:
            if (r1 == 0) goto L31
        L16:
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r4.lock = r0
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r4.subscribers = r0
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BroadcastChannelKt.access$getNO_ELEMENT$p()
            r4.lastConflatedElement = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.onSendInternalResult = r0
            return
        L31:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "BroadcastChannel capacity must be positive or Channel.CONFLATED, but "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r4.capacity
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " was specified"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public static final /* synthetic */ java.util.concurrent.locks.ReentrantLock access$getLock$p(kotlinx.coroutines.channels.BroadcastChannelImpl r1) {
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            return r0
    }

    public static final /* synthetic */ java.util.HashMap access$getOnSendInternalResult$p(kotlinx.coroutines.channels.BroadcastChannelImpl r1) {
            java.util.HashMap<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object> r0 = r1.onSendInternalResult
            return r0
    }

    public static final /* synthetic */ void access$removeSubscriber(kotlinx.coroutines.channels.BroadcastChannelImpl r0, kotlinx.coroutines.channels.ReceiveChannel r1) {
            r0.removeSubscriber(r1)
            return
    }

    public static /* synthetic */ void getValue$annotations() {
            return
    }

    public static /* synthetic */ void getValueOrNull$annotations() {
            return
    }

    private final void removeSubscriber(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r15) {
            r14 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r14.lock
            r1 = 0
            r2 = r0
            java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
            r2.lock()
            r3 = 0
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> r4 = r14.subscribers     // Catch: java.lang.Throwable -> L42
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Throwable -> L42
            r5 = 0
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L42
            r6.<init>()     // Catch: java.lang.Throwable -> L42
            java.util.Collection r6 = (java.util.Collection) r6     // Catch: java.lang.Throwable -> L42
            r7 = r4
            r8 = 0
            java.util.Iterator r9 = r7.iterator()     // Catch: java.lang.Throwable -> L42
        L1c:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r10 == 0) goto L35
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> L42
            r11 = r10
            kotlinx.coroutines.channels.BufferedChannel r11 = (kotlinx.coroutines.channels.BufferedChannel) r11     // Catch: java.lang.Throwable -> L42
            r12 = 0
            if (r11 == r15) goto L2e
            r13 = 1
            goto L2f
        L2e:
            r13 = 0
        L2f:
            if (r13 == 0) goto L1c
            r6.add(r10)     // Catch: java.lang.Throwable -> L42
            goto L1c
        L35:
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L42
            r14.subscribers = r6     // Catch: java.lang.Throwable -> L42
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L42
            r2.unlock()
            return
        L42:
            r3 = move-exception
            r2.unlock()
            throw r3
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean cancelImpl$kotlinx_coroutines_core(java.lang.Throwable r11) {
            r10 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r10.lock
            r1 = 0
            r2 = r0
            java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
            r2.lock()
            r3 = 0
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> r4 = r10.subscribers     // Catch: java.lang.Throwable -> L35
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Throwable -> L35
            r5 = 0
            java.util.Iterator r6 = r4.iterator()     // Catch: java.lang.Throwable -> L35
        L13:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L26
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L35
            r8 = r7
            kotlinx.coroutines.channels.BufferedChannel r8 = (kotlinx.coroutines.channels.BufferedChannel) r8     // Catch: java.lang.Throwable -> L35
            r9 = 0
            r8.cancelImpl$kotlinx_coroutines_core(r11)     // Catch: java.lang.Throwable -> L35
            goto L13
        L26:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.BroadcastChannelKt.access$getNO_ELEMENT$p()     // Catch: java.lang.Throwable -> L35
            r10.lastConflatedElement = r4     // Catch: java.lang.Throwable -> L35
            boolean r4 = super.cancelImpl$kotlinx_coroutines_core(r11)     // Catch: java.lang.Throwable -> L35
            r2.unlock()
            return r4
        L35:
            r3 = move-exception
            r2.unlock()
            throw r3
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public boolean close(java.lang.Throwable r15) {
            r14 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r14.lock
            r1 = 0
            r2 = r0
            java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
            r2.lock()
            r3 = 0
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> r4 = r14.subscribers     // Catch: java.lang.Throwable -> L5f
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Throwable -> L5f
            r5 = 0
            java.util.Iterator r6 = r4.iterator()     // Catch: java.lang.Throwable -> L5f
        L13:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L5f
            if (r7 == 0) goto L26
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L5f
            r8 = r7
            kotlinx.coroutines.channels.BufferedChannel r8 = (kotlinx.coroutines.channels.BufferedChannel) r8     // Catch: java.lang.Throwable -> L5f
            r9 = 0
            r8.close(r15)     // Catch: java.lang.Throwable -> L5f
            goto L13
        L26:
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> r4 = r14.subscribers     // Catch: java.lang.Throwable -> L5f
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Throwable -> L5f
            r5 = 0
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5f
            r6.<init>()     // Catch: java.lang.Throwable -> L5f
            java.util.Collection r6 = (java.util.Collection) r6     // Catch: java.lang.Throwable -> L5f
            r7 = r4
            r8 = 0
            java.util.Iterator r9 = r7.iterator()     // Catch: java.lang.Throwable -> L5f
        L39:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> L5f
            if (r10 == 0) goto L51
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> L5f
            r11 = r10
            kotlinx.coroutines.channels.BufferedChannel r11 = (kotlinx.coroutines.channels.BufferedChannel) r11     // Catch: java.lang.Throwable -> L5f
            r12 = 0
            boolean r13 = r11.hasElements$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L5f
            if (r13 == 0) goto L39
            r6.add(r10)     // Catch: java.lang.Throwable -> L5f
            goto L39
        L51:
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L5f
            r14.subscribers = r6     // Catch: java.lang.Throwable -> L5f
            boolean r4 = super.close(r15)     // Catch: java.lang.Throwable -> L5f
            r2.unlock()
            return r4
        L5f:
            r3 = move-exception
            r2.unlock()
            throw r3
    }

    public final int getCapacity() {
            r1 = this;
            int r0 = r1.capacity
            return r0
    }

    public final E getValue() {
            r6 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r6.lock
            r1 = 0
            r2 = r0
            java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
            r2.lock()
            r3 = 0
            boolean r4 = r6.isClosedForSend()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L20
            java.lang.Throwable r4 = r6.getCloseCause()     // Catch: java.lang.Throwable -> L3a
            if (r4 != 0) goto L1f
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3a
            java.lang.String r5 = "This broadcast channel is closed"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L3a
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Throwable -> L3a
        L1f:
            throw r4     // Catch: java.lang.Throwable -> L3a
        L20:
            java.lang.Object r4 = r6.lastConflatedElement     // Catch: java.lang.Throwable -> L3a
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.BroadcastChannelKt.access$getNO_ELEMENT$p()     // Catch: java.lang.Throwable -> L3a
            if (r4 == r5) goto L2e
            java.lang.Object r4 = r6.lastConflatedElement     // Catch: java.lang.Throwable -> L3a
            r2.unlock()
            return r4
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3a
            java.lang.String r5 = "No value"
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L3a
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L3a
            throw r4     // Catch: java.lang.Throwable -> L3a
        L3a:
            r3 = move-exception
            r2.unlock()
            throw r3
    }

    public final E getValueOrNull() {
            r7 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r7.lock
            r1 = 0
            r2 = r0
            java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
            r2.lock()
            r3 = 0
            boolean r4 = r7.isClosedForReceive()     // Catch: java.lang.Throwable -> L22
            r5 = 0
            if (r4 == 0) goto L12
            goto L1d
        L12:
            java.lang.Object r4 = r7.lastConflatedElement     // Catch: java.lang.Throwable -> L22
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.BroadcastChannelKt.access$getNO_ELEMENT$p()     // Catch: java.lang.Throwable -> L22
            if (r4 != r6) goto L1b
            goto L1d
        L1b:
            java.lang.Object r5 = r7.lastConflatedElement     // Catch: java.lang.Throwable -> L22
        L1d:
            r2.unlock()
            return r5
        L22:
            r3 = move-exception
            r2.unlock()
            throw r3
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
            r5 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r5.lock
            r1 = 0
            r2 = r0
            java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
            r2.lock()
            r3 = 0
            boolean r4 = super.isClosedForSend()     // Catch: java.lang.Throwable -> L12
            r2.unlock()
            return r4
        L12:
            r3 = move-exception
            r2.unlock()
            throw r3
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public kotlinx.coroutines.channels.ReceiveChannel<E> openSubscription() {
            r7 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r7.lock
            r1 = 0
            r2 = r0
            java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
            r2.lock()
            r3 = 0
            int r4 = r7.capacity     // Catch: java.lang.Throwable -> L59
            r5 = -1
            if (r4 != r5) goto L15
            kotlinx.coroutines.channels.BroadcastChannelImpl$SubscriberConflated r4 = new kotlinx.coroutines.channels.BroadcastChannelImpl$SubscriberConflated     // Catch: java.lang.Throwable -> L59
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L59
            goto L1a
        L15:
            kotlinx.coroutines.channels.BroadcastChannelImpl$SubscriberBuffered r4 = new kotlinx.coroutines.channels.BroadcastChannelImpl$SubscriberBuffered     // Catch: java.lang.Throwable -> L59
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L59
        L1a:
            kotlinx.coroutines.channels.BufferedChannel r4 = (kotlinx.coroutines.channels.BufferedChannel) r4     // Catch: java.lang.Throwable -> L59
            boolean r5 = r7.isClosedForSend()     // Catch: java.lang.Throwable -> L59
            if (r5 == 0) goto L38
            java.lang.Object r5 = r7.lastConflatedElement     // Catch: java.lang.Throwable -> L59
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.BroadcastChannelKt.access$getNO_ELEMENT$p()     // Catch: java.lang.Throwable -> L59
            if (r5 != r6) goto L38
            java.lang.Throwable r5 = r7.getCloseCause()     // Catch: java.lang.Throwable -> L59
            r4.close(r5)     // Catch: java.lang.Throwable -> L59
            r5 = r4
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5     // Catch: java.lang.Throwable -> L59
            r2.unlock()
            return r5
        L38:
            java.lang.Object r5 = r7.lastConflatedElement     // Catch: java.lang.Throwable -> L59
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.BroadcastChannelKt.access$getNO_ELEMENT$p()     // Catch: java.lang.Throwable -> L59
            if (r5 == r6) goto L47
            java.lang.Object r5 = r7.getValue()     // Catch: java.lang.Throwable -> L59
            r4.mo1656trySendJP2dKIU(r5)     // Catch: java.lang.Throwable -> L59
        L47:
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> r5 = r7.subscribers     // Catch: java.lang.Throwable -> L59
            java.util.Collection r5 = (java.util.Collection) r5     // Catch: java.lang.Throwable -> L59
            java.util.List r5 = kotlin.collections.CollectionsKt.plus(r5, r4)     // Catch: java.lang.Throwable -> L59
            r7.subscribers = r5     // Catch: java.lang.Throwable -> L59
            r2.unlock()
            r0 = r4
            kotlinx.coroutines.channels.ReceiveChannel r0 = (kotlinx.coroutines.channels.ReceiveChannel) r0
            return r0
        L59:
            r3 = move-exception
            r2.unlock()
            throw r3
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    protected void registerSelectForSend(kotlinx.coroutines.selects.SelectInstance<?> r8, java.lang.Object r9) {
            r7 = this;
            java.util.concurrent.locks.ReentrantLock r1 = r7.lock
            r2 = 0
            r3 = r1
            java.util.concurrent.locks.Lock r3 = (java.util.concurrent.locks.Lock) r3
            r3.lock()
            r0 = 0
            java.util.HashMap<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object> r4 = r7.onSendInternalResult     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r4 = r4.remove(r8)     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L1b
            r8.selectInRegistrationPhase(r4)     // Catch: java.lang.Throwable -> L3a
            r3.unlock()
            return
        L1b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3a
            r3.unlock()
            kotlin.coroutines.CoroutineContext r0 = r8.getContext()
            kotlinx.coroutines.CoroutineScope r1 = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(r0)
            kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
            kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2 r0 = new kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2
            r2 = 0
            r0.<init>(r7, r9, r8, r2)
            r4 = r0
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r5 = 1
            r6 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r1, r2, r3, r4, r5, r6)
            return
        L3a:
            r0 = move-exception
            r3.unlock()
            throw r0
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public java.lang.Object send(E r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
            r9 = this;
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.BroadcastChannelImpl.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r11
            kotlinx.coroutines.channels.BroadcastChannelImpl$send$1 r0 = (kotlinx.coroutines.channels.BroadcastChannelImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r11 = r0.label
            int r11 = r11 - r2
            r0.label = r11
            goto L19
        L14:
            kotlinx.coroutines.channels.BroadcastChannelImpl$send$1 r0 = new kotlinx.coroutines.channels.BroadcastChannelImpl$send$1
            r0.<init>(r9, r11)
        L19:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L40;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2c:
            r10 = 0
            r2 = 0
            java.lang.Object r3 = r0.L$2
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r4 = r0.L$1
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.channels.BroadcastChannelImpl r5 = (kotlinx.coroutines.channels.BroadcastChannelImpl) r5
            kotlin.ResultKt.throwOnFailure(r11)
            r6 = r2
            r2 = r1
            r1 = r0
            r0 = r11
            goto L90
        L40:
            kotlin.ResultKt.throwOnFailure(r11)
            r2 = r9
            java.util.concurrent.locks.ReentrantLock r3 = r2.lock
            r4 = 0
            r5 = r3
            java.util.concurrent.locks.Lock r5 = (java.util.concurrent.locks.Lock) r5
            r5.lock()
            r3 = 0
            boolean r6 = r2.isClosedForSend()     // Catch: java.lang.Throwable -> Lb2
            if (r6 != 0) goto Lad
            int r6 = r2.capacity     // Catch: java.lang.Throwable -> Lb2
            r7 = -1
            if (r6 != r7) goto L5b
            r2.lastConflatedElement = r10     // Catch: java.lang.Throwable -> Lb2
        L5b:
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> r6 = r2.subscribers     // Catch: java.lang.Throwable -> Lb2
            r5.unlock()
            r3 = r6
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r4 = 0
            java.util.Iterator r5 = r3.iterator()
            r3 = r4
            r4 = r10
            r10 = r3
            r3 = r5
            r5 = r2
        L6e:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto La9
            java.lang.Object r2 = r3.next()
            kotlinx.coroutines.channels.BufferedChannel r2 = (kotlinx.coroutines.channels.BufferedChannel) r2
            r6 = 0
            r0.L$0 = r5
            r0.L$1 = r4
            r0.L$2 = r3
            r7 = 1
            r0.label = r7
            java.lang.Object r2 = r2.sendBroadcast$kotlinx_coroutines_core(r4, r0)
            if (r2 != r1) goto L8b
            return r1
        L8b:
            r8 = r0
            r0 = r11
            r11 = r2
            r2 = r1
            r1 = r8
        L90:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto La4
            boolean r7 = r5.isClosedForSend()
            if (r7 != 0) goto L9f
            goto La4
        L9f:
            java.lang.Throwable r2 = r5.getSendException()
            throw r2
        La4:
            r11 = r0
            r0 = r1
            r1 = r2
            goto L6e
        La9:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        Lad:
            java.lang.Throwable r1 = r2.getSendException()     // Catch: java.lang.Throwable -> Lb2
            throw r1     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r10 = move-exception
            r5.unlock()
            throw r10
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public java.lang.String toString() {
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r11.lastConflatedElement
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BroadcastChannelKt.access$getNO_ELEMENT$p()
            if (r1 == r2) goto L29
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "CONFLATED_ELEMENT="
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.Object r2 = r11.lastConflatedElement
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "; "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L2b
        L29:
            java.lang.String r1 = ""
        L2b:
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "BROADCAST=<"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = super.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ">; SUBSCRIBERS="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> r1 = r11.subscribers
            r2 = r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.String r1 = ";"
            r3 = r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r1 = "<"
            r4 = r1
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.String r1 = ">"
            r5 = r1
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r9 = 56
            r10 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r1 = kotlin.collections.CollectionsKt.joinToString$default(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU, reason: not valid java name */
    public java.lang.Object mo1656trySendJP2dKIU(E r13) {
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r12.lock
            r1 = 0
            r2 = r0
            java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
            r2.lock()
            r3 = 0
            boolean r4 = r12.isClosedForSend()     // Catch: java.lang.Throwable -> L84
            if (r4 == 0) goto L18
            java.lang.Object r4 = super.mo1656trySendJP2dKIU(r13)     // Catch: java.lang.Throwable -> L84
            r2.unlock()
            return r4
        L18:
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> r4 = r12.subscribers     // Catch: java.lang.Throwable -> L84
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Throwable -> L84
            r5 = 0
            boolean r6 = r4 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L84
            r7 = 0
            if (r6 == 0) goto L2c
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6     // Catch: java.lang.Throwable -> L84
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L84
            if (r6 == 0) goto L2c
            goto L47
        L2c:
            java.util.Iterator r6 = r4.iterator()     // Catch: java.lang.Throwable -> L84
        L30:
            boolean r8 = r6.hasNext()     // Catch: java.lang.Throwable -> L84
            if (r8 == 0) goto L46
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L84
            r9 = r8
            kotlinx.coroutines.channels.BufferedChannel r9 = (kotlinx.coroutines.channels.BufferedChannel) r9     // Catch: java.lang.Throwable -> L84
            r10 = 0
            boolean r11 = r9.shouldSendSuspend$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L30
            r7 = 1
            goto L47
        L46:
        L47:
            if (r7 == 0) goto L54
            kotlinx.coroutines.channels.ChannelResult$Companion r4 = kotlinx.coroutines.channels.ChannelResult.Companion     // Catch: java.lang.Throwable -> L84
            java.lang.Object r4 = r4.m1681failurePtdJZtk()     // Catch: java.lang.Throwable -> L84
            r2.unlock()
            return r4
        L54:
            int r4 = r12.capacity     // Catch: java.lang.Throwable -> L84
            r5 = -1
            if (r4 != r5) goto L5b
            r12.lastConflatedElement = r13     // Catch: java.lang.Throwable -> L84
        L5b:
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> r4 = r12.subscribers     // Catch: java.lang.Throwable -> L84
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Throwable -> L84
            r5 = 0
            java.util.Iterator r6 = r4.iterator()     // Catch: java.lang.Throwable -> L84
        L64:
            boolean r8 = r6.hasNext()     // Catch: java.lang.Throwable -> L84
            if (r8 == 0) goto L77
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L84
            r9 = r8
            kotlinx.coroutines.channels.BufferedChannel r9 = (kotlinx.coroutines.channels.BufferedChannel) r9     // Catch: java.lang.Throwable -> L84
            r10 = 0
            r9.mo1656trySendJP2dKIU(r13)     // Catch: java.lang.Throwable -> L84
            goto L64
        L77:
            kotlinx.coroutines.channels.ChannelResult$Companion r4 = kotlinx.coroutines.channels.ChannelResult.Companion     // Catch: java.lang.Throwable -> L84
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L84
            java.lang.Object r4 = r4.m1682successJP2dKIU(r5)     // Catch: java.lang.Throwable -> L84
            r2.unlock()
            return r4
        L84:
            r3 = move-exception
            r2.unlock()
            throw r3
    }
}
