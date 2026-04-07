package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Broadcast.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B#\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0012\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\u0016\u0010\u0019\u001a\u00020\u00032\u000e\u0010\u001a\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001dJ\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001f\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J.\u0010 \u001a\u00020\u00032#\u0010!\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u001b¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00030\"H\u0096\u0001J\u0016\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0002\u0010'J\u0018\u0010(\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\nH\u0014J\u0015\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0003H\u0014¢\u0006\u0002\u0010,J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000.H\u0096\u0001J\u0016\u0010/\u001a\u00020\u00032\u0006\u0010&\u001a\u00028\u0000H\u0096A¢\u0006\u0002\u00100J$\u00101\u001a\b\u0012\u0004\u0012\u00020\u0003022\u0006\u0010&\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\n8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R$\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastCoroutine;", "E", "Lkotlinx/coroutines/AbstractCoroutine;", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlinx/coroutines/channels/BroadcastChannel;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "_channel", "active", "", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/BroadcastChannel;Z)V", "get_channel", "()Lkotlinx/coroutines/channels/BroadcastChannel;", "channel", "Lkotlinx/coroutines/channels/SendChannel;", "getChannel", "()Lkotlinx/coroutines/channels/SendChannel;", "isActive", "()Z", "isClosedForSend", "onSend", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "cancel", "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancelInternal", "close", "invokeOnClose", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "offer", "element", "(Ljava/lang/Object;)Z", "onCancelled", "handled", "onCompleted", "value", "(Lkotlin/Unit;)V", "openSubscription", "Lkotlinx/coroutines/channels/ReceiveChannel;", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trySend", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
class BroadcastCoroutine<E> extends kotlinx.coroutines.AbstractCoroutine<kotlin.Unit> implements kotlinx.coroutines.channels.ProducerScope<E>, kotlinx.coroutines.channels.BroadcastChannel<E> {
    private final kotlinx.coroutines.channels.BroadcastChannel<E> _channel;

