package kotlinx.coroutines.sync;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* synthetic */ class SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.lang.Long, kotlinx.coroutines.sync.SemaphoreSegment, kotlinx.coroutines.sync.SemaphoreSegment> {
    public static final kotlinx.coroutines.sync.SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 INSTANCE = null;

    static {
            kotlinx.coroutines.sync.SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 r0 = new kotlinx.coroutines.sync.SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1
            r0.<init>()
            kotlinx.coroutines.sync.SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1.INSTANCE = r0
            return
    }

    SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1() {
            r6 = this;
            java.lang.Class<kotlinx.coroutines.sync.SemaphoreKt> r2 = kotlinx.coroutines.sync.SemaphoreKt.class
            java.lang.String r4 = "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;"
            r5 = 1
            r1 = 2
            java.lang.String r3 = "createSegment"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ kotlinx.coroutines.sync.SemaphoreSegment invoke(java.lang.Long r4, kotlinx.coroutines.sync.SemaphoreSegment r5) {
            r3 = this;
            r0 = r4
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r2 = r5
            kotlinx.coroutines.sync.SemaphoreSegment r2 = (kotlinx.coroutines.sync.SemaphoreSegment) r2
            kotlinx.coroutines.sync.SemaphoreSegment r0 = r3.invoke(r0, r2)
            return r0
    }

    public final kotlinx.coroutines.sync.SemaphoreSegment invoke(long r2, kotlinx.coroutines.sync.SemaphoreSegment r4) {
            r1 = this;
            kotlinx.coroutines.sync.SemaphoreSegment r0 = kotlinx.coroutines.sync.SemaphoreKt.access$createSegment(r2, r4)
            return r0
    }
}
