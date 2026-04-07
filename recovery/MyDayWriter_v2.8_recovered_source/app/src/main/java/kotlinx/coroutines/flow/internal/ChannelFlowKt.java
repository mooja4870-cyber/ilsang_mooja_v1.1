package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aX\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00072\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\tH\u0080@¢\u0006\u0002\u0010\u000b\u001a\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00010\r\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u000eH\u0000\u001a&\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0010\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¨\u0006\u0012"}, d2 = {"withContextUndispatched", "T", "V", "newContext", "Lkotlin/coroutines/CoroutineContext;", "value", "countOrElement", "", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "asChannelFlow", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlinx/coroutines/flow/Flow;", "withUndispatchedContextCollector", "Lkotlinx/coroutines/flow/FlowCollector;", "emitContext", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ChannelFlowKt {
    public static final /* synthetic */ kotlinx.coroutines.flow.FlowCollector access$withUndispatchedContextCollector(kotlinx.coroutines.flow.FlowCollector r1, kotlin.coroutines.CoroutineContext r2) {
            kotlinx.coroutines.flow.FlowCollector r0 = withUndispatchedContextCollector(r1, r2)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.internal.ChannelFlow<T> asChannelFlow(kotlinx.coroutines.flow.Flow<? extends T> r8) {
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.internal.ChannelFlow
            if (r0 == 0) goto L8
            r0 = r8
            kotlinx.coroutines.flow.internal.ChannelFlow r0 = (kotlinx.coroutines.flow.internal.ChannelFlow) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 != 0) goto L1b
            kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl r1 = new kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl
            r6 = 14
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0 = r1
            kotlinx.coroutines.flow.internal.ChannelFlow r0 = (kotlinx.coroutines.flow.internal.ChannelFlow) r0
            goto L1c
        L1b:
            r2 = r8
        L1c:
            return r0
    }

    public static final <T, V> java.lang.Object withContextUndispatched(kotlin.coroutines.CoroutineContext r7, V r8, java.lang.Object r9, kotlin.jvm.functions.Function2<? super V, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r10, kotlin.coroutines.Continuation<? super T> r11) {
            r0 = r11
            r1 = 0
            r2 = 0
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r7, r9)
            r4 = 0
            kotlinx.coroutines.flow.internal.StackFrameContinuation r5 = new kotlinx.coroutines.flow.internal.StackFrameContinuation     // Catch: java.lang.Throwable -> L34
            r5.<init>(r0, r7)     // Catch: java.lang.Throwable -> L34
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5     // Catch: java.lang.Throwable -> L34
            boolean r6 = r10 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl     // Catch: java.lang.Throwable -> L34
            if (r6 != 0) goto L19
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.wrapWithContinuationImpl(r10, r8, r5)     // Catch: java.lang.Throwable -> L34
            goto L24
        L19:
            r6 = 2
            java.lang.Object r6 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r10, r6)     // Catch: java.lang.Throwable -> L34
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6     // Catch: java.lang.Throwable -> L34
            java.lang.Object r5 = r6.invoke(r8, r5)     // Catch: java.lang.Throwable -> L34
        L24:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r7, r3)
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r5 != r0) goto L33
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r11)
        L33:
            return r5
        L34:
            r4 = move-exception
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r7, r3)
            throw r4
    }

    public static /* synthetic */ java.lang.Object withContextUndispatched$default(kotlin.coroutines.CoroutineContext r0, java.lang.Object r1, java.lang.Object r2, kotlin.jvm.functions.Function2 r3, kotlin.coroutines.Continuation r4, int r5, java.lang.Object r6) {
            r5 = r5 & 4
            if (r5 == 0) goto L8
            java.lang.Object r2 = kotlinx.coroutines.internal.ThreadContextKt.threadContextElements(r0)
        L8:
            java.lang.Object r0 = withContextUndispatched(r0, r1, r2, r3, r4)
            return r0
    }

    private static final <T> kotlinx.coroutines.flow.FlowCollector<T> withUndispatchedContextCollector(kotlinx.coroutines.flow.FlowCollector<? super T> r1, kotlin.coroutines.CoroutineContext r2) {
            boolean r0 = r1 instanceof kotlinx.coroutines.flow.internal.SendingCollector
            if (r0 == 0) goto L7
            r0 = 1
            goto L9
        L7:
            boolean r0 = r1 instanceof kotlinx.coroutines.flow.internal.NopCollector
        L9:
            if (r0 == 0) goto Ld
            r0 = r1
            goto L14
        Ld:
            kotlinx.coroutines.flow.internal.UndispatchedContextCollector r0 = new kotlinx.coroutines.flow.internal.UndispatchedContextCollector
            r0.<init>(r1, r2)
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
        L14:
            return r0
    }
}
