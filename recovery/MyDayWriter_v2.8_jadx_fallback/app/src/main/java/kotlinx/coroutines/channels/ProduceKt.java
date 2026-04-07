package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Produce.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00022\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0086@¢\u0006\u0002\u0010\u0005\u001a\u009b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2-\b\u0002\u0010\u0010\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011j\u0004\u0018\u0001`\u00162/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017¢\u0006\u0002\b\u001aH\u0007¢\u0006\u0002\u0010\u001b\u001a¥\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2-\b\u0002\u0010\u0010\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011j\u0004\u0018\u0001`\u00162/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017¢\u0006\u0002\b\u001aH\u0000¢\u0006\u0002\u0010\u001e\u001ab\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017¢\u0006\u0002\b\u001aH\u0007¢\u0006\u0002\u0010\u001f¨\u0006 "}, d2 = {"awaitClose", "", "Lkotlinx/coroutines/channels/ProducerScope;", "block", "Lkotlin/Function0;", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "produce", "Lkotlinx/coroutines/channels/ReceiveChannel;", "E", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "start", "Lkotlinx/coroutines/CoroutineStart;", "onCompletion", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ProduceKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ProduceKt$awaitClose$1, reason: invalid class name */
    /* JADX INFO: compiled from: Produce.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", i = {0, 0}, l = {150}, m = "awaitClose", n = {"$this$awaitClose", "block"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ProduceKt.AnonymousClass1> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r0, r0, r1)
                return r0
        }
    }


    public static final java.lang.Object awaitClose(kotlinx.coroutines.channels.ProducerScope<?> r9, kotlin.jvm.functions.Function0<kotlin.Unit> r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.ProduceKt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r11
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = (kotlinx.coroutines.channels.ProduceKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r11 = r0.label
            int r11 = r11 - r2
            r0.label = r11
            goto L19
        L14:
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            r0.<init>(r11)
        L19:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L3b;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2c:
            r9 = 0
            java.lang.Object r10 = r0.L$1
            kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
            java.lang.Object r1 = r0.L$0
            kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L39
            goto L8e
        L39:
            r9 = move-exception
            goto L96
        L3b:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            kotlinx.coroutines.Job$Key r3 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r3 = (kotlin.coroutines.CoroutineContext.Key) r3
            kotlin.coroutines.CoroutineContext$Element r2 = r2.get(r3)
            r3 = 1
            if (r2 != r9) goto L4f
            r2 = r3
            goto L50
        L4f:
            r2 = 0
        L50:
            if (r2 == 0) goto L9a
        L53:
            r2 = 0
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L39
            r0.L$1 = r10     // Catch: java.lang.Throwable -> L39
            r0.label = r3     // Catch: java.lang.Throwable -> L39
            r4 = r0
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4     // Catch: java.lang.Throwable -> L39
            r5 = 0
            kotlinx.coroutines.CancellableContinuationImpl r6 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.lang.Throwable -> L39
            kotlin.coroutines.Continuation r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r4)     // Catch: java.lang.Throwable -> L39
            r6.<init>(r7, r3)     // Catch: java.lang.Throwable -> L39
            r6.initCancellability()     // Catch: java.lang.Throwable -> L39
            r3 = r6
            kotlinx.coroutines.CancellableContinuation r3 = (kotlinx.coroutines.CancellableContinuation) r3     // Catch: java.lang.Throwable -> L39
            r7 = 0
            kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1 r8 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1     // Catch: java.lang.Throwable -> L39
            r8.<init>(r3)     // Catch: java.lang.Throwable -> L39
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8     // Catch: java.lang.Throwable -> L39
            r9.invokeOnClose(r8)     // Catch: java.lang.Throwable -> L39
            java.lang.Object r9 = r6.getResult()     // Catch: java.lang.Throwable -> L39
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L39
            if (r9 != r3) goto L8a
            r3 = r0
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3     // Catch: java.lang.Throwable -> L39
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r3)     // Catch: java.lang.Throwable -> L39
        L8a:
            if (r9 != r1) goto L8d
            return r1
        L8d:
            r9 = r2
        L8e:
            r10.invoke()
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L96:
            r10.invoke()
            throw r9
        L9a:
            r9 = 0
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    public static /* synthetic */ java.lang.Object awaitClose$default(kotlinx.coroutines.channels.ProducerScope r0, kotlin.jvm.functions.Function0 r1, kotlin.coroutines.Continuation r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L8
            kotlinx.coroutines.channels.ProduceKt$awaitClose$2 r1 = kotlinx.coroutines.channels.ProduceKt.AnonymousClass2.INSTANCE
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
        L8:
            java.lang.Object r0 = awaitClose(r0, r1, r2)
            return r0
    }

    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> produce(kotlinx.coroutines.CoroutineScope r7, kotlin.coroutines.CoroutineContext r8, int r9, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ProducerScope<? super E>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r10) {
            kotlinx.coroutines.channels.BufferOverflow r3 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            kotlinx.coroutines.CoroutineStart r4 = kotlinx.coroutines.CoroutineStart.DEFAULT
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r6 = r10
            kotlinx.coroutines.channels.ReceiveChannel r7 = produce(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> produce(kotlinx.coroutines.CoroutineScope r7, kotlin.coroutines.CoroutineContext r8, int r9, kotlinx.coroutines.CoroutineStart r10, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r11, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ProducerScope<? super E>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r12) {
            kotlinx.coroutines.channels.BufferOverflow r3 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            kotlinx.coroutines.channels.ReceiveChannel r7 = produce(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> produce(kotlinx.coroutines.CoroutineScope r4, kotlin.coroutines.CoroutineContext r5, int r6, kotlinx.coroutines.channels.BufferOverflow r7, kotlinx.coroutines.CoroutineStart r8, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r9, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ProducerScope<? super E>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r10) {
            r0 = 0
            r1 = 4
            kotlinx.coroutines.channels.Channel r0 = kotlinx.coroutines.channels.ChannelKt.Channel$default(r6, r7, r0, r1, r0)
            kotlin.coroutines.CoroutineContext r1 = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(r4, r5)
            kotlinx.coroutines.channels.ProducerCoroutine r2 = new kotlinx.coroutines.channels.ProducerCoroutine
            r2.<init>(r1, r0)
            if (r9 == 0) goto L14
            r2.invokeOnCompletion(r9)
        L14:
            r2.start(r8, r2, r10)
            r3 = r2
            kotlinx.coroutines.channels.ReceiveChannel r3 = (kotlinx.coroutines.channels.ReceiveChannel) r3
            return r3
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel produce$default(kotlinx.coroutines.CoroutineScope r0, kotlin.coroutines.CoroutineContext r1, int r2, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L8
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        L8:
            r4 = r4 & 2
            if (r4 == 0) goto Ld
            r2 = 0
        Ld:
            kotlinx.coroutines.channels.ReceiveChannel r0 = produce(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel produce$default(kotlinx.coroutines.CoroutineScope r0, kotlin.coroutines.CoroutineContext r1, int r2, kotlinx.coroutines.CoroutineStart r3, kotlin.jvm.functions.Function1 r4, kotlin.jvm.functions.Function2 r5, int r6, java.lang.Object r7) {
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
            kotlinx.coroutines.channels.ReceiveChannel r0 = produce(r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel produce$default(kotlinx.coroutines.CoroutineScope r0, kotlin.coroutines.CoroutineContext r1, int r2, kotlinx.coroutines.channels.BufferOverflow r3, kotlinx.coroutines.CoroutineStart r4, kotlin.jvm.functions.Function1 r5, kotlin.jvm.functions.Function2 r6, int r7, java.lang.Object r8) {
            r8 = r7 & 1
            if (r8 == 0) goto L8
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        L8:
            r8 = r7 & 2
            if (r8 == 0) goto Ld
            r2 = 0
        Ld:
            r8 = r7 & 4
            if (r8 == 0) goto L13
            kotlinx.coroutines.channels.BufferOverflow r3 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
        L13:
            r8 = r7 & 8
            if (r8 == 0) goto L19
            kotlinx.coroutines.CoroutineStart r4 = kotlinx.coroutines.CoroutineStart.DEFAULT
        L19:
            r7 = r7 & 16
            if (r7 == 0) goto L20
            r5 = 0
            r7 = r5
            goto L21
        L20:
            r7 = r5
        L21:
            r5 = r3
            r8 = r6
            r3 = r1
            r6 = r4
            r4 = r2
            r2 = r0
            kotlinx.coroutines.channels.ReceiveChannel r0 = produce(r2, r3, r4, r5, r6, r7, r8)
            return r0
    }
}
