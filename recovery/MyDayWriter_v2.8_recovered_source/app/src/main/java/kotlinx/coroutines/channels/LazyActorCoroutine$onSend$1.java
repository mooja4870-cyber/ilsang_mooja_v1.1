package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Actor.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* synthetic */ class LazyActorCoroutine$onSend$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.channels.LazyActorCoroutine<?>, kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, kotlin.Unit> {
    public static final kotlinx.coroutines.channels.LazyActorCoroutine$onSend$1 INSTANCE = null;

    static {
            kotlinx.coroutines.channels.LazyActorCoroutine$onSend$1 r0 = new kotlinx.coroutines.channels.LazyActorCoroutine$onSend$1
            r0.<init>()
            kotlinx.coroutines.channels.LazyActorCoroutine$onSend$1.INSTANCE = r0
            return
    }

    LazyActorCoroutine$onSend$1() {
            r6 = this;
            java.lang.Class<kotlinx.coroutines.channels.LazyActorCoroutine> r2 = kotlinx.coroutines.channels.LazyActorCoroutine.class
            java.lang.String r4 = "onSendRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V"
            r5 = 0
            r1 = 3
            java.lang.String r3 = "onSendRegFunction"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlinx.coroutines.channels.LazyActorCoroutine<?> r3, kotlinx.coroutines.selects.SelectInstance<?> r4, java.lang.Object r5) {
            r2 = this;
            r0 = r3
            kotlinx.coroutines.channels.LazyActorCoroutine r0 = (kotlinx.coroutines.channels.LazyActorCoroutine) r0
            r1 = r4
            kotlinx.coroutines.selects.SelectInstance r1 = (kotlinx.coroutines.selects.SelectInstance) r1
            r2.invoke2(r0, r1, r5)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(kotlinx.coroutines.channels.LazyActorCoroutine<?> r1, kotlinx.coroutines.selects.SelectInstance<?> r2, java.lang.Object r3) {
            r0 = this;
            kotlinx.coroutines.channels.LazyActorCoroutine.access$onSendRegFunction(r1, r2, r3)
            return
    }
}
