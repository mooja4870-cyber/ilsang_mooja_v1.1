package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Broadcast.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002BJ\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012-\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b¢\u0006\u0002\b\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000bH\u0014J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/channels/LazyBroadcastCoroutine;", "E", "Lkotlinx/coroutines/channels/BroadcastCoroutine;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "channel", "Lkotlinx/coroutines/channels/BroadcastChannel;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/BroadcastChannel;Lkotlin/jvm/functions/Function2;)V", "continuation", "onStart", "openSubscription", "Lkotlinx/coroutines/channels/ReceiveChannel;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class LazyBroadcastCoroutine<E> extends kotlinx.coroutines.channels.BroadcastCoroutine<E> {
    private final kotlin.coroutines.Continuation<kotlin.Unit> continuation;

    public LazyBroadcastCoroutine(kotlin.coroutines.CoroutineContext r2, kotlinx.coroutines.channels.BroadcastChannel<E> r3, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ProducerScope<? super E>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            r0 = r1
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.createCoroutineUnintercepted(r4, r1, r0)
            r1.continuation = r0
            return
    }

    @Override // kotlinx.coroutines.JobSupport
    protected void onStart() {
            r2 = this;
            kotlin.coroutines.Continuation<kotlin.Unit> r0 = r2.continuation
            r1 = r2
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable(r0, r1)
            return
    }

    @Override // kotlinx.coroutines.channels.BroadcastCoroutine, kotlinx.coroutines.channels.BroadcastChannel
    public kotlinx.coroutines.channels.ReceiveChannel<E> openSubscription() {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannel r0 = r1.get_channel()
            kotlinx.coroutines.channels.ReceiveChannel r0 = r0.openSubscription()
            r1.start()
            return r0
    }
}
