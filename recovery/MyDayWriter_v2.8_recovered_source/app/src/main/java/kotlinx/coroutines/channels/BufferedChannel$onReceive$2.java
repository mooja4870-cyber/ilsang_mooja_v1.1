package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* synthetic */ class BufferedChannel$onReceive$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.channels.BufferedChannel<?>, java.lang.Object, java.lang.Object, java.lang.Object> {
    public static final kotlinx.coroutines.channels.BufferedChannel$onReceive$2 INSTANCE = null;

    static {
            kotlinx.coroutines.channels.BufferedChannel$onReceive$2 r0 = new kotlinx.coroutines.channels.BufferedChannel$onReceive$2
            r0.<init>()
            kotlinx.coroutines.channels.BufferedChannel$onReceive$2.INSTANCE = r0
            return
    }

    BufferedChannel$onReceive$2() {
            r6 = this;
            java.lang.Class<kotlinx.coroutines.channels.BufferedChannel> r2 = kotlinx.coroutines.channels.BufferedChannel.class
            java.lang.String r4 = "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"
            r5 = 0
            r1 = 3
            java.lang.String r3 = "processResultSelectReceive"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.BufferedChannel<?> r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            r0 = r2
            kotlinx.coroutines.channels.BufferedChannel r0 = (kotlinx.coroutines.channels.BufferedChannel) r0
            java.lang.Object r0 = r1.invoke2(r0, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.channels.BufferedChannel<?> r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            java.lang.Object r0 = kotlinx.coroutines.channels.BufferedChannel.access$processResultSelectReceive(r2, r3, r4)
            return r0
    }
}
