package kotlinx.coroutines;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"kotlinx/coroutines/BuildersKt__BuildersKt", "kotlinx/coroutines/BuildersKt__Builders_commonKt"}, k = 4, mv = {1, 9, 0}, xi = 48)
public final class BuildersKt {
    public static final <T> kotlinx.coroutines.Deferred<T> async(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.CoroutineContext r2, kotlinx.coroutines.CoroutineStart r3, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r4) {
            kotlinx.coroutines.Deferred r0 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async(r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.Deferred async$default(kotlinx.coroutines.CoroutineScope r0, kotlin.coroutines.CoroutineContext r1, kotlinx.coroutines.CoroutineStart r2, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            kotlinx.coroutines.Deferred r0 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static final <T> java.lang.Object invoke(kotlinx.coroutines.CoroutineDispatcher r1, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super T> r3) {
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt__Builders_commonKt.invoke(r1, r2, r3)
            return r0
    }

    public static final kotlinx.coroutines.Job launch(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.CoroutineContext r2, kotlinx.coroutines.CoroutineStart r3, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r4) {
            kotlinx.coroutines.Job r0 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch(r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.Job launch$default(kotlinx.coroutines.CoroutineScope r0, kotlin.coroutines.CoroutineContext r1, kotlinx.coroutines.CoroutineStart r2, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            kotlinx.coroutines.Job r0 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static final <T> T runBlocking(kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r2) throws java.lang.InterruptedException {
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking(r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.Object runBlocking$default(kotlin.coroutines.CoroutineContext r0, kotlin.jvm.functions.Function2 r1, int r2, java.lang.Object r3) throws java.lang.InterruptedException {
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(r0, r1, r2, r3)
            return r0
    }

    public static final <T> java.lang.Object withContext(kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super T> r3) {
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt__Builders_commonKt.withContext(r1, r2, r3)
            return r0
    }
}
