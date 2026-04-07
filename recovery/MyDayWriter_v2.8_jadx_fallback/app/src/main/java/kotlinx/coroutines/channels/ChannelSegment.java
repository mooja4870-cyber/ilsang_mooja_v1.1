package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00000\u0002B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ)\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0002\b\u0019J\u0015\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\tH\u0000¢\u0006\u0002\b\u001cJ!\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0002\b\u001fJ\u0017\u0010 \u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\tH\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\tH\u0000¢\u0006\u0002\b$J\"\u0010%\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020)H\u0016J\u0016\u0010*\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u0015J\u0017\u0010,\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\tH\u0000¢\u0006\u0004\b-\u0010\"J\u001a\u0010.\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u00010\u0010H\u0002J\u001f\u00100\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0002\b1J\u001f\u00102\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u00103\u001a\u00028\u0000H\u0000¢\u0006\u0004\b4\u00105R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fX\u0082\u0004R\u0014\u0010\u0011\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u00066"}, d2 = {"Lkotlinx/coroutines/channels/ChannelSegment;", "E", "Lkotlinx/coroutines/internal/Segment;", "id", "", "prev", "channel", "Lkotlinx/coroutines/channels/BufferedChannel;", "pointers", "", "(JLkotlinx/coroutines/channels/ChannelSegment;Lkotlinx/coroutines/channels/BufferedChannel;I)V", "_channel", "getChannel", "()Lkotlinx/coroutines/channels/BufferedChannel;", "data", "Lkotlinx/atomicfu/AtomicArray;", "", "numberOfSlots", "getNumberOfSlots", "()I", "casState", "", "index", "from", "to", "casState$kotlinx_coroutines_core", "cleanElement", "", "cleanElement$kotlinx_coroutines_core", "getAndSetState", "update", "getAndSetState$kotlinx_coroutines_core", "getElement", "getElement$kotlinx_coroutines_core", "(I)Ljava/lang/Object;", "getState", "getState$kotlinx_coroutines_core", "onCancellation", "cause", "", "context", "Lkotlin/coroutines/CoroutineContext;", "onCancelledRequest", "receiver", "retrieveElement", "retrieveElement$kotlinx_coroutines_core", "setElementLazy", "value", "setState", "setState$kotlinx_coroutines_core", "storeElement", "element", "storeElement$kotlinx_coroutines_core", "(ILjava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ChannelSegment<E> extends kotlinx.coroutines.internal.Segment<kotlinx.coroutines.channels.ChannelSegment<E>> {
    private final kotlinx.coroutines.channels.BufferedChannel<E> _channel;
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray data;

    public ChannelSegment(long r3, kotlinx.coroutines.channels.ChannelSegment<E> r5, kotlinx.coroutines.channels.BufferedChannel<E> r6, int r7) {
            r2 = this;
            r0 = r5
            kotlinx.coroutines.internal.Segment r0 = (kotlinx.coroutines.internal.Segment) r0
            r2.<init>(r3, r0, r7)
            r2._channel = r6
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            int r1 = r1 * 2
            r0.<init>(r1)
            r2.data = r0
            return
    }

    private final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray getData() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.data
            return r0
    }

    private final void setElementLazy(int r3, java.lang.Object r4) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r2.getData()
            int r1 = r3 * 2
            r0.set(r1, r4)
            return
    }

    public final boolean casState$kotlinx_coroutines_core(int r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r2.getData()
            int r1 = r3 * 2
            int r1 = r1 + 1
            boolean r0 = kotlinx.coroutines.channels.ChannelSegment$$ExternalSyntheticBackportWithForwarding0.m(r0, r1, r4, r5)
            return r0
    }

    public final void cleanElement$kotlinx_coroutines_core(int r2) {
            r1 = this;
            r0 = 0
            r1.setElementLazy(r2, r0)
            return
    }

    public final java.lang.Object getAndSetState$kotlinx_coroutines_core(int r3, java.lang.Object r4) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r2.getData()
            int r1 = r3 * 2
            int r1 = r1 + 1
            java.lang.Object r0 = r0.getAndSet(r1, r4)
            return r0
    }

    public final kotlinx.coroutines.channels.BufferedChannel<E> getChannel() {
            r1 = this;
            kotlinx.coroutines.channels.BufferedChannel<E> r0 = r1._channel
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
    }

    public final E getElement$kotlinx_coroutines_core(int r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r2.getData()
            int r1 = r3 * 2
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    @Override // kotlinx.coroutines.internal.Segment
    public int getNumberOfSlots() {
            r1 = this;
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            return r0
    }

    public final java.lang.Object getState$kotlinx_coroutines_core(int r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r2.getData()
            int r1 = r3 * 2
            int r1 = r1 + 1
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    @Override // kotlinx.coroutines.internal.Segment
    public void onCancellation(int r9, java.lang.Throwable r10, kotlin.coroutines.CoroutineContext r11) {
            r8 = this;
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            r1 = 1
            r2 = 0
            if (r9 < r0) goto L8
            r0 = r1
            goto L9
        L8:
            r0 = r2
        L9:
            if (r0 == 0) goto L10
            int r3 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            int r3 = r9 - r3
            goto L11
        L10:
            r3 = r9
        L11:
            java.lang.Object r4 = r8.getElement$kotlinx_coroutines_core(r3)
        L15:
            java.lang.Object r5 = r8.getState$kotlinx_coroutines_core(r3)
            boolean r6 = r5 instanceof kotlinx.coroutines.Waiter
            if (r6 != 0) goto L7f
            boolean r6 = r5 instanceof kotlinx.coroutines.channels.WaiterEB
            if (r6 == 0) goto L24
            goto L7f
        L24:
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
            if (r5 == r6) goto L6e
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_RCV$p()
            if (r5 != r6) goto L31
            goto L6e
        L31:
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_EB$p()
            if (r5 == r6) goto L15
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_RCV$p()
            if (r5 != r6) goto L3e
            goto L15
        L3e:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getDONE_RCV$p()
            if (r5 == r1) goto L6d
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            if (r5 != r1) goto L49
            goto L6d
        L49:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            if (r5 != r1) goto L50
            return
        L50:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "unexpected state: "
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L6d:
            return
        L6e:
            r8.cleanElement$kotlinx_coroutines_core(r3)
            if (r0 == 0) goto L7e
            kotlinx.coroutines.channels.BufferedChannel r1 = r8.getChannel()
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r1 = r1.onUndeliveredElement
            if (r1 == 0) goto L7e
            kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(r1, r4, r11)
        L7e:
            return
        L7f:
            if (r0 == 0) goto L86
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
            goto L8a
        L86:
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_RCV$p()
        L8a:
            boolean r7 = r8.casState$kotlinx_coroutines_core(r3, r5, r6)
            if (r7 == 0) goto L15
            r8.cleanElement$kotlinx_coroutines_core(r3)
            if (r0 != 0) goto L96
            goto L97
        L96:
            r1 = r2
        L97:
            r8.onCancelledRequest(r3, r1)
            if (r0 == 0) goto La7
            kotlinx.coroutines.channels.BufferedChannel r1 = r8.getChannel()
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r1 = r1.onUndeliveredElement
            if (r1 == 0) goto La7
            kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(r1, r4, r11)
        La7:
            return
    }

    public final void onCancelledRequest(int r6, boolean r7) {
            r5 = this;
            if (r7 == 0) goto L11
            kotlinx.coroutines.channels.BufferedChannel r0 = r5.getChannel()
            long r1 = r5.id
            int r3 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r3 = (long) r3
            long r1 = r1 * r3
            long r3 = (long) r6
            long r1 = r1 + r3
            r0.waitExpandBufferCompletion$kotlinx_coroutines_core(r1)
        L11:
            r5.onSlotCleaned()
            return
    }

    public final E retrieveElement$kotlinx_coroutines_core(int r4) {
            r3 = this;
            java.lang.Object r0 = r3.getElement$kotlinx_coroutines_core(r4)
            r1 = r0
            r2 = 0
            r3.cleanElement$kotlinx_coroutines_core(r4)
            return r0
    }

    public final void setState$kotlinx_coroutines_core(int r3, java.lang.Object r4) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r2.getData()
            int r1 = r3 * 2
            int r1 = r1 + 1
            r0.set(r1, r4)
            return
    }

    public final void storeElement$kotlinx_coroutines_core(int r1, E r2) {
            r0 = this;
            r0.setElementLazy(r1, r2)
            return
    }
}
