package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {0, 0, 0, 0}, l = {3087}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", n = {"this", "segment", "index", "r"}, s = {"L$0", "L$1", "I$0", "J$0"})
final class BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int I$0;
    long J$0;
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ kotlinx.coroutines.channels.BufferedChannel<E> this$0;

    BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(kotlinx.coroutines.channels.BufferedChannel<E> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>(r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            r7 = this;
            r7.result = r8
            int r0 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            r7.label = r0
            kotlinx.coroutines.channels.BufferedChannel<E> r1 = r7.this$0
            r4 = 0
            r6 = r7
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            r2 = 0
            r3 = 0
            java.lang.Object r0 = kotlinx.coroutines.channels.BufferedChannel.m1657access$receiveCatchingOnNoWaiterSuspendGKJJFZk(r1, r2, r3, r4, r6)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L1d
            return r0
        L1d:
            kotlinx.coroutines.channels.ChannelResult r0 = kotlinx.coroutines.channels.ChannelResult.m1667boximpl(r0)
            return r0
    }
}
