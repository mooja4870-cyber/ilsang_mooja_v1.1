package kotlinx.coroutines.selects;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0002\u001aB\u0010\u0019\u001a\u0002H\u001a\"\u0004\b\u0000\u0010\u001a2\u001f\b\u0004\u0010\u001b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001a0\u001d\u0012\u0004\u0012\u00020\u001e0\u001c¢\u0006\u0002\b\u001fH\u0086H\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010 \u001a7\u0010!\u001a\u00020\"*\b\u0012\u0004\u0012\u00020\u001e0#2#\u0010$\u001a\u001f\u0012\u0013\u0012\u00110%¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001cH\u0002\"]\u0010\u0000\u001aQ\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001j\u0002`\bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u000b\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\"\u000e\u0010\u000e\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000*Â\u0001\b\u0007\u0010'\"[\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030(¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b()\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u001e0\u001c0\u00012[\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030(¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b()\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u001e0\u001c0\u0001B\u0002\b**¦\u0001\b\u0007\u0010+\"M\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012M\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0002\b**¦\u0001\b\u0007\u0010,\"M\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030(¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u001e0\u00012M\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030(¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u001e0\u0001B\u0002\b*¨\u0006-"}, d2 = {"DUMMY_PROCESS_RESULT_FUNCTION", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "clauseObject", "param", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "NO_RESULT", "Lkotlinx/coroutines/internal/Symbol;", "PARAM_CLAUSE_0", "getPARAM_CLAUSE_0", "()Lkotlinx/coroutines/internal/Symbol;", "STATE_CANCELLED", "STATE_COMPLETED", "STATE_REG", "TRY_SELECT_ALREADY_SELECTED", "", "TRY_SELECT_CANCELLED", "TRY_SELECT_REREGISTER", "TRY_SELECT_SUCCESSFUL", "TrySelectDetailedResult", "Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "trySelectInternalResult", "select", "R", "builder", "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/SelectBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryResume", "", "Lkotlinx/coroutines/CancellableContinuation;", "onCancellation", "", "cause", "OnCancellationConstructor", "Lkotlinx/coroutines/selects/SelectInstance;", "internalResult", "Lkotlinx/coroutines/InternalCoroutinesApi;", "ProcessResultFunction", "RegistrationFunction", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SelectKt {
    private static final kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> DUMMY_PROCESS_RESULT_FUNCTION = null;
    private static final kotlinx.coroutines.internal.Symbol NO_RESULT = null;
    private static final kotlinx.coroutines.internal.Symbol PARAM_CLAUSE_0 = null;
    private static final kotlinx.coroutines.internal.Symbol STATE_CANCELLED = null;
    private static final kotlinx.coroutines.internal.Symbol STATE_COMPLETED = null;
    private static final kotlinx.coroutines.internal.Symbol STATE_REG = null;
    private static final int TRY_SELECT_ALREADY_SELECTED = 3;
    private static final int TRY_SELECT_CANCELLED = 2;
    private static final int TRY_SELECT_REREGISTER = 1;
    private static final int TRY_SELECT_SUCCESSFUL = 0;

    static {
            kotlinx.coroutines.selects.SelectKt$DUMMY_PROCESS_RESULT_FUNCTION$1 r0 = kotlinx.coroutines.selects.SelectKt$DUMMY_PROCESS_RESULT_FUNCTION$1.INSTANCE
            kotlin.jvm.functions.Function3 r0 = (kotlin.jvm.functions.Function3) r0
            kotlinx.coroutines.selects.SelectKt.DUMMY_PROCESS_RESULT_FUNCTION = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "STATE_REG"
            r0.<init>(r1)
            kotlinx.coroutines.selects.SelectKt.STATE_REG = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "STATE_COMPLETED"
            r0.<init>(r1)
            kotlinx.coroutines.selects.SelectKt.STATE_COMPLETED = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "STATE_CANCELLED"
            r0.<init>(r1)
            kotlinx.coroutines.selects.SelectKt.STATE_CANCELLED = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "NO_RESULT"
            r0.<init>(r1)
            kotlinx.coroutines.selects.SelectKt.NO_RESULT = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "PARAM_CLAUSE_0"
            r0.<init>(r1)
            kotlinx.coroutines.selects.SelectKt.PARAM_CLAUSE_0 = r0
            return
    }

    public static /* synthetic */ void OnCancellationConstructor$annotations() {
            return
    }

    public static /* synthetic */ void ProcessResultFunction$annotations() {
            return
    }

    public static /* synthetic */ void RegistrationFunction$annotations() {
            return
    }

    private static final kotlinx.coroutines.selects.TrySelectDetailedResult TrySelectDetailedResult(int r3) {
            switch(r3) {
                case 0: goto L29;
                case 1: goto L26;
                case 2: goto L23;
                case 3: goto L20;
                default: goto L3;
            }
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected internal result: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L20:
            kotlinx.coroutines.selects.TrySelectDetailedResult r0 = kotlinx.coroutines.selects.TrySelectDetailedResult.ALREADY_SELECTED
            goto L2b
        L23:
            kotlinx.coroutines.selects.TrySelectDetailedResult r0 = kotlinx.coroutines.selects.TrySelectDetailedResult.CANCELLED
            goto L2b
        L26:
            kotlinx.coroutines.selects.TrySelectDetailedResult r0 = kotlinx.coroutines.selects.TrySelectDetailedResult.REREGISTER
            goto L2b
        L29:
            kotlinx.coroutines.selects.TrySelectDetailedResult r0 = kotlinx.coroutines.selects.TrySelectDetailedResult.SUCCESSFUL
        L2b:
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.selects.TrySelectDetailedResult access$TrySelectDetailedResult(int r1) {
            kotlinx.coroutines.selects.TrySelectDetailedResult r0 = TrySelectDetailedResult(r1)
            return r0
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function3 access$getDUMMY_PROCESS_RESULT_FUNCTION$p() {
            kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> r0 = kotlinx.coroutines.selects.SelectKt.DUMMY_PROCESS_RESULT_FUNCTION
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getNO_RESULT$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.selects.SelectKt.NO_RESULT
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getSTATE_CANCELLED$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.selects.SelectKt.STATE_CANCELLED
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getSTATE_COMPLETED$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.selects.SelectKt.STATE_COMPLETED
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getSTATE_REG$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.selects.SelectKt.STATE_REG
            return r0
    }

    public static final /* synthetic */ boolean access$tryResume(kotlinx.coroutines.CancellableContinuation r1, kotlin.jvm.functions.Function1 r2) {
            boolean r0 = tryResume(r1, r2)
            return r0
    }

    public static final kotlinx.coroutines.internal.Symbol getPARAM_CLAUSE_0() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.selects.SelectKt.PARAM_CLAUSE_0
            return r0
    }

    public static final <R> java.lang.Object select(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.SelectBuilder<? super R>, kotlin.Unit> r3, kotlin.coroutines.Continuation<? super R> r4) {
            r0 = 0
            kotlinx.coroutines.selects.SelectImplementation r1 = new kotlinx.coroutines.selects.SelectImplementation
            kotlin.coroutines.CoroutineContext r2 = r4.getContext()
            r1.<init>(r2)
            r2 = 0
            r3.invoke(r1)
            java.lang.Object r1 = r1.doSelect(r4)
            return r1
    }

    private static final <R> java.lang.Object select$$forInline(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.SelectBuilder<? super R>, kotlin.Unit> r0, kotlin.coroutines.Continuation<? super R> r1) {
            kotlinx.coroutines.selects.SelectImplementation r0 = new kotlinx.coroutines.selects.SelectImplementation
            r0 = 0
            r0.getContext()
            throw r0
    }

    private static final boolean tryResume(kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r2, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3) {
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r1 = 0
            java.lang.Object r0 = r2.tryResume(r0, r1, r3)
            if (r0 != 0) goto Lb
            r0 = 0
            return r0
        Lb:
            r2.completeResume(r0)
            r1 = 1
            return r1
    }
}
