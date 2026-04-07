package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: ConflatedBufferedChannel.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\"\b\u0002\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\n¢\u0006\u0002\u0010\u000bJ\u001e\u0010\u000f\u001a\u00020\t2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0016\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00028\u0000H\u0090@¢\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0018\u001a\u00020\rH\u0010¢\u0006\u0002\b\u0019J#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u001b2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001b2\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J+\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u001b2\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010!R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Lkotlinx/coroutines/channels/ConflatedBufferedChannel;", "E", "Lkotlinx/coroutines/channels/BufferedChannel;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;)V", "isConflatedDropOldest", "", "()Z", "registerSelectForSend", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "element", "", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendBroadcast", "sendBroadcast$kotlinx_coroutines_core", "shouldSendSuspend", "shouldSendSuspend$kotlinx_coroutines_core", "trySend", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySendDropLatest", "isSendOp", "trySendDropLatest-Mj0NB7M", "(Ljava/lang/Object;Z)Ljava/lang/Object;", "trySendImpl", "trySendImpl-Mj0NB7M", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class ConflatedBufferedChannel<E> extends kotlinx.coroutines.channels.BufferedChannel<E> {
    private final int capacity;
    private final kotlinx.coroutines.channels.BufferOverflow onBufferOverflow;

    public ConflatedBufferedChannel(int r5, kotlinx.coroutines.channels.BufferOverflow r6, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r7) {
            r4 = this;
            r4.<init>(r5, r7)
            r4.capacity = r5
            r4.onBufferOverflow = r6
            kotlinx.coroutines.channels.BufferOverflow r0 = r4.onBufferOverflow
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L12
            r0 = r3
            goto L13
        L12:
            r0 = r2
        L13:
            if (r0 == 0) goto L44
            int r0 = r4.capacity
            if (r0 < r3) goto L1a
            r2 = r3
        L1a:
            if (r2 == 0) goto L1e
        L1d:
            return
        L1e:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Buffered channel capacity must be at least 1, but "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r4.capacity
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " was specified"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L44:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "This implementation does not support suspension for senders, use "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.Class<kotlinx.coroutines.channels.BufferedChannel> r2 = kotlinx.coroutines.channels.BufferedChannel.class
            kotlin.reflect.KClass r2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r2)
            java.lang.String r2 = r2.getSimpleName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " instead"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public /* synthetic */ ConflatedBufferedChannel(int r1, kotlinx.coroutines.channels.BufferOverflow r2, kotlin.jvm.functions.Function1 r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            r0.<init>(r1, r2, r3)
            return
    }

    static /* synthetic */ <E> java.lang.Object send$suspendImpl(kotlinx.coroutines.channels.ConflatedBufferedChannel<E> r8, E r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
            r0 = 1
            java.lang.Object r0 = r8.m1684trySendImplMj0NB7M(r9, r0)
            r1 = 0
            boolean r2 = r0 instanceof kotlinx.coroutines.channels.ChannelResult.Closed
            if (r2 == 0) goto L2d
            java.lang.Throwable r2 = kotlinx.coroutines.channels.ChannelResult.m1671exceptionOrNullimpl(r0)
            r3 = 0
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r4 = r8.onUndeliveredElement
            if (r4 == 0) goto L28
            r5 = 2
            r6 = 0
            kotlinx.coroutines.internal.UndeliveredElementException r4 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(r4, r9, r6, r5, r6)
            if (r4 == 0) goto L28
            r5 = 0
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            java.lang.Throwable r7 = r8.getSendException()
            kotlin.ExceptionsKt.addSuppressed(r6, r7)
            throw r4
        L28:
            java.lang.Throwable r4 = r8.getSendException()
            throw r4
        L2d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    static /* synthetic */ <E> java.lang.Object sendBroadcast$suspendImpl(kotlinx.coroutines.channels.ConflatedBufferedChannel<E> r5, E r6, kotlin.coroutines.Continuation<? super java.lang.Boolean> r7) {
            r0 = 1
            java.lang.Object r1 = r5.m1684trySendImplMj0NB7M(r6, r0)
            r2 = 0
            boolean r3 = r1 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r3 != 0) goto L15
            r3 = r1
            kotlin.Unit r3 = (kotlin.Unit) r3
            r4 = 0
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r0
        L15:
            r0 = 0
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r0
    }

    /* JADX INFO: renamed from: trySendDropLatest-Mj0NB7M, reason: not valid java name */
    private final java.lang.Object m1683trySendDropLatestMj0NB7M(E r5, boolean r6) {
            r4 = this;
            java.lang.Object r0 = super.mo1656trySendJP2dKIU(r5)
            boolean r1 = kotlinx.coroutines.channels.ChannelResult.m1677isSuccessimpl(r0)
            if (r1 != 0) goto L2b
            boolean r1 = kotlinx.coroutines.channels.ChannelResult.m1675isClosedimpl(r0)
            if (r1 == 0) goto L11
            goto L2b
        L11:
            if (r6 == 0) goto L22
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r1 = r4.onUndeliveredElement
            if (r1 == 0) goto L22
            r2 = 2
            r3 = 0
            kotlinx.coroutines.internal.UndeliveredElementException r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(r1, r5, r3, r2, r3)
            if (r1 != 0) goto L20
            goto L22
        L20:
            r2 = 0
            throw r1
        L22:
            kotlinx.coroutines.channels.ChannelResult$Companion r1 = kotlinx.coroutines.channels.ChannelResult.Companion
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.m1682successJP2dKIU(r2)
            return r1
        L2b:
            return r0
    }

    /* JADX INFO: renamed from: trySendImpl-Mj0NB7M, reason: not valid java name */
    private final java.lang.Object m1684trySendImplMj0NB7M(E r3, boolean r4) {
            r2 = this;
            kotlinx.coroutines.channels.BufferOverflow r0 = r2.onBufferOverflow
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_LATEST
            if (r0 != r1) goto Lb
            java.lang.Object r0 = r2.m1683trySendDropLatestMj0NB7M(r3, r4)
            goto Lf
        Lb:
            java.lang.Object r0 = r2.m1662trySendDropOldestJP2dKIU(r3)
        Lf:
            return r0
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    protected boolean isConflatedDropOldest() {
            r2 = this;
            kotlinx.coroutines.channels.BufferOverflow r0 = r2.onBufferOverflow
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    protected void registerSelectForSend(kotlinx.coroutines.selects.SelectInstance<?> r8, java.lang.Object r9) {
            r7 = this;
            java.lang.Object r0 = r7.mo1656trySendJP2dKIU(r9)
            r1 = 0
            r2 = r0
            r3 = 0
            boolean r4 = r2 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r4 != 0) goto L16
            r4 = r2
            kotlin.Unit r4 = (kotlin.Unit) r4
            r5 = 0
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            r8.selectInRegistrationPhase(r6)
            return
        L16:
            r3 = 0
            boolean r4 = r2 instanceof kotlinx.coroutines.channels.ChannelResult.Closed
            if (r4 == 0) goto L2b
            java.lang.Throwable r4 = kotlinx.coroutines.channels.ChannelResult.m1671exceptionOrNullimpl(r2)
            r5 = 0
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            r8.selectInRegistrationPhase(r6)
            return
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unreachable"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public java.lang.Object send(E r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            java.lang.Object r0 = send$suspendImpl(r1, r2, r3)
            return r0
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public java.lang.Object sendBroadcast$kotlinx_coroutines_core(E r2, kotlin.coroutines.Continuation<? super java.lang.Boolean> r3) {
            r1 = this;
            java.lang.Object r0 = sendBroadcast$suspendImpl(r1, r2, r3)
            return r0
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public java.lang.Object mo1656trySendJP2dKIU(E r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r0 = r1.m1684trySendImplMj0NB7M(r2, r0)
            return r0
    }
}
