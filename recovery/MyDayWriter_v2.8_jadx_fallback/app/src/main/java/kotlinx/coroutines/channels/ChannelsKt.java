package kotlinx.coroutines.channels;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"kotlinx/coroutines/channels/ChannelsKt__ChannelsKt", "kotlinx/coroutines/channels/ChannelsKt__Channels_commonKt", "kotlinx/coroutines/channels/ChannelsKt__DeprecatedKt"}, k = 4, mv = {1, 9, 0}, xi = 48)
public final class ChannelsKt {
    public static final java.lang.String DEFAULT_CLOSE_MESSAGE = "Channel was closed";

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object any(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.any(r1, r2)
            return r0
    }

    public static final void cancelConsumed(kotlinx.coroutines.channels.ReceiveChannel<?> r0, java.lang.Throwable r1) {
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.cancelConsumed(r0, r1)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    public static final <E, R> R consume(kotlinx.coroutines.channels.BroadcastChannel<E> r1, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.channels.ReceiveChannel<? extends E>, ? extends R> r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.consume(r1, r2)
            return r0
    }

    public static final <E, R> R consume(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r1, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.channels.ReceiveChannel<? extends E>, ? extends R> r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.consume(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    public static final <E> java.lang.Object consumeEach(kotlinx.coroutines.channels.BroadcastChannel<E> r1, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.consumeEach(r1, r2, r3)
            return r0
    }

    public static final <E> java.lang.Object consumeEach(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r1, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.consumeEach(r1, r2, r3)
            return r0
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> consumes(kotlinx.coroutines.channels.ReceiveChannel<?> r1) {
            kotlin.jvm.functions.Function1 r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.consumes(r1)
            return r0
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> consumesAll(kotlinx.coroutines.channels.ReceiveChannel<?>... r1) {
            kotlin.jvm.functions.Function1 r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.consumesAll(r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object count(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.count(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel distinct(kotlinx.coroutines.channels.ReceiveChannel r1) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.distinct(r1)
            return r0
    }

    public static final <E, K> kotlinx.coroutines.channels.ReceiveChannel<E> distinctBy(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r1, kotlin.coroutines.CoroutineContext r2, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super K>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.distinctBy(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel distinctBy$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.distinctBy$default(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel drop(kotlinx.coroutines.channels.ReceiveChannel r1, int r2, kotlin.coroutines.CoroutineContext r3) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.drop(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel drop$default(kotlinx.coroutines.channels.ReceiveChannel r0, int r1, kotlin.coroutines.CoroutineContext r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.drop$default(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel dropWhile(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.CoroutineContext r2, kotlin.jvm.functions.Function2 r3) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.dropWhile(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel dropWhile$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.dropWhile$default(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object elementAt(kotlinx.coroutines.channels.ReceiveChannel r1, int r2, kotlin.coroutines.Continuation r3) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.elementAt(r1, r2, r3)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object elementAtOrNull(kotlinx.coroutines.channels.ReceiveChannel r1, int r2, kotlin.coroutines.Continuation r3) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.elementAtOrNull(r1, r2, r3)
            return r0
    }

    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> filter(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r1, kotlin.coroutines.CoroutineContext r2, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filter(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filter$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filter$default(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filterIndexed(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.CoroutineContext r2, kotlin.jvm.functions.Function3 r3) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterIndexed(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filterIndexed$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function3 r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterIndexed$default(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filterNot(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.CoroutineContext r2, kotlin.jvm.functions.Function2 r3) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNot(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filterNot$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNot$default(r0, r1, r2, r3, r4)
            return r0
    }

    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> filterNotNull(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r1) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNull(r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel r1, java.util.Collection r2, kotlin.coroutines.Continuation r3) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNullTo(r1, r2, r3)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel r1, kotlinx.coroutines.channels.SendChannel r2, kotlin.coroutines.Continuation r3) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNullTo(r1, r2, r3)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object first(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.first(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object firstOrNull(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.firstOrNull(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel flatMap(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.CoroutineContext r2, kotlin.jvm.functions.Function2 r3) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.flatMap(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel flatMap$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.flatMap$default(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object indexOf(kotlinx.coroutines.channels.ReceiveChannel r1, java.lang.Object r2, kotlin.coroutines.Continuation r3) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.indexOf(r1, r2, r3)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object last(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.last(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object lastIndexOf(kotlinx.coroutines.channels.ReceiveChannel r1, java.lang.Object r2, kotlin.coroutines.Continuation r3) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.lastIndexOf(r1, r2, r3)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object lastOrNull(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.lastOrNull(r1, r2)
            return r0
    }

    public static final <E, R> kotlinx.coroutines.channels.ReceiveChannel<R> map(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r1, kotlin.coroutines.CoroutineContext r2, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.map(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel map$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.map$default(r0, r1, r2, r3, r4)
            return r0
    }

    public static final <E, R> kotlinx.coroutines.channels.ReceiveChannel<R> mapIndexed(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r1, kotlin.coroutines.CoroutineContext r2, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.mapIndexed(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapIndexed$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function3 r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.mapIndexed$default(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapIndexedNotNull(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.CoroutineContext r2, kotlin.jvm.functions.Function3 r3) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.mapIndexedNotNull(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapIndexedNotNull$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function3 r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.mapIndexedNotNull$default(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapNotNull(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.CoroutineContext r2, kotlin.jvm.functions.Function2 r3) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.mapNotNull(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapNotNull$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.mapNotNull$default(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object maxWith(kotlinx.coroutines.channels.ReceiveChannel r1, java.util.Comparator r2, kotlin.coroutines.Continuation r3) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.maxWith(r1, r2, r3)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object minWith(kotlinx.coroutines.channels.ReceiveChannel r1, java.util.Comparator r2, kotlin.coroutines.Continuation r3) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.minWith(r1, r2, r3)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object none(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.none(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in the favour of 'onReceiveCatching'")
    public static final /* synthetic */ kotlinx.coroutines.selects.SelectClause1 onReceiveOrNull(kotlinx.coroutines.channels.ReceiveChannel r1) {
            kotlinx.coroutines.selects.SelectClause1 r0 = kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.onReceiveOrNull(r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @kotlin.ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    public static final /* synthetic */ java.lang.Object receiveOrNull(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.receiveOrNull(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Left for binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel requireNoNulls(kotlinx.coroutines.channels.ReceiveChannel r1) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.requireNoNulls(r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @kotlin.ReplaceWith(expression = "trySendBlocking(element)", imports = {}))
    public static final /* synthetic */ void sendBlocking(kotlinx.coroutines.channels.SendChannel r0, java.lang.Object r1) {
            kotlinx.coroutines.channels.ChannelsKt__ChannelsKt.sendBlocking(r0, r1)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object single(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.single(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object singleOrNull(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.singleOrNull(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel take(kotlinx.coroutines.channels.ReceiveChannel r1, int r2, kotlin.coroutines.CoroutineContext r3) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.take(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel take$default(kotlinx.coroutines.channels.ReceiveChannel r0, int r1, kotlin.coroutines.CoroutineContext r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.take$default(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel takeWhile(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.CoroutineContext r2, kotlin.jvm.functions.Function2 r3) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.takeWhile(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel takeWhile$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.takeWhile$default(r0, r1, r2, r3, r4)
            return r0
    }

    public static final <E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> java.lang.Object toChannel(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r1, C r2, kotlin.coroutines.Continuation<? super C> r3) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toChannel(r1, r2, r3)
            return r0
    }

    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object toCollection(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r1, C r2, kotlin.coroutines.Continuation<? super C> r3) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toCollection(r1, r2, r3)
            return r0
    }

    public static final <E> java.lang.Object toList(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r1, kotlin.coroutines.Continuation<? super java.util.List<? extends E>> r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.toList(r1, r2)
            return r0
    }

    public static final <K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object toMap(kotlinx.coroutines.channels.ReceiveChannel<? extends kotlin.Pair<? extends K, ? extends V>> r1, M r2, kotlin.coroutines.Continuation<? super M> r3) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toMap(r1, r2, r3)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object toMap(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toMap(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object toMutableList(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toMutableList(r1, r2)
            return r0
    }

    public static final <E> java.lang.Object toMutableSet(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r1, kotlin.coroutines.Continuation<? super java.util.Set<E>> r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toMutableSet(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object toSet(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toSet(r1, r2)
            return r0
    }

    public static final <E> java.lang.Object trySendBlocking(kotlinx.coroutines.channels.SendChannel<? super E> r1, E r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__ChannelsKt.trySendBlocking(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel withIndex(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.CoroutineContext r2) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.withIndex(r1, r2)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel withIndex$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, int r2, java.lang.Object r3) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.withIndex$default(r0, r1, r2, r3)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel zip(kotlinx.coroutines.channels.ReceiveChannel r1, kotlinx.coroutines.channels.ReceiveChannel r2) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.zip(r1, r2)
            return r0
    }

    public static final <E, R, V> kotlinx.coroutines.channels.ReceiveChannel<V> zip(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r1, kotlinx.coroutines.channels.ReceiveChannel<? extends R> r2, kotlin.coroutines.CoroutineContext r3, kotlin.jvm.functions.Function2<? super E, ? super R, ? extends V> r4) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.zip(r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel zip$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.CoroutineContext r2, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.zip$default(r0, r1, r2, r3, r4, r5)
            return r0
    }
}
