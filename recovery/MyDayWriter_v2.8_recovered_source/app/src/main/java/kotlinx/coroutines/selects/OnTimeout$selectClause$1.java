package kotlinx.coroutines.selects;

/* JADX INFO: compiled from: OnTimeout.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* synthetic */ class OnTimeout$selectClause$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.OnTimeout, kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, kotlin.Unit> {
    public static final kotlinx.coroutines.selects.OnTimeout$selectClause$1 INSTANCE = null;

    static {
            kotlinx.coroutines.selects.OnTimeout$selectClause$1 r0 = new kotlinx.coroutines.selects.OnTimeout$selectClause$1
            r0.<init>()
            kotlinx.coroutines.selects.OnTimeout$selectClause$1.INSTANCE = r0
            return
    }

    OnTimeout$selectClause$1() {
            r6 = this;
            java.lang.Class<kotlinx.coroutines.selects.OnTimeout> r2 = kotlinx.coroutines.selects.OnTimeout.class
            java.lang.String r4 = "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V"
            r5 = 0
            r1 = 3
            java.lang.String r3 = "register"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlinx.coroutines.selects.OnTimeout r3, kotlinx.coroutines.selects.SelectInstance<?> r4, java.lang.Object r5) {
            r2 = this;
            r0 = r3
            kotlinx.coroutines.selects.OnTimeout r0 = (kotlinx.coroutines.selects.OnTimeout) r0
            r1 = r4
            kotlinx.coroutines.selects.SelectInstance r1 = (kotlinx.coroutines.selects.SelectInstance) r1
            r2.invoke2(r0, r1, r5)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(kotlinx.coroutines.selects.OnTimeout r1, kotlinx.coroutines.selects.SelectInstance<?> r2, java.lang.Object r3) {
            r0 = this;
            kotlinx.coroutines.selects.OnTimeout.access$register(r1, r2, r3)
            return
    }
}
