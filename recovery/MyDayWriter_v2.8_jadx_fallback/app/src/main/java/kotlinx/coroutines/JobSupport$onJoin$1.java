package kotlinx.coroutines;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* synthetic */ class JobSupport$onJoin$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.JobSupport, kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, kotlin.Unit> {
    public static final kotlinx.coroutines.JobSupport$onJoin$1 INSTANCE = null;

    static {
            kotlinx.coroutines.JobSupport$onJoin$1 r0 = new kotlinx.coroutines.JobSupport$onJoin$1
            r0.<init>()
            kotlinx.coroutines.JobSupport$onJoin$1.INSTANCE = r0
            return
    }

    JobSupport$onJoin$1() {
            r6 = this;
            java.lang.Class<kotlinx.coroutines.JobSupport> r2 = kotlinx.coroutines.JobSupport.class
            java.lang.String r4 = "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V"
            r5 = 0
            r1 = 3
            java.lang.String r3 = "registerSelectForOnJoin"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlinx.coroutines.JobSupport r3, kotlinx.coroutines.selects.SelectInstance<?> r4, java.lang.Object r5) {
            r2 = this;
            r0 = r3
            kotlinx.coroutines.JobSupport r0 = (kotlinx.coroutines.JobSupport) r0
            r1 = r4
            kotlinx.coroutines.selects.SelectInstance r1 = (kotlinx.coroutines.selects.SelectInstance) r1
            r2.invoke2(r0, r1, r5)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(kotlinx.coroutines.JobSupport r1, kotlinx.coroutines.selects.SelectInstance<?> r2, java.lang.Object r3) {
            r0 = this;
            kotlinx.coroutines.JobSupport.access$registerSelectForOnJoin(r1, r2, r3)
            return
    }
}
