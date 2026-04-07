package kotlinx.coroutines;

/* JADX INFO: compiled from: CompletableDeferred.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/CompletableDeferred;", "T", "Lkotlinx/coroutines/Deferred;", "complete", "", "value", "(Ljava/lang/Object;)Z", "completeExceptionally", "exception", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface CompletableDeferred<T> extends kotlinx.coroutines.Deferred<T> {

    /* JADX INFO: compiled from: CompletableDeferred.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public static /* synthetic */ void cancel(kotlinx.coroutines.CompletableDeferred r1) {
                r0 = r1
                kotlinx.coroutines.Deferred r0 = (kotlinx.coroutines.Deferred) r0
                kotlinx.coroutines.Deferred.DefaultImpls.cancel(r0)
                return
        }

        public static <T, R> R fold(kotlinx.coroutines.CompletableDeferred<T> r1, R r2, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> r3) {
                r0 = r1
                kotlinx.coroutines.Deferred r0 = (kotlinx.coroutines.Deferred) r0
                java.lang.Object r0 = kotlinx.coroutines.Deferred.DefaultImpls.fold(r0, r2, r3)
                return r0
        }

        public static <T, E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlinx.coroutines.CompletableDeferred<T> r1, kotlin.coroutines.CoroutineContext.Key<E> r2) {
                r0 = r1
                kotlinx.coroutines.Deferred r0 = (kotlinx.coroutines.Deferred) r0
                kotlin.coroutines.CoroutineContext$Element r0 = kotlinx.coroutines.Deferred.DefaultImpls.get(r0, r2)
                return r0
        }

        public static <T> kotlin.coroutines.CoroutineContext minusKey(kotlinx.coroutines.CompletableDeferred<T> r1, kotlin.coroutines.CoroutineContext.Key<?> r2) {
                r0 = r1
                kotlinx.coroutines.Deferred r0 = (kotlinx.coroutines.Deferred) r0
                kotlin.coroutines.CoroutineContext r0 = kotlinx.coroutines.Deferred.DefaultImpls.minusKey(r0, r2)
                return r0
        }

        public static <T> kotlin.coroutines.CoroutineContext plus(kotlinx.coroutines.CompletableDeferred<T> r1, kotlin.coroutines.CoroutineContext r2) {
                r0 = r1
                kotlinx.coroutines.Deferred r0 = (kotlinx.coroutines.Deferred) r0
                kotlin.coroutines.CoroutineContext r0 = kotlinx.coroutines.Deferred.DefaultImpls.plus(r0, r2)
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static <T> kotlinx.coroutines.Job plus(kotlinx.coroutines.CompletableDeferred<T> r1, kotlinx.coroutines.Job r2) {
                r0 = r1
                kotlinx.coroutines.Deferred r0 = (kotlinx.coroutines.Deferred) r0
                kotlinx.coroutines.Job r0 = kotlinx.coroutines.Deferred.DefaultImpls.plus(r0, r2)
                return r0
        }
    }

    boolean complete(T r1);

    boolean completeExceptionally(java.lang.Throwable r1);
}
