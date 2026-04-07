package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0007\u001a>\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u001aU\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f2#\u0010\r\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u0002H\u000b0\bH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a[\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u000b0\f\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f2#\u0010\u0015\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\t0\bH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u0016\u0010\u0013\u001a[\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\f\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f2#\u0010\u0015\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\t0\bH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u0017\u0010\u0013\u001aY\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u000b0\f\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f2!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t0\bH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u001a\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Channel", "Lkotlinx/coroutines/channels/Channel;", "E", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "onUndeliveredElement", "Lkotlin/Function1;", "", "getOrElse", "T", "Lkotlinx/coroutines/channels/ChannelResult;", "onFailure", "", "Lkotlin/ParameterName;", "name", "exception", "getOrElse-WpGqRn0", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "onClosed", "action", "onClosed-WpGqRn0", "onFailure-WpGqRn0", "onSuccess", "value", "onSuccess-WpGqRn0", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ChannelKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ kotlinx.coroutines.channels.Channel Channel(int r2) {
            r0 = 0
            r1 = 6
            kotlinx.coroutines.channels.Channel r0 = Channel$default(r2, r0, r0, r1, r0)
            return r0
    }

    public static final <E> kotlinx.coroutines.channels.Channel<E> Channel(int r3, kotlinx.coroutines.channels.BufferOverflow r4, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r5) {
            r0 = 0
            r1 = 1
            switch(r3) {
                case -2: goto L4f;
                case -1: goto L30;
                case 0: goto L1a;
                case 2147483647: goto Lf;
                default: goto L5;
            }
        L5:
            kotlinx.coroutines.channels.BufferOverflow r0 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r4 != r0) goto L69
            kotlinx.coroutines.channels.BufferedChannel r0 = new kotlinx.coroutines.channels.BufferedChannel
            r0.<init>(r3, r5)
            goto L70
        Lf:
            kotlinx.coroutines.channels.BufferedChannel r0 = new kotlinx.coroutines.channels.BufferedChannel
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.<init>(r1, r5)
            kotlinx.coroutines.channels.Channel r0 = (kotlinx.coroutines.channels.Channel) r0
            goto L72
        L1a:
            kotlinx.coroutines.channels.BufferOverflow r2 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r4 != r2) goto L24
            kotlinx.coroutines.channels.BufferedChannel r1 = new kotlinx.coroutines.channels.BufferedChannel
            r1.<init>(r0, r5)
            goto L2c
        L24:
            kotlinx.coroutines.channels.ConflatedBufferedChannel r0 = new kotlinx.coroutines.channels.ConflatedBufferedChannel
            r0.<init>(r1, r4, r5)
            r1 = r0
            kotlinx.coroutines.channels.BufferedChannel r1 = (kotlinx.coroutines.channels.BufferedChannel) r1
        L2c:
            r0 = r1
            kotlinx.coroutines.channels.Channel r0 = (kotlinx.coroutines.channels.Channel) r0
            goto L72
        L30:
            kotlinx.coroutines.channels.BufferOverflow r2 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r4 != r2) goto L35
            r0 = r1
        L35:
            if (r0 == 0) goto L41
            kotlinx.coroutines.channels.ConflatedBufferedChannel r0 = new kotlinx.coroutines.channels.ConflatedBufferedChannel
            kotlinx.coroutines.channels.BufferOverflow r2 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
            r0.<init>(r1, r2, r5)
            kotlinx.coroutines.channels.Channel r0 = (kotlinx.coroutines.channels.Channel) r0
            goto L72
        L41:
            r0 = 0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "CONFLATED capacity cannot be used with non-default onBufferOverflow"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L4f:
            kotlinx.coroutines.channels.BufferOverflow r0 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r4 != r0) goto L5f
            kotlinx.coroutines.channels.BufferedChannel r0 = new kotlinx.coroutines.channels.BufferedChannel
            kotlinx.coroutines.channels.Channel$Factory r1 = kotlinx.coroutines.channels.Channel.Factory
            int r1 = r1.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core()
            r0.<init>(r1, r5)
            goto L66
        L5f:
            kotlinx.coroutines.channels.ConflatedBufferedChannel r0 = new kotlinx.coroutines.channels.ConflatedBufferedChannel
            r0.<init>(r1, r4, r5)
            kotlinx.coroutines.channels.BufferedChannel r0 = (kotlinx.coroutines.channels.BufferedChannel) r0
        L66:
            kotlinx.coroutines.channels.Channel r0 = (kotlinx.coroutines.channels.Channel) r0
            goto L72
        L69:
            kotlinx.coroutines.channels.ConflatedBufferedChannel r0 = new kotlinx.coroutines.channels.ConflatedBufferedChannel
            r0.<init>(r3, r4, r5)
            kotlinx.coroutines.channels.BufferedChannel r0 = (kotlinx.coroutines.channels.BufferedChannel) r0
        L70:
            kotlinx.coroutines.channels.Channel r0 = (kotlinx.coroutines.channels.Channel) r0
        L72:
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.Channel Channel$default(int r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            kotlinx.coroutines.channels.Channel r0 = Channel(r0)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.Channel Channel$default(int r0, kotlinx.coroutines.channels.BufferOverflow r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r0 = 0
        L5:
            r4 = r3 & 2
            if (r4 == 0) goto Lb
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
        Lb:
            r3 = r3 & 4
            if (r3 == 0) goto L10
            r2 = 0
        L10:
            kotlinx.coroutines.channels.Channel r0 = Channel(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: getOrElse-WpGqRn0, reason: not valid java name */
    public static final <T> T m1663getOrElseWpGqRn0(java.lang.Object r2, kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends T> r3) {
            r0 = 0
            boolean r1 = r2 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r1 == 0) goto Lf
            java.lang.Throwable r1 = kotlinx.coroutines.channels.ChannelResult.m1671exceptionOrNullimpl(r2)
            java.lang.Object r1 = r3.invoke(r1)
            goto L10
        Lf:
            r1 = r2
        L10:
            return r1
    }

    /* JADX INFO: renamed from: onClosed-WpGqRn0, reason: not valid java name */
    public static final <T> java.lang.Object m1664onClosedWpGqRn0(java.lang.Object r2, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3) {
            r0 = 0
            boolean r1 = r2 instanceof kotlinx.coroutines.channels.ChannelResult.Closed
            if (r1 == 0) goto Ld
            java.lang.Throwable r1 = kotlinx.coroutines.channels.ChannelResult.m1671exceptionOrNullimpl(r2)
            r3.invoke(r1)
        Ld:
            return r2
    }

    /* JADX INFO: renamed from: onFailure-WpGqRn0, reason: not valid java name */
    public static final <T> java.lang.Object m1665onFailureWpGqRn0(java.lang.Object r2, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3) {
            r0 = 0
            boolean r1 = r2 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r1 == 0) goto Ld
            java.lang.Throwable r1 = kotlinx.coroutines.channels.ChannelResult.m1671exceptionOrNullimpl(r2)
            r3.invoke(r1)
        Ld:
            return r2
    }

    /* JADX INFO: renamed from: onSuccess-WpGqRn0, reason: not valid java name */
    public static final <T> java.lang.Object m1666onSuccessWpGqRn0(java.lang.Object r2, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r3) {
            r0 = 0
            boolean r1 = r2 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r1 != 0) goto L9
            r3.invoke(r2)
        L9:
            return r2
    }
}
