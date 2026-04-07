package kotlinx.coroutines.flow;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"kotlinx/coroutines/flow/FlowKt__BuildersKt", "kotlinx/coroutines/flow/FlowKt__ChannelsKt", "kotlinx/coroutines/flow/FlowKt__CollectKt", "kotlinx/coroutines/flow/FlowKt__CollectionKt", "kotlinx/coroutines/flow/FlowKt__ContextKt", "kotlinx/coroutines/flow/FlowKt__CountKt", "kotlinx/coroutines/flow/FlowKt__DelayKt", "kotlinx/coroutines/flow/FlowKt__DistinctKt", "kotlinx/coroutines/flow/FlowKt__EmittersKt", "kotlinx/coroutines/flow/FlowKt__ErrorsKt", "kotlinx/coroutines/flow/FlowKt__LimitKt", "kotlinx/coroutines/flow/FlowKt__MergeKt", "kotlinx/coroutines/flow/FlowKt__MigrationKt", "kotlinx/coroutines/flow/FlowKt__ReduceKt", "kotlinx/coroutines/flow/FlowKt__ShareKt", "kotlinx/coroutines/flow/FlowKt__TransformKt", "kotlinx/coroutines/flow/FlowKt__ZipKt"}, k = 4, mv = {1, 9, 0}, xi = 48)
public final class FlowKt {
    public static final java.lang.String DEFAULT_CONCURRENCY_PROPERTY_NAME = "kotlinx.coroutines.flow.defaultConcurrency";

