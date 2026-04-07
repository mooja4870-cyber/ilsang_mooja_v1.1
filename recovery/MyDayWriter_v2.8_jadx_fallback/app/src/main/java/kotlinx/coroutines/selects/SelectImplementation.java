package kotlinx.coroutines.selects;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004:\u0001HB\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000eH\u0002J\u001a\u0010\u001d\u001a\u00020\u001b2\u0010\u0010\u001e\u001a\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002J\u000e\u0010\u001f\u001a\u00028\u0000H\u0082@¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0016J\u000e\u0010$\u001a\u00028\u0000H\u0091@¢\u0006\u0002\u0010 J\u000e\u0010%\u001a\u00028\u0000H\u0082@¢\u0006\u0002\u0010 J\u001c\u0010&\u001a\u000e\u0018\u00010\nR\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001c\u001a\u00020\u000eH\u0002J\u0012\u0010'\u001a\u00020\u001b2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u001c\u0010*\u001a\u00020\u001b2\n\u0010+\u001a\u0006\u0012\u0002\b\u00030,2\u0006\u0010-\u001a\u00020\u0014H\u0016J*\u0010.\u001a\u00028\u00002\u0010\u0010/\u001a\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0082@¢\u0006\u0002\u00100J\u0010\u00101\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000eH\u0002J\u0012\u00102\u001a\u00020\u001b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u00103\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u000e2\b\u00104\u001a\u0004\u0018\u00010\u000eH\u0016J\u0018\u00105\u001a\u0002062\u0006\u0010\u001c\u001a\u00020\u000e2\b\u00104\u001a\u0004\u0018\u00010\u000eJ\u001a\u00107\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0002J\u000e\u00108\u001a\u00020\u001bH\u0082@¢\u0006\u0002\u0010 J0\u0010'\u001a\u00020\u001b*\u0002092\u001c\u0010:\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000<\u0012\u0006\u0012\u0004\u0018\u00010\u000e0;H\u0096\u0002¢\u0006\u0002\u0010=JB\u0010'\u001a\u00020\u001b\"\u0004\b\u0001\u0010>*\b\u0012\u0004\u0012\u0002H>0?2\"\u0010:\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H>\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000<\u0012\u0006\u0012\u0004\u0018\u00010\u000e0@H\u0096\u0002¢\u0006\u0002\u0010AJV\u0010'\u001a\u00020\u001b\"\u0004\b\u0001\u0010B\"\u0004\b\u0002\u0010>*\u000e\u0012\u0004\u0012\u0002HB\u0012\u0004\u0012\u0002H>0C2\u0006\u0010D\u001a\u0002HB2\"\u0010:\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H>\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000<\u0012\u0006\u0012\u0004\u0018\u00010\u000e0@H\u0096\u0002¢\u0006\u0002\u0010EJ \u0010F\u001a\u00020\u001b*\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010G\u001a\u00020\u0010H\u0001R$\u0010\b\u001a\u0014\u0012\u000e\u0012\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019X\u0082\u0004¨\u0006I"}, d2 = {"Lkotlinx/coroutines/selects/SelectImplementation;", "R", "Lkotlinx/coroutines/CancelHandler;", "Lkotlinx/coroutines/selects/SelectBuilder;", "Lkotlinx/coroutines/selects/SelectInstanceInternal;", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "clauses", "", "Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "disposableHandleOrSegment", "", "inRegistrationPhase", "", "getInRegistrationPhase", "()Z", "indexInSegment", "", "internalResult", "isCancelled", "isSelected", "state", "Lkotlinx/atomicfu/AtomicRef;", "checkClauseObject", "", "clauseObject", "cleanup", "selectedClause", "complete", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disposeOnCompletion", "disposableHandle", "Lkotlinx/coroutines/DisposableHandle;", "doSelect", "doSelectSuspend", "findClause", "invoke", "cause", "", "invokeOnCancellation", "segment", "Lkotlinx/coroutines/internal/Segment;", "index", "processResultAndInvokeBlockRecoveringException", "clause", "(Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reregisterClause", "selectInRegistrationPhase", "trySelect", "result", "trySelectDetailed", "Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "trySelectInternal", "waitUntilSelected", "Lkotlinx/coroutines/selects/SelectClause0;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/selects/SelectClause0;Lkotlin/jvm/functions/Function1;)V", "Q", "Lkotlinx/coroutines/selects/SelectClause1;", "Lkotlin/Function2;", "(Lkotlinx/coroutines/selects/SelectClause1;Lkotlin/jvm/functions/Function2;)V", "P", "Lkotlinx/coroutines/selects/SelectClause2;", "param", "(Lkotlinx/coroutines/selects/SelectClause2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "register", "reregister", "ClauseData", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class SelectImplementation<R> implements kotlinx.coroutines.CancelHandler, kotlinx.coroutines.selects.SelectBuilder<R>, kotlinx.coroutines.selects.SelectInstanceInternal<R> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater state$volatile$FU = null;
    private java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData> clauses;
    private final kotlin.coroutines.CoroutineContext context;
    private java.lang.Object disposableHandleOrSegment;
    private int indexInSegment;
    private java.lang.Object internalResult;
    private volatile /* synthetic */ java.lang.Object state$volatile;

    /* JADX INFO: compiled from: Select.kt */
    @kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B¶\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012U\u0010\u0003\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0002\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004j\u0002`\u000b\u0012U\u0010\f\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0002\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u000e\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012g\u0010\u0010\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012\u0018\u00010\u0004j\u0004\u0018\u0001`\u0014¢\u0006\u0002\u0010\u0015J*\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0018\u00010\u00122\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u001a\u001a\u00020\nJ\u0018\u0010\u001b\u001a\u00028\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0086@¢\u0006\u0002\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001J\u0014\u0010 \u001a\u00020!2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\"R\u000e\u0010\u000f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000Rq\u0010\u0010\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012\u0018\u00010\u0004j\u0004\u0018\u0001`\u00148\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R]\u0010\f\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0002\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R]\u0010\u0003\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0002\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004j\u0002`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;", "", "clauseObject", "regFunc", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "param", "", "Lkotlinx/coroutines/selects/RegistrationFunction;", "processResFunc", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "block", "onCancellationConstructor", "internalResult", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "(Lkotlinx/coroutines/selects/SelectImplementation;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "disposableHandleOrSegment", "indexInSegment", "", "createOnCancellationAction", "dispose", "invokeBlock", "argument", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processResult", "result", "tryRegisterAsWaiter", "", "Lkotlinx/coroutines/selects/SelectImplementation;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class ClauseData {
        private final java.lang.Object block;
        public final java.lang.Object clauseObject;
        public java.lang.Object disposableHandleOrSegment;
        public int indexInSegment;
        public final kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>> onCancellationConstructor;
        private final java.lang.Object param;
        private final kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> processResFunc;
        private final kotlin.jvm.functions.Function3<java.lang.Object, kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, kotlin.Unit> regFunc;
        final /* synthetic */ kotlinx.coroutines.selects.SelectImplementation<R> this$0;

        public ClauseData(kotlinx.coroutines.selects.SelectImplementation r2, java.lang.Object r3, kotlin.jvm.functions.Function3<java.lang.Object, ? super kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, kotlin.Unit> r4, kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, java.lang.Object, ? extends java.lang.Object> r5, java.lang.Object r6, java.lang.Object r7, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, ? extends kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>> r8) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                r1.clauseObject = r3
                r1.regFunc = r4
                r1.processResFunc = r5
                r1.param = r6
                r1.block = r7
                r1.onCancellationConstructor = r8
                r0 = -1
                r1.indexInSegment = r0
                return
        }

        public final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> createOnCancellationAction(kotlinx.coroutines.selects.SelectInstance<?> r3, java.lang.Object r4) {
                r2 = this;
                kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>> r0 = r2.onCancellationConstructor
                if (r0 == 0) goto Ld
                java.lang.Object r1 = r2.param
                java.lang.Object r0 = r0.invoke(r3, r1, r4)
                kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
                goto Le
            Ld:
                r0 = 0
            Le:
                return r0
        }

        public final void dispose() {
                r6 = this;
                java.lang.Object r0 = r6.disposableHandleOrSegment
                kotlinx.coroutines.selects.SelectImplementation<R> r1 = r6.this$0
                r2 = 0
                boolean r3 = r0 instanceof kotlinx.coroutines.internal.Segment
                r4 = 0
                if (r3 == 0) goto L17
                r3 = r0
                kotlinx.coroutines.internal.Segment r3 = (kotlinx.coroutines.internal.Segment) r3
                int r5 = r6.indexInSegment
                kotlin.coroutines.CoroutineContext r1 = r1.getContext()
                r3.onCancellation(r5, r4, r1)
                goto L23
            L17:
                boolean r1 = r0 instanceof kotlinx.coroutines.DisposableHandle
                if (r1 == 0) goto L1e
                r4 = r0
                kotlinx.coroutines.DisposableHandle r4 = (kotlinx.coroutines.DisposableHandle) r4
            L1e:
                if (r4 == 0) goto L23
                r4.dispose()
            L23:
                return
        }

        public final java.lang.Object invokeBlock(java.lang.Object r4, kotlin.coroutines.Continuation<? super R> r5) {
                r3 = this;
                java.lang.Object r0 = r3.block
                java.lang.Object r1 = r3.param
                kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.selects.SelectKt.getPARAM_CLAUSE_0()
                if (r1 != r2) goto L1a
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
                r1 = r0
                kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
                r1 = r0
                kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
                java.lang.Object r1 = r1.invoke(r5)
            L19:
                return r1
            L1a:
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
                r1 = r0
                kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
                r1 = r0
                kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
                java.lang.Object r1 = r1.invoke(r4, r5)
                goto L19
        }

        public final java.lang.Object processResult(java.lang.Object r4) {
                r3 = this;
                kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> r0 = r3.processResFunc
                java.lang.Object r1 = r3.clauseObject
                java.lang.Object r2 = r3.param
                java.lang.Object r0 = r0.invoke(r1, r2, r4)
                return r0
        }

        public final boolean tryRegisterAsWaiter(kotlinx.coroutines.selects.SelectImplementation<R> r6) {
                r5 = this;
                boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L22
                r0 = 0
                boolean r3 = kotlinx.coroutines.selects.SelectImplementation.access$getInRegistrationPhase(r6)
                if (r3 != 0) goto L18
                boolean r3 = kotlinx.coroutines.selects.SelectImplementation.access$isCancelled(r6)
                if (r3 == 0) goto L16
                goto L18
            L16:
                r0 = r1
                goto L19
            L18:
                r0 = r2
            L19:
                if (r0 == 0) goto L1c
                goto L22
            L1c:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
            L22:
                boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
                if (r0 == 0) goto L3f
                r0 = 0
                java.lang.Object r3 = kotlinx.coroutines.selects.SelectImplementation.access$getInternalResult$p(r6)
                kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.selects.SelectKt.access$getNO_RESULT$p()
                if (r3 != r4) goto L35
                r0 = r2
                goto L36
            L35:
                r0 = r1
            L36:
                if (r0 == 0) goto L39
                goto L3f
            L39:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
            L3f:
                kotlin.jvm.functions.Function3<java.lang.Object, kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, kotlin.Unit> r0 = r5.regFunc
                java.lang.Object r3 = r5.clauseObject
                java.lang.Object r4 = r5.param
                r0.invoke(r3, r6, r4)
                java.lang.Object r0 = kotlinx.coroutines.selects.SelectImplementation.access$getInternalResult$p(r6)
                kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.selects.SelectKt.access$getNO_RESULT$p()
                if (r0 != r3) goto L53
                r1 = r2
            L53:
                return r1
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1, reason: invalid class name */
    /* JADX INFO: compiled from: Select.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {0}, l = {438, 441}, m = "doSelectSuspend", n = {"this"}, s = {"L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ kotlinx.coroutines.selects.SelectImplementation<R> this$0;

        AnonymousClass1(kotlinx.coroutines.selects.SelectImplementation<R> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.selects.SelectImplementation.AnonymousClass1> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                kotlinx.coroutines.selects.SelectImplementation<R> r0 = r2.this$0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.selects.SelectImplementation.access$doSelectSuspend(r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Select.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {}, l = {712}, m = "processResultAndInvokeBlockRecoveringException", n = {}, s = {})
    static final class C01321 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ kotlinx.coroutines.selects.SelectImplementation<R> this$0;

        C01321(kotlinx.coroutines.selects.SelectImplementation<R> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.selects.SelectImplementation.C01321> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                r3 = this;
                r3.result = r4
                int r0 = r3.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r3.label = r0
                kotlinx.coroutines.selects.SelectImplementation<R> r0 = r3.this$0
                r1 = 0
                r2 = r3
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r0 = kotlinx.coroutines.selects.SelectImplementation.access$processResultAndInvokeBlockRecoveringException(r0, r1, r1, r2)
                return r0
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "state$volatile"
            java.lang.Class<kotlinx.coroutines.selects.SelectImplementation> r2 = kotlinx.coroutines.selects.SelectImplementation.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.selects.SelectImplementation.state$volatile$FU = r0
            return
    }

    public SelectImplementation(kotlin.coroutines.CoroutineContext r3) {
            r2 = this;
            r2.<init>()
            r2.context = r3
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.selects.SelectKt.access$getSTATE_REG$p()
            r2.state$volatile = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            java.util.List r0 = (java.util.List) r0
            r2.clauses = r0
            r0 = -1
            r2.indexInSegment = r0
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.selects.SelectKt.access$getNO_RESULT$p()
            r2.internalResult = r0
            return
    }

    public static final /* synthetic */ java.lang.Object access$complete(kotlinx.coroutines.selects.SelectImplementation r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r1.complete(r2)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$doSelectSuspend(kotlinx.coroutines.selects.SelectImplementation r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r1.doSelectSuspend(r2)
            return r0
    }

    public static final /* synthetic */ boolean access$getInRegistrationPhase(kotlinx.coroutines.selects.SelectImplementation r1) {
            boolean r0 = r1.getInRegistrationPhase()
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$getInternalResult$p(kotlinx.coroutines.selects.SelectImplementation r1) {
            java.lang.Object r0 = r1.internalResult
            return r0
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater access$getState$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getState$volatile$FU()
            return r0
    }

    public static final /* synthetic */ boolean access$isCancelled(kotlinx.coroutines.selects.SelectImplementation r1) {
            boolean r0 = r1.isCancelled()
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$processResultAndInvokeBlockRecoveringException(kotlinx.coroutines.selects.SelectImplementation r1, kotlinx.coroutines.selects.SelectImplementation.ClauseData r2, java.lang.Object r3, kotlin.coroutines.Continuation r4) {
            java.lang.Object r0 = r1.processResultAndInvokeBlockRecoveringException(r2, r3, r4)
            return r0
    }

    public static final /* synthetic */ void access$reregisterClause(kotlinx.coroutines.selects.SelectImplementation r0, java.lang.Object r1) {
            r0.reregisterClause(r1)
            return
    }

    public static final /* synthetic */ java.lang.Object access$waitUntilSelected(kotlinx.coroutines.selects.SelectImplementation r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r1.waitUntilSelected(r2)
            return r0
    }

    private final void checkClauseObject(java.lang.Object r11) {
            r10 = this;
            java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>$ClauseData> r0 = r10.clauses
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r2 = 0
            boolean r3 = r1 instanceof java.util.Collection
            r4 = 1
            if (r3 == 0) goto L18
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L18
            goto L37
        L18:
            java.util.Iterator r3 = r1.iterator()
        L1c:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L36
            java.lang.Object r5 = r3.next()
            r6 = r5
            kotlinx.coroutines.selects.SelectImplementation$ClauseData r6 = (kotlinx.coroutines.selects.SelectImplementation.ClauseData) r6
            r7 = 0
            java.lang.Object r8 = r6.clauseObject
            r9 = 0
            if (r8 != r11) goto L31
            r6 = r4
            goto L32
        L31:
            r6 = r9
        L32:
            if (r6 == 0) goto L1c
            r4 = r9
            goto L37
        L36:
        L37:
            if (r4 == 0) goto L3a
            return
        L3a:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot use select clauses on the same object: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r11)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    private final void cleanup(kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData r8) {
            r7 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L1c
            r0 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = getState$volatile$FU()
            java.lang.Object r1 = r1.get(r7)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r8)
            if (r0 == 0) goto L16
            goto L1c
        L16:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L1c:
            java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>$ClauseData> r0 = r7.clauses
            if (r0 != 0) goto L21
            return
        L21:
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r2 = 0
            java.util.Iterator r3 = r1.iterator()
        L29:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3f
            java.lang.Object r4 = r3.next()
            r5 = r4
            kotlinx.coroutines.selects.SelectImplementation$ClauseData r5 = (kotlinx.coroutines.selects.SelectImplementation.ClauseData) r5
            r6 = 0
            if (r5 == r8) goto L3c
            r5.dispose()
        L3c:
            goto L29
        L3f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = getState$volatile$FU()
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.selects.SelectKt.access$getSTATE_COMPLETED$p()
            r1.set(r7, r2)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.selects.SelectKt.access$getNO_RESULT$p()
            r7.internalResult = r1
            r1 = 0
            r7.clauses = r1
            return
    }

    private final java.lang.Object complete(kotlin.coroutines.Continuation<? super R> r5) {
            r4 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L14
            r0 = 0
            boolean r0 = r4.isSelected()
            if (r0 == 0) goto Le
            goto L14
        Le:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L14:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getState$volatile$FU()
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            kotlinx.coroutines.selects.SelectImplementation$ClauseData r0 = (kotlinx.coroutines.selects.SelectImplementation.ClauseData) r0
            java.lang.Object r1 = r4.internalResult
            r4.cleanup(r0)
            boolean r2 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r2 != 0) goto L37
            java.lang.Object r2 = r0.processResult(r1)
            java.lang.Object r3 = r0.invokeBlock(r2, r5)
            return r3
        L37:
            java.lang.Object r2 = r4.processResultAndInvokeBlockRecoveringException(r0, r1, r5)
            return r2
    }

    static /* synthetic */ <R> java.lang.Object doSelect$suspendImpl(kotlinx.coroutines.selects.SelectImplementation<R> r1, kotlin.coroutines.Continuation<? super R> r2) {
            boolean r0 = r1.isSelected()
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r1.complete(r2)
            return r0
        Lb:
            java.lang.Object r0 = r1.doSelectSuspend(r2)
            return r0
    }

    private final java.lang.Object doSelectSuspend(kotlin.coroutines.Continuation<? super R> r5) {
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.selects.SelectImplementation.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r5
            kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 r0 = (kotlinx.coroutines.selects.SelectImplementation.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.label
            int r5 = r5 - r2
            r0.label = r5
            goto L19
        L14:
            kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 r0 = new kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1
            r0.<init>(r4, r5)
        L19:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L39;
                case 1: goto L31;
                case 2: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2c:
            kotlin.ResultKt.throwOnFailure(r5)
            r2 = r5
            goto L56
        L31:
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.selects.SelectImplementation r2 = (kotlinx.coroutines.selects.SelectImplementation) r2
            kotlin.ResultKt.throwOnFailure(r5)
            goto L49
        L39:
            kotlin.ResultKt.throwOnFailure(r5)
            r2 = r4
            r0.L$0 = r2
            r3 = 1
            r0.label = r3
            java.lang.Object r3 = r2.waitUntilSelected(r0)
            if (r3 != r1) goto L49
            return r1
        L49:
            r3 = 0
            r0.L$0 = r3
            r3 = 2
            r0.label = r3
            java.lang.Object r2 = r2.complete(r0)
            if (r2 != r1) goto L56
            return r1
        L56:
            return r2
    }

    private final kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData findClause(java.lang.Object r8) {
            r7 = this;
            java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>$ClauseData> r0 = r7.clauses
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r2 = r0
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        Ld:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L25
            java.lang.Object r3 = r2.next()
            r4 = r3
            kotlinx.coroutines.selects.SelectImplementation$ClauseData r4 = (kotlinx.coroutines.selects.SelectImplementation.ClauseData) r4
            r5 = 0
            java.lang.Object r6 = r4.clauseObject
            if (r6 != r8) goto L21
            r6 = 1
            goto L22
        L21:
            r6 = 0
        L22:
            if (r6 == 0) goto Ld
            r1 = r3
        L25:
            kotlinx.coroutines.selects.SelectImplementation$ClauseData r1 = (kotlinx.coroutines.selects.SelectImplementation.ClauseData) r1
            if (r1 == 0) goto L2a
            return r1
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Clause with object "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r8)
            java.lang.String r3 = " is not found"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    private final boolean getInRegistrationPhase() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getState$volatile$FU()
            java.lang.Object r0 = r0.get(r3)
            r1 = 0
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.selects.SelectKt.access$getSTATE_REG$p()
            if (r0 == r2) goto L16
            boolean r2 = r0 instanceof java.util.List
            if (r2 == 0) goto L14
            goto L16
        L14:
            r2 = 0
            goto L17
        L16:
            r2 = 1
        L17:
            return r2
    }

    private final /* synthetic */ java.lang.Object getState$volatile() {
            r1 = this;
            java.lang.Object r0 = r1.state$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getState$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.selects.SelectImplementation.state$volatile$FU
            return r0
    }

    private final boolean isCancelled() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getState$volatile$FU()
            java.lang.Object r0 = r0.get(r2)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.selects.SelectKt.access$getSTATE_CANCELLED$p()
            if (r0 != r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    private final boolean isSelected() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getState$volatile$FU()
            java.lang.Object r0 = r0.get(r1)
            boolean r0 = r0 instanceof kotlinx.coroutines.selects.SelectImplementation.ClauseData
            return r0
    }

    private final /* synthetic */ void loop$atomicfu(java.lang.Object r2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> r4) {
            r1 = this;
        L0:
            java.lang.Object r0 = r3.get(r2)
            r4.invoke(r0)
            goto L0
    }

    private final java.lang.Object processResultAndInvokeBlockRecoveringException(kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData r5, java.lang.Object r6, kotlin.coroutines.Continuation<? super R> r7) {
            r4 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.selects.SelectImplementation.C01321
            if (r0 == 0) goto L14
            r0 = r7
            kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1 r0 = (kotlinx.coroutines.selects.SelectImplementation.C01321) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1 r0 = new kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1
            r0.<init>(r4, r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L33;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2c:
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L31
            r6 = r7
            goto L45
        L31:
            r5 = move-exception
            goto L47
        L33:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r2 = r5.processResult(r6)     // Catch: java.lang.Throwable -> L31
            r6 = 1
            r0.label = r6     // Catch: java.lang.Throwable -> L31
            java.lang.Object r6 = r5.invokeBlock(r2, r0)     // Catch: java.lang.Throwable -> L31
            if (r6 != r1) goto L45
            return r1
        L45:
            return r6
        L47:
            r6 = 0
            boolean r1 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r1 == 0) goto L5d
            r1 = r0
            r2 = 0
            boolean r3 = r1 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r3 != 0) goto L55
            throw r5
        L55:
            r3 = r1
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r3 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r3
            java.lang.Throwable r3 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r5, r3)
            throw r3
        L5d:
            throw r5
    }

    public static /* synthetic */ void register$default(kotlinx.coroutines.selects.SelectImplementation r0, kotlinx.coroutines.selects.SelectImplementation.ClauseData r1, boolean r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lb
            r3 = r3 & 1
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            r0.register(r1, r2)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: register"
            r0.<init>(r1)
            throw r0
    }

    private final void reregisterClause(java.lang.Object r3) {
            r2 = this;
            kotlinx.coroutines.selects.SelectImplementation$ClauseData r0 = r2.findClause(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1 = 0
            r0.disposableHandleOrSegment = r1
            r1 = -1
            r0.indexInSegment = r1
            r1 = 1
            r2.register(r0, r1)
            return
    }

    private final /* synthetic */ void setState$volatile(java.lang.Object r1) {
            r0 = this;
            r0.state$volatile = r1
            return
    }

    private final int trySelectInternal(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
        L1:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getState$volatile$FU()
            java.lang.Object r0 = r0.get(r6)
            boolean r1 = r0 instanceof kotlinx.coroutines.CancellableContinuation
            r2 = 2
            if (r1 == 0) goto L3a
            kotlinx.coroutines.selects.SelectImplementation$ClauseData r1 = r6.findClause(r7)
            if (r1 != 0) goto L15
            goto L1
        L15:
            r3 = r6
            kotlinx.coroutines.selects.SelectInstance r3 = (kotlinx.coroutines.selects.SelectInstance) r3
            kotlin.jvm.functions.Function1 r3 = r1.createOnCancellationAction(r3, r8)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = getState$volatile$FU()
            boolean r4 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r6, r0, r1)
            if (r4 == 0) goto L1
            r4 = r0
            kotlinx.coroutines.CancellableContinuation r4 = (kotlinx.coroutines.CancellableContinuation) r4
            r6.internalResult = r8
            boolean r5 = kotlinx.coroutines.selects.SelectKt.access$tryResume(r4, r3)
            if (r5 == 0) goto L33
            r2 = 0
            return r2
        L33:
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.selects.SelectKt.access$getNO_RESULT$p()
            r6.internalResult = r5
            return r2
        L3a:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.selects.SelectKt.access$getSTATE_COMPLETED$p()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r3 = 1
            if (r1 == 0) goto L47
            r1 = r3
            goto L49
        L47:
            boolean r1 = r0 instanceof kotlinx.coroutines.selects.SelectImplementation.ClauseData
        L49:
            if (r1 == 0) goto L4d
            r1 = 3
            return r1
        L4d:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.selects.SelectKt.access$getSTATE_CANCELLED$p()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r1 == 0) goto L58
            return r2
        L58:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.selects.SelectKt.access$getSTATE_REG$p()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r1 == 0) goto L71
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = getState$volatile$FU()
            java.util.List r2 = kotlin.collections.CollectionsKt.listOf(r7)
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r6, r0, r2)
            if (r1 == 0) goto L1
            return r3
        L71:
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L87
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = getState$volatile$FU()
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.List r2 = kotlin.collections.CollectionsKt.plus(r2, r7)
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r6, r0, r2)
            if (r1 == 0) goto L1
            return r3
        L87:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected state: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    private final /* synthetic */ void update$atomicfu(java.lang.Object r3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4, kotlin.jvm.functions.Function1<java.lang.Object, ? extends java.lang.Object> r5) {
            r2 = this;
        L0:
            java.lang.Object r0 = r4.get(r3)
            java.lang.Object r1 = r5.invoke(r0)
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r3, r0, r1)
            if (r0 == 0) goto L0
            return
    }

    private final java.lang.Object waitUntilSelected(kotlin.coroutines.Continuation<? super kotlin.Unit> r18) {
            r17 = this;
            r0 = r17
            r1 = 0
            r2 = r18
            r3 = 0
            kotlinx.coroutines.CancellableContinuationImpl r4 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r2)
            r6 = 1
            r4.<init>(r5, r6)
            r4.initCancellability()
            r5 = r4
            kotlinx.coroutines.CancellableContinuation r5 = (kotlinx.coroutines.CancellableContinuation) r5
            r6 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = access$getState$volatile$FU()
            r8 = r17
        L1d:
            java.lang.Object r9 = r7.get(r0)
            r10 = 0
            kotlinx.coroutines.internal.Symbol r11 = kotlinx.coroutines.selects.SelectKt.access$getSTATE_REG$p()
            if (r9 != r11) goto L3a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = access$getState$volatile$FU()
            boolean r11 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r11, r0, r9, r5)
            if (r11 == 0) goto L6a
            r11 = r0
            kotlinx.coroutines.CancelHandler r11 = (kotlinx.coroutines.CancelHandler) r11
            kotlinx.coroutines.CancellableContinuationKt.invokeOnCancellation(r5, r11)
            goto L84
        L3a:
            boolean r11 = r9 instanceof java.util.List
            if (r11 == 0) goto L6c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = access$getState$volatile$FU()
            kotlinx.coroutines.internal.Symbol r12 = kotlinx.coroutines.selects.SelectKt.access$getSTATE_REG$p()
            boolean r11 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r11, r0, r9, r12)
            if (r11 == 0) goto L6a
            r11 = r9
            java.util.List r11 = (java.util.List) r11
            r11 = r9
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            r12 = 0
            java.util.Iterator r13 = r11.iterator()
        L57:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L69
            java.lang.Object r14 = r13.next()
            r15 = r14
            r16 = 0
            access$reregisterClause(r0, r15)
            goto L57
        L69:
        L6a:
            goto L1d
        L6c:
            boolean r11 = r9 instanceof kotlinx.coroutines.selects.SelectImplementation.ClauseData
            if (r11 == 0) goto L9d
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            r12 = r9
            kotlinx.coroutines.selects.SelectImplementation$ClauseData r12 = (kotlinx.coroutines.selects.SelectImplementation.ClauseData) r12
            r13 = r0
            kotlinx.coroutines.selects.SelectInstance r13 = (kotlinx.coroutines.selects.SelectInstance) r13
            java.lang.Object r14 = access$getInternalResult$p(r0)
            kotlin.jvm.functions.Function1 r12 = r12.createOnCancellationAction(r13, r14)
            r5.resume(r11, r12)
        L84:
            java.lang.Object r2 = r4.getResult()
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto L92
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r18)
        L92:
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto L99
            return r2
        L99:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L9d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "unexpected state: "
            java.lang.StringBuilder r12 = r12.append(r13)
            java.lang.StringBuilder r12 = r12.append(r9)
            java.lang.String r12 = r12.toString()
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void disposeOnCompletion(kotlinx.coroutines.DisposableHandle r1) {
            r0 = this;
            r0.disposableHandleOrSegment = r1
            return
    }

    public java.lang.Object doSelect(kotlin.coroutines.Continuation<? super R> r2) {
            r1 = this;
            java.lang.Object r0 = doSelect$suspendImpl(r1, r2)
            return r0
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.context
            return r0
    }

    @Override // kotlinx.coroutines.CancelHandler
    public void invoke(java.lang.Throwable r8) {
            r7 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getState$volatile$FU()
            r1 = r7
        L5:
            java.lang.Object r2 = r0.get(r7)
            r3 = r2
            r4 = 0
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.selects.SelectKt.access$getSTATE_COMPLETED$p()
            if (r3 != r5) goto L12
            return
        L12:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.selects.SelectKt.access$getSTATE_CANCELLED$p()
            boolean r2 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r7, r2, r3)
            if (r2 == 0) goto L5
            java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>$ClauseData> r0 = r7.clauses
            if (r0 != 0) goto L21
            return
        L21:
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r2 = 0
            java.util.Iterator r3 = r1.iterator()
        L29:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3c
            java.lang.Object r4 = r3.next()
            r5 = r4
            kotlinx.coroutines.selects.SelectImplementation$ClauseData r5 = (kotlinx.coroutines.selects.SelectImplementation.ClauseData) r5
            r6 = 0
            r5.dispose()
            goto L29
        L3c:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.selects.SelectKt.access$getNO_RESULT$p()
            r7.internalResult = r1
            r1 = 0
            r7.clauses = r1
            return
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public void invoke(kotlinx.coroutines.selects.SelectClause0 r9, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r10) {
            r8 = this;
            kotlinx.coroutines.selects.SelectImplementation$ClauseData r0 = new kotlinx.coroutines.selects.SelectImplementation$ClauseData
            java.lang.Object r2 = r9.getClauseObject()
            kotlin.jvm.functions.Function3 r3 = r9.getRegFunc()
            kotlin.jvm.functions.Function3 r4 = r9.getProcessResFunc()
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.selects.SelectKt.getPARAM_CLAUSE_0()
            kotlin.jvm.functions.Function3 r7 = r9.getOnCancellationConstructor()
            r1 = r8
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10 = 1
            r2 = 0
            r3 = 0
            register$default(r8, r0, r3, r10, r2)
            return
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <Q> void invoke(kotlinx.coroutines.selects.SelectClause1<? extends Q> r9, kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r10) {
            r8 = this;
            kotlinx.coroutines.selects.SelectImplementation$ClauseData r0 = new kotlinx.coroutines.selects.SelectImplementation$ClauseData
            java.lang.Object r2 = r9.getClauseObject()
            kotlin.jvm.functions.Function3 r3 = r9.getRegFunc()
            kotlin.jvm.functions.Function3 r4 = r9.getProcessResFunc()
            r5 = 0
            kotlin.jvm.functions.Function3 r7 = r9.getOnCancellationConstructor()
            r1 = r8
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10 = 1
            r2 = 0
            r3 = 0
            register$default(r8, r0, r3, r10, r2)
            return
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(kotlinx.coroutines.selects.SelectClause2<? super P, ? extends Q> r9, P r10, kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r11) {
            r8 = this;
            kotlinx.coroutines.selects.SelectImplementation$ClauseData r0 = new kotlinx.coroutines.selects.SelectImplementation$ClauseData
            java.lang.Object r2 = r9.getClauseObject()
            kotlin.jvm.functions.Function3 r3 = r9.getRegFunc()
            kotlin.jvm.functions.Function3 r4 = r9.getProcessResFunc()
            kotlin.jvm.functions.Function3 r7 = r9.getOnCancellationConstructor()
            r1 = r8
            r5 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10 = 1
            r11 = 0
            r2 = 0
            register$default(r8, r0, r2, r10, r11)
            return
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(kotlinx.coroutines.selects.SelectClause2<? super P, ? extends Q> r1, kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2) {
            r0 = this;
            kotlinx.coroutines.selects.SelectBuilder.DefaultImpls.invoke(r0, r1, r2)
            return
    }

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> r1, int r2) {
            r0 = this;
            r0.disposableHandleOrSegment = r1
            r0.indexInSegment = r2
            return
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Replaced with the same extension function", replaceWith = @kotlin.ReplaceWith(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
    public void onTimeout(long r1, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3) {
            r0 = this;
            kotlinx.coroutines.selects.SelectBuilder.DefaultImpls.onTimeout(r0, r1, r3)
            return
    }

    public final void register(kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData r4, boolean r5) {
            r3 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L21
            r0 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = getState$volatile$FU()
            java.lang.Object r1 = r1.get(r3)
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.selects.SelectKt.access$getSTATE_CANCELLED$p()
            if (r1 == r2) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
            if (r1 == 0) goto L1b
            goto L21
        L1b:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L21:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getState$volatile$FU()
            java.lang.Object r0 = r0.get(r3)
            r1 = 0
            boolean r0 = r0 instanceof kotlinx.coroutines.selects.SelectImplementation.ClauseData
            if (r0 == 0) goto L2f
            return
        L2f:
            if (r5 != 0) goto L36
            java.lang.Object r0 = r4.clauseObject
            r3.checkClauseObject(r0)
        L36:
            boolean r0 = r4.tryRegisterAsWaiter(r3)
            if (r0 == 0) goto L57
            if (r5 != 0) goto L48
            java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>$ClauseData> r0 = r3.clauses
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            r0.add(r4)
        L48:
            java.lang.Object r0 = r3.disposableHandleOrSegment
            r4.disposableHandleOrSegment = r0
            int r0 = r3.indexInSegment
            r4.indexInSegment = r0
            r0 = 0
            r3.disposableHandleOrSegment = r0
            r0 = -1
            r3.indexInSegment = r0
            goto L5e
        L57:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getState$volatile$FU()
            r0.set(r3, r4)
        L5e:
            return
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void selectInRegistrationPhase(java.lang.Object r1) {
            r0 = this;
            r0.internalResult = r1
            return
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public boolean trySelect(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.trySelectInternal(r2, r3)
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final kotlinx.coroutines.selects.TrySelectDetailedResult trySelectDetailed(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.trySelectInternal(r2, r3)
            kotlinx.coroutines.selects.TrySelectDetailedResult r0 = kotlinx.coroutines.selects.SelectKt.access$TrySelectDetailedResult(r0)
            return r0
    }
}
