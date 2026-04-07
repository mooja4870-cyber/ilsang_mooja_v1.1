package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0018\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020.H\u0002\u001a\u0018\u00109\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u000bH\u0002\u001a*\u0010;\u001a\b\u0012\u0004\u0012\u0002H<0\u001a\"\u0004\b\u0000\u0010<2\u0006\u0010=\u001a\u00020\u00032\f\u0010>\u001a\b\u0012\u0004\u0012\u0002H<0\u001aH\u0002\u001a,\u0010?\u001a \u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002H<0\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H<0\u001a0@\"\u0004\b\u0000\u0010<H\u0000\u001a\u0010\u0010A\u001a\u00020\u00032\u0006\u0010B\u001a\u00020\u000bH\u0002\u001aL\u0010C\u001a\u00020.\"\u0004\b\u0000\u0010D*\b\u0012\u0004\u0012\u0002HD0E2\u0006\u0010F\u001a\u0002HD2%\b\u0002\u0010G\u001a\u001f\u0012\u0013\u0012\u00110I¢\u0006\f\bJ\u0012\b\bK\u0012\u0004\b\b(L\u0012\u0004\u0012\u00020M\u0018\u00010HH\u0002¢\u0006\u0002\u0010N\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u000e\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010%\u001a\u00020\u000b8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010'\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010)\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0019\u0010*\u001a\u00020\u0003*\u00020\u00038Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\"\u0019\u0010-\u001a\u00020.*\u00020\u00038Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100\"\u0019\u00101\u001a\u00020\u000b*\u00020\u00038Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103\"\u0019\u00104\u001a\u00020\u0003*\u00020\u00038Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u0010,¨\u0006O"}, d2 = {"BUFFERED", "Lkotlinx/coroutines/internal/Symbol;", "BUFFER_END_RENDEZVOUS", "", "BUFFER_END_UNLIMITED", "CHANNEL_CLOSED", "getCHANNEL_CLOSED", "()Lkotlinx/coroutines/internal/Symbol;", "CLOSE_HANDLER_CLOSED", "CLOSE_HANDLER_INVOKED", "CLOSE_STATUS_ACTIVE", "", "CLOSE_STATUS_CANCELLATION_STARTED", "CLOSE_STATUS_CANCELLED", "CLOSE_STATUS_CLOSED", "DONE_RCV", "EB_COMPLETED_COUNTER_MASK", "EB_COMPLETED_PAUSE_EXPAND_BUFFERS_BIT", "EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS", "FAILED", "INTERRUPTED_RCV", "INTERRUPTED_SEND", "IN_BUFFER", "NO_CLOSE_CAUSE", "NO_RECEIVE_RESULT", "NULL_SEGMENT", "Lkotlinx/coroutines/channels/ChannelSegment;", "", "POISONED", "RESULT_BUFFERED", "RESULT_CLOSED", "RESULT_FAILED", "RESULT_RENDEZVOUS", "RESULT_SUSPEND", "RESULT_SUSPEND_NO_WAITER", "RESUMING_BY_EB", "RESUMING_BY_RCV", "SEGMENT_SIZE", "SENDERS_CLOSE_STATUS_SHIFT", "SENDERS_COUNTER_MASK", "SUSPEND", "SUSPEND_NO_WAITER", "ebCompletedCounter", "getEbCompletedCounter", "(J)J", "ebPauseExpandBuffers", "", "getEbPauseExpandBuffers", "(J)Z", "sendersCloseStatus", "getSendersCloseStatus", "(J)I", "sendersCounter", "getSendersCounter", "constructEBCompletedAndPauseFlag", "counter", "pauseEB", "constructSendersAndCloseStatus", "closeStatus", "createSegment", "E", "id", "prev", "createSegmentFunction", "Lkotlin/reflect/KFunction2;", "initialBufferEnd", "capacity", "tryResume0", "T", "Lkotlinx/coroutines/CancellableContinuation;", "value", "onCancellation", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "(Lkotlinx/coroutines/CancellableContinuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Z", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BufferedChannelKt {
    public static final kotlinx.coroutines.internal.Symbol BUFFERED = null;
    private static final long BUFFER_END_RENDEZVOUS = 0;
    private static final long BUFFER_END_UNLIMITED = Long.MAX_VALUE;
    private static final kotlinx.coroutines.internal.Symbol CHANNEL_CLOSED = null;
    private static final kotlinx.coroutines.internal.Symbol CLOSE_HANDLER_CLOSED = null;
    private static final kotlinx.coroutines.internal.Symbol CLOSE_HANDLER_INVOKED = null;
    private static final int CLOSE_STATUS_ACTIVE = 0;
    private static final int CLOSE_STATUS_CANCELLATION_STARTED = 1;
    private static final int CLOSE_STATUS_CANCELLED = 3;
    private static final int CLOSE_STATUS_CLOSED = 2;
    private static final kotlinx.coroutines.internal.Symbol DONE_RCV = null;
    private static final long EB_COMPLETED_COUNTER_MASK = 4611686018427387903L;
    private static final long EB_COMPLETED_PAUSE_EXPAND_BUFFERS_BIT = 4611686018427387904L;
    private static final int EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS = 0;
    private static final kotlinx.coroutines.internal.Symbol FAILED = null;
    private static final kotlinx.coroutines.internal.Symbol INTERRUPTED_RCV = null;
    private static final kotlinx.coroutines.internal.Symbol INTERRUPTED_SEND = null;
    private static final kotlinx.coroutines.internal.Symbol IN_BUFFER = null;
    private static final kotlinx.coroutines.internal.Symbol NO_CLOSE_CAUSE = null;
    private static final kotlinx.coroutines.internal.Symbol NO_RECEIVE_RESULT = null;
    private static final kotlinx.coroutines.channels.ChannelSegment<java.lang.Object> NULL_SEGMENT = null;
    private static final kotlinx.coroutines.internal.Symbol POISONED = null;
    private static final int RESULT_BUFFERED = 1;
    private static final int RESULT_CLOSED = 4;
    private static final int RESULT_FAILED = 5;
    private static final int RESULT_RENDEZVOUS = 0;
    private static final int RESULT_SUSPEND = 2;
    private static final int RESULT_SUSPEND_NO_WAITER = 3;
    private static final kotlinx.coroutines.internal.Symbol RESUMING_BY_EB = null;
    private static final kotlinx.coroutines.internal.Symbol RESUMING_BY_RCV = null;
    public static final int SEGMENT_SIZE = 0;
    private static final int SENDERS_CLOSE_STATUS_SHIFT = 60;
    private static final long SENDERS_COUNTER_MASK = 1152921504606846975L;
    private static final kotlinx.coroutines.internal.Symbol SUSPEND = null;
    private static final kotlinx.coroutines.internal.Symbol SUSPEND_NO_WAITER = null;

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BufferedChannelKt$createSegmentFunction$1, reason: invalid class name */
    /* JADX INFO: compiled from: BufferedChannel.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class AnonymousClass1<E> extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.lang.Long, kotlinx.coroutines.channels.ChannelSegment<E>, kotlinx.coroutines.channels.ChannelSegment<E>> {
        public static final kotlinx.coroutines.channels.BufferedChannelKt.AnonymousClass1 INSTANCE = null;

        static {
                kotlinx.coroutines.channels.BufferedChannelKt$createSegmentFunction$1 r0 = new kotlinx.coroutines.channels.BufferedChannelKt$createSegmentFunction$1
                r0.<init>()
                kotlinx.coroutines.channels.BufferedChannelKt.AnonymousClass1.INSTANCE = r0
                return
        }

        AnonymousClass1() {
                r6 = this;
                java.lang.Class<kotlinx.coroutines.channels.BufferedChannelKt> r2 = kotlinx.coroutines.channels.BufferedChannelKt.class
                java.lang.String r4 = "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;"
                r5 = 1
                r1 = 2
                java.lang.String r3 = "createSegment"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Long r4, java.lang.Object r5) {
                r3 = this;
                r0 = r4
                java.lang.Number r0 = (java.lang.Number) r0
                long r0 = r0.longValue()
                r2 = r5
                kotlinx.coroutines.channels.ChannelSegment r2 = (kotlinx.coroutines.channels.ChannelSegment) r2
                kotlinx.coroutines.channels.ChannelSegment r0 = r3.invoke(r0, r2)
                return r0
        }

        public final kotlinx.coroutines.channels.ChannelSegment<E> invoke(long r2, kotlinx.coroutines.channels.ChannelSegment<E> r4) {
                r1 = this;
                kotlinx.coroutines.channels.ChannelSegment r0 = kotlinx.coroutines.channels.BufferedChannelKt.access$createSegment(r2, r4)
                return r0
        }
    }

    static {
            kotlinx.coroutines.channels.ChannelSegment r0 = new kotlinx.coroutines.channels.ChannelSegment
            r4 = 0
            r5 = 0
            r1 = -1
            r3 = 0
            r0.<init>(r1, r3, r4, r5)
            kotlinx.coroutines.channels.BufferedChannelKt.NULL_SEGMENT = r0
            r5 = 12
            r6 = 0
            java.lang.String r1 = "kotlinx.coroutines.bufferedChannel.segmentSize"
            r2 = 32
            r3 = 0
            r4 = 0
            int r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp$default(r1, r2, r3, r4, r5, r6)
            kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE = r0
            java.lang.String r1 = "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations"
            r2 = 10000(0x2710, float:1.4013E-41)
            int r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp$default(r1, r2, r3, r4, r5, r6)
            kotlinx.coroutines.channels.BufferedChannelKt.EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "BUFFERED"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "SHOULD_BUFFER"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.IN_BUFFER = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "S_RESUMING_BY_RCV"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_RCV = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "RESUMING_BY_EB"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_EB = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "POISONED"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.POISONED = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "DONE_RCV"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.DONE_RCV = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "INTERRUPTED_SEND"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_SEND = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "INTERRUPTED_RCV"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_RCV = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "CHANNEL_CLOSED"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.CHANNEL_CLOSED = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "SUSPEND"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "SUSPEND_NO_WAITER"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND_NO_WAITER = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "FAILED"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.FAILED = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "NO_RECEIVE_RESULT"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.NO_RECEIVE_RESULT = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "CLOSE_HANDLER_CLOSED"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.CLOSE_HANDLER_CLOSED = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "CLOSE_HANDLER_INVOKED"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.CLOSE_HANDLER_INVOKED = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "NO_CLOSE_CAUSE"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.NO_CLOSE_CAUSE = r0
            return
    }

    public static final /* synthetic */ long access$constructEBCompletedAndPauseFlag(long r2, boolean r4) {
            long r0 = constructEBCompletedAndPauseFlag(r2, r4)
            return r0
    }

    public static final /* synthetic */ long access$constructSendersAndCloseStatus(long r2, int r4) {
            long r0 = constructSendersAndCloseStatus(r2, r4)
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.channels.ChannelSegment access$createSegment(long r1, kotlinx.coroutines.channels.ChannelSegment r3) {
            kotlinx.coroutines.channels.ChannelSegment r0 = createSegment(r1, r3)
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getCLOSE_HANDLER_CLOSED$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.CLOSE_HANDLER_CLOSED
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getCLOSE_HANDLER_INVOKED$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.CLOSE_HANDLER_INVOKED
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getDONE_RCV$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.DONE_RCV
            return r0
    }

    public static final /* synthetic */ int access$getEXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS$p() {
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getFAILED$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getINTERRUPTED_RCV$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_RCV
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getINTERRUPTED_SEND$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_SEND
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getIN_BUFFER$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.IN_BUFFER
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getNO_CLOSE_CAUSE$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.NO_CLOSE_CAUSE
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getNO_RECEIVE_RESULT$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.NO_RECEIVE_RESULT
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.channels.ChannelSegment access$getNULL_SEGMENT$p() {
            kotlinx.coroutines.channels.ChannelSegment<java.lang.Object> r0 = kotlinx.coroutines.channels.BufferedChannelKt.NULL_SEGMENT
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getPOISONED$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.POISONED
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getRESUMING_BY_EB$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_EB
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getRESUMING_BY_RCV$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_RCV
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getSUSPEND$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getSUSPEND_NO_WAITER$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND_NO_WAITER
            return r0
    }

    public static final /* synthetic */ long access$initialBufferEnd(int r2) {
            long r0 = initialBufferEnd(r2)
            return r0
    }

    public static final /* synthetic */ boolean access$tryResume0(kotlinx.coroutines.CancellableContinuation r1, java.lang.Object r2, kotlin.jvm.functions.Function1 r3) {
            boolean r0 = tryResume0(r1, r2, r3)
            return r0
    }

    private static final long constructEBCompletedAndPauseFlag(long r2, boolean r4) {
            if (r4 == 0) goto L5
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            goto L7
        L5:
            r0 = 0
        L7:
            long r0 = r0 + r2
            return r0
    }

    private static final long constructSendersAndCloseStatus(long r3, int r5) {
            long r0 = (long) r5
            r2 = 60
            long r0 = r0 << r2
            long r0 = r0 + r3
            return r0
    }

    private static final <E> kotlinx.coroutines.channels.ChannelSegment<E> createSegment(long r6, kotlinx.coroutines.channels.ChannelSegment<E> r8) {
            kotlinx.coroutines.channels.ChannelSegment r0 = new kotlinx.coroutines.channels.ChannelSegment
            kotlinx.coroutines.channels.BufferedChannel r4 = r8.getChannel()
            r5 = 0
            r1 = r6
            r3 = r8
            r0.<init>(r1, r3, r4, r5)
            return r0
    }

    public static final <E> kotlin.reflect.KFunction<kotlinx.coroutines.channels.ChannelSegment<E>> createSegmentFunction() {
            kotlinx.coroutines.channels.BufferedChannelKt$createSegmentFunction$1 r0 = kotlinx.coroutines.channels.BufferedChannelKt.AnonymousClass1.INSTANCE
            kotlin.reflect.KFunction r0 = (kotlin.reflect.KFunction) r0
            return r0
    }

    public static final kotlinx.coroutines.internal.Symbol getCHANNEL_CLOSED() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.CHANNEL_CLOSED
            return r0
    }

    private static final long getEbCompletedCounter(long r3) {
            r0 = 0
            r1 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r1 = r1 & r3
            return r1
    }

    private static final boolean getEbPauseExpandBuffers(long r5) {
            r0 = 0
            r1 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r1 = r1 & r5
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    private static final int getSendersCloseStatus(long r3) {
            r0 = 0
            r1 = 60
            long r1 = r3 >> r1
            int r1 = (int) r1
            return r1
    }

    private static final long getSendersCounter(long r3) {
            r0 = 0
            r1 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r1 = r1 & r3
            return r1
    }

    private static final long initialBufferEnd(int r2) {
            switch(r2) {
                case 0: goto Lb;
                case 2147483647: goto L5;
                default: goto L3;
            }
        L3:
            long r0 = (long) r2
            goto Ld
        L5:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto Ld
        Lb:
            r0 = 0
        Ld:
            return r0
    }

    private static final <T> boolean tryResume0(kotlinx.coroutines.CancellableContinuation<? super T> r3, T r4, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r5) {
            r0 = 0
            java.lang.Object r0 = r3.tryResume(r4, r0, r5)
            r1 = 0
            if (r0 == 0) goto Ld
            r3.completeResume(r0)
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            return r2
    }

    static /* synthetic */ boolean tryResume0$default(kotlinx.coroutines.CancellableContinuation r0, java.lang.Object r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = tryResume0(r0, r1, r2)
            return r0
    }
}
