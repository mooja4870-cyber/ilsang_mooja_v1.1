package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Actor.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0014J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0014¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/channels/ActorCoroutine;", "E", "Lkotlinx/coroutines/channels/ChannelCoroutine;", "Lkotlinx/coroutines/channels/ActorScope;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "channel", "Lkotlinx/coroutines/channels/Channel;", "active", "", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/Channel;Z)V", "handleJobException", "exception", "", "onCancelling", "", "cause", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
class ActorCoroutine<E> extends kotlinx.coroutines.channels.ChannelCoroutine<E> implements kotlinx.coroutines.channels.ActorScope<E> {
    public ActorCoroutine(kotlin.coroutines.CoroutineContext r2, kotlinx.coroutines.channels.Channel<E> r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r4)
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            kotlin.coroutines.CoroutineContext$Element r0 = r2.get(r0)
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            r1.initParentJob(r0)
            return
    }

    @Override // kotlinx.coroutines.JobSupport
    protected boolean handleJobException(java.lang.Throwable r2) {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.getContext()
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r0, r2)
            r0 = 1
            return r0
    }

    @Override // kotlinx.coroutines.JobSupport
    protected void onCancelling(java.lang.Throwable r6) {
            r5 = this;
            kotlinx.coroutines.channels.Channel r0 = r5.get_channel()
            r1 = 0
            if (r6 == 0) goto L2d
            r2 = r6
            r3 = 0
            boolean r4 = r2 instanceof java.util.concurrent.CancellationException
            if (r4 == 0) goto L10
            r1 = r2
            java.util.concurrent.CancellationException r1 = (java.util.concurrent.CancellationException) r1
        L10:
            if (r1 != 0) goto L2d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r5)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r4 = " was cancelled"
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.util.concurrent.CancellationException r1 = kotlinx.coroutines.ExceptionsKt.CancellationException(r1, r2)
        L2d:
            r0.cancel(r1)
            return
    }
}
