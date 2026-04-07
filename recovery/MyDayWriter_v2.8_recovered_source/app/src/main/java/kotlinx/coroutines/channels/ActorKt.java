package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Actor.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0099\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2-\b\u0002\u0010\n\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bj\u0004\u0018\u0001`\u00112-\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0013¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"actor", "Lkotlinx/coroutines/channels/SendChannel;", "E", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "start", "Lkotlinx/coroutines/CoroutineStart;", "onCompletion", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ActorScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/SendChannel;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ActorKt {
    public static final <E> kotlinx.coroutines.channels.SendChannel<E> actor(kotlinx.coroutines.CoroutineScope r4, kotlin.coroutines.CoroutineContext r5, int r6, kotlinx.coroutines.CoroutineStart r7, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r8, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ActorScope<E>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r9) {
            kotlin.coroutines.CoroutineContext r0 = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(r4, r5)
            r1 = 0
            r2 = 6
            kotlinx.coroutines.channels.Channel r1 = kotlinx.coroutines.channels.ChannelKt.Channel$default(r6, r1, r1, r2, r1)
            boolean r2 = r7.isLazy()
            if (r2 == 0) goto L18
            kotlinx.coroutines.channels.LazyActorCoroutine r2 = new kotlinx.coroutines.channels.LazyActorCoroutine
            r2.<init>(r0, r1, r9)
            kotlinx.coroutines.channels.ActorCoroutine r2 = (kotlinx.coroutines.channels.ActorCoroutine) r2
            goto L1e
        L18:
            kotlinx.coroutines.channels.ActorCoroutine r2 = new kotlinx.coroutines.channels.ActorCoroutine
            r3 = 1
            r2.<init>(r0, r1, r3)
        L1e:
            if (r8 == 0) goto L24
            r2.invokeOnCompletion(r8)
        L24:
            r2.start(r7, r2, r9)
            r3 = r2
            kotlinx.coroutines.channels.SendChannel r3 = (kotlinx.coroutines.channels.SendChannel) r3
            return r3
    }

    public static /* synthetic */ kotlinx.coroutines.channels.SendChannel actor$default(kotlinx.coroutines.CoroutineScope r0, kotlin.coroutines.CoroutineContext r1, int r2, kotlinx.coroutines.CoroutineStart r3, kotlin.jvm.functions.Function1 r4, kotlin.jvm.functions.Function2 r5, int r6, java.lang.Object r7) {
            r7 = r6 & 1
            if (r7 == 0) goto L8
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        L8:
            r7 = r6 & 2
            if (r7 == 0) goto Ld
            r2 = 0
        Ld:
            r7 = r6 & 4
            if (r7 == 0) goto L13
            kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.DEFAULT
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
            kotlinx.coroutines.channels.SendChannel r0 = actor(r2, r3, r4, r5, r6, r7)
            return r0
    }
}
