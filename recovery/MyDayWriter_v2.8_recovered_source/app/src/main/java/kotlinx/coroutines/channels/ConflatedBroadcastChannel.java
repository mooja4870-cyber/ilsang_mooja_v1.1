package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: BroadcastChannel.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "ConflatedBroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005B\u0015\b\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0097\u0001J\u001b\u0010\u0015\u001a\u00020\u00182\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001aH\u0096\u0001J\u0013\u0010\u001b\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0001J.\u0010\u001c\u001a\u00020\u00182#\u0010\u001d\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00180\u001eH\u0096\u0001J\u0016\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0002\u0010#J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0096\u0001J\u0016\u0010&\u001a\u00020\u00182\u0006\u0010\"\u001a\u00028\u0000H\u0096A¢\u0006\u0002\u0010'J$\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00180)2\u0006\u0010\"\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR$\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\rX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;", "E", "Lkotlinx/coroutines/channels/BroadcastChannel;", "()V", "value", "(Ljava/lang/Object;)V", "broadcast", "Lkotlinx/coroutines/channels/BroadcastChannelImpl;", "(Lkotlinx/coroutines/channels/BroadcastChannelImpl;)V", "isClosedForSend", "", "()Z", "onSend", "Lkotlinx/coroutines/selects/SelectClause2;", "Lkotlinx/coroutines/channels/SendChannel;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "getValue", "()Ljava/lang/Object;", "valueOrNull", "getValueOrNull", "cancel", "cause", "", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "close", "invokeOnClose", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "offer", "element", "(Ljava/lang/Object;)Z", "openSubscription", "Lkotlinx/coroutines/channels/ReceiveChannel;", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trySend", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ConflatedBroadcastChannel<E> implements kotlinx.coroutines.channels.BroadcastChannel<E> {
    private final kotlinx.coroutines.channels.BroadcastChannelImpl<E> broadcast;

    public ConflatedBroadcastChannel() {
            r2 = this;
            kotlinx.coroutines.channels.BroadcastChannelImpl r0 = new kotlinx.coroutines.channels.BroadcastChannelImpl
            r1 = -1
            r0.<init>(r1)
            r2.<init>(r0)
            return
    }

    public ConflatedBroadcastChannel(E r1) {
            r0 = this;
            r0.<init>()
            r0.mo1656trySendJP2dKIU(r1)
            return
    }

    private ConflatedBroadcastChannel(kotlinx.coroutines.channels.BroadcastChannelImpl<E> r1) {
            r0 = this;
            r0.<init>()
            r0.broadcast = r1
            return
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public void cancel(java.util.concurrent.CancellationException r2) {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannelImpl<E> r0 = r1.broadcast
            r0.cancel(r2)
            return
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility only")
    public /* synthetic */ boolean cancel(java.lang.Throwable r2) {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannelImpl<E> r0 = r1.broadcast
            boolean r0 = r0.cancel(r2)
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(java.lang.Throwable r2) {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannelImpl<E> r0 = r1.broadcast
            boolean r0 = r0.close(r2)
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public kotlinx.coroutines.selects.SelectClause2<E, kotlinx.coroutines.channels.SendChannel<E>> getOnSend() {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannelImpl<E> r0 = r1.broadcast
            kotlinx.coroutines.selects.SelectClause2 r0 = r0.getOnSend()
            return r0
    }

    public final E getValue() {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannelImpl<E> r0 = r1.broadcast
            java.lang.Object r0 = r0.getValue()
            return r0
    }

    public final E getValueOrNull() {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannelImpl<E> r0 = r1.broadcast
            java.lang.Object r0 = r0.getValueOrNull()
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r2) {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannelImpl<E> r0 = r1.broadcast
            r0.invokeOnClose(r2)
            return
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannelImpl<E> r0 = r1.broadcast
            boolean r0 = r0.isClosedForSend()
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E r2) {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannelImpl<E> r0 = r1.broadcast
            boolean r0 = r0.offer(r2)
            return r0
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public kotlinx.coroutines.channels.ReceiveChannel<E> openSubscription() {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannelImpl<E> r0 = r1.broadcast
            kotlinx.coroutines.channels.ReceiveChannel r0 = r0.openSubscription()
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public java.lang.Object send(E r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannelImpl<E> r0 = r1.broadcast
            java.lang.Object r0 = r0.send(r2, r3)
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public java.lang.Object mo1656trySendJP2dKIU(E r2) {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannelImpl<E> r0 = r1.broadcast
            java.lang.Object r0 = r0.mo1656trySendJP2dKIU(r2)
            return r0
    }
}
