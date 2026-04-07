package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Produce.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0014J\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0014¢\u0006\u0002\u0010\u0013R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/channels/ProducerCoroutine;", "E", "Lkotlinx/coroutines/channels/ChannelCoroutine;", "Lkotlinx/coroutines/channels/ProducerScope;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "channel", "Lkotlinx/coroutines/channels/Channel;", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/Channel;)V", "isActive", "", "()Z", "onCancelled", "", "cause", "", "handled", "onCompleted", "value", "(Lkotlin/Unit;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ProducerCoroutine<E> extends kotlinx.coroutines.channels.ChannelCoroutine<E> implements kotlinx.coroutines.channels.ProducerScope<E> {
    public ProducerCoroutine(kotlin.coroutines.CoroutineContext r2, kotlinx.coroutines.channels.Channel<E> r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0, r0)
            return
    }

    @Override // kotlinx.coroutines.channels.ProducerScope
    public /* bridge */ /* synthetic */ kotlinx.coroutines.channels.SendChannel getChannel() {
            r1 = this;
            kotlinx.coroutines.channels.Channel r0 = r1.getChannel()
            kotlinx.coroutines.channels.SendChannel r0 = (kotlinx.coroutines.channels.SendChannel) r0
            return r0
    }

    @Override // kotlinx.coroutines.AbstractCoroutine, kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public boolean isActive() {
            r1 = this;
            boolean r0 = super.isActive()
            return r0
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    protected void onCancelled(java.lang.Throwable r3, boolean r4) {
            r2 = this;
            kotlinx.coroutines.channels.Channel r0 = r2.get_channel()
            boolean r0 = r0.close(r3)
            if (r0 != 0) goto L13
            if (r4 != 0) goto L13
            kotlin.coroutines.CoroutineContext r1 = r2.getContext()
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r1, r3)
        L13:
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
            kotlinx.coroutines.channels.Channel r0 = r3.get_channel()
            kotlinx.coroutines.channels.SendChannel r0 = (kotlinx.coroutines.channels.SendChannel) r0
            r1 = 0
            r2 = 1
            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(r0, r1, r2, r1)
            return
    }
}
