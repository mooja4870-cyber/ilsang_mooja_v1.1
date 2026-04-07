package kotlinx.coroutines.selects;

/* JADX INFO: compiled from: SelectUnbiased.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aB\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u001f\b\u0004\u0010\u0002\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086H\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"selectUnbiased", "R", "builder", "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/SelectBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SelectUnbiasedKt {
    public static final <R> java.lang.Object selectUnbiased(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.SelectBuilder<? super R>, kotlin.Unit> r3, kotlin.coroutines.Continuation<? super R> r4) {
            r0 = 0
            kotlinx.coroutines.selects.UnbiasedSelectImplementation r1 = new kotlinx.coroutines.selects.UnbiasedSelectImplementation
            kotlin.coroutines.CoroutineContext r2 = r4.getContext()
            r1.<init>(r2)
            r2 = 0
            r3.invoke(r1)
            java.lang.Object r1 = r1.doSelect(r4)
            return r1
    }

    private static final <R> java.lang.Object selectUnbiased$$forInline(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.SelectBuilder<? super R>, kotlin.Unit> r0, kotlin.coroutines.Continuation<? super R> r1) {
            kotlinx.coroutines.selects.UnbiasedSelectImplementation r0 = new kotlinx.coroutines.selects.UnbiasedSelectImplementation
            r0 = 0
            r0.getContext()
            throw r0
    }
}
