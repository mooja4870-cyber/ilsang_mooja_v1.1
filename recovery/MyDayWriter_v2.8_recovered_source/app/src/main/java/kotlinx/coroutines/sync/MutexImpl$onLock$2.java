package kotlinx.coroutines.sync;

/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* synthetic */ class MutexImpl$onLock$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.sync.MutexImpl, java.lang.Object, java.lang.Object, java.lang.Object> {
    public static final kotlinx.coroutines.sync.MutexImpl$onLock$2 INSTANCE = null;

    static {
            kotlinx.coroutines.sync.MutexImpl$onLock$2 r0 = new kotlinx.coroutines.sync.MutexImpl$onLock$2
            r0.<init>()
            kotlinx.coroutines.sync.MutexImpl$onLock$2.INSTANCE = r0
            return
    }

    MutexImpl$onLock$2() {
            r6 = this;
            java.lang.Class<kotlinx.coroutines.sync.MutexImpl> r2 = kotlinx.coroutines.sync.MutexImpl.class
            java.lang.String r4 = "onLockProcessResult(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"
            r5 = 0
            r1 = 3
            java.lang.String r3 = "onLockProcessResult"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.sync.MutexImpl r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            r0 = r2
            kotlinx.coroutines.sync.MutexImpl r0 = (kotlinx.coroutines.sync.MutexImpl) r0
            java.lang.Object r0 = r1.invoke2(r0, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.sync.MutexImpl r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            java.lang.Object r0 = r2.onLockProcessResult(r3, r4)
            return r0
    }
}
