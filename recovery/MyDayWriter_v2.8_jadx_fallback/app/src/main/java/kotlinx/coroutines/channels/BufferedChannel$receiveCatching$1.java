package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {}, l = {762}, m = "receiveCatching-JP2dKIU$suspendImpl", n = {}, s = {})
final class BufferedChannel$receiveCatching$1<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ kotlinx.coroutines.channels.BufferedChannel<E> this$0;

    BufferedChannel$receiveCatching$1(kotlinx.coroutines.channels.BufferedChannel<E> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>(r2)
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
            kotlinx.coroutines.channels.BufferedChannel<E> r0 = r2.this$0
            r1 = r2
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r0 = kotlinx.coroutines.channels.BufferedChannel.m1658receiveCatchingJP2dKIU$suspendImpl(r0, r1)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L19
            return r0
        L19:
            kotlinx.coroutines.channels.ChannelResult r0 = kotlinx.coroutines.channels.ChannelResult.m1667boximpl(r0)
            return r0
    }
}
