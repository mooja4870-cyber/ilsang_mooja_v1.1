package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: ChannelCoroutine.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0004B+\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\b\u0010\"\u001a\u00020\u0003H\u0017J\u0012\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010$H\u0007J\u0016\u0010\"\u001a\u00020\u00032\u000e\u0010#\u001a\n\u0018\u00010%j\u0004\u0018\u0001`&J\u0010\u0010'\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$H\u0016J\u0013\u0010(\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0001J.\u0010)\u001a\u00020\u00032#\u0010*\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010$¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00030+H\u0096\u0001J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000/H\u0096\u0003J\u0016\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0002\u00102J\u0010\u00103\u001a\u0004\u0018\u00018\u0000H\u0097\u0001¢\u0006\u0002\u00104J\u000e\u00105\u001a\u00028\u0000H\u0096A¢\u0006\u0002\u00106J\u001c\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096Aø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00106J\u0010\u00109\u001a\u0004\u0018\u00018\u0000H\u0097A¢\u0006\u0002\u00106J\u0016\u0010:\u001a\u00020\u00032\u0006\u00101\u001a\u00028\u0000H\u0096A¢\u0006\u0002\u0010;J\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u00104J$\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00030\u00192\u0006\u00101\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b?\u0010@R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\t8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\t8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\t8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190\u0015X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00158VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0017R$\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f0\u001eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006A"}, d2 = {"Lkotlinx/coroutines/channels/ChannelCoroutine;", "E", "Lkotlinx/coroutines/AbstractCoroutine;", "", "Lkotlinx/coroutines/channels/Channel;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "_channel", "initParentJob", "", "active", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/Channel;ZZ)V", "get_channel", "()Lkotlinx/coroutines/channels/Channel;", "channel", "getChannel", "isClosedForReceive", "()Z", "isClosedForSend", "isEmpty", "onReceive", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceiveCatching", "Lkotlinx/coroutines/channels/ChannelResult;", "getOnReceiveCatching", "onReceiveOrNull", "getOnReceiveOrNull", "onSend", "Lkotlinx/coroutines/selects/SelectClause2;", "Lkotlinx/coroutines/channels/SendChannel;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "cancel", "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancelInternal", "close", "invokeOnClose", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "iterator", "Lkotlinx/coroutines/channels/ChannelIterator;", "offer", "element", "(Ljava/lang/Object;)Z", "poll", "()Ljava/lang/Object;", "receive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveCatching", "receiveCatching-JP2dKIU", "receiveOrNull", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryReceive", "tryReceive-PtdJZtk", "trySend", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class ChannelCoroutine<E> extends kotlinx.coroutines.AbstractCoroutine<kotlin.Unit> implements kotlinx.coroutines.channels.Channel<E> {
    private final kotlinx.coroutines.channels.Channel<E> _channel;

    public ChannelCoroutine(kotlin.coroutines.CoroutineContext r1, kotlinx.coroutines.channels.Channel<E> r2, boolean r3, boolean r4) {
            r0 = this;
            r0.<init>(r1, r3, r4)
            r0._channel = r2
            return
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
            r6 = this;
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
            r6.cancelInternal(r3)
            return
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public final void cancel(java.util.concurrent.CancellationException r7) {
            r6 = this;
            boolean r0 = r6.isCancelled()
            if (r0 == 0) goto L7
            return
        L7:
            if (r7 != 0) goto L20
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
            goto L21
        L20:
            r3 = r7
        L21:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r6.cancelInternal(r3)
            return
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean cancel(java.lang.Throwable r7) {
            r6 = this;
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
            kotlinx.coroutines.channels.Channel<E> r1 = r3._channel
            r1.cancel(r0)
            r1 = r0
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r3.cancelCoroutine(r1)
            return
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(java.lang.Throwable r2) {
            r1 = this;
            kotlinx.coroutines.channels.Channel<E> r0 = r1._channel
            boolean r0 = r0.close(r2)
            return r0
    }

    public final kotlinx.coroutines.channels.Channel<E> getChannel() {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.channels.Channel r0 = (kotlinx.coroutines.channels.Channel) r0
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.selects.SelectClause1<E> getOnReceive() {
            r1 = this;
            kotlinx.coroutines.channels.Channel<E> r0 = r1._channel
            kotlinx.coroutines.selects.SelectClause1 r0 = r0.getOnReceive()
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.selects.SelectClause1<kotlinx.coroutines.channels.ChannelResult<E>> getOnReceiveCatching() {
            r1 = this;
            kotlinx.coroutines.channels.Channel<E> r0 = r1._channel
            kotlinx.coroutines.selects.SelectClause1 r0 = r0.getOnReceiveCatching()
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.selects.SelectClause1<E> getOnReceiveOrNull() {
            r1 = this;
            kotlinx.coroutines.channels.Channel<E> r0 = r1._channel
            kotlinx.coroutines.selects.SelectClause1 r0 = r0.getOnReceiveOrNull()
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public kotlinx.coroutines.selects.SelectClause2<E, kotlinx.coroutines.channels.SendChannel<E>> getOnSend() {
            r1 = this;
            kotlinx.coroutines.channels.Channel<E> r0 = r1._channel
            kotlinx.coroutines.selects.SelectClause2 r0 = r0.getOnSend()
            return r0
    }

    protected final kotlinx.coroutines.channels.Channel<E> get_channel() {
            r1 = this;
            kotlinx.coroutines.channels.Channel<E> r0 = r1._channel
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r2) {
            r1 = this;
            kotlinx.coroutines.channels.Channel<E> r0 = r1._channel
            r0.invokeOnClose(r2)
            return
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
            r1 = this;
            kotlinx.coroutines.channels.Channel<E> r0 = r1._channel
            boolean r0 = r0.isClosedForReceive()
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
            r1 = this;
            kotlinx.coroutines.channels.Channel<E> r0 = r1._channel
            boolean r0 = r0.isClosedForSend()
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
            r1 = this;
            kotlinx.coroutines.channels.Channel<E> r0 = r1._channel
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.channels.ChannelIterator<E> iterator() {
            r1 = this;
            kotlinx.coroutines.channels.Channel<E> r0 = r1._channel
            kotlinx.coroutines.channels.ChannelIterator r0 = r0.iterator()
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E r2) {
            r1 = this;
            kotlinx.coroutines.channels.Channel<E> r0 = r1._channel
            boolean r0 = r0.offer(r2)
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @kotlin.ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    public E poll() {
            r1 = this;
            kotlinx.coroutines.channels.Channel<E> r0 = r1._channel
            java.lang.Object r0 = r0.poll()
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public java.lang.Object receive(kotlin.coroutines.Continuation<? super E> r2) {
            r1 = this;
            kotlinx.coroutines.channels.Channel<E> r0 = r1._channel
            java.lang.Object r0 = r0.receive(r2)
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: receiveCatching-JP2dKIU */
    public java.lang.Object mo1660receiveCatchingJP2dKIU(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> r2) {
            r1 = this;
            kotlinx.coroutines.channels.Channel<E> r0 = r1._channel
            java.lang.Object r0 = r0.mo1660receiveCatchingJP2dKIU(r2)
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @kotlin.ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    public java.lang.Object receiveOrNull(kotlin.coroutines.Continuation<? super E> r2) {
            r1 = this;
            kotlinx.coroutines.channels.Channel<E> r0 = r1._channel
            java.lang.Object r0 = r0.receiveOrNull(r2)
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public java.lang.Object send(E r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            kotlinx.coroutines.channels.Channel<E> r0 = r1._channel
            java.lang.Object r0 = r0.send(r2, r3)
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: tryReceive-PtdJZtk */
    public java.lang.Object mo1661tryReceivePtdJZtk() {
            r1 = this;
            kotlinx.coroutines.channels.Channel<E> r0 = r1._channel
            java.lang.Object r0 = r0.mo1661tryReceivePtdJZtk()
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public java.lang.Object mo1656trySendJP2dKIU(E r2) {
            r1 = this;
            kotlinx.coroutines.channels.Channel<E> r0 = r1._channel
            java.lang.Object r0 = r0.mo1656trySendJP2dKIU(r2)
            return r0
    }
}