    public BroadcastCoroutine(kotlin.coroutines.CoroutineContext r2, kotlinx.coroutines.channels.BroadcastChannel<E> r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r4)
            r1._channel = r3
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            kotlin.coroutines.CoroutineContext$Element r0 = r2.get(r0)
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            r1.initParentJob(r0)
            return
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public final void cancel(java.util.concurrent.CancellationException r7) {
            r6 = this;
            if (r7 != 0) goto L19
            r0 = 0
            r1 = 0
            r2 = 0
            kotlinx.coroutines.JobCancellationException r3 = new kotlinx.coroutines.JobCancellationException
            r4 = r6
            kotlinx.coroutines.JobSupport r4 = (kotlinx.coroutines.JobSupport) r4
            java.lang.String r4 = kotlinx.coroutines.JobSupport.access$cancellationExceptionMessage(r4)
            r5 = r6
            kotlinx.coroutines.JobSupport r5 = (kotlinx.coroutines.JobSupport) r5
            kotlinx.coroutines.Job r5 = (kotlinx.coroutines.Job) r5
            r3.<init>(r4, r1, r5)
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
            goto L1a
        L19:
            r3 = r7
        L1a:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r6.cancelInternal(r3)
            return
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean cancel(java.lang.Throwable r7) {
            r6 = this;
            if (r7 != 0) goto L19
            r0 = 0
            r1 = 0
            r2 = 0
            kotlinx.coroutines.JobCancellationException r3 = new kotlinx.coroutines.JobCancellationException
            r4 = r6
            kotlinx.coroutines.JobSupport r4 = (kotlinx.coroutines.JobSupport) r4
            java.lang.String r4 = kotlinx.coroutines.JobSupport.access$cancellationExceptionMessage(r4)
            r5 = r6
            kotlinx.coroutines.JobSupport r5 = (kotlinx.coroutines.JobSupport) r5
            kotlinx.coroutines.Job r5 = (kotlinx.coroutines.Job) r5
            r3.<init>(r4, r1, r5)
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            goto L1a
        L19:
            r3 = r7
        L1a:
            r6.cancelInternal(r3)
            r0 = 1
            return r0
    }

    @Override // kotlinx.coroutines.JobSupport
    public void cancelInternal(java.lang.Throwable r4) {
            r3 = this;
            r0 = r3
            kotlinx.coroutines.JobSupport r0 = (kotlinx.coroutines.JobSupport) r0
            r1 = 0
            r2 = 1
            java.util.concurrent.CancellationException r0 = kotlinx.coroutines.JobSupport.toCancellationException$default(r0, r4, r1, r2, r1)
            kotlinx.coroutines.channels.BroadcastChannel<E> r1 = r3._channel
            r1.cancel(r0)
            r1 = r0
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r3.cancelCoroutine(r1)
            return
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(java.lang.Throwable r2) {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannel<E> r0 = r1._channel
            boolean r0 = r0.close(r2)
            r1.start()
            return r0
    }

    @Override // kotlinx.coroutines.channels.ProducerScope
    public kotlinx.coroutines.channels.SendChannel<E> getChannel() {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.channels.SendChannel r0 = (kotlinx.coroutines.channels.SendChannel) r0
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public kotlinx.coroutines.selects.SelectClause2<E, kotlinx.coroutines.channels.SendChannel<E>> getOnSend() {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannel<E> r0 = r1._channel
            kotlinx.coroutines.selects.SelectClause2 r0 = r0.getOnSend()
            return r0
    }

    protected final kotlinx.coroutines.channels.BroadcastChannel<E> get_channel() {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannel<E> r0 = r1._channel
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r2) {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannel<E> r0 = r1._channel
            r0.invokeOnClose(r2)
            return
    }

    @Override // kotlinx.coroutines.AbstractCoroutine, kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public boolean isActive() {
            r1 = this;
            boolean r0 = super.isActive()
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannel<E> r0 = r1._channel
            boolean r0 = r0.isClosedForSend()
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E r2) {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannel<E> r0 = r1._channel
            boolean r0 = r0.offer(r2)
            return r0
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    protected void onCancelled(java.lang.Throwable r3, boolean r4) {
            r2 = this;
            kotlinx.coroutines.channels.BroadcastChannel<E> r0 = r2._channel
            boolean r0 = r0.close(r3)
            if (r0 != 0) goto L11
            if (r4 != 0) goto L11
            kotlin.coroutines.CoroutineContext r1 = r2.getContext()
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r1, r3)
        L11:
            return
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public /* bridge */ /* synthetic */ void onCompleted(kotlin.Unit r2) {
            r1 = this;
            r0 = r2
            kotlin.Unit r0 = (kotlin.Unit) r0
            r1.onCompleted2(r0)
            return
    }

    /* JADX INFO: renamed from: onCompleted, reason: avoid collision after fix types in other method */
    protected void onCompleted2(kotlin.Unit r4) {
            r3 = this;
            kotlinx.coroutines.channels.BroadcastChannel<E> r0 = r3._channel
            kotlinx.coroutines.channels.SendChannel r0 = (kotlinx.coroutines.channels.SendChannel) r0
            r1 = 0
            r2 = 1
            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(r0, r1, r2, r1)
            return
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public kotlinx.coroutines.channels.ReceiveChannel<E> openSubscription() {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannel<E> r0 = r1._channel
            kotlinx.coroutines.channels.ReceiveChannel r0 = r0.openSubscription()
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public java.lang.Object send(E r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannel<E> r0 = r1._channel
            java.lang.Object r0 = r0.send(r2, r3)
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public java.lang.Object mo1656trySendJP2dKIU(E r2) {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannel<E> r0 = r1._channel
            java.lang.Object r0 = r0.mo1656trySendJP2dKIU(r2)
            return r0
    }
}
