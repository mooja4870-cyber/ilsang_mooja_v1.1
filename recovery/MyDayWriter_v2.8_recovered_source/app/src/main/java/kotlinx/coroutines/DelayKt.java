package kotlinx.coroutines;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000e\u0010\u0005\u001a\u00020\u0006H\u0086@¢\u0006\u0002\u0010\u0007\u001a\u0016\u0010\u0000\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u000b\u001a\u001b\u0010\u0000\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000b\u001a\u0016\u0010\u000f\u001a\u00020\n*\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"delay", "Lkotlinx/coroutines/Delay;", "Lkotlin/coroutines/CoroutineContext;", "getDelay", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/Delay;", "awaitCancellation", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "timeMillis", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "duration", "Lkotlin/time/Duration;", "delay-VtjQ1oo", "toDelayMillis", "toDelayMillis-LRDsOJo", "(J)J", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DelayKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.DelayKt$awaitCancellation$1, reason: invalid class name */
    /* JADX INFO: compiled from: Delay.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", i = {}, l = {160}, m = "awaitCancellation", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.DelayKt.AnonymousClass1> r1) {
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
                r0 = r2
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)
                return r0
        }
    }

    public static final java.lang.Object awaitCancellation(kotlin.coroutines.Continuation<?> r8) {
            boolean r0 = r8 instanceof kotlinx.coroutines.DelayKt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r8
            kotlinx.coroutines.DelayKt$awaitCancellation$1 r0 = (kotlinx.coroutines.DelayKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            kotlinx.coroutines.DelayKt$awaitCancellation$1 r0 = new kotlinx.coroutines.DelayKt$awaitCancellation$1
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L31;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2c:
            r1 = 0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L62
        L31:
            kotlin.ResultKt.throwOnFailure(r8)
            r2 = 0
            r3 = 1
            r0.label = r3
            r4 = r0
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r5 = 0
            kotlinx.coroutines.CancellableContinuationImpl r6 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r4)
            r6.<init>(r7, r3)
            r6.initCancellability()
            r3 = r6
            kotlinx.coroutines.CancellableContinuation r3 = (kotlinx.coroutines.CancellableContinuation) r3
            r3 = 0
            java.lang.Object r3 = r6.getResult()
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r4) goto L5e
            r4 = r0
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r4)
        L5e:
            if (r3 != r1) goto L61
            return r1
        L61:
            r1 = r2
        L62:
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    public static final java.lang.Object delay(long r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 > 0) goto L9
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L9:
            r0 = 0
            r1 = r10
            r2 = 0
            kotlinx.coroutines.CancellableContinuationImpl r3 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r1)
            r5 = 1
            r3.<init>(r4, r5)
            r3.initCancellability()
            r4 = r3
            kotlinx.coroutines.CancellableContinuation r4 = (kotlinx.coroutines.CancellableContinuation) r4
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 >= 0) goto L31
            kotlin.coroutines.CoroutineContext r6 = r4.getContext()
            kotlinx.coroutines.Delay r6 = getDelay(r6)
            r6.mo1713scheduleResumeAfterDelay(r8, r4)
        L31:
            java.lang.Object r1 = r3.getResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L40
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r10)
        L40:
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L47
            return r1
        L47:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    /* JADX INFO: renamed from: delay-VtjQ1oo, reason: not valid java name */
    public static final java.lang.Object m1644delayVtjQ1oo(long r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            long r0 = m1645toDelayMillisLRDsOJo(r2)
            java.lang.Object r0 = delay(r0, r4)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto Lf
            return r0
        Lf:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    public static final kotlinx.coroutines.Delay getDelay(kotlin.coroutines.CoroutineContext r2) {
            kotlin.coroutines.ContinuationInterceptor$Key r0 = kotlin.coroutines.ContinuationInterceptor.Key
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            kotlin.coroutines.CoroutineContext$Element r0 = r2.get(r0)
            boolean r1 = r0 instanceof kotlinx.coroutines.Delay
            if (r1 == 0) goto Lf
            kotlinx.coroutines.Delay r0 = (kotlinx.coroutines.Delay) r0
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 != 0) goto L16
            kotlinx.coroutines.Delay r0 = kotlinx.coroutines.DefaultExecutorKt.getDefaultDelay()
        L16:
            return r0
    }

    /* JADX INFO: renamed from: toDelayMillis-LRDsOJo, reason: not valid java name */
    public static final long m1645toDelayMillisLRDsOJo(long r3) {
            boolean r0 = kotlin.time.Duration.m1513isPositiveimpl(r3)
            r1 = 1
            if (r0 != r1) goto L1b
            kotlin.time.Duration$Companion r0 = kotlin.time.Duration.Companion
            r0 = 999999(0xf423f, double:4.94065E-318)
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.NANOSECONDS
            long r0 = kotlin.time.DurationKt.toDuration(r0, r2)
            long r0 = kotlin.time.Duration.m1515plusLRDsOJo(r3, r0)
            long r0 = kotlin.time.Duration.m1497getInWholeMillisecondsimpl(r0)
            goto L1f
        L1b:
            if (r0 != 0) goto L20
            r0 = 0
        L1f:
            return r0
        L20:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
    }
}
