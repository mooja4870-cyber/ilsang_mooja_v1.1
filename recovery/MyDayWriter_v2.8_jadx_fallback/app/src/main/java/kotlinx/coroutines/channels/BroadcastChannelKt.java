package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: BroadcastChannel.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"NO_ELEMENT", "Lkotlinx/coroutines/internal/Symbol;", "BroadcastChannel", "Lkotlinx/coroutines/channels/BroadcastChannel;", "E", "capacity", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BroadcastChannelKt {
    private static final kotlinx.coroutines.internal.Symbol NO_ELEMENT = null;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "NO_ELEMENT"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BroadcastChannelKt.NO_ELEMENT = r0
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and StateFlow, and is no longer supported")
    public static final <E> kotlinx.coroutines.channels.BroadcastChannel<E> BroadcastChannel(int r2) {
            switch(r2) {
                case -2: goto L23;
                case -1: goto L1b;
                case 0: goto L13;
                case 2147483647: goto Lb;
                default: goto L3;
            }
        L3:
            kotlinx.coroutines.channels.BroadcastChannelImpl r0 = new kotlinx.coroutines.channels.BroadcastChannelImpl
            r0.<init>(r2)
            kotlinx.coroutines.channels.BroadcastChannel r0 = (kotlinx.coroutines.channels.BroadcastChannel) r0
            goto L30
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported UNLIMITED capacity for BroadcastChannel"
            r0.<init>(r1)
            throw r0
        L13:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported 0 capacity for BroadcastChannel"
            r0.<init>(r1)
            throw r0
        L1b:
            kotlinx.coroutines.channels.ConflatedBroadcastChannel r0 = new kotlinx.coroutines.channels.ConflatedBroadcastChannel
            r0.<init>()
            kotlinx.coroutines.channels.BroadcastChannel r0 = (kotlinx.coroutines.channels.BroadcastChannel) r0
            goto L30
        L23:
            kotlinx.coroutines.channels.BroadcastChannelImpl r0 = new kotlinx.coroutines.channels.BroadcastChannelImpl
            kotlinx.coroutines.channels.Channel$Factory r1 = kotlinx.coroutines.channels.Channel.Factory
            int r1 = r1.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core()
            r0.<init>(r1)
            kotlinx.coroutines.channels.BroadcastChannel r0 = (kotlinx.coroutines.channels.BroadcastChannel) r0
        L30:
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getNO_ELEMENT$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BroadcastChannelKt.NO_ELEMENT
            return r0
    }
}
