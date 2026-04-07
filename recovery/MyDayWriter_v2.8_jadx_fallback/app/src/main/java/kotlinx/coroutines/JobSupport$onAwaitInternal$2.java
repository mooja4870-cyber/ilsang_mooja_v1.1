package kotlinx.coroutines;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* synthetic */ class JobSupport$onAwaitInternal$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.JobSupport, java.lang.Object, java.lang.Object, java.lang.Object> {
    public static final kotlinx.coroutines.JobSupport$onAwaitInternal$2 INSTANCE = null;

    static {
            kotlinx.coroutines.JobSupport$onAwaitInternal$2 r0 = new kotlinx.coroutines.JobSupport$onAwaitInternal$2
            r0.<init>()
            kotlinx.coroutines.JobSupport$onAwaitInternal$2.INSTANCE = r0
            return
    }

    JobSupport$onAwaitInternal$2() {
            r6 = this;
            java.lang.Class<kotlinx.coroutines.JobSupport> r2 = kotlinx.coroutines.JobSupport.class
            java.lang.String r4 = "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"
            r5 = 0
            r1 = 3
            java.lang.String r3 = "onAwaitInternalProcessResFunc"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.JobSupport r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            r0 = r2
            kotlinx.coroutines.JobSupport r0 = (kotlinx.coroutines.JobSupport) r0
            java.lang.Object r0 = r1.invoke2(r0, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.JobSupport r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            java.lang.Object r0 = kotlinx.coroutines.JobSupport.access$onAwaitInternalProcessResFunc(r2, r3, r4)
            return r0
    }
}