    public static final <T> kotlinx.coroutines.flow.Flow<T> asFlow(java.lang.Iterable<? extends T> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.asFlow(r1)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> asFlow(java.util.Iterator<? extends T> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.asFlow(r1)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> asFlow(kotlin.jvm.functions.Function0<? extends T> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.asFlow(r1)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> asFlow(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.asFlow(r1)
            return r0
    }

    public static final kotlinx.coroutines.flow.Flow<java.lang.Integer> asFlow(kotlin.ranges.IntRange r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.asFlow(r1)
            return r0
    }

    public static final kotlinx.coroutines.flow.Flow<java.lang.Long> asFlow(kotlin.ranges.LongRange r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.asFlow(r1)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> asFlow(kotlin.sequences.Sequence<? extends T> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.asFlow(r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    public static final <T> kotlinx.coroutines.flow.Flow<T> asFlow(kotlinx.coroutines.channels.BroadcastChannel<T> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ChannelsKt.asFlow(r1)
            return r0
    }

    public static final kotlinx.coroutines.flow.Flow<java.lang.Integer> asFlow(int[] r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.asFlow(r1)
            return r0
    }

    public static final kotlinx.coroutines.flow.Flow<java.lang.Long> asFlow(long[] r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.asFlow(r1)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> asFlow(T[] r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.asFlow(r1)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.SharedFlow<T> asSharedFlow(kotlinx.coroutines.flow.MutableSharedFlow<T> r1) {
            kotlinx.coroutines.flow.SharedFlow r0 = kotlinx.coroutines.flow.FlowKt__ShareKt.asSharedFlow(r1)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.StateFlow<T> asStateFlow(kotlinx.coroutines.flow.MutableStateFlow<T> r1) {
            kotlinx.coroutines.flow.StateFlow r0 = kotlinx.coroutines.flow.FlowKt__ShareKt.asStateFlow(r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ kotlinx.coroutines.flow.Flow buffer(kotlinx.coroutines.flow.Flow r1, int r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ContextKt.buffer(r1, r2)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> buffer(kotlinx.coroutines.flow.Flow<? extends T> r1, int r2, kotlinx.coroutines.channels.BufferOverflow r3) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ContextKt.buffer(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow buffer$default(kotlinx.coroutines.flow.Flow r0, int r1, int r2, java.lang.Object r3) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ContextKt.buffer$default(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow buffer$default(kotlinx.coroutines.flow.Flow r0, int r1, kotlinx.coroutines.channels.BufferOverflow r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ContextKt.buffer$default(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @kotlin.ReplaceWith(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> cache(kotlinx.coroutines.flow.Flow<? extends T> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.cache(r1)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> callbackFlow(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ProducerScope<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.callbackFlow(r1)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> cancellable(kotlinx.coroutines.flow.Flow<? extends T> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ContextKt.cancellable(r1)
            return r0
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static final <T> kotlinx.coroutines.flow.Flow<T> m1685catch(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ErrorsKt.m1696catch(r1, r2)
            return r0
    }

    public static final <T> java.lang.Object catchImpl(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlinx.coroutines.flow.FlowCollector<? super T> r2, kotlin.coroutines.Continuation<? super java.lang.Throwable> r3) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ErrorsKt.catchImpl(r1, r2, r3)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> channelFlow(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ProducerScope<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.channelFlow(r1)
            return r0
    }

    public static final java.lang.Object collect(kotlinx.coroutines.flow.Flow<?> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__CollectKt.collect(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Backwards compatibility with JS and K/N")
    public static final /* synthetic */ <T> java.lang.Object collect(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__CollectKt.collect(r1, r2, r3)
            return r0
    }

    public static final <T> java.lang.Object collectIndexed(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__CollectKt.collectIndexed(r1, r2, r3)
            return r0
    }

    public static final <T> java.lang.Object collectLatest(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest(r1, r2, r3)
            return r0
    }

    public static final <T> java.lang.Object collectWhile(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__LimitKt.collectWhile(r1, r2, r3)
            return r0
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.Flow<R> combine(java.lang.Iterable<? extends kotlinx.coroutines.flow.Flow<? extends T>> r1, kotlin.jvm.functions.Function2<? super T[], ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.combine(r1, r2)
            return r0
    }

    public static final <T1, T2, R> kotlinx.coroutines.flow.Flow<R> combine(kotlinx.coroutines.flow.Flow<? extends T1> r1, kotlinx.coroutines.flow.Flow<? extends T2> r2, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.combine(r1, r2, r3)
            return r0
    }

    public static final <T1, T2, T3, R> kotlinx.coroutines.flow.Flow<R> combine(kotlinx.coroutines.flow.Flow<? extends T1> r1, kotlinx.coroutines.flow.Flow<? extends T2> r2, kotlinx.coroutines.flow.Flow<? extends T3> r3, kotlin.jvm.functions.Function4<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.combine(r1, r2, r3, r4)
            return r0
    }

    public static final <T1, T2, T3, T4, R> kotlinx.coroutines.flow.Flow<R> combine(kotlinx.coroutines.flow.Flow<? extends T1> r1, kotlinx.coroutines.flow.Flow<? extends T2> r2, kotlinx.coroutines.flow.Flow<? extends T3> r3, kotlinx.coroutines.flow.Flow<? extends T4> r4, kotlin.jvm.functions.Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r5) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.combine(r1, r2, r3, r4, r5)
            return r0
    }

    public static final <T1, T2, T3, T4, T5, R> kotlinx.coroutines.flow.Flow<R> combine(kotlinx.coroutines.flow.Flow<? extends T1> r1, kotlinx.coroutines.flow.Flow<? extends T2> r2, kotlinx.coroutines.flow.Flow<? extends T3> r3, kotlinx.coroutines.flow.Flow<? extends T4> r4, kotlinx.coroutines.flow.Flow<? extends T5> r5, kotlin.jvm.functions.Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r6) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.combine(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.Flow<R> combine(kotlinx.coroutines.flow.Flow<? extends T>[] r1, kotlin.jvm.functions.Function2<? super T[], ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.combine(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.ReplaceWith(expression = "this.combine(other, transform)", imports = {}))
    public static final <T1, T2, R> kotlinx.coroutines.flow.Flow<R> combineLatest(kotlinx.coroutines.flow.Flow<? extends T1> r1, kotlinx.coroutines.flow.Flow<? extends T2> r2, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.combineLatest(r1, r2, r3)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.ReplaceWith(expression = "combine(this, other, other2, transform)", imports = {}))
    public static final <T1, T2, T3, R> kotlinx.coroutines.flow.Flow<R> combineLatest(kotlinx.coroutines.flow.Flow<? extends T1> r1, kotlinx.coroutines.flow.Flow<? extends T2> r2, kotlinx.coroutines.flow.Flow<? extends T3> r3, kotlin.jvm.functions.Function4<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.combineLatest(r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.ReplaceWith(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, R> kotlinx.coroutines.flow.Flow<R> combineLatest(kotlinx.coroutines.flow.Flow<? extends T1> r1, kotlinx.coroutines.flow.Flow<? extends T2> r2, kotlinx.coroutines.flow.Flow<? extends T3> r3, kotlinx.coroutines.flow.Flow<? extends T4> r4, kotlin.jvm.functions.Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r5) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.combineLatest(r1, r2, r3, r4, r5)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.ReplaceWith(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, T5, R> kotlinx.coroutines.flow.Flow<R> combineLatest(kotlinx.coroutines.flow.Flow<? extends T1> r1, kotlinx.coroutines.flow.Flow<? extends T2> r2, kotlinx.coroutines.flow.Flow<? extends T3> r3, kotlinx.coroutines.flow.Flow<? extends T4> r4, kotlinx.coroutines.flow.Flow<? extends T5> r5, kotlin.jvm.functions.Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r6) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.combineLatest(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.Flow<R> combineTransform(java.lang.Iterable<? extends kotlinx.coroutines.flow.Flow<? extends T>> r1, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.combineTransform(r1, r2)
            return r0
    }

    public static final <T1, T2, R> kotlinx.coroutines.flow.Flow<R> combineTransform(kotlinx.coroutines.flow.Flow<? extends T1> r1, kotlinx.coroutines.flow.Flow<? extends T2> r2, kotlin.jvm.functions.Function4<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.combineTransform(r1, r2, r3)
            return r0
    }

    public static final <T1, T2, T3, R> kotlinx.coroutines.flow.Flow<R> combineTransform(kotlinx.coroutines.flow.Flow<? extends T1> r1, kotlinx.coroutines.flow.Flow<? extends T2> r2, kotlinx.coroutines.flow.Flow<? extends T3> r3, kotlin.jvm.functions.Function5<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r4) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.combineTransform(r1, r2, r3, r4)
            return r0
    }

    public static final <T1, T2, T3, T4, R> kotlinx.coroutines.flow.Flow<R> combineTransform(kotlinx.coroutines.flow.Flow<? extends T1> r1, kotlinx.coroutines.flow.Flow<? extends T2> r2, kotlinx.coroutines.flow.Flow<? extends T3> r3, kotlinx.coroutines.flow.Flow<? extends T4> r4, kotlin.jvm.functions.Function6<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r5) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.combineTransform(r1, r2, r3, r4, r5)
            return r0
    }

    public static final <T1, T2, T3, T4, T5, R> kotlinx.coroutines.flow.Flow<R> combineTransform(kotlinx.coroutines.flow.Flow<? extends T1> r1, kotlinx.coroutines.flow.Flow<? extends T2> r2, kotlinx.coroutines.flow.Flow<? extends T3> r3, kotlinx.coroutines.flow.Flow<? extends T4> r4, kotlinx.coroutines.flow.Flow<? extends T5> r5, kotlin.jvm.functions.Function7<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r6) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.combineTransform(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.Flow<R> combineTransform(kotlinx.coroutines.flow.Flow<? extends T>[] r1, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.combineTransform(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @kotlin.ReplaceWith(expression = "let(transformer)", imports = {}))
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> compose(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.flow.Flow<? extends T>, ? extends kotlinx.coroutines.flow.Flow<? extends R>> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.compose(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @kotlin.ReplaceWith(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> concatMap(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function1<? super T, ? extends kotlinx.coroutines.flow.Flow<? extends R>> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.concatMap(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @kotlin.ReplaceWith(expression = "onCompletion { emit(value) }", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> concatWith(kotlinx.coroutines.flow.Flow<? extends T> r1, T r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.concatWith(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @kotlin.ReplaceWith(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> concatWith(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlinx.coroutines.flow.Flow<? extends T> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.concatWith(r1, r2)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> conflate(kotlinx.coroutines.flow.Flow<? extends T> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ContextKt.conflate(r1)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> consumeAsFlow(kotlinx.coroutines.channels.ReceiveChannel<? extends T> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ChannelsKt.consumeAsFlow(r1)
            return r0
    }

    public static final <T> java.lang.Object count(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.coroutines.Continuation<? super java.lang.Integer> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__CountKt.count(r1, r2)
            return r0
    }

    public static final <T> java.lang.Object count(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super java.lang.Integer> r3) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__CountKt.count(r1, r2, r3)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> debounce(kotlinx.coroutines.flow.Flow<? extends T> r1, long r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__DelayKt.debounce(r1, r2)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> debounce(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function1<? super T, java.lang.Long> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__DelayKt.debounce(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: debounce-HG0u8IE, reason: not valid java name */
    public static final <T> kotlinx.coroutines.flow.Flow<T> m1686debounceHG0u8IE(kotlinx.coroutines.flow.Flow<? extends T> r1, long r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__DelayKt.m1689debounceHG0u8IE(r1, r2)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> debounceDuration(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function1<? super T, kotlin.time.Duration> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__DelayKt.debounceDuration(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @kotlin.ReplaceWith(expression = "onEach { delay(timeMillis) }", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> delayEach(kotlinx.coroutines.flow.Flow<? extends T> r1, long r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.delayEach(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @kotlin.ReplaceWith(expression = "onStart { delay(timeMillis) }", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> delayFlow(kotlinx.coroutines.flow.Flow<? extends T> r1, long r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.delayFlow(r1, r2)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> distinctUntilChanged(kotlinx.coroutines.flow.Flow<? extends T> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__DistinctKt.distinctUntilChanged(r1)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> distinctUntilChanged(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Boolean> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__DistinctKt.distinctUntilChanged(r1, r2)
            return r0
    }

    public static final <T, K> kotlinx.coroutines.flow.Flow<T> distinctUntilChangedBy(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function1<? super T, ? extends K> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__DistinctKt.distinctUntilChangedBy(r1, r2)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> drop(kotlinx.coroutines.flow.Flow<? extends T> r1, int r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__LimitKt.drop(r1, r2)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> dropWhile(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__LimitKt.dropWhile(r1, r2)
            return r0
    }

    public static final <T> java.lang.Object emitAll(kotlinx.coroutines.flow.FlowCollector<? super T> r1, kotlinx.coroutines.channels.ReceiveChannel<? extends T> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ChannelsKt.emitAll(r1, r2, r3)
            return r0
    }

    public static final <T> java.lang.Object emitAll(kotlinx.coroutines.flow.FlowCollector<? super T> r1, kotlinx.coroutines.flow.Flow<? extends T> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__CollectKt.emitAll(r1, r2, r3)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> emptyFlow() {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.emptyFlow()
            return r0
    }

    public static final void ensureActive(kotlinx.coroutines.flow.FlowCollector<?> r0) {
            kotlinx.coroutines.flow.FlowKt__EmittersKt.ensureActive(r0)
            return
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> filter(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.filter(r1, r2)
            return r0
    }

    public static final /* synthetic */ <R> kotlinx.coroutines.flow.Flow<R> filterIsInstance(kotlinx.coroutines.flow.Flow<?> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.filterIsInstance(r1)
            return r0
    }

    public static final <R> kotlinx.coroutines.flow.Flow<R> filterIsInstance(kotlinx.coroutines.flow.Flow<?> r1, kotlin.reflect.KClass<R> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.filterIsInstance(r1, r2)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> filterNot(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.filterNot(r1, r2)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> filterNotNull(kotlinx.coroutines.flow.Flow<? extends T> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.filterNotNull(r1)
            return r0
    }

    public static final <T> java.lang.Object first(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.coroutines.Continuation<? super T> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.first(r1, r2)
            return r0
    }

    public static final <T> java.lang.Object first(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super T> r3) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.first(r1, r2, r3)
            return r0
    }

    public static final <T> java.lang.Object firstOrNull(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.coroutines.Continuation<? super T> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.firstOrNull(r1, r2)
            return r0
    }

    public static final <T> java.lang.Object firstOrNull(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super T> r3) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.firstOrNull(r1, r2, r3)
            return r0
    }

    public static final kotlinx.coroutines.channels.ReceiveChannel<kotlin.Unit> fixedPeriodTicker(kotlinx.coroutines.CoroutineScope r1, long r2) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.flow.FlowKt__DelayKt.fixedPeriodTicker(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @kotlin.ReplaceWith(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> flatMap(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.flatMap(r1, r2)
            return r0
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> flatMapConcat(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.flatMapConcat(r1, r2)
            return r0
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> flatMapLatest(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.flatMapLatest(r1, r2)
            return r0
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> flatMapMerge(kotlinx.coroutines.flow.Flow<? extends T> r1, int r2, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.flatMapMerge(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow flatMapMerge$default(kotlinx.coroutines.flow.Flow r0, int r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.flatMapMerge$default(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @kotlin.ReplaceWith(expression = "flattenConcat()", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> flatten(kotlinx.coroutines.flow.Flow<? extends kotlinx.coroutines.flow.Flow<? extends T>> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.flatten(r1)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> flattenConcat(kotlinx.coroutines.flow.Flow<? extends kotlinx.coroutines.flow.Flow<? extends T>> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.flattenConcat(r1)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> flattenMerge(kotlinx.coroutines.flow.Flow<? extends kotlinx.coroutines.flow.Flow<? extends T>> r1, int r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.flattenMerge(r1, r2)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow flattenMerge$default(kotlinx.coroutines.flow.Flow r0, int r1, int r2, java.lang.Object r3) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.flattenMerge$default(r0, r1, r2, r3)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> flow(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.flow(r1)
            return r0
    }

    public static final <T1, T2, R> kotlinx.coroutines.flow.Flow<R> flowCombine(kotlinx.coroutines.flow.Flow<? extends T1> r1, kotlinx.coroutines.flow.Flow<? extends T2> r2, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.flowCombine(r1, r2, r3)
            return r0
    }

    public static final <T1, T2, R> kotlinx.coroutines.flow.Flow<R> flowCombineTransform(kotlinx.coroutines.flow.Flow<? extends T1> r1, kotlinx.coroutines.flow.Flow<? extends T2> r2, kotlin.jvm.functions.Function4<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.flowCombineTransform(r1, r2, r3)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> flowOf(T r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.flowOf(r1)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> flowOf(T... r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.flowOf(r1)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> flowOn(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.coroutines.CoroutineContext r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ContextKt.flowOn(r1, r2)
            return r0
    }

    public static final <T, R> java.lang.Object fold(kotlinx.coroutines.flow.Flow<? extends T> r1, R r2, kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super R> r4) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.fold(r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @kotlin.ReplaceWith(expression = "collect(action)", imports = {}))
    public static final <T> void forEach(kotlinx.coroutines.flow.Flow<? extends T> r0, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.FlowKt__MigrationKt.forEach(r0, r1)
            return
    }

    public static final int getDEFAULT_CONCURRENCY() {
            int r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.getDEFAULT_CONCURRENCY()
            return r0
    }

    public static /* synthetic */ void getDEFAULT_CONCURRENCY_PROPERTY_NAME$annotations() {
            kotlinx.coroutines.flow.FlowKt__MergeKt.getDEFAULT_CONCURRENCY_PROPERTY_NAME$annotations()
            return
    }

    public static final <T> java.lang.Object last(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.coroutines.Continuation<? super T> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.last(r1, r2)
            return r0
    }

    public static final <T> java.lang.Object lastOrNull(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.coroutines.Continuation<? super T> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.lastOrNull(r1, r2)
            return r0
    }

    public static final <T> kotlinx.coroutines.Job launchIn(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlinx.coroutines.CoroutineScope r2) {
            kotlinx.coroutines.Job r0 = kotlinx.coroutines.flow.FlowKt__CollectKt.launchIn(r1, r2)
            return r0
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> map(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.map(r1, r2)
            return r0
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> mapLatest(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.mapLatest(r1, r2)
            return r0
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> mapNotNull(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.mapNotNull(r1, r2)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> merge(java.lang.Iterable<? extends kotlinx.coroutines.flow.Flow<? extends T>> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.merge(r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @kotlin.ReplaceWith(expression = "flattenConcat()", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> merge(kotlinx.coroutines.flow.Flow<? extends kotlinx.coroutines.flow.Flow<? extends T>> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.merge(r1)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> merge(kotlinx.coroutines.flow.Flow<? extends T>... r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.merge(r1)
            return r0
    }

    public static final java.lang.Void noImpl() {
            java.lang.Void r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.noImpl()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    public static final <T> kotlinx.coroutines.flow.Flow<T> observeOn(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.coroutines.CoroutineContext r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.observeOn(r1, r2)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> onCompletion(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__EmittersKt.onCompletion(r1, r2)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> onEach(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.onEach(r1, r2)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> onEmpty(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__EmittersKt.onEmpty(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @kotlin.ReplaceWith(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> onErrorResume(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlinx.coroutines.flow.Flow<? extends T> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.onErrorResume(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @kotlin.ReplaceWith(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> onErrorResumeNext(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlinx.coroutines.flow.Flow<? extends T> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.onErrorResumeNext(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @kotlin.ReplaceWith(expression = "catch { emit(fallback) }", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> onErrorReturn(kotlinx.coroutines.flow.Flow<? extends T> r1, T r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.onErrorReturn(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @kotlin.ReplaceWith(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> onErrorReturn(kotlinx.coroutines.flow.Flow<? extends T> r1, T r2, kotlin.jvm.functions.Function1<? super java.lang.Throwable, java.lang.Boolean> r3) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.onErrorReturn(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow onErrorReturn$default(kotlinx.coroutines.flow.Flow r0, java.lang.Object r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.onErrorReturn$default(r0, r1, r2, r3, r4)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> onStart(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__EmittersKt.onStart(r1, r2)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.SharedFlow<T> onSubscription(kotlinx.coroutines.flow.SharedFlow<? extends T> r1, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.SharedFlow r0 = kotlinx.coroutines.flow.FlowKt__ShareKt.onSubscription(r1, r2)
            return r0
    }

    public static final <T> kotlinx.coroutines.channels.ReceiveChannel<T> produceIn(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlinx.coroutines.CoroutineScope r2) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.flow.FlowKt__ChannelsKt.produceIn(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @kotlin.ReplaceWith(expression = "this.shareIn(scope, 0)", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> publish(kotlinx.coroutines.flow.Flow<? extends T> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.publish(r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @kotlin.ReplaceWith(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> publish(kotlinx.coroutines.flow.Flow<? extends T> r1, int r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.publish(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    public static final <T> kotlinx.coroutines.flow.Flow<T> publishOn(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.coroutines.CoroutineContext r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.publishOn(r1, r2)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> receiveAsFlow(kotlinx.coroutines.channels.ReceiveChannel<? extends T> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ChannelsKt.receiveAsFlow(r1)
            return r0
    }

    public static final <S, T extends S> java.lang.Object reduce(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function3<? super S, ? super T, ? super kotlin.coroutines.Continuation<? super S>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super S> r3) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.reduce(r1, r2, r3)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @kotlin.ReplaceWith(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> replay(kotlinx.coroutines.flow.Flow<? extends T> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.replay(r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @kotlin.ReplaceWith(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> replay(kotlinx.coroutines.flow.Flow<? extends T> r1, int r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.replay(r1, r2)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> retry(kotlinx.coroutines.flow.Flow<? extends T> r1, long r2, kotlin.jvm.functions.Function2<? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r4) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ErrorsKt.retry(r1, r2, r4)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow retry$default(kotlinx.coroutines.flow.Flow r0, long r1, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ErrorsKt.retry$default(r0, r1, r3, r4, r5)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> retryWhen(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function4<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super java.lang.Throwable, ? super java.lang.Long, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ErrorsKt.retryWhen(r1, r2)
            return r0
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> runningFold(kotlinx.coroutines.flow.Flow<? extends T> r1, R r2, kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.runningFold(r1, r2, r3)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> runningReduce(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function3<? super T, ? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.runningReduce(r1, r2)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> sample(kotlinx.coroutines.flow.Flow<? extends T> r1, long r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__DelayKt.sample(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: sample-HG0u8IE, reason: not valid java name */
    public static final <T> kotlinx.coroutines.flow.Flow<T> m1687sampleHG0u8IE(kotlinx.coroutines.flow.Flow<? extends T> r1, long r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__DelayKt.m1690sampleHG0u8IE(r1, r2)
            return r0
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> scan(kotlinx.coroutines.flow.Flow<? extends T> r1, R r2, kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.scan(r1, r2, r3)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @kotlin.ReplaceWith(expression = "scan(initial, operation)", imports = {}))
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> scanFold(kotlinx.coroutines.flow.Flow<? extends T> r1, R r2, kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.scanFold(r1, r2, r3)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @kotlin.ReplaceWith(expression = "runningReduce(operation)", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> scanReduce(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function3<? super T, ? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.scanReduce(r1, r2)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.SharedFlow<T> shareIn(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlinx.coroutines.CoroutineScope r2, kotlinx.coroutines.flow.SharingStarted r3, int r4) {
            kotlinx.coroutines.flow.SharedFlow r0 = kotlinx.coroutines.flow.FlowKt__ShareKt.shareIn(r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.flow.SharedFlow shareIn$default(kotlinx.coroutines.flow.Flow r0, kotlinx.coroutines.CoroutineScope r1, kotlinx.coroutines.flow.SharingStarted r2, int r3, int r4, java.lang.Object r5) {
            kotlinx.coroutines.flow.SharedFlow r0 = kotlinx.coroutines.flow.FlowKt__ShareKt.shareIn$default(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static final <T> java.lang.Object single(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.coroutines.Continuation<? super T> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.single(r1, r2)
            return r0
    }

    public static final <T> java.lang.Object singleOrNull(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.coroutines.Continuation<? super T> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.singleOrNull(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @kotlin.ReplaceWith(expression = "drop(count)", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> skip(kotlinx.coroutines.flow.Flow<? extends T> r1, int r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.skip(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @kotlin.ReplaceWith(expression = "onStart { emit(value) }", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> startWith(kotlinx.coroutines.flow.Flow<? extends T> r1, T r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.startWith(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @kotlin.ReplaceWith(expression = "onStart { emitAll(other) }", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> startWith(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlinx.coroutines.flow.Flow<? extends T> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.startWith(r1, r2)
            return r0
    }

    public static final <T> java.lang.Object stateIn(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlinx.coroutines.CoroutineScope r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.StateFlow<? extends T>> r3) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ShareKt.stateIn(r1, r2, r3)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.StateFlow<T> stateIn(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlinx.coroutines.CoroutineScope r2, kotlinx.coroutines.flow.SharingStarted r3, T r4) {
            kotlinx.coroutines.flow.StateFlow r0 = kotlinx.coroutines.flow.FlowKt__ShareKt.stateIn(r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void subscribe(kotlinx.coroutines.flow.Flow<? extends T> r0) {
            kotlinx.coroutines.flow.FlowKt__MigrationKt.subscribe(r0)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void subscribe(kotlinx.coroutines.flow.Flow<? extends T> r0, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.FlowKt__MigrationKt.subscribe(r0, r1)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void subscribe(kotlinx.coroutines.flow.Flow<? extends T> r0, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1, kotlin.jvm.functions.Function2<? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.FlowKt__MigrationKt.subscribe(r0, r1, r2)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'flowOn' instead")
    public static final <T> kotlinx.coroutines.flow.Flow<T> subscribeOn(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.coroutines.CoroutineContext r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.subscribeOn(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @kotlin.ReplaceWith(expression = "this.flatMapLatest(transform)", imports = {}))
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> switchMap(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.switchMap(r1, r2)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> take(kotlinx.coroutines.flow.Flow<? extends T> r1, int r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__LimitKt.take(r1, r2)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> takeWhile(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__LimitKt.takeWhile(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: timeout-HG0u8IE, reason: not valid java name */
    public static final <T> kotlinx.coroutines.flow.Flow<T> m1688timeoutHG0u8IE(kotlinx.coroutines.flow.Flow<? extends T> r1, long r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__DelayKt.m1691timeoutHG0u8IE(r1, r2)
            return r0
    }

    public static final <T, C extends java.util.Collection<? super T>> java.lang.Object toCollection(kotlinx.coroutines.flow.Flow<? extends T> r1, C r2, kotlin.coroutines.Continuation<? super C> r3) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__CollectionKt.toCollection(r1, r2, r3)
            return r0
    }

    public static final <T> java.lang.Object toList(kotlinx.coroutines.flow.Flow<? extends T> r1, java.util.List<T> r2, kotlin.coroutines.Continuation<? super java.util.List<? extends T>> r3) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__CollectionKt.toList(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.Object toList$default(kotlinx.coroutines.flow.Flow r0, java.util.List r1, kotlin.coroutines.Continuation r2, int r3, java.lang.Object r4) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__CollectionKt.toList$default(r0, r1, r2, r3, r4)
            return r0
    }

    public static final <T> java.lang.Object toSet(kotlinx.coroutines.flow.Flow<? extends T> r1, java.util.Set<T> r2, kotlin.coroutines.Continuation<? super java.util.Set<? extends T>> r3) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__CollectionKt.toSet(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.Object toSet$default(kotlinx.coroutines.flow.Flow r0, java.util.Set r1, kotlin.coroutines.Continuation r2, int r3, java.lang.Object r4) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__CollectionKt.toSet$default(r0, r1, r2, r3, r4)
            return r0
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> transform(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__EmittersKt.transform(r1, r2)
            return r0
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> transformLatest(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.transformLatest(r1, r2)
            return r0
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> transformWhile(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__LimitKt.transformWhile(r1, r2)
            return r0
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> unsafeTransform(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__EmittersKt.unsafeTransform(r1, r2)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<kotlin.collections.IndexedValue<T>> withIndex(kotlinx.coroutines.flow.Flow<? extends T> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.withIndex(r1)
            return r0
    }

    public static final <T1, T2, R> kotlinx.coroutines.flow.Flow<R> zip(kotlinx.coroutines.flow.Flow<? extends T1> r1, kotlinx.coroutines.flow.Flow<? extends T2> r2, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.zip(r1, r2, r3)
            return r0
    }
}
