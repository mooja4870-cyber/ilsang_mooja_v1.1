package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Actor.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002BJ\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012-\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b¢\u0006\u0002\b\r¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0015\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00028\u0000H\u0017¢\u0006\u0002\u0010\u001dJ\u001e\u0010\u001e\u001a\u00020\u000b2\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030 2\b\u0010\u001c\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010!\u001a\u00020\u000bH\u0014J\u0016\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010#J#\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0%2\u0006\u0010\u001c\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e¢\u0006\u0002\n\u0000R,\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u00118VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Lkotlinx/coroutines/channels/LazyActorCoroutine;", "E", "Lkotlinx/coroutines/channels/ActorCoroutine;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "channel", "Lkotlinx/coroutines/channels/Channel;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ActorScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/Channel;Lkotlin/jvm/functions/Function2;)V", "continuation", "onSend", "Lkotlinx/coroutines/selects/SelectClause2;", "Lkotlinx/coroutines/channels/SendChannel;", "getOnSend$annotations", "()V", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "close", "", "cause", "", "offer", "element", "(Ljava/lang/Object;)Z", "onSendRegFunction", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "onStart", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trySend", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class LazyActorCoroutine<E> extends kotlinx.coroutines.channels.ActorCoroutine<E> {
    private kotlin.coroutines.Continuation<? super kotlin.Unit> continuation;

    public LazyActorCoroutine(kotlin.coroutines.CoroutineContext r2, kotlinx.coroutines.channels.Channel<E> r3, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ActorScope<E>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            r0 = r1
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.createCoroutineUnintercepted(r4, r1, r0)
            r1.continuation = r0
            return
    }

    public static final /* synthetic */ void access$onSendRegFunction(kotlinx.coroutines.channels.LazyActorCoroutine r0, kotlinx.coroutines.selects.SelectInstance r1, java.lang.Object r2) {
            r0.onSendRegFunction(r1, r2)
            return
    }

    public static /* synthetic */ void getOnSend$annotations() {
            return
    }

    private final void onSendRegFunction(kotlinx.coroutines.selects.SelectInstance<?> r2, java.lang.Object r3) {
            r1 = this;
            r1.onStart()
            kotlinx.coroutines.selects.SelectClause2 r0 = super.getOnSend()
            kotlin.jvm.functions.Function3 r0 = r0.getRegFunc()
            r0.invoke(r1, r2, r3)
            return
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    public boolean close(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = super.close(r2)
            r1.start()
            return r0
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    public kotlinx.coroutines.selects.SelectClause2<E, kotlinx.coroutines.channels.SendChannel<E>> getOnSend() {
            r7 = this;
            kotlinx.coroutines.selects.SelectClause2Impl r0 = new kotlinx.coroutines.selects.SelectClause2Impl
            kotlinx.coroutines.channels.LazyActorCoroutine$onSend$1 r1 = kotlinx.coroutines.channels.LazyActorCoroutine$onSend$1.INSTANCE
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            r2 = 3
            java.lang.Object r1 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r1, r2)
            r2 = r1
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
            kotlinx.coroutines.selects.SelectClause2 r1 = super.getOnSend()
            kotlin.jvm.functions.Function3 r3 = r1.getProcessResFunc()
            r5 = 8
            r6 = 0
            r4 = 0
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            kotlinx.coroutines.selects.SelectClause2 r0 = (kotlinx.coroutines.selects.SelectClause2) r0
            return r0
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E r2) {
            r1 = this;
            r1.start()
            boolean r0 = super.offer(r2)
            return r0
    }

    @Override // kotlinx.coroutines.JobSupport
    protected void onStart() {
            r2 = this;
            kotlin.coroutines.Continuation<? super kotlin.Unit> r0 = r2.continuation
            r1 = r2
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable(r0, r1)
            return
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    public java.lang.Object send(E r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            r2.start()
            java.lang.Object r0 = super.send(r3, r4)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto Le
            return r0
        Le:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public java.lang.Object mo1656trySendJP2dKIU(E r2) {
            r1 = this;
            r1.start()
            java.lang.Object r0 = super.mo1656trySendJP2dKIU(r2)
            return r0
    }
}
