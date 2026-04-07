package kotlinx.coroutines;

/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\f\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H'¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/ParentJob;", "Lkotlinx/coroutines/Job;", "getChildJobCancellationCause", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ParentJob extends kotlinx.coroutines.Job {

    /* JADX INFO: compiled from: Job.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public static /* synthetic */ void cancel(kotlinx.coroutines.ParentJob r1) {
                r0 = r1
                kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
                kotlinx.coroutines.Job.DefaultImpls.cancel(r0)
                return
        }

        public static <R> R fold(kotlinx.coroutines.ParentJob r1, R r2, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> r3) {
                r0 = r1
                kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
                java.lang.Object r0 = kotlinx.coroutines.Job.DefaultImpls.fold(r0, r2, r3)
                return r0
        }

        public static <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlinx.coroutines.ParentJob r1, kotlin.coroutines.CoroutineContext.Key<E> r2) {
                r0 = r1
                kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
                kotlin.coroutines.CoroutineContext$Element r0 = kotlinx.coroutines.Job.DefaultImpls.get(r0, r2)
                return r0
        }

        public static kotlin.coroutines.CoroutineContext minusKey(kotlinx.coroutines.ParentJob r1, kotlin.coroutines.CoroutineContext.Key<?> r2) {
                r0 = r1
                kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
                kotlin.coroutines.CoroutineContext r0 = kotlinx.coroutines.Job.DefaultImpls.minusKey(r0, r2)
                return r0
        }

        public static kotlin.coroutines.CoroutineContext plus(kotlinx.coroutines.ParentJob r1, kotlin.coroutines.CoroutineContext r2) {
                r0 = r1
                kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
                kotlin.coroutines.CoroutineContext r0 = kotlinx.coroutines.Job.DefaultImpls.plus(r0, r2)
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static kotlinx.coroutines.Job plus(kotlinx.coroutines.ParentJob r1, kotlinx.coroutines.Job r2) {
                r0 = r1
                kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
                kotlinx.coroutines.Job r0 = kotlinx.coroutines.Job.DefaultImpls.plus(r0, r2)
                return r0
        }
    }

    java.util.concurrent.CancellationException getChildJobCancellationCause();
}
