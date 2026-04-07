package kotlinx.coroutines;

/* JADX INFO: compiled from: Deferred.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u000e\u0010\u0007\u001a\u00028\u0000H¦@¢\u0006\u0002\u0010\bJ\r\u0010\t\u001a\u00028\u0000H'¢\u0006\u0002\u0010\nJ\n\u0010\u000b\u001a\u0004\u0018\u00010\fH'R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/Deferred;", "T", "Lkotlinx/coroutines/Job;", "onAwait", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnAwait", "()Lkotlinx/coroutines/selects/SelectClause1;", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCompleted", "()Ljava/lang/Object;", "getCompletionExceptionOrNull", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Deferred<T> extends kotlinx.coroutines.Job {

    /* JADX INFO: compiled from: Deferred.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public static /* synthetic */ void cancel(kotlinx.coroutines.Deferred r1) {
                r0 = r1
                kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
                kotlinx.coroutines.Job.DefaultImpls.cancel(r0)
                return
        }

        public static <T, R> R fold(kotlinx.coroutines.Deferred<? extends T> r1, R r2, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> r3) {
                r0 = r1
                kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
                java.lang.Object r0 = kotlinx.coroutines.Job.DefaultImpls.fold(r0, r2, r3)
                return r0
        }

        public static <T, E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlinx.coroutines.Deferred<? extends T> r1, kotlin.coroutines.CoroutineContext.Key<E> r2) {
                r0 = r1
                kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
                kotlin.coroutines.CoroutineContext$Element r0 = kotlinx.coroutines.Job.DefaultImpls.get(r0, r2)
                return r0
        }

        public static <T> kotlin.coroutines.CoroutineContext minusKey(kotlinx.coroutines.Deferred<? extends T> r1, kotlin.coroutines.CoroutineContext.Key<?> r2) {
                r0 = r1
                kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
                kotlin.coroutines.CoroutineContext r0 = kotlinx.coroutines.Job.DefaultImpls.minusKey(r0, r2)
                return r0
        }

        public static <T> kotlin.coroutines.CoroutineContext plus(kotlinx.coroutines.Deferred<? extends T> r1, kotlin.coroutines.CoroutineContext r2) {
                r0 = r1
                kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
                kotlin.coroutines.CoroutineContext r0 = kotlinx.coroutines.Job.DefaultImpls.plus(r0, r2)
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static <T> kotlinx.coroutines.Job plus(kotlinx.coroutines.Deferred<? extends T> r1, kotlinx.coroutines.Job r2) {
                r0 = r1
                kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
                kotlinx.coroutines.Job r0 = kotlinx.coroutines.Job.DefaultImpls.plus(r0, r2)
                return r0
        }
    }

    java.lang.Object await(kotlin.coroutines.Continuation<? super T> r1);

    T getCompleted();

    java.lang.Throwable getCompletionExceptionOrNull();

    kotlinx.coroutines.selects.SelectClause1<T> getOnAwait();
}
