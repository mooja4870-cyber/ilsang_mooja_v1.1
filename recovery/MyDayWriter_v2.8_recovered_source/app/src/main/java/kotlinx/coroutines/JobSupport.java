package kotlinx.coroutines;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@kotlin.Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\nµ\u0001¶\u0001·\u0001¸\u0001¹\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010A\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0002J\u001e\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u00112\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00110KH\u0002J\u0012\u0010L\u001a\u00020H2\b\u00108\u001a\u0004\u0018\u00010\u000bH\u0014J\u000e\u0010M\u001a\u00020\t2\u0006\u0010N\u001a\u00020\u0002J\u0010\u0010O\u001a\u0004\u0018\u00010\u000bH\u0084@¢\u0006\u0002\u0010PJ\u0010\u0010Q\u001a\u0004\u0018\u00010\u000bH\u0082@¢\u0006\u0002\u0010PJ\u0012\u0010R\u001a\u00020\u00052\b\u0010S\u001a\u0004\u0018\u00010\u0011H\u0017J\u0018\u0010R\u001a\u00020H2\u000e\u0010S\u001a\n\u0018\u00010Tj\u0004\u0018\u0001`UH\u0016J\u0010\u0010V\u001a\u00020\u00052\b\u0010S\u001a\u0004\u0018\u00010\u0011J\u0017\u0010W\u001a\u00020\u00052\b\u0010S\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0002\bXJ\u0010\u0010Y\u001a\u00020H2\u0006\u0010S\u001a\u00020\u0011H\u0016J\u0014\u0010Z\u001a\u0004\u0018\u00010\u000b2\b\u0010S\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010[\u001a\u00020\u00052\u0006\u0010S\u001a\u00020\u0011H\u0002J\b\u0010\\\u001a\u00020]H\u0014J\u0010\u0010^\u001a\u00020\u00052\u0006\u0010S\u001a\u00020\u0011H\u0016J\u001a\u0010_\u001a\u00020H2\u0006\u00108\u001a\u00020?2\b\u0010`\u001a\u0004\u0018\u00010\u000bH\u0002J\"\u0010a\u001a\u00020H2\u0006\u00108\u001a\u00020b2\u0006\u0010c\u001a\u00020d2\b\u0010e\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010f\u001a\u00020\u00112\b\u0010S\u001a\u0004\u0018\u00010\u000bH\u0002J&\u0010g\u001a\u00020h2\n\b\u0002\u0010i\u001a\u0004\u0018\u00010]2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u0011H\u0080\b¢\u0006\u0002\bjJ\u001c\u0010k\u001a\u0004\u0018\u00010\u000b2\u0006\u00108\u001a\u00020b2\b\u0010e\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010l\u001a\u0004\u0018\u00010d2\u0006\u00108\u001a\u00020?H\u0002J\n\u0010m\u001a\u00060Tj\u0002`UJ\f\u0010n\u001a\u00060Tj\u0002`UH\u0016J\u000f\u0010o\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0002\bpJ\b\u0010q\u001a\u0004\u0018\u00010\u0011J \u0010r\u001a\u0004\u0018\u00010\u00112\u0006\u00108\u001a\u00020b2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00110KH\u0002J\u0012\u0010s\u001a\u0004\u0018\u00010D2\u0006\u00108\u001a\u00020?H\u0002J\u0010\u0010t\u001a\u00020\u00052\u0006\u0010u\u001a\u00020\u0011H\u0014J\u0015\u0010v\u001a\u00020H2\u0006\u0010u\u001a\u00020\u0011H\u0010¢\u0006\u0002\bwJ\u0012\u0010x\u001a\u00020H2\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u0004JA\u0010y\u001a\u00020z2\u0006\u0010{\u001a\u00020\u00052\u0006\u0010|\u001a\u00020\u00052)\u0010}\u001a%\u0012\u0016\u0012\u0014\u0018\u00010\u0011¢\u0006\r\b\u007f\u0012\t\b\u0080\u0001\u0012\u0004\b\b(S\u0012\u0004\u0012\u00020H0~j\u0003`\u0081\u0001J1\u0010y\u001a\u00020z2)\u0010}\u001a%\u0012\u0016\u0012\u0014\u0018\u00010\u0011¢\u0006\r\b\u007f\u0012\t\b\u0080\u0001\u0012\u0004\b\b(S\u0012\u0004\u0012\u00020H0~j\u0003`\u0081\u0001J(\u0010\u0082\u0001\u001a\u00020z2\u0006\u0010{\u001a\u00020\u00052\u0006\u0010|\u001a\u00020\u00052\u0007\u0010}\u001a\u00030\u0083\u0001H\u0000¢\u0006\u0003\b\u0084\u0001J\u000f\u0010\u0085\u0001\u001a\u00020HH\u0086@¢\u0006\u0002\u0010PJ\t\u0010\u0086\u0001\u001a\u00020\u0005H\u0002J\u000f\u0010\u0087\u0001\u001a\u00020HH\u0082@¢\u0006\u0002\u0010PJ\"\u0010\u0088\u0001\u001a\u00030\u0089\u00012\u0015\u0010\u008a\u0001\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020H0~H\u0082\bJ\u0015\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u000b2\b\u0010S\u001a\u0004\u0018\u00010\u000bH\u0002J\u0019\u0010\u008c\u0001\u001a\u00020\u00052\b\u0010e\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0003\b\u008d\u0001J\u001b\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u000b2\b\u0010e\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0003\b\u008f\u0001J\u001a\u0010\u0090\u0001\u001a\u00020F2\u0007\u0010}\u001a\u00030\u0083\u00012\u0006\u0010{\u001a\u00020\u0005H\u0002J\u000f\u0010\u0091\u0001\u001a\u00020]H\u0010¢\u0006\u0003\b\u0092\u0001J\u0019\u0010\u0093\u0001\u001a\u00020H2\u0006\u0010C\u001a\u00020D2\u0006\u0010S\u001a\u00020\u0011H\u0002J)\u0010\u0094\u0001\u001a\u00020H\"\u000b\b\u0000\u0010\u0095\u0001\u0018\u0001*\u00020F2\u0006\u0010C\u001a\u00020D2\b\u0010S\u001a\u0004\u0018\u00010\u0011H\u0082\bJ!\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u000b2\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u000b2\t\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u000bH\u0002J\"\u0010\u0099\u0001\u001a\u00020H2\f\u0010\u009a\u0001\u001a\u0007\u0012\u0002\b\u00030\u009b\u00012\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010{\u001a\u00020H2\b\u0010S\u001a\u0004\u0018\u00010\u0011H\u0014J\u0013\u0010\u009c\u0001\u001a\u00020H2\b\u00108\u001a\u0004\u0018\u00010\u000bH\u0014J\t\u0010\u009d\u0001\u001a\u00020HH\u0014J\u0010\u0010\u009e\u0001\u001a\u00020H2\u0007\u0010\u009f\u0001\u001a\u00020\u0003J\u0012\u0010 \u0001\u001a\u00020H2\u0007\u00108\u001a\u00030¡\u0001H\u0002J\u0011\u0010¢\u0001\u001a\u00020H2\u0006\u00108\u001a\u00020FH\u0002J\"\u0010£\u0001\u001a\u00020H2\f\u0010\u009a\u0001\u001a\u0007\u0012\u0002\b\u00030\u009b\u00012\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u000bH\u0002J\u0017\u0010¤\u0001\u001a\u00020H2\u0006\u0010E\u001a\u00020FH\u0000¢\u0006\u0003\b¥\u0001J\u0007\u0010¦\u0001\u001a\u00020\u0005J\u0014\u0010§\u0001\u001a\u00030¨\u00012\b\u00108\u001a\u0004\u0018\u00010\u000bH\u0002J\u0013\u0010©\u0001\u001a\u00020]2\b\u00108\u001a\u0004\u0018\u00010\u000bH\u0002J\t\u0010ª\u0001\u001a\u00020]H\u0007J\t\u0010«\u0001\u001a\u00020]H\u0016J\u001b\u0010¬\u0001\u001a\u00020\u00052\u0006\u00108\u001a\u00020?2\b\u0010`\u001a\u0004\u0018\u00010\u000bH\u0002J\u0019\u0010\u00ad\u0001\u001a\u00020\u00052\u0006\u00108\u001a\u00020?2\u0006\u0010I\u001a\u00020\u0011H\u0002J\u001f\u0010®\u0001\u001a\u0004\u0018\u00010\u000b2\b\u00108\u001a\u0004\u0018\u00010\u000b2\b\u0010e\u001a\u0004\u0018\u00010\u000bH\u0002J\u001d\u0010¯\u0001\u001a\u0004\u0018\u00010\u000b2\u0006\u00108\u001a\u00020?2\b\u0010e\u001a\u0004\u0018\u00010\u000bH\u0002J$\u0010°\u0001\u001a\u00020\u00052\u0006\u00108\u001a\u00020b2\u0006\u0010N\u001a\u00020d2\b\u0010e\u001a\u0004\u0018\u00010\u000bH\u0082\u0010J\u0010\u0010±\u0001\u001a\u0004\u0018\u00010d*\u00030²\u0001H\u0002J\u0017\u0010³\u0001\u001a\u00020H*\u00020D2\b\u0010S\u001a\u0004\u0018\u00010\u0011H\u0002J\u001d\u0010´\u0001\u001a\u00060Tj\u0002`U*\u00020\u00112\n\b\u0002\u0010i\u001a\u0004\u0018\u00010]H\u0004R\u0011\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004R\u0011\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bX\u0082\u0004R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00058DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u001c\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0016R\u0015\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u001e\u0010\"\u001a\u0006\u0012\u0002\b\u00030#8DX\u0084\u0004¢\u0006\f\u0012\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0016R\u0017\u0010*\u001a\u00020+8F¢\u0006\f\u0012\u0004\b,\u0010%\u001a\u0004\b-\u0010.R\u0016\u0010/\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R(\u00103\u001a\u0004\u0018\u00010\t2\b\u00102\u001a\u0004\u0018\u00010\t8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0016\u00108\u001a\u0004\u0018\u00010\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001c\u0010;\u001a\u0004\u0018\u00010\u0011*\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0018\u0010>\u001a\u00020\u0005*\u00020?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010@¨\u0006º\u0001"}, d2 = {"Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/ChildJob;", "Lkotlinx/coroutines/ParentJob;", "active", "", "(Z)V", "_parentHandle", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/ChildHandle;", "_state", "", "children", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "completionCause", "", "getCompletionCause", "()Ljava/lang/Throwable;", "completionCauseHandled", "getCompletionCauseHandled", "()Z", "handlesException", "getHandlesException$kotlinx_coroutines_core", "isActive", "isCancelled", "isCompleted", "isCompletedExceptionally", "isScopedCoroutine", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "onAwaitInternal", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnAwaitInternal$annotations", "()V", "getOnAwaitInternal", "()Lkotlinx/coroutines/selects/SelectClause1;", "onCancelComplete", "getOnCancelComplete$kotlinx_coroutines_core", "onJoin", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin$annotations", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "parent", "getParent", "()Lkotlinx/coroutines/Job;", "value", "parentHandle", "getParentHandle$kotlinx_coroutines_core", "()Lkotlinx/coroutines/ChildHandle;", "setParentHandle$kotlinx_coroutines_core", "(Lkotlinx/coroutines/ChildHandle;)V", "state", "getState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "exceptionOrNull", "getExceptionOrNull", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "isCancelling", "Lkotlinx/coroutines/Incomplete;", "(Lkotlinx/coroutines/Incomplete;)Z", "addLastAtomic", "expect", "list", "Lkotlinx/coroutines/NodeList;", "node", "Lkotlinx/coroutines/JobNode;", "addSuppressedExceptions", "", "rootCause", "exceptions", "", "afterCompletion", "attachChild", "child", "awaitInternal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitSuspend", "cancel", "cause", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancelCoroutine", "cancelImpl", "cancelImpl$kotlinx_coroutines_core", "cancelInternal", "cancelMakeCompleting", "cancelParent", "cancellationExceptionMessage", "", "childCancelled", "completeStateFinalization", "update", "continueCompleting", "Lkotlinx/coroutines/JobSupport$Finishing;", "lastChild", "Lkotlinx/coroutines/ChildHandleNode;", "proposedUpdate", "createCauseException", "defaultCancellationException", "Lkotlinx/coroutines/JobCancellationException;", "message", "defaultCancellationException$kotlinx_coroutines_core", "finalizeFinishingState", "firstChild", "getCancellationException", "getChildJobCancellationCause", "getCompletedInternal", "getCompletedInternal$kotlinx_coroutines_core", "getCompletionExceptionOrNull", "getFinalRootCause", "getOrPromoteCancellingList", "handleJobException", "exception", "handleOnCompletionException", "handleOnCompletionException$kotlinx_coroutines_core", "initParentJob", "invokeOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "onCancelling", "invokeImmediately", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "invokeOnCompletionInternal", "Lkotlinx/coroutines/InternalCompletionHandler;", "invokeOnCompletionInternal$kotlinx_coroutines_core", "join", "joinInternal", "joinSuspend", "loopOnState", "", "block", "makeCancelling", "makeCompleting", "makeCompleting$kotlinx_coroutines_core", "makeCompletingOnce", "makeCompletingOnce$kotlinx_coroutines_core", "makeNode", "nameString", "nameString$kotlinx_coroutines_core", "notifyCancelling", "notifyHandlers", "T", "onAwaitInternalProcessResFunc", "ignoredParam", "result", "onAwaitInternalRegFunc", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "onCompletionInternal", "onStart", "parentCancelled", "parentJob", "promoteEmptyToNodeList", "Lkotlinx/coroutines/Empty;", "promoteSingleToNodeList", "registerSelectForOnJoin", "removeNode", "removeNode$kotlinx_coroutines_core", "start", "startInternal", "", "stateString", "toDebugString", "toString", "tryFinalizeSimpleState", "tryMakeCancelling", "tryMakeCompleting", "tryMakeCompletingSlowPath", "tryWaitForChild", "nextChild", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "notifyCompletion", "toCancellationException", "AwaitContinuation", "ChildCompletion", "Finishing", "SelectOnAwaitCompletionHandler", "SelectOnJoinCompletionHandler", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class JobSupport implements kotlinx.coroutines.Job, kotlinx.coroutines.ChildJob, kotlinx.coroutines.ParentJob {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _parentHandle$volatile$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$volatile$FU = null;
    private volatile /* synthetic */ java.lang.Object _parentHandle$volatile;
    private volatile /* synthetic */ java.lang.Object _state$volatile;

    /* JADX INFO: compiled from: JobSupport.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/JobSupport$AwaitContinuation;", "T", "Lkotlinx/coroutines/CancellableContinuationImpl;", "delegate", "Lkotlin/coroutines/Continuation;", "job", "Lkotlinx/coroutines/JobSupport;", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/JobSupport;)V", "getContinuationCancellationCause", "", "parent", "Lkotlinx/coroutines/Job;", "nameString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class AwaitContinuation<T> extends kotlinx.coroutines.CancellableContinuationImpl<T> {
        private final kotlinx.coroutines.JobSupport job;

        public AwaitContinuation(kotlin.coroutines.Continuation<? super T> r2, kotlinx.coroutines.JobSupport r3) {
                r1 = this;
                r0 = 1
                r1.<init>(r2, r0)
                r1.job = r3
                return
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        public java.lang.Throwable getContinuationCancellationCause(kotlinx.coroutines.Job r4) {
                r3 = this;
                kotlinx.coroutines.JobSupport r0 = r3.job
                java.lang.Object r0 = r0.getState$kotlinx_coroutines_core()
                boolean r1 = r0 instanceof kotlinx.coroutines.JobSupport.Finishing
                if (r1 == 0) goto L15
                r1 = r0
                kotlinx.coroutines.JobSupport$Finishing r1 = (kotlinx.coroutines.JobSupport.Finishing) r1
                java.lang.Throwable r1 = r1.getRootCause()
                if (r1 == 0) goto L15
                r2 = 0
                return r1
            L15:
                boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
                if (r1 == 0) goto L1f
                r1 = r0
                kotlinx.coroutines.CompletedExceptionally r1 = (kotlinx.coroutines.CompletedExceptionally) r1
                java.lang.Throwable r1 = r1.cause
                return r1
            L1f:
                java.util.concurrent.CancellationException r1 = r4.getCancellationException()
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                return r1
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        protected java.lang.String nameString() {
                r1 = this;
                java.lang.String r0 = "AwaitContinuation"
                return r0
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/JobSupport$ChildCompletion;", "Lkotlinx/coroutines/JobNode;", "parent", "Lkotlinx/coroutines/JobSupport;", "state", "Lkotlinx/coroutines/JobSupport$Finishing;", "child", "Lkotlinx/coroutines/ChildHandleNode;", "proposedUpdate", "", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class ChildCompletion extends kotlinx.coroutines.JobNode {
        private final kotlinx.coroutines.ChildHandleNode child;
        private final kotlinx.coroutines.JobSupport parent;
        private final java.lang.Object proposedUpdate;
        private final kotlinx.coroutines.JobSupport.Finishing state;

        public ChildCompletion(kotlinx.coroutines.JobSupport r1, kotlinx.coroutines.JobSupport.Finishing r2, kotlinx.coroutines.ChildHandleNode r3, java.lang.Object r4) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.state = r2
                r0.child = r3
                r0.proposedUpdate = r4
                return
        }

        @Override // kotlinx.coroutines.InternalCompletionHandler
        public void invoke(java.lang.Throwable r5) {
                r4 = this;
                kotlinx.coroutines.JobSupport r0 = r4.parent
                kotlinx.coroutines.JobSupport$Finishing r1 = r4.state
                kotlinx.coroutines.ChildHandleNode r2 = r4.child
                java.lang.Object r3 = r4.proposedUpdate
                kotlinx.coroutines.JobSupport.access$continueCompleting(r0, r1, r2, r3)
                return
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    @kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\tJ\u0018\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\t0&j\b\u0012\u0004\u0012\u00020\t`'H\u0002J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0)2\b\u0010*\u001a\u0004\u0018\u00010\tJ\b\u0010+\u001a\u00020,H\u0016R\u0011\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fX\u0082\u0004R\t\u0010\r\u001a\u00020\u000eX\u0082\u0004R\u0011\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\fX\u0082\u0004R(\u0010\u0011\u001a\u0004\u0018\u00010\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0017\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR(\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006-"}, d2 = {"Lkotlinx/coroutines/JobSupport$Finishing;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/Incomplete;", "list", "Lkotlinx/coroutines/NodeList;", "isCompleting", "", "rootCause", "", "(Lkotlinx/coroutines/NodeList;ZLjava/lang/Throwable;)V", "_exceptionsHolder", "Lkotlinx/atomicfu/AtomicRef;", "_isCompleting", "Lkotlinx/atomicfu/AtomicBoolean;", "_rootCause", "value", "exceptionsHolder", "getExceptionsHolder", "()Ljava/lang/Object;", "setExceptionsHolder", "(Ljava/lang/Object;)V", "isActive", "()Z", "isCancelling", "setCompleting", "(Z)V", "isSealed", "getList", "()Lkotlinx/coroutines/NodeList;", "getRootCause", "()Ljava/lang/Throwable;", "setRootCause", "(Ljava/lang/Throwable;)V", "addExceptionLocked", "", "exception", "allocateList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "sealLocked", "", "proposedException", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Finishing implements kotlinx.coroutines.Incomplete {
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _exceptionsHolder$volatile$FU = null;
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _isCompleting$volatile$FU = null;
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _rootCause$volatile$FU = null;
        private volatile /* synthetic */ java.lang.Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ java.lang.Object _rootCause$volatile;
        private final kotlinx.coroutines.NodeList list;

        static {
                java.lang.String r0 = "_isCompleting$volatile"
                java.lang.Class<kotlinx.coroutines.JobSupport$Finishing> r1 = kotlinx.coroutines.JobSupport.Finishing.class
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
                kotlinx.coroutines.JobSupport.Finishing._isCompleting$volatile$FU = r0
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                java.lang.String r2 = "_rootCause$volatile"
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
                kotlinx.coroutines.JobSupport.Finishing._rootCause$volatile$FU = r0
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                java.lang.String r2 = "_exceptionsHolder$volatile"
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
                kotlinx.coroutines.JobSupport.Finishing._exceptionsHolder$volatile$FU = r0
                return
        }

        public Finishing(kotlinx.coroutines.NodeList r1, boolean r2, java.lang.Throwable r3) {
                r0 = this;
                r0.<init>()
                r0.list = r1
                r0._isCompleting$volatile = r2
                r0._rootCause$volatile = r3
                return
        }

        private final java.util.ArrayList<java.lang.Throwable> allocateList() {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 4
                r0.<init>(r1)
                return r0
        }

        private final java.lang.Object getExceptionsHolder() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_exceptionsHolder$volatile$FU()
                java.lang.Object r0 = r0.get(r1)
                return r0
        }

        private final /* synthetic */ java.lang.Object get_exceptionsHolder$volatile() {
                r1 = this;
                java.lang.Object r0 = r1._exceptionsHolder$volatile
                return r0
        }

        private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater get_exceptionsHolder$volatile$FU() {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.JobSupport.Finishing._exceptionsHolder$volatile$FU
                return r0
        }

        private final /* synthetic */ int get_isCompleting$volatile() {
                r1 = this;
                int r0 = r1._isCompleting$volatile
                return r0
        }

        private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater get_isCompleting$volatile$FU() {
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.JobSupport.Finishing._isCompleting$volatile$FU
                return r0
        }

        private final /* synthetic */ java.lang.Object get_rootCause$volatile() {
                r1 = this;
                java.lang.Object r0 = r1._rootCause$volatile
                return r0
        }

        private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater get_rootCause$volatile$FU() {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.JobSupport.Finishing._rootCause$volatile$FU
                return r0
        }

        private final void setExceptionsHolder(java.lang.Object r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_exceptionsHolder$volatile$FU()
                r0.set(r1, r2)
                return
        }

        private final /* synthetic */ void set_exceptionsHolder$volatile(java.lang.Object r1) {
                r0 = this;
                r0._exceptionsHolder$volatile = r1
                return
        }

        private final /* synthetic */ void set_isCompleting$volatile(int r1) {
                r0 = this;
                r0._isCompleting$volatile = r1
                return
        }

        private final /* synthetic */ void set_rootCause$volatile(java.lang.Object r1) {
                r0 = this;
                r0._rootCause$volatile = r1
                return
        }

        public final void addExceptionLocked(java.lang.Throwable r6) {
                r5 = this;
                java.lang.Throwable r0 = r5.getRootCause()
                if (r0 != 0) goto La
                r5.setRootCause(r6)
                return
            La:
                if (r6 != r0) goto Ld
                return
            Ld:
                java.lang.Object r1 = r5.getExceptionsHolder()
                if (r1 != 0) goto L17
                r5.setExceptionsHolder(r6)
                goto L39
            L17:
                boolean r2 = r1 instanceof java.lang.Throwable
                if (r2 == 0) goto L2f
                if (r6 != r1) goto L1e
                return
            L1e:
                java.util.ArrayList r2 = r5.allocateList()
                r3 = r2
                r4 = 0
                r3.add(r1)
                r3.add(r6)
                r5.setExceptionsHolder(r2)
                goto L39
            L2f:
                boolean r2 = r1 instanceof java.util.ArrayList
                if (r2 == 0) goto L3a
                r2 = r1
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                r2.add(r6)
            L39:
                return
            L3a:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "State is "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r1)
                java.lang.String r3 = r3.toString()
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }

        @Override // kotlinx.coroutines.Incomplete
        public kotlinx.coroutines.NodeList getList() {
                r1 = this;
                kotlinx.coroutines.NodeList r0 = r1.list
                return r0
        }

        public final java.lang.Throwable getRootCause() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_rootCause$volatile$FU()
                java.lang.Object r0 = r0.get(r1)
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                return r0
        }

        @Override // kotlinx.coroutines.Incomplete
        public boolean isActive() {
                r1 = this;
                java.lang.Throwable r0 = r1.getRootCause()
                if (r0 != 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public final boolean isCancelling() {
                r1 = this;
                java.lang.Throwable r0 = r1.getRootCause()
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public final boolean isCompleting() {
                r1 = this;
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_isCompleting$volatile$FU()
                int r0 = r0.get(r1)
                if (r0 == 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        public final boolean isSealed() {
                r2 = this;
                java.lang.Object r0 = r2.getExceptionsHolder()
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.access$getSEALED$p()
                if (r0 != r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        public final java.util.List<java.lang.Throwable> sealLocked(java.lang.Throwable r6) {
                r5 = this;
                java.lang.Object r0 = r5.getExceptionsHolder()
                if (r0 != 0) goto Lb
                java.util.ArrayList r1 = r5.allocateList()
                goto L20
            Lb:
                boolean r1 = r0 instanceof java.lang.Throwable
                if (r1 == 0) goto L19
                java.util.ArrayList r1 = r5.allocateList()
                r2 = r1
                r3 = 0
                r2.add(r0)
                goto L20
            L19:
                boolean r1 = r0 instanceof java.util.ArrayList
                if (r1 == 0) goto L43
                r1 = r0
                java.util.ArrayList r1 = (java.util.ArrayList) r1
            L20:
                java.lang.Throwable r0 = r5.getRootCause()
                if (r0 == 0) goto L2d
                r2 = r0
                r3 = 0
                r4 = 0
                r1.add(r4, r2)
            L2d:
                if (r6 == 0) goto L38
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r0)
                if (r2 != 0) goto L38
                r1.add(r6)
            L38:
                kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.JobSupportKt.access$getSEALED$p()
                r5.setExceptionsHolder(r2)
                r2 = r1
                java.util.List r2 = (java.util.List) r2
                return r2
            L43:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "State is "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r0)
                java.lang.String r2 = r2.toString()
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
        }

        public final void setCompleting(boolean r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_isCompleting$volatile$FU()
                r0.set(r1, r2)
                return
        }

        public final void setRootCause(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_rootCause$volatile$FU()
                r0.set(r1, r2)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Finishing[cancelling="
                java.lang.StringBuilder r0 = r0.append(r1)
                boolean r1 = r2.isCancelling()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", completing="
                java.lang.StringBuilder r0 = r0.append(r1)
                boolean r1 = r2.isCompleting()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", rootCause="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.Throwable r1 = r2.getRootCause()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", exceptions="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.Object r1 = r2.getExceptionsHolder()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", list="
                java.lang.StringBuilder r0 = r0.append(r1)
                kotlinx.coroutines.NodeList r1 = r2.getList()
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 93
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/JobSupport$SelectOnAwaitCompletionHandler;", "Lkotlinx/coroutines/JobNode;", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/selects/SelectInstance;)V", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class SelectOnAwaitCompletionHandler extends kotlinx.coroutines.JobNode {
        private final kotlinx.coroutines.selects.SelectInstance<?> select;
        final /* synthetic */ kotlinx.coroutines.JobSupport this$0;

        public SelectOnAwaitCompletionHandler(kotlinx.coroutines.JobSupport r1, kotlinx.coroutines.selects.SelectInstance<?> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.select = r2
                return
        }

        @Override // kotlinx.coroutines.InternalCompletionHandler
        public void invoke(java.lang.Throwable r5) {
                r4 = this;
                kotlinx.coroutines.JobSupport r0 = r4.this$0
                java.lang.Object r0 = r0.getState$kotlinx_coroutines_core()
                boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
                if (r1 == 0) goto Lc
                r1 = r0
                goto L10
            Lc:
                java.lang.Object r1 = kotlinx.coroutines.JobSupportKt.unboxState(r0)
            L10:
                kotlinx.coroutines.selects.SelectInstance<?> r2 = r4.select
                kotlinx.coroutines.JobSupport r3 = r4.this$0
                r2.trySelect(r3, r1)
                return
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/JobSupport$SelectOnJoinCompletionHandler;", "Lkotlinx/coroutines/JobNode;", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/selects/SelectInstance;)V", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class SelectOnJoinCompletionHandler extends kotlinx.coroutines.JobNode {
        private final kotlinx.coroutines.selects.SelectInstance<?> select;
        final /* synthetic */ kotlinx.coroutines.JobSupport this$0;

        public SelectOnJoinCompletionHandler(kotlinx.coroutines.JobSupport r1, kotlinx.coroutines.selects.SelectInstance<?> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.select = r2
                return
        }

        @Override // kotlinx.coroutines.InternalCompletionHandler
        public void invoke(java.lang.Throwable r4) {
                r3 = this;
                kotlinx.coroutines.selects.SelectInstance<?> r0 = r3.select
                kotlinx.coroutines.JobSupport r1 = r3.this$0
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                r0.trySelect(r1, r2)
                return
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_state$volatile"
            java.lang.Class<kotlinx.coroutines.JobSupport> r2 = kotlinx.coroutines.JobSupport.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.JobSupport._state$volatile$FU = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_parentHandle$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.JobSupport._parentHandle$volatile$FU = r0
            return
    }

    public JobSupport(boolean r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto La
            kotlinx.coroutines.Empty r0 = kotlinx.coroutines.JobSupportKt.access$getEMPTY_ACTIVE$p()
            goto Le
        La:
            kotlinx.coroutines.Empty r0 = kotlinx.coroutines.JobSupportKt.access$getEMPTY_NEW$p()
        Le:
            r1._state$volatile = r0
            return
    }

    public static final /* synthetic */ java.lang.Object access$awaitSuspend(kotlinx.coroutines.JobSupport r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r1.awaitSuspend(r2)
            return r0
    }

    public static final /* synthetic */ java.lang.String access$cancellationExceptionMessage(kotlinx.coroutines.JobSupport r1) {
            java.lang.String r0 = r1.cancellationExceptionMessage()
            return r0
    }

    public static final /* synthetic */ void access$continueCompleting(kotlinx.coroutines.JobSupport r0, kotlinx.coroutines.JobSupport.Finishing r1, kotlinx.coroutines.ChildHandleNode r2, java.lang.Object r3) {
            r0.continueCompleting(r1, r2, r3)
            return
    }

    public static final /* synthetic */ java.lang.Object access$joinSuspend(kotlinx.coroutines.JobSupport r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r1.joinSuspend(r2)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$onAwaitInternalProcessResFunc(kotlinx.coroutines.JobSupport r1, java.lang.Object r2, java.lang.Object r3) {
            java.lang.Object r0 = r1.onAwaitInternalProcessResFunc(r2, r3)
            return r0
    }

    public static final /* synthetic */ void access$onAwaitInternalRegFunc(kotlinx.coroutines.JobSupport r0, kotlinx.coroutines.selects.SelectInstance r1, java.lang.Object r2) {
            r0.onAwaitInternalRegFunc(r1, r2)
            return
    }

    public static final /* synthetic */ void access$registerSelectForOnJoin(kotlinx.coroutines.JobSupport r0, kotlinx.coroutines.selects.SelectInstance r1, java.lang.Object r2) {
            r0.registerSelectForOnJoin(r1, r2)
            return
    }

    private final boolean addLastAtomic(java.lang.Object r7, kotlinx.coroutines.NodeList r8, kotlinx.coroutines.JobNode r9) {
            r6 = this;
            r0 = r8
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
            r2 = r0
            r3 = 0
            kotlinx.coroutines.JobSupport$addLastAtomic$$inlined$addLastIf$1 r4 = new kotlinx.coroutines.JobSupport$addLastAtomic$$inlined$addLastIf$1
            r5 = r9
            kotlinx.coroutines.internal.LockFreeLinkedListNode r5 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r5
            r4.<init>(r5, r6, r7)
            kotlinx.coroutines.internal.LockFreeLinkedListNode$CondAddOp r4 = (kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp) r4
        L12:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r0.getPrevNode()
            r3 = r9
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            int r3 = r2.tryCondAddNext(r3, r0, r4)
            switch(r3) {
                case 1: goto L24;
                case 2: goto L22;
                default: goto L21;
            }
        L21:
            goto L12
        L22:
            r3 = 0
            goto L25
        L24:
            r3 = 1
        L25:
            return r3
    }

    private final void addSuppressedExceptions(java.lang.Throwable r7, java.util.List<? extends java.lang.Throwable> r8) {
            r6 = this;
            int r0 = r8.size()
            r1 = 1
            if (r0 > r1) goto L8
            return
        L8:
            int r0 = r8.size()
            r1 = 0
            java.util.IdentityHashMap r2 = new java.util.IdentityHashMap
            r2.<init>(r0)
            java.util.Map r2 = (java.util.Map) r2
            java.util.Set r0 = java.util.Collections.newSetFromMap(r2)
            r1 = 0
            boolean r2 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r2 != 0) goto L22
            r2 = r7
            goto L26
        L22:
            java.lang.Throwable r2 = kotlinx.coroutines.internal.StackTraceRecoveryKt.unwrapImpl(r7)
        L26:
            java.util.Iterator r1 = r8.iterator()
        L2b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L57
            java.lang.Object r3 = r1.next()
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r4 = 0
            boolean r5 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r5 != 0) goto L40
            r5 = r3
            goto L44
        L40:
            java.lang.Throwable r5 = kotlinx.coroutines.internal.StackTraceRecoveryKt.unwrapImpl(r3)
        L44:
            if (r5 == r7) goto L2b
            if (r5 == r2) goto L2b
            boolean r4 = r5 instanceof java.util.concurrent.CancellationException
            if (r4 != 0) goto L2b
            boolean r4 = r0.add(r5)
            if (r4 == 0) goto L2b
            kotlin.ExceptionsKt.addSuppressed(r7, r5)
            goto L2b
        L57:
            return
    }

    private final java.lang.Object awaitSuspend(kotlin.coroutines.Continuation<java.lang.Object> r11) {
            r10 = this;
            r0 = r11
            r1 = 0
            kotlinx.coroutines.JobSupport$AwaitContinuation r2 = new kotlinx.coroutines.JobSupport$AwaitContinuation
            kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r2.<init>(r3, r10)
            r2.initCancellability()
            r3 = r2
            kotlinx.coroutines.CancellableContinuation r3 = (kotlinx.coroutines.CancellableContinuation) r3
            r4 = r10
            kotlinx.coroutines.Job r4 = (kotlinx.coroutines.Job) r4
            kotlinx.coroutines.ResumeAwaitOnCompletion r5 = new kotlinx.coroutines.ResumeAwaitOnCompletion
            r6 = r2
            kotlinx.coroutines.CancellableContinuationImpl r6 = (kotlinx.coroutines.CancellableContinuationImpl) r6
            r5.<init>(r6)
            r7 = r5
            kotlinx.coroutines.InternalCompletionHandler r7 = (kotlinx.coroutines.InternalCompletionHandler) r7
            r8 = 3
            r9 = 0
            r5 = 0
            r6 = 0
            kotlinx.coroutines.DisposableHandle r4 = kotlinx.coroutines.JobKt.invokeOnCompletion$default(r4, r5, r6, r7, r8, r9)
            kotlinx.coroutines.CancellableContinuationKt.disposeOnCancellation(r3, r4)
            java.lang.Object r0 = r2.getResult()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L37
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r11)
        L37:
            return r0
    }

    private final java.lang.Object cancelMakeCompleting(java.lang.Object r10) {
            r9 = this;
            r0 = r9
            r1 = 0
        L2:
            java.lang.Object r2 = r0.getState$kotlinx_coroutines_core()
            r3 = 0
            boolean r4 = r2 instanceof kotlinx.coroutines.Incomplete
            if (r4 == 0) goto L33
            boolean r4 = r2 instanceof kotlinx.coroutines.JobSupport.Finishing
            if (r4 == 0) goto L1a
            r4 = r2
            kotlinx.coroutines.JobSupport$Finishing r4 = (kotlinx.coroutines.JobSupport.Finishing) r4
            boolean r4 = r4.isCompleting()
            if (r4 == 0) goto L1a
            goto L33
        L1a:
            kotlinx.coroutines.CompletedExceptionally r4 = new kotlinx.coroutines.CompletedExceptionally
            java.lang.Throwable r5 = r9.createCauseException(r10)
            r6 = 2
            r7 = 0
            r8 = 0
            r4.<init>(r5, r8, r6, r7)
            java.lang.Object r5 = r9.tryMakeCompleting(r2, r4)
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()
            if (r5 == r6) goto L31
            return r5
        L31:
            goto L2
        L33:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            return r4
    }

    private final boolean cancelParent(java.lang.Throwable r5) {
            r4 = this;
            boolean r0 = r4.isScopedCoroutine()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r5 instanceof java.util.concurrent.CancellationException
            kotlinx.coroutines.ChildHandle r2 = r4.getParentHandle$kotlinx_coroutines_core()
            if (r2 == 0) goto L20
            kotlinx.coroutines.NonDisposableHandle r3 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            if (r2 != r3) goto L15
            goto L20
        L15:
            boolean r3 = r2.childCancelled(r5)
            if (r3 != 0) goto L1f
            if (r0 == 0) goto L1e
            goto L1f
        L1e:
            r1 = 0
        L1f:
            return r1
        L20:
            return r0
    }

    private final void completeStateFinalization(kotlinx.coroutines.Incomplete r6, java.lang.Object r7) {
            r5 = this;
            kotlinx.coroutines.ChildHandle r0 = r5.getParentHandle$kotlinx_coroutines_core()
            if (r0 == 0) goto L13
            r1 = 0
            r0.dispose()
            kotlinx.coroutines.NonDisposableHandle r2 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            kotlinx.coroutines.ChildHandle r2 = (kotlinx.coroutines.ChildHandle) r2
            r5.setParentHandle$kotlinx_coroutines_core(r2)
        L13:
            boolean r0 = r7 instanceof kotlinx.coroutines.CompletedExceptionally
            r1 = 0
            if (r0 == 0) goto L1c
            r0 = r7
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            goto L1d
        L1c:
            r0 = r1
        L1d:
            if (r0 == 0) goto L21
            java.lang.Throwable r1 = r0.cause
        L21:
            boolean r0 = r6 instanceof kotlinx.coroutines.JobNode
            if (r0 == 0) goto L56
        L26:
            r0 = r6
            kotlinx.coroutines.JobNode r0 = (kotlinx.coroutines.JobNode) r0     // Catch: java.lang.Throwable -> L2d
            r0.invoke(r1)     // Catch: java.lang.Throwable -> L2d
            goto L5f
        L2d:
            r0 = move-exception
            kotlinx.coroutines.CompletionHandlerException r2 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception in completion handler "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r4 = " for "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3, r0)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r5.handleOnCompletionException$kotlinx_coroutines_core(r2)
            goto L5f
        L56:
            kotlinx.coroutines.NodeList r0 = r6.getList()
            if (r0 == 0) goto L5f
            r5.notifyCompletion(r0, r1)
        L5f:
            return
    }

    private final void continueCompleting(kotlinx.coroutines.JobSupport.Finishing r3, kotlinx.coroutines.ChildHandleNode r4, java.lang.Object r5) {
            r2 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L19
            r0 = 0
            java.lang.Object r1 = r2.getState$kotlinx_coroutines_core()
            if (r1 != r3) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            if (r1 == 0) goto L13
            goto L19
        L13:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L19:
            r0 = r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            kotlinx.coroutines.ChildHandleNode r0 = r2.nextChild(r0)
            if (r0 == 0) goto L29
            boolean r1 = r2.tryWaitForChild(r3, r0, r5)
            if (r1 == 0) goto L29
            return
        L29:
            java.lang.Object r1 = r2.finalizeFinishingState(r3, r5)
            r2.afterCompletion(r1)
            return
    }

    private final java.lang.Throwable createCauseException(java.lang.Object r7) {
            r6 = this;
            if (r7 != 0) goto L5
            r0 = 1
            goto L7
        L5:
            boolean r0 = r7 instanceof java.lang.Throwable
        L7:
            if (r0 == 0) goto L21
            r0 = r7
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 != 0) goto L2f
            r0 = 0
            r1 = 0
            r2 = 0
            kotlinx.coroutines.JobCancellationException r3 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r4 = access$cancellationExceptionMessage(r6)
            r5 = r6
            kotlinx.coroutines.Job r5 = (kotlinx.coroutines.Job) r5
            r3.<init>(r4, r1, r5)
            r0 = r3
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            goto L2f
        L21:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.ParentJob"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7, r0)
            r0 = r7
            kotlinx.coroutines.ParentJob r0 = (kotlinx.coroutines.ParentJob) r0
            java.util.concurrent.CancellationException r0 = r0.getChildJobCancellationCause()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
        L2f:
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.JobCancellationException defaultCancellationException$kotlinx_coroutines_core$default(kotlinx.coroutines.JobSupport r2, java.lang.String r3, java.lang.Throwable r4, int r5, java.lang.Object r6) {
            if (r6 != 0) goto L1e
            r6 = r5 & 1
            if (r6 == 0) goto L7
            r3 = 0
        L7:
            r5 = r5 & 2
            if (r5 == 0) goto Lc
            r4 = 0
        Lc:
            r5 = 0
            kotlinx.coroutines.JobCancellationException r6 = new kotlinx.coroutines.JobCancellationException
            if (r3 != 0) goto L16
            java.lang.String r0 = access$cancellationExceptionMessage(r2)
            goto L17
        L16:
            r0 = r3
        L17:
            r1 = r2
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            r6.<init>(r0, r4, r1)
            return r6
        L1e:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.String r6 = "Super calls with default arguments not supported in this target, function: defaultCancellationException"
            r5.<init>(r6)
            throw r5
    }

    private final java.lang.Object finalizeFinishingState(kotlinx.coroutines.JobSupport.Finishing r11, java.lang.Object r12) {
            r10 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1b
            r0 = 0
            java.lang.Object r3 = r10.getState$kotlinx_coroutines_core()
            if (r3 != r11) goto L11
            r0 = r1
            goto L12
        L11:
            r0 = r2
        L12:
            if (r0 == 0) goto L15
            goto L1b
        L15:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L1b:
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L2f
            r0 = 0
            boolean r3 = r11.isSealed()
            if (r3 != 0) goto L29
            goto L2f
        L29:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L2f:
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L43
            r0 = 0
            boolean r0 = r11.isCompleting()
            if (r0 == 0) goto L3d
            goto L43
        L3d:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L43:
            boolean r0 = r12 instanceof kotlinx.coroutines.CompletedExceptionally
            r3 = 0
            if (r0 == 0) goto L4c
            r0 = r12
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            goto L4d
        L4c:
            r0 = r3
        L4d:
            if (r0 == 0) goto L52
            java.lang.Throwable r0 = r0.cause
            goto L53
        L52:
            r0 = r3
        L53:
            r4 = 0
            r5 = 0
            r6 = 0
            monitor-enter(r11)
            r7 = 0
            boolean r8 = r11.isCancelling()     // Catch: java.lang.Throwable -> Lc7
            r4 = r8
            java.util.List r8 = r11.sealLocked(r0)     // Catch: java.lang.Throwable -> Lc7
            java.lang.Throwable r9 = r10.getFinalRootCause(r11, r8)     // Catch: java.lang.Throwable -> Lc7
            if (r9 == 0) goto L6b
            r10.addSuppressedExceptions(r9, r8)     // Catch: java.lang.Throwable -> Lc7
        L6b:
            monitor-exit(r11)
            if (r9 != 0) goto L73
            goto L75
        L73:
            if (r9 != r0) goto L77
        L75:
            r5 = r12
            goto L7d
        L77:
            kotlinx.coroutines.CompletedExceptionally r5 = new kotlinx.coroutines.CompletedExceptionally
            r6 = 2
            r5.<init>(r9, r2, r6, r3)
        L7d:
            if (r9 == 0) goto L9b
            boolean r3 = r10.cancelParent(r9)
            if (r3 != 0) goto L8e
            boolean r3 = r10.handleJobException(r9)
            if (r3 == 0) goto L8d
            goto L8e
        L8d:
            r1 = r2
        L8e:
            if (r1 == 0) goto L9b
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r2)
            r2 = r5
            kotlinx.coroutines.CompletedExceptionally r2 = (kotlinx.coroutines.CompletedExceptionally) r2
            r2.makeHandled()
        L9b:
            if (r4 != 0) goto La0
            r10.onCancelling(r9)
        La0:
            r10.onCompletionInternal(r5)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = get_state$volatile$FU()
            java.lang.Object r2 = kotlinx.coroutines.JobSupportKt.boxIncomplete(r5)
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r10, r11, r2)
            boolean r2 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r2 == 0) goto Lc0
            r2 = 0
            if (r1 == 0) goto Lba
            goto Lc0
        Lba:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        Lc0:
            r2 = r11
            kotlinx.coroutines.Incomplete r2 = (kotlinx.coroutines.Incomplete) r2
            r10.completeStateFinalization(r2, r5)
            return r5
        Lc7:
            r1 = move-exception
            monitor-exit(r11)
            throw r1
    }

    private final kotlinx.coroutines.ChildHandleNode firstChild(kotlinx.coroutines.Incomplete r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.ChildHandleNode
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r3
            kotlinx.coroutines.ChildHandleNode r0 = (kotlinx.coroutines.ChildHandleNode) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 != 0) goto L19
            kotlinx.coroutines.NodeList r0 = r3.getList()
            if (r0 == 0) goto L1a
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            kotlinx.coroutines.ChildHandleNode r1 = r2.nextChild(r0)
            goto L1a
        L19:
            r1 = r0
        L1a:
            return r1
    }

    private final java.lang.Throwable getExceptionOrNull(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.CompletedExceptionally
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r3
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto Le
            java.lang.Throwable r1 = r0.cause
        Le:
            return r1
    }

    private final java.lang.Throwable getFinalRootCause(kotlinx.coroutines.JobSupport.Finishing r12, java.util.List<? extends java.lang.Throwable> r13) {
            r11 = this;
            boolean r0 = r13.isEmpty()
            r1 = 0
            if (r0 == 0) goto L20
            boolean r0 = r12.isCancelling()
            if (r0 == 0) goto L1f
            r0 = 0
            r1 = 0
            r2 = 0
            kotlinx.coroutines.JobCancellationException r3 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r4 = access$cancellationExceptionMessage(r11)
            r5 = r11
            kotlinx.coroutines.Job r5 = (kotlinx.coroutines.Job) r5
            r3.<init>(r4, r1, r5)
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            return r3
        L1f:
            return r1
        L20:
            r0 = r13
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r2 = 0
            java.util.Iterator r3 = r0.iterator()
        L28:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3b
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            r6 = 0
            boolean r7 = r5 instanceof java.util.concurrent.CancellationException
            if (r7 != 0) goto L28
            goto L3c
        L3b:
            r4 = r1
        L3c:
            r0 = r4
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L42
            return r0
        L42:
            r2 = 0
            java.lang.Object r3 = r13.get(r2)
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            boolean r4 = r3 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r4 == 0) goto L76
            r4 = r13
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r5 = 0
            java.util.Iterator r6 = r4.iterator()
        L55:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L70
            java.lang.Object r7 = r6.next()
            r8 = r7
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            r9 = 0
            if (r8 == r3) goto L6b
            boolean r10 = r8 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r10 == 0) goto L6b
            r10 = 1
            goto L6c
        L6b:
            r10 = r2
        L6c:
            if (r10 == 0) goto L55
            r1 = r7
            goto L71
        L70:
        L71:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L76
            return r1
        L76:
            return r3
    }

    protected static /* synthetic */ void getOnAwaitInternal$annotations() {
            return
    }

    public static /* synthetic */ void getOnJoin$annotations() {
            return
    }

    private final kotlinx.coroutines.NodeList getOrPromoteCancellingList(kotlinx.coroutines.Incomplete r4) {
            r3 = this;
            kotlinx.coroutines.NodeList r0 = r4.getList()
            if (r0 != 0) goto L3a
        L7:
            boolean r0 = r4 instanceof kotlinx.coroutines.Empty
            if (r0 == 0) goto L11
            kotlinx.coroutines.NodeList r0 = new kotlinx.coroutines.NodeList
            r0.<init>()
            goto L3a
        L11:
            boolean r0 = r4 instanceof kotlinx.coroutines.JobNode
            if (r0 == 0) goto L1d
            r0 = r4
            kotlinx.coroutines.JobNode r0 = (kotlinx.coroutines.JobNode) r0
            r3.promoteSingleToNodeList(r0)
            r0 = 0
            goto L3a
        L1d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "State should have list: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3a:
            return r0
    }

    private final /* synthetic */ java.lang.Object get_parentHandle$volatile() {
            r1 = this;
            java.lang.Object r0 = r1._parentHandle$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater get_parentHandle$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.JobSupport._parentHandle$volatile$FU
            return r0
    }

    private final /* synthetic */ java.lang.Object get_state$volatile() {
            r1 = this;
            java.lang.Object r0 = r1._state$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater get_state$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.JobSupport._state$volatile$FU
            return r0
    }

    private final boolean isCancelling(kotlinx.coroutines.Incomplete r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.JobSupport.Finishing
            if (r0 == 0) goto Lf
            r0 = r2
            kotlinx.coroutines.JobSupport$Finishing r0 = (kotlinx.coroutines.JobSupport.Finishing) r0
            boolean r0 = r0.isCancelling()
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    private final boolean joinInternal() {
            r5 = this;
            r0 = r5
            r1 = 0
        L2:
            java.lang.Object r2 = r0.getState$kotlinx_coroutines_core()
            r3 = 0
            boolean r4 = r2 instanceof kotlinx.coroutines.Incomplete
            if (r4 != 0) goto Le
            r4 = 0
            return r4
        Le:
            int r4 = r5.startInternal(r2)
            if (r4 < 0) goto L16
            r4 = 1
            return r4
        L16:
            goto L2
    }

    private final java.lang.Object joinSuspend(kotlin.coroutines.Continuation<? super kotlin.Unit> r13) {
            r12 = this;
            r0 = 0
            r1 = r13
            r2 = 0
            kotlinx.coroutines.CancellableContinuationImpl r3 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r1)
            r5 = 1
            r3.<init>(r4, r5)
            r3.initCancellability()
            r4 = r3
            kotlinx.coroutines.CancellableContinuation r4 = (kotlinx.coroutines.CancellableContinuation) r4
            r5 = 0
            r6 = r12
            kotlinx.coroutines.Job r6 = (kotlinx.coroutines.Job) r6
            kotlinx.coroutines.ResumeOnCompletion r7 = new kotlinx.coroutines.ResumeOnCompletion
            r8 = r4
            kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
            r7.<init>(r8)
            r9 = r7
            kotlinx.coroutines.InternalCompletionHandler r9 = (kotlinx.coroutines.InternalCompletionHandler) r9
            r10 = 3
            r11 = 0
            r7 = 0
            r8 = 0
            kotlinx.coroutines.DisposableHandle r6 = kotlinx.coroutines.JobKt.invokeOnCompletion$default(r6, r7, r8, r9, r10, r11)
            kotlinx.coroutines.CancellableContinuationKt.disposeOnCancellation(r4, r6)
            java.lang.Object r1 = r3.getResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L3c
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r13)
        L3c:
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L43
            return r1
        L43:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    private final /* synthetic */ void loop$atomicfu(java.lang.Object r2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> r4) {
            r1 = this;
        L0:
            java.lang.Object r0 = r3.get(r2)
            r4.invoke(r0)
            goto L0
    }

    private final java.lang.Void loopOnState(kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> r3) {
            r2 = this;
            r0 = 0
        L1:
            java.lang.Object r1 = r2.getState$kotlinx_coroutines_core()
            r3.invoke(r1)
            goto L1
    }

    private final java.lang.Object makeCancelling(java.lang.Object r17) {
            r16 = this;
            r1 = r16
            r0 = 0
            r2 = r16
            r3 = 0
            r4 = r0
        L7:
            java.lang.Object r5 = r2.getState$kotlinx_coroutines_core()
            r6 = 0
            boolean r0 = r5 instanceof kotlinx.coroutines.JobSupport.Finishing
            r7 = 0
            r8 = 0
            if (r0 == 0) goto L73
            r9 = 0
            r10 = 0
            monitor-enter(r5)
            r0 = 0
            r11 = r5
            kotlinx.coroutines.JobSupport$Finishing r11 = (kotlinx.coroutines.JobSupport.Finishing) r11     // Catch: java.lang.Throwable -> L70
            boolean r11 = r11.isSealed()     // Catch: java.lang.Throwable -> L70
            if (r11 == 0) goto L28
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.JobSupportKt.access$getTOO_LATE_TO_CANCEL$p()     // Catch: java.lang.Throwable -> L70
            monitor-exit(r5)
            return r7
        L28:
            r11 = r5
            kotlinx.coroutines.JobSupport$Finishing r11 = (kotlinx.coroutines.JobSupport.Finishing) r11     // Catch: java.lang.Throwable -> L70
            boolean r11 = r11.isCancelling()     // Catch: java.lang.Throwable -> L70
            if (r17 != 0) goto L33
            if (r11 != 0) goto L48
        L33:
            if (r4 != 0) goto L40
            java.lang.Throwable r12 = r16.createCauseException(r17)     // Catch: java.lang.Throwable -> L70
            r13 = r12
            r14 = 0
            r4 = r13
            r15 = r12
            r12 = r4
            r4 = r15
            goto L41
        L40:
            r12 = r4
        L41:
            r13 = r5
            kotlinx.coroutines.JobSupport$Finishing r13 = (kotlinx.coroutines.JobSupport.Finishing) r13     // Catch: java.lang.Throwable -> L6d
            r13.addExceptionLocked(r4)     // Catch: java.lang.Throwable -> L6d
            r4 = r12
        L48:
            r12 = r5
            kotlinx.coroutines.JobSupport$Finishing r12 = (kotlinx.coroutines.JobSupport.Finishing) r12     // Catch: java.lang.Throwable -> L70
            java.lang.Throwable r12 = r12.getRootCause()     // Catch: java.lang.Throwable -> L70
            r13 = r12
            r14 = 0
            if (r11 != 0) goto L54
            r8 = 1
        L54:
            if (r8 == 0) goto L57
            r7 = r12
        L57:
            monitor-exit(r5)
            if (r7 == 0) goto L68
            r0 = r7
            r8 = 0
            r9 = r5
            kotlinx.coroutines.JobSupport$Finishing r9 = (kotlinx.coroutines.JobSupport.Finishing) r9
            kotlinx.coroutines.NodeList r9 = r9.getList()
            r1.notifyCancelling(r9, r0)
        L68:
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            return r0
        L6d:
            r0 = move-exception
            r4 = r12
            goto L71
        L70:
            r0 = move-exception
        L71:
            monitor-exit(r5)
            throw r0
        L73:
            boolean r0 = r5 instanceof kotlinx.coroutines.Incomplete
            if (r0 == 0) goto Ld2
            if (r4 != 0) goto L81
            java.lang.Throwable r0 = r16.createCauseException(r17)
            r9 = r0
            r10 = 0
            r4 = r0
            goto L82
        L81:
            r9 = r4
        L82:
            r0 = r5
            kotlinx.coroutines.Incomplete r0 = (kotlinx.coroutines.Incomplete) r0
            boolean r0 = r0.isActive()
            if (r0 == 0) goto L9a
            r0 = r5
            kotlinx.coroutines.Incomplete r0 = (kotlinx.coroutines.Incomplete) r0
            boolean r0 = r1.tryMakeCancelling(r0, r4)
            if (r0 == 0) goto L99
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            return r0
        L99:
            goto Lb2
        L9a:
            kotlinx.coroutines.CompletedExceptionally r0 = new kotlinx.coroutines.CompletedExceptionally
            r10 = 2
            r0.<init>(r4, r8, r10, r7)
            java.lang.Object r0 = r1.tryMakeCompleting(r5, r0)
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            if (r0 == r7) goto Lb5
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()
            if (r0 == r7) goto Lb2
            return r0
        Lb2:
            r4 = r9
            goto L7
        Lb5:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "Cannot happen in "
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.StringBuilder r8 = r8.append(r5)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        Ld2:
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.JobSupportKt.access$getTOO_LATE_TO_CANCEL$p()
            return r0
    }

    private final kotlinx.coroutines.JobNode makeNode(kotlinx.coroutines.InternalCompletionHandler r6, boolean r7) {
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L16
            boolean r1 = r6 instanceof kotlinx.coroutines.JobCancellingNode
            if (r1 == 0) goto La
            r0 = r6
            kotlinx.coroutines.JobCancellingNode r0 = (kotlinx.coroutines.JobCancellingNode) r0
        La:
            if (r0 != 0) goto L13
            kotlinx.coroutines.InvokeOnCancelling r0 = new kotlinx.coroutines.InvokeOnCancelling
            r0.<init>(r6)
            kotlinx.coroutines.JobCancellingNode r0 = (kotlinx.coroutines.JobCancellingNode) r0
        L13:
            kotlinx.coroutines.JobNode r0 = (kotlinx.coroutines.JobNode) r0
            goto L3c
        L16:
            boolean r1 = r6 instanceof kotlinx.coroutines.JobNode
            if (r1 == 0) goto L1d
            r0 = r6
            kotlinx.coroutines.JobNode r0 = (kotlinx.coroutines.JobNode) r0
        L1d:
            if (r0 == 0) goto L35
        L20:
            r1 = r0
            r2 = 0
            boolean r3 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r3 == 0) goto L34
            r3 = 0
            boolean r4 = r1 instanceof kotlinx.coroutines.JobCancellingNode
            if (r4 != 0) goto L2e
            goto L34
        L2e:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L34:
            goto L3c
        L35:
            kotlinx.coroutines.InvokeOnCompletion r0 = new kotlinx.coroutines.InvokeOnCompletion
            r0.<init>(r6)
            kotlinx.coroutines.JobNode r0 = (kotlinx.coroutines.JobNode) r0
        L3c:
            r0.setJob(r5)
            return r0
    }

    private final kotlinx.coroutines.ChildHandleNode nextChild(kotlinx.coroutines.internal.LockFreeLinkedListNode r3) {
            r2 = this;
            r0 = r3
        L1:
            boolean r1 = r0.isRemoved()
            if (r1 == 0) goto Lc
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getPrevNode()
            goto L1
        Lc:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            boolean r1 = r0.isRemoved()
            if (r1 != 0) goto Lc
            boolean r1 = r0 instanceof kotlinx.coroutines.ChildHandleNode
            if (r1 == 0) goto L1f
            r1 = r0
            kotlinx.coroutines.ChildHandleNode r1 = (kotlinx.coroutines.ChildHandleNode) r1
            return r1
        L1f:
            boolean r1 = r0 instanceof kotlinx.coroutines.NodeList
            if (r1 == 0) goto Lc
            r1 = 0
            return r1
    }

    private final void notifyCancelling(kotlinx.coroutines.NodeList r17, java.lang.Throwable r18) {
            r16 = this;
            r1 = r16
            r2 = r18
            r1.onCancelling(r2)
            r3 = r16
            r4 = 0
            r0 = 0
            r5 = r17
            kotlinx.coroutines.internal.LockFreeLinkedListHead r5 = (kotlinx.coroutines.internal.LockFreeLinkedListHead) r5
            r6 = 0
            java.lang.Object r7 = r5.getNext()
            java.lang.String r8 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7, r8)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r7 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r7
            r8 = r7
            r7 = r0
        L1d:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r5)
            if (r0 != 0) goto L6c
            boolean r0 = r8 instanceof kotlinx.coroutines.JobCancellingNode
            if (r0 == 0) goto L67
            r9 = r8
            kotlinx.coroutines.JobNode r9 = (kotlinx.coroutines.JobNode) r9
            r10 = 0
            r9.invoke(r2)     // Catch: java.lang.Throwable -> L30
            goto L65
        L30:
            r0 = move-exception
            r11 = r7
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            if (r11 == 0) goto L3d
            r12 = r11
            r13 = 0
            kotlin.ExceptionsKt.addSuppressed(r12, r0)
            if (r11 != 0) goto L65
        L3d:
            r11 = r3
            r12 = 0
            kotlinx.coroutines.CompletionHandlerException r13 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Exception in completion handler "
            java.lang.StringBuilder r14 = r14.append(r15)
            java.lang.StringBuilder r14 = r14.append(r9)
            java.lang.String r15 = " for "
            java.lang.StringBuilder r14 = r14.append(r15)
            java.lang.StringBuilder r14 = r14.append(r11)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14, r0)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            r7 = r13
        L65:
        L67:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r8 = r8.getNextNode()
            goto L1d
        L6c:
            r0 = r7
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L76
            r5 = 0
            r3.handleOnCompletionException$kotlinx_coroutines_core(r0)
        L76:
            r1.cancelParent(r2)
            return
    }

    private final void notifyCompletion(kotlinx.coroutines.NodeList r16, java.lang.Throwable r17) {
            r15 = this;
            r1 = r15
            r2 = 0
            r0 = 0
            r3 = r16
            kotlinx.coroutines.internal.LockFreeLinkedListHead r3 = (kotlinx.coroutines.internal.LockFreeLinkedListHead) r3
            r4 = 0
            java.lang.Object r5 = r3.getNext()
            java.lang.String r6 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r6)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r5 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r5
            r6 = r5
            r5 = r0
        L15:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r3)
            if (r0 != 0) goto L69
            boolean r0 = r6 instanceof kotlinx.coroutines.JobNode
            if (r0 == 0) goto L61
            r7 = r6
            kotlinx.coroutines.JobNode r7 = (kotlinx.coroutines.JobNode) r7
            r8 = 0
            r9 = r17
            r7.invoke(r9)     // Catch: java.lang.Throwable -> L2a
            goto L5f
        L2a:
            r0 = move-exception
            r10 = r5
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            if (r10 == 0) goto L37
            r11 = r10
            r12 = 0
            kotlin.ExceptionsKt.addSuppressed(r11, r0)
            if (r10 != 0) goto L5f
        L37:
            r10 = r1
            r11 = 0
            kotlinx.coroutines.CompletionHandlerException r12 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Exception in completion handler "
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.StringBuilder r13 = r13.append(r7)
            java.lang.String r14 = " for "
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.StringBuilder r13 = r13.append(r10)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13, r0)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            r5 = r12
        L5f:
            goto L63
        L61:
            r9 = r17
        L63:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r6 = r6.getNextNode()
            goto L15
        L69:
            r9 = r17
            r0 = r5
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L74
            r3 = 0
            r1.handleOnCompletionException$kotlinx_coroutines_core(r0)
        L74:
            return
    }

    private final /* synthetic */ <T extends kotlinx.coroutines.JobNode> void notifyHandlers(kotlinx.coroutines.NodeList r14, java.lang.Throwable r15) {
            r13 = this;
            r0 = 0
            r1 = 0
            r2 = r14
            kotlinx.coroutines.internal.LockFreeLinkedListHead r2 = (kotlinx.coroutines.internal.LockFreeLinkedListHead) r2
            r3 = 0
            java.lang.Object r4 = r2.getNext()
            java.lang.String r5 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r5)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r4
        L11:
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r2)
            if (r5 != 0) goto L6d
            r5 = 3
            java.lang.String r6 = "T"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r5, r6)
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.LockFreeLinkedListNode
            if (r5 == 0) goto L68
            r5 = r4
            kotlinx.coroutines.JobNode r5 = (kotlinx.coroutines.JobNode) r5
            r6 = 0
            r5.invoke(r15)     // Catch: java.lang.Throwable -> L2a
            goto L66
        L2a:
            r7 = move-exception
            r8 = r1
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            if (r8 == 0) goto L3c
            r9 = r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r10 = 0
            kotlin.ExceptionsKt.addSuppressed(r9, r7)
            r9 = r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            if (r8 != 0) goto L66
        L3c:
            r8 = r13
            kotlinx.coroutines.JobSupport r8 = (kotlinx.coroutines.JobSupport) r8
            r9 = 0
            kotlinx.coroutines.CompletionHandlerException r10 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Exception in completion handler "
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.StringBuilder r11 = r11.append(r5)
            java.lang.String r12 = " for "
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.StringBuilder r11 = r11.append(r8)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11, r7)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            r1 = r10
        L66:
        L68:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r4.getNextNode()
            goto L11
        L6d:
            r2 = r1
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            if (r2 == 0) goto L79
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r3 = 0
            r13.handleOnCompletionException$kotlinx_coroutines_core(r2)
        L79:
            return
    }

    private final java.lang.Object onAwaitInternalProcessResFunc(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r0 != 0) goto L5
            return r3
        L5:
            r0 = r3
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            java.lang.Throwable r0 = r0.cause
            throw r0
    }

    private final void onAwaitInternalRegFunc(kotlinx.coroutines.selects.SelectInstance<?> r9, java.lang.Object r10) {
            r8 = this;
        L1:
            java.lang.Object r0 = r8.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto L18
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L10
            r1 = r0
            goto L14
        L10:
            java.lang.Object r1 = kotlinx.coroutines.JobSupportKt.unboxState(r0)
        L14:
            r9.selectInRegistrationPhase(r1)
            return
        L18:
            int r1 = r8.startInternal(r0)
            if (r1 < 0) goto L1
            r2 = r8
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            kotlinx.coroutines.JobSupport$SelectOnAwaitCompletionHandler r0 = new kotlinx.coroutines.JobSupport$SelectOnAwaitCompletionHandler
            r0.<init>(r8, r9)
            r5 = r0
            kotlinx.coroutines.InternalCompletionHandler r5 = (kotlinx.coroutines.InternalCompletionHandler) r5
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            kotlinx.coroutines.DisposableHandle r0 = kotlinx.coroutines.JobKt.invokeOnCompletion$default(r2, r3, r4, r5, r6, r7)
            r9.disposeOnCompletion(r0)
            return
    }

    private final void promoteEmptyToNodeList(kotlinx.coroutines.Empty r4) {
            r3 = this;
            kotlinx.coroutines.NodeList r0 = new kotlinx.coroutines.NodeList
            r0.<init>()
            boolean r1 = r4.isActive()
            if (r1 == 0) goto Lf
            r1 = r0
            kotlinx.coroutines.Incomplete r1 = (kotlinx.coroutines.Incomplete) r1
            goto L16
        Lf:
            kotlinx.coroutines.InactiveNodeList r1 = new kotlinx.coroutines.InactiveNodeList
            r1.<init>(r0)
            kotlinx.coroutines.Incomplete r1 = (kotlinx.coroutines.Incomplete) r1
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = get_state$volatile$FU()
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r3, r4, r1)
            return
    }

    private final void promoteSingleToNodeList(kotlinx.coroutines.JobNode r3) {
            r2 = this;
            kotlinx.coroutines.NodeList r0 = new kotlinx.coroutines.NodeList
            r0.<init>()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r3.addOneIfEmpty(r0)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r3.getNextNode()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = get_state$volatile$FU()
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r2, r3, r0)
            return
    }

    private final void registerSelectForOnJoin(kotlinx.coroutines.selects.SelectInstance<?> r8, java.lang.Object r9) {
            r7 = this;
            boolean r0 = r7.joinInternal()
            if (r0 != 0) goto Lc
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r8.selectInRegistrationPhase(r0)
            return
        Lc:
            r1 = r7
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            kotlinx.coroutines.JobSupport$SelectOnJoinCompletionHandler r0 = new kotlinx.coroutines.JobSupport$SelectOnJoinCompletionHandler
            r0.<init>(r7, r8)
            r4 = r0
            kotlinx.coroutines.InternalCompletionHandler r4 = (kotlinx.coroutines.InternalCompletionHandler) r4
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            kotlinx.coroutines.DisposableHandle r0 = kotlinx.coroutines.JobKt.invokeOnCompletion$default(r1, r2, r3, r4, r5, r6)
            r8.disposeOnCompletion(r0)
            return
    }

    private final /* synthetic */ void set_parentHandle$volatile(java.lang.Object r1) {
            r0 = this;
            r0._parentHandle$volatile = r1
            return
    }

    private final /* synthetic */ void set_state$volatile(java.lang.Object r1) {
            r0 = this;
            r0._state$volatile = r1
            return
    }

    private final int startInternal(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.Empty
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L25
            r0 = r5
            kotlinx.coroutines.Empty r0 = (kotlinx.coroutines.Empty) r0
            boolean r0 = r0.isActive()
            if (r0 == 0) goto L12
            return r3
        L12:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_state$volatile$FU()
            kotlinx.coroutines.Empty r3 = kotlinx.coroutines.JobSupportKt.access$getEMPTY_ACTIVE$p()
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r4, r5, r3)
            if (r0 != 0) goto L21
            return r1
        L21:
            r4.onStart()
            return r2
        L25:
            boolean r0 = r5 instanceof kotlinx.coroutines.InactiveNodeList
            if (r0 == 0) goto L3f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_state$volatile$FU()
            r3 = r5
            kotlinx.coroutines.InactiveNodeList r3 = (kotlinx.coroutines.InactiveNodeList) r3
            kotlinx.coroutines.NodeList r3 = r3.getList()
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r4, r5, r3)
            if (r0 != 0) goto L3b
            return r1
        L3b:
            r4.onStart()
            return r2
        L3f:
            return r3
    }

    private final java.lang.String stateString(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.JobSupport.Finishing
            java.lang.String r1 = "Active"
            if (r0 == 0) goto L20
            r0 = r3
            kotlinx.coroutines.JobSupport$Finishing r0 = (kotlinx.coroutines.JobSupport.Finishing) r0
            boolean r0 = r0.isCancelling()
            if (r0 == 0) goto L13
            java.lang.String r1 = "Cancelling"
            goto L3a
        L13:
            r0 = r3
            kotlinx.coroutines.JobSupport$Finishing r0 = (kotlinx.coroutines.JobSupport.Finishing) r0
            boolean r0 = r0.isCompleting()
            if (r0 == 0) goto L1f
            java.lang.String r1 = "Completing"
            goto L3a
        L1f:
            goto L3a
        L20:
            boolean r0 = r3 instanceof kotlinx.coroutines.Incomplete
            if (r0 == 0) goto L31
            r0 = r3
            kotlinx.coroutines.Incomplete r0 = (kotlinx.coroutines.Incomplete) r0
            boolean r0 = r0.isActive()
            if (r0 == 0) goto L2e
            goto L3a
        L2e:
            java.lang.String r1 = "New"
            goto L3a
        L31:
            boolean r0 = r3 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r0 == 0) goto L38
            java.lang.String r1 = "Cancelled"
            goto L3a
        L38:
            java.lang.String r1 = "Completed"
        L3a:
            return r1
    }

    public static /* synthetic */ java.util.concurrent.CancellationException toCancellationException$default(kotlinx.coroutines.JobSupport r0, java.lang.Throwable r1, java.lang.String r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lc
            r3 = r3 & 1
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            java.util.concurrent.CancellationException r0 = r0.toCancellationException(r1, r2)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: toCancellationException"
            r0.<init>(r1)
            throw r0
    }

    private final boolean tryFinalizeSimpleState(kotlinx.coroutines.Incomplete r5, java.lang.Object r6) {
            r4 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1e
            r0 = 0
            boolean r3 = r5 instanceof kotlinx.coroutines.Empty
            if (r3 != 0) goto L14
            boolean r3 = r5 instanceof kotlinx.coroutines.JobNode
            if (r3 == 0) goto L12
            goto L14
        L12:
            r0 = r1
            goto L15
        L14:
            r0 = r2
        L15:
            if (r0 == 0) goto L18
            goto L1e
        L18:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L1e:
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L30
            r0 = 0
            boolean r3 = r6 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r3 != 0) goto L2a
            goto L30
        L2a:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L30:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_state$volatile$FU()
            java.lang.Object r3 = kotlinx.coroutines.JobSupportKt.boxIncomplete(r6)
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r4, r5, r3)
            if (r0 != 0) goto L3f
            return r1
        L3f:
            r0 = 0
            r4.onCancelling(r0)
            r4.onCompletionInternal(r6)
            r4.completeStateFinalization(r5, r6)
            return r2
    }

    private final boolean tryMakeCancelling(kotlinx.coroutines.Incomplete r5, java.lang.Throwable r6) {
            r4 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L12
            r0 = 0
            boolean r1 = r5 instanceof kotlinx.coroutines.JobSupport.Finishing
            if (r1 != 0) goto Lc
            goto L12
        Lc:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L12:
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L26
            r0 = 0
            boolean r0 = r5.isActive()
            if (r0 == 0) goto L20
            goto L26
        L20:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L26:
            kotlinx.coroutines.NodeList r0 = r4.getOrPromoteCancellingList(r5)
            r1 = 0
            if (r0 != 0) goto L2e
            return r1
        L2e:
            kotlinx.coroutines.JobSupport$Finishing r2 = new kotlinx.coroutines.JobSupport$Finishing
            r2.<init>(r0, r1, r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = get_state$volatile$FU()
            boolean r3 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r3, r4, r5, r2)
            if (r3 != 0) goto L3e
            return r1
        L3e:
            r4.notifyCancelling(r0, r6)
            r1 = 1
            return r1
    }

    private final java.lang.Object tryMakeCompleting(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.Incomplete
            if (r0 != 0) goto L9
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            return r0
        L9:
            boolean r0 = r2 instanceof kotlinx.coroutines.Empty
            if (r0 != 0) goto L11
            boolean r0 = r2 instanceof kotlinx.coroutines.JobNode
            if (r0 == 0) goto L28
        L11:
            boolean r0 = r2 instanceof kotlinx.coroutines.ChildHandleNode
            if (r0 != 0) goto L28
            boolean r0 = r3 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r0 != 0) goto L28
            r0 = r2
            kotlinx.coroutines.Incomplete r0 = (kotlinx.coroutines.Incomplete) r0
            boolean r0 = r1.tryFinalizeSimpleState(r0, r3)
            if (r0 == 0) goto L23
            return r3
        L23:
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()
            return r0
        L28:
            r0 = r2
            kotlinx.coroutines.Incomplete r0 = (kotlinx.coroutines.Incomplete) r0
            java.lang.Object r0 = r1.tryMakeCompletingSlowPath(r0, r3)
            return r0
    }

    private final java.lang.Object tryMakeCompletingSlowPath(kotlinx.coroutines.Incomplete r14, java.lang.Object r15) {
            r13 = this;
            kotlinx.coroutines.NodeList r0 = r13.getOrPromoteCancellingList(r14)
            if (r0 != 0) goto Lb
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()
            return r0
        Lb:
            boolean r1 = r14 instanceof kotlinx.coroutines.JobSupport.Finishing
            r2 = 0
            if (r1 == 0) goto L14
            r1 = r14
            kotlinx.coroutines.JobSupport$Finishing r1 = (kotlinx.coroutines.JobSupport.Finishing) r1
            goto L15
        L14:
            r1 = r2
        L15:
            r3 = 0
            if (r1 != 0) goto L1d
            kotlinx.coroutines.JobSupport$Finishing r1 = new kotlinx.coroutines.JobSupport$Finishing
            r1.<init>(r0, r3, r2)
        L1d:
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            r5 = 0
            r6 = 0
            monitor-enter(r1)
            r7 = 0
            boolean r8 = r1.isCompleting()     // Catch: java.lang.Throwable -> Lab
            if (r8 == 0) goto L33
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r1)
            return r2
        L33:
            r8 = 1
            r1.setCompleting(r8)     // Catch: java.lang.Throwable -> Lab
            if (r1 == r14) goto L49
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = get_state$volatile$FU()     // Catch: java.lang.Throwable -> Lab
            boolean r9 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r9, r13, r14, r1)     // Catch: java.lang.Throwable -> Lab
            if (r9 != 0) goto L49
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r1)
            return r2
        L49:
            boolean r9 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()     // Catch: java.lang.Throwable -> Lab
            if (r9 == 0) goto L5d
            r9 = 0
            boolean r10 = r1.isSealed()     // Catch: java.lang.Throwable -> Lab
            if (r10 != 0) goto L57
            goto L5d
        L57:
            java.lang.AssertionError r2 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> Lab
            r2.<init>()     // Catch: java.lang.Throwable -> Lab
            throw r2     // Catch: java.lang.Throwable -> Lab
        L5d:
            boolean r9 = r1.isCancelling()     // Catch: java.lang.Throwable -> Lab
            boolean r10 = r15 instanceof kotlinx.coroutines.CompletedExceptionally     // Catch: java.lang.Throwable -> Lab
            if (r10 == 0) goto L69
            r10 = r15
            kotlinx.coroutines.CompletedExceptionally r10 = (kotlinx.coroutines.CompletedExceptionally) r10     // Catch: java.lang.Throwable -> Lab
            goto L6a
        L69:
            r10 = r2
        L6a:
            if (r10 == 0) goto L72
            r11 = 0
            java.lang.Throwable r12 = r10.cause     // Catch: java.lang.Throwable -> Lab
            r1.addExceptionLocked(r12)     // Catch: java.lang.Throwable -> Lab
        L72:
            java.lang.Throwable r10 = r1.getRootCause()     // Catch: java.lang.Throwable -> Lab
            r11 = r10
            r12 = 0
            if (r9 != 0) goto L7b
            r3 = r8
        L7b:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> Lab
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> Lab
            if (r3 == 0) goto L86
            r2 = r10
        L86:
            r4.element = r2     // Catch: java.lang.Throwable -> Lab
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r1)
            T r2 = r4.element
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            if (r2 == 0) goto L97
            r3 = 0
            r13.notifyCancelling(r0, r2)
        L97:
            kotlinx.coroutines.ChildHandleNode r2 = r13.firstChild(r14)
            if (r2 == 0) goto La6
            boolean r3 = r13.tryWaitForChild(r1, r2, r15)
            if (r3 == 0) goto La6
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            return r3
        La6:
            java.lang.Object r3 = r13.finalizeFinishingState(r1, r15)
            return r3
        Lab:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    private final boolean tryWaitForChild(kotlinx.coroutines.JobSupport.Finishing r8, kotlinx.coroutines.ChildHandleNode r9, java.lang.Object r10) {
            r7 = this;
        L1:
            kotlinx.coroutines.ChildJob r0 = r9.childJob
            r1 = r0
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            kotlinx.coroutines.JobSupport$ChildCompletion r0 = new kotlinx.coroutines.JobSupport$ChildCompletion
            r0.<init>(r7, r8, r9, r10)
            r4 = r0
            kotlinx.coroutines.InternalCompletionHandler r4 = (kotlinx.coroutines.InternalCompletionHandler) r4
            r5 = 1
            r6 = 0
            r2 = 0
            r3 = 0
            kotlinx.coroutines.DisposableHandle r0 = kotlinx.coroutines.JobKt.invokeOnCompletion$default(r1, r2, r3, r4, r5, r6)
            kotlinx.coroutines.NonDisposableHandle r1 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            if (r0 == r1) goto L1d
            r1 = 1
            return r1
        L1d:
            r1 = r9
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            kotlinx.coroutines.ChildHandleNode r1 = r7.nextChild(r1)
            if (r1 != 0) goto L28
            r1 = 0
            return r1
        L28:
            r9 = r1
            goto L1
    }

    protected void afterCompletion(java.lang.Object r1) {
            r0 = this;
            return
    }

    @Override // kotlinx.coroutines.Job
    public final kotlinx.coroutines.ChildHandle attachChild(kotlinx.coroutines.ChildJob r7) {
            r6 = this;
            r0 = r6
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            kotlinx.coroutines.ChildHandleNode r1 = new kotlinx.coroutines.ChildHandleNode
            r1.<init>(r7)
            r3 = r1
            kotlinx.coroutines.InternalCompletionHandler r3 = (kotlinx.coroutines.InternalCompletionHandler) r3
            r4 = 2
            r5 = 0
            r1 = 1
            r2 = 0
            kotlinx.coroutines.DisposableHandle r0 = kotlinx.coroutines.JobKt.invokeOnCompletion$default(r0, r1, r2, r3, r4, r5)
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            kotlinx.coroutines.ChildHandle r0 = (kotlinx.coroutines.ChildHandle) r0
            return r0
    }

    protected final java.lang.Object awaitInternal(kotlin.coroutines.Continuation<java.lang.Object> r7) {
            r6 = this;
        L1:
            java.lang.Object r0 = r6.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto L2f
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L2a
            r1 = r0
            kotlinx.coroutines.CompletedExceptionally r1 = (kotlinx.coroutines.CompletedExceptionally) r1
            java.lang.Throwable r1 = r1.cause
            r2 = 0
            boolean r3 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r3 == 0) goto L29
            r3 = r7
            r4 = 0
            boolean r5 = r3 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r5 != 0) goto L21
            throw r1
        L21:
            r5 = r3
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r5 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r5
            java.lang.Throwable r5 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r1, r5)
            throw r5
        L29:
            throw r1
        L2a:
            java.lang.Object r1 = kotlinx.coroutines.JobSupportKt.unboxState(r0)
            return r1
        L2f:
            int r1 = r6.startInternal(r0)
            if (r1 < 0) goto L1
            java.lang.Object r0 = r6.awaitSuspend(r7)
            return r0
    }

    @Override // kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
            r0 = this;
            kotlinx.coroutines.Job.DefaultImpls.cancel(r0)
            return
    }

    @Override // kotlinx.coroutines.Job
    public void cancel(java.util.concurrent.CancellationException r7) {
            r6 = this;
            if (r7 != 0) goto L14
            r0 = 0
            r1 = 0
            r2 = 0
            kotlinx.coroutines.JobCancellationException r3 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r4 = access$cancellationExceptionMessage(r6)
            r5 = r6
            kotlinx.coroutines.Job r5 = (kotlinx.coroutines.Job) r5
            r3.<init>(r4, r1, r5)
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
            goto L15
        L14:
            r3 = r7
        L15:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r6.cancelInternal(r3)
            return
    }

    @Override // kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean cancel(java.lang.Throwable r8) {
            r7 = this;
            r0 = 1
            if (r8 == 0) goto La
            r1 = 0
            java.util.concurrent.CancellationException r1 = toCancellationException$default(r7, r8, r1, r0, r1)
            if (r1 != 0) goto L1c
        La:
            r1 = 0
            r2 = 0
            r3 = 0
            kotlinx.coroutines.JobCancellationException r4 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r5 = access$cancellationExceptionMessage(r7)
            r6 = r7
            kotlinx.coroutines.Job r6 = (kotlinx.coroutines.Job) r6
            r4.<init>(r5, r2, r6)
            r1 = r4
            java.util.concurrent.CancellationException r1 = (java.util.concurrent.CancellationException) r1
        L1c:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r7.cancelInternal(r1)
            return r0
    }

    public final boolean cancelCoroutine(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r1.cancelImpl$kotlinx_coroutines_core(r2)
            return r0
    }

    public final boolean cancelImpl$kotlinx_coroutines_core(java.lang.Object r4) {
            r3 = this;
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            boolean r1 = r3.getOnCancelComplete$kotlinx_coroutines_core()
            r2 = 1
            if (r1 == 0) goto L14
            java.lang.Object r0 = r3.cancelMakeCompleting(r4)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            if (r0 != r1) goto L14
            return r2
        L14:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            if (r0 != r1) goto L1e
            java.lang.Object r0 = r3.makeCancelling(r4)
        L1e:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            if (r0 != r1) goto L26
            goto L37
        L26:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            if (r0 != r1) goto L2b
            goto L37
        L2b:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.access$getTOO_LATE_TO_CANCEL$p()
            if (r0 != r1) goto L33
            r2 = 0
            goto L37
        L33:
            r3.afterCompletion(r0)
        L37:
            return r2
    }

    public void cancelInternal(java.lang.Throwable r1) {
            r0 = this;
            r0.cancelImpl$kotlinx_coroutines_core(r1)
            return
    }

    protected java.lang.String cancellationExceptionMessage() {
            r1 = this;
            java.lang.String r0 = "Job was cancelled"
            return r0
    }

    public boolean childCancelled(java.lang.Throwable r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.util.concurrent.CancellationException
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = r2.cancelImpl$kotlinx_coroutines_core(r3)
            if (r0 == 0) goto L13
            boolean r0 = r2.getHandlesException$kotlinx_coroutines_core()
            if (r0 == 0) goto L13
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
    }

    public final kotlinx.coroutines.JobCancellationException defaultCancellationException$kotlinx_coroutines_core(java.lang.String r5, java.lang.Throwable r6) {
            r4 = this;
            r0 = 0
            kotlinx.coroutines.JobCancellationException r1 = new kotlinx.coroutines.JobCancellationException
            if (r5 != 0) goto La
            java.lang.String r2 = access$cancellationExceptionMessage(r4)
            goto Lb
        La:
            r2 = r5
        Lb:
            r3 = r4
            kotlinx.coroutines.Job r3 = (kotlinx.coroutines.Job) r3
            r1.<init>(r2, r6, r3)
            return r1
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r2, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> r3) {
            r1 = this;
            java.lang.Object r0 = kotlinx.coroutines.Job.DefaultImpls.fold(r1, r2, r3)
            return r0
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> r2) {
            r1 = this;
            kotlin.coroutines.CoroutineContext$Element r0 = kotlinx.coroutines.Job.DefaultImpls.get(r1, r2)
            return r0
    }

    @Override // kotlinx.coroutines.Job
    public final java.util.concurrent.CancellationException getCancellationException() {
            r5 = this;
            java.lang.Object r0 = r5.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.JobSupport.Finishing
            java.lang.String r2 = "Job is still new or active: "
            if (r1 == 0) goto L4c
            r1 = r0
            kotlinx.coroutines.JobSupport$Finishing r1 = (kotlinx.coroutines.JobSupport.Finishing) r1
            java.lang.Throwable r1 = r1.getRootCause()
            if (r1 == 0) goto L31
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r5)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " is cancelling"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.util.concurrent.CancellationException r1 = r5.toCancellationException(r1, r3)
            if (r1 == 0) goto L31
            goto L81
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L4c:
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto L82
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            r2 = 0
            if (r1 == 0) goto L60
            r1 = r0
            kotlinx.coroutines.CompletedExceptionally r1 = (kotlinx.coroutines.CompletedExceptionally) r1
            java.lang.Throwable r1 = r1.cause
            r3 = 1
            java.util.concurrent.CancellationException r1 = toCancellationException$default(r5, r1, r2, r3, r2)
            goto L81
        L60:
            kotlinx.coroutines.JobCancellationException r1 = new kotlinx.coroutines.JobCancellationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r5)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " has completed normally"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = r5
            kotlinx.coroutines.Job r4 = (kotlinx.coroutines.Job) r4
            r1.<init>(r3, r2, r4)
            java.util.concurrent.CancellationException r1 = (java.util.concurrent.CancellationException) r1
        L81:
            return r1
        L82:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Override // kotlinx.coroutines.ParentJob
    public java.util.concurrent.CancellationException getChildJobCancellationCause() {
            r5 = this;
            java.lang.Object r0 = r5.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.JobSupport.Finishing
            r2 = 0
            if (r1 == 0) goto L12
            r1 = r0
            kotlinx.coroutines.JobSupport$Finishing r1 = (kotlinx.coroutines.JobSupport.Finishing) r1
            java.lang.Throwable r1 = r1.getRootCause()
            goto L21
        L12:
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L1c
            r1 = r0
            kotlinx.coroutines.CompletedExceptionally r1 = (kotlinx.coroutines.CompletedExceptionally) r1
            java.lang.Throwable r1 = r1.cause
            goto L21
        L1c:
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto L4d
            r1 = r2
        L21:
            boolean r3 = r1 instanceof java.util.concurrent.CancellationException
            if (r3 == 0) goto L29
            r2 = r1
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L29:
            if (r2 != 0) goto L4c
            kotlinx.coroutines.JobCancellationException r2 = new kotlinx.coroutines.JobCancellationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Parent job is "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r5.stateString(r0)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = r5
            kotlinx.coroutines.Job r4 = (kotlinx.coroutines.Job) r4
            r2.<init>(r3, r1, r4)
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L4c:
            return r2
        L4d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot be cancelling child in this state: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Override // kotlinx.coroutines.Job
    public final kotlin.sequences.Sequence<kotlinx.coroutines.Job> getChildren() {
            r2 = this;
            kotlinx.coroutines.JobSupport$children$1 r0 = new kotlinx.coroutines.JobSupport$children$1
            r1 = 0
            r0.<init>(r2, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.sequence(r0)
            return r0
    }

    public final java.lang.Object getCompletedInternal$kotlinx_coroutines_core() {
            r3 = this;
            java.lang.Object r0 = r3.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto L17
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 != 0) goto L11
            java.lang.Object r1 = kotlinx.coroutines.JobSupportKt.unboxState(r0)
            return r1
        L11:
            r1 = r0
            kotlinx.coroutines.CompletedExceptionally r1 = (kotlinx.coroutines.CompletedExceptionally) r1
            java.lang.Throwable r1 = r1.cause
            throw r1
        L17:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This job has not completed yet"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    protected final java.lang.Throwable getCompletionCause() {
            r4 = this;
            java.lang.Object r0 = r4.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.JobSupport.Finishing
            java.lang.String r2 = "Job is still new or active: "
            if (r1 == 0) goto L2f
            r1 = r0
            kotlinx.coroutines.JobSupport$Finishing r1 = (kotlinx.coroutines.JobSupport.Finishing) r1
            java.lang.Throwable r1 = r1.getRootCause()
            if (r1 == 0) goto L14
            goto L3e
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L2f:
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto L3f
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L3d
            r1 = r0
            kotlinx.coroutines.CompletedExceptionally r1 = (kotlinx.coroutines.CompletedExceptionally) r1
            java.lang.Throwable r1 = r1.cause
            goto L3e
        L3d:
            r1 = 0
        L3e:
            return r1
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    protected final boolean getCompletionCauseHandled() {
            r3 = this;
            java.lang.Object r0 = r3.getState$kotlinx_coroutines_core()
            r1 = 0
            boolean r2 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r2 == 0) goto L14
            r2 = r0
            kotlinx.coroutines.CompletedExceptionally r2 = (kotlinx.coroutines.CompletedExceptionally) r2
            boolean r2 = r2.getHandled()
            if (r2 == 0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            return r2
    }

    public final java.lang.Throwable getCompletionExceptionOrNull() {
            r3 = this;
            java.lang.Object r0 = r3.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto Ld
            java.lang.Throwable r1 = r3.getExceptionOrNull(r0)
            return r1
        Ld:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This job has not completed yet"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public boolean getHandlesException$kotlinx_coroutines_core() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.CoroutineContext.Key<?> getKey() {
            r1 = this;
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            return r0
    }

    protected final kotlinx.coroutines.selects.SelectClause1<?> getOnAwaitInternal() {
            r7 = this;
            kotlinx.coroutines.selects.SelectClause1Impl r0 = new kotlinx.coroutines.selects.SelectClause1Impl
            kotlinx.coroutines.JobSupport$onAwaitInternal$1 r1 = kotlinx.coroutines.JobSupport$onAwaitInternal$1.INSTANCE
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            r2 = 3
            java.lang.Object r1 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r1, r2)
            kotlin.jvm.functions.Function3 r1 = (kotlin.jvm.functions.Function3) r1
            kotlinx.coroutines.JobSupport$onAwaitInternal$2 r3 = kotlinx.coroutines.JobSupport$onAwaitInternal$2.INSTANCE
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r4)
            java.lang.Object r2 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r3, r2)
            r3 = r2
            kotlin.jvm.functions.Function3 r3 = (kotlin.jvm.functions.Function3) r3
            r5 = 8
            r6 = 0
            r4 = 0
            r2 = r1
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            kotlinx.coroutines.selects.SelectClause1 r0 = (kotlinx.coroutines.selects.SelectClause1) r0
            return r0
    }

    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.Job
    public final kotlinx.coroutines.selects.SelectClause0 getOnJoin() {
            r6 = this;
            kotlinx.coroutines.selects.SelectClause0Impl r0 = new kotlinx.coroutines.selects.SelectClause0Impl
            kotlinx.coroutines.JobSupport$onJoin$1 r1 = kotlinx.coroutines.JobSupport$onJoin$1.INSTANCE
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            r2 = 3
            java.lang.Object r1 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r1, r2)
            r2 = r1
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
            r4 = 4
            r5 = 0
            r3 = 0
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            kotlinx.coroutines.selects.SelectClause0 r0 = (kotlinx.coroutines.selects.SelectClause0) r0
            return r0
    }

    @Override // kotlinx.coroutines.Job
    public kotlinx.coroutines.Job getParent() {
            r1 = this;
            kotlinx.coroutines.ChildHandle r0 = r1.getParentHandle$kotlinx_coroutines_core()
            if (r0 == 0) goto Lb
            kotlinx.coroutines.Job r0 = r0.getParent()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public final kotlinx.coroutines.ChildHandle getParentHandle$kotlinx_coroutines_core() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_parentHandle$volatile$FU()
            java.lang.Object r0 = r0.get(r1)
            kotlinx.coroutines.ChildHandle r0 = (kotlinx.coroutines.ChildHandle) r0
            return r0
    }

    public final java.lang.Object getState$kotlinx_coroutines_core() {
            r5 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_state$volatile$FU()
            r1 = r5
        L5:
            java.lang.Object r2 = r0.get(r5)
            r3 = 0
            boolean r4 = r2 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r4 != 0) goto Lf
            return r2
        Lf:
            r4 = r2
            kotlinx.coroutines.internal.OpDescriptor r4 = (kotlinx.coroutines.internal.OpDescriptor) r4
            r4.perform(r5)
            goto L5
    }

    protected boolean handleJobException(java.lang.Throwable r2) {
            r1 = this;
            r0 = 0
            return r0
    }

    public void handleOnCompletionException$kotlinx_coroutines_core(java.lang.Throwable r1) {
            r0 = this;
            throw r1
    }

    protected final void initParentJob(kotlinx.coroutines.Job r3) {
            r2 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L19
            r0 = 0
            kotlinx.coroutines.ChildHandle r1 = r2.getParentHandle$kotlinx_coroutines_core()
            if (r1 != 0) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            if (r1 == 0) goto L13
            goto L19
        L13:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L19:
            if (r3 != 0) goto L23
            kotlinx.coroutines.NonDisposableHandle r0 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            kotlinx.coroutines.ChildHandle r0 = (kotlinx.coroutines.ChildHandle) r0
            r2.setParentHandle$kotlinx_coroutines_core(r0)
            return
        L23:
            r3.start()
            r0 = r2
            kotlinx.coroutines.ChildJob r0 = (kotlinx.coroutines.ChildJob) r0
            kotlinx.coroutines.ChildHandle r0 = r3.attachChild(r0)
            r2.setParentHandle$kotlinx_coroutines_core(r0)
            boolean r1 = r2.isCompleted()
            if (r1 == 0) goto L40
            r0.dispose()
            kotlinx.coroutines.NonDisposableHandle r1 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            kotlinx.coroutines.ChildHandle r1 = (kotlinx.coroutines.ChildHandle) r1
            r2.setParentHandle$kotlinx_coroutines_core(r1)
        L40:
            return
    }

    @Override // kotlinx.coroutines.Job
    public final kotlinx.coroutines.DisposableHandle invokeOnCompletion(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r4) {
            r3 = this;
            kotlinx.coroutines.InternalCompletionHandler$UserSupplied r0 = new kotlinx.coroutines.InternalCompletionHandler$UserSupplied
            r0.<init>(r4)
            kotlinx.coroutines.InternalCompletionHandler r0 = (kotlinx.coroutines.InternalCompletionHandler) r0
            r1 = 0
            r2 = 1
            kotlinx.coroutines.DisposableHandle r0 = r3.invokeOnCompletionInternal$kotlinx_coroutines_core(r1, r2, r0)
            return r0
    }

    @Override // kotlinx.coroutines.Job
    public final kotlinx.coroutines.DisposableHandle invokeOnCompletion(boolean r2, boolean r3, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r4) {
            r1 = this;
            kotlinx.coroutines.InternalCompletionHandler$UserSupplied r0 = new kotlinx.coroutines.InternalCompletionHandler$UserSupplied
            r0.<init>(r4)
            kotlinx.coroutines.InternalCompletionHandler r0 = (kotlinx.coroutines.InternalCompletionHandler) r0
            kotlinx.coroutines.DisposableHandle r0 = r1.invokeOnCompletionInternal$kotlinx_coroutines_core(r2, r3, r0)
            return r0
    }

    public final kotlinx.coroutines.DisposableHandle invokeOnCompletionInternal$kotlinx_coroutines_core(boolean r13, boolean r14, kotlinx.coroutines.InternalCompletionHandler r15) {
            r12 = this;
            kotlinx.coroutines.JobNode r0 = r12.makeNode(r15, r13)
            r1 = r12
            r2 = 0
        L6:
            java.lang.Object r3 = r1.getState$kotlinx_coroutines_core()
            r4 = 0
            boolean r5 = r3 instanceof kotlinx.coroutines.Empty
            if (r5 == 0) goto L30
            r5 = r3
            kotlinx.coroutines.Empty r5 = (kotlinx.coroutines.Empty) r5
            boolean r5 = r5.isActive()
            if (r5 == 0) goto L28
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = get_state$volatile$FU()
            boolean r5 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r5, r12, r3, r0)
            if (r5 == 0) goto L9c
            r5 = r0
            kotlinx.coroutines.DisposableHandle r5 = (kotlinx.coroutines.DisposableHandle) r5
            return r5
        L28:
            r5 = r3
            kotlinx.coroutines.Empty r5 = (kotlinx.coroutines.Empty) r5
            r12.promoteEmptyToNodeList(r5)
            goto L9c
        L30:
            boolean r5 = r3 instanceof kotlinx.coroutines.Incomplete
            if (r5 == 0) goto L9f
            r5 = r3
            kotlinx.coroutines.Incomplete r5 = (kotlinx.coroutines.Incomplete) r5
            kotlinx.coroutines.NodeList r5 = r5.getList()
            if (r5 != 0) goto L49
            java.lang.String r6 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r6)
            r6 = r3
            kotlinx.coroutines.JobNode r6 = (kotlinx.coroutines.JobNode) r6
            r12.promoteSingleToNodeList(r6)
            goto L9c
        L49:
            r6 = 0
            r7 = 0
            kotlinx.coroutines.NonDisposableHandle r7 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            if (r13 == 0) goto L87
            boolean r8 = r3 instanceof kotlinx.coroutines.JobSupport.Finishing
            if (r8 == 0) goto L87
            r8 = 0
            r9 = 0
            monitor-enter(r3)
            r10 = 0
            r11 = r3
            kotlinx.coroutines.JobSupport$Finishing r11 = (kotlinx.coroutines.JobSupport.Finishing) r11     // Catch: java.lang.Throwable -> L84
            java.lang.Throwable r11 = r11.getRootCause()     // Catch: java.lang.Throwable -> L84
            r6 = r11
            if (r6 == 0) goto L6f
            boolean r11 = r15 instanceof kotlinx.coroutines.ChildHandleNode     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L7f
            r11 = r3
            kotlinx.coroutines.JobSupport$Finishing r11 = (kotlinx.coroutines.JobSupport.Finishing) r11     // Catch: java.lang.Throwable -> L84
            boolean r11 = r11.isCompleting()     // Catch: java.lang.Throwable -> L84
            if (r11 != 0) goto L7f
        L6f:
            boolean r11 = r12.addLastAtomic(r3, r5, r0)     // Catch: java.lang.Throwable -> L84
            if (r11 != 0) goto L77
            monitor-exit(r3)
            goto L9d
        L77:
            if (r6 != 0) goto L7e
            r11 = r0
            kotlinx.coroutines.DisposableHandle r11 = (kotlinx.coroutines.DisposableHandle) r11     // Catch: java.lang.Throwable -> L84
            monitor-exit(r3)
            return r11
        L7e:
            r7 = r0
        L7f:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L84
            monitor-exit(r3)
            goto L87
        L84:
            r10 = move-exception
            monitor-exit(r3)
            throw r10
        L87:
            if (r6 == 0) goto L92
            if (r14 == 0) goto L8e
            r15.invoke(r6)
        L8e:
            r8 = r7
            kotlinx.coroutines.DisposableHandle r8 = (kotlinx.coroutines.DisposableHandle) r8
            return r8
        L92:
            boolean r8 = r12.addLastAtomic(r3, r5, r0)
            if (r8 == 0) goto L9c
            r8 = r0
            kotlinx.coroutines.DisposableHandle r8 = (kotlinx.coroutines.DisposableHandle) r8
            return r8
        L9c:
        L9d:
            goto L6
        L9f:
            if (r14 == 0) goto Lb2
            boolean r5 = r3 instanceof kotlinx.coroutines.CompletedExceptionally
            r6 = 0
            if (r5 == 0) goto Laa
            r5 = r3
            kotlinx.coroutines.CompletedExceptionally r5 = (kotlinx.coroutines.CompletedExceptionally) r5
            goto Lab
        Laa:
            r5 = r6
        Lab:
            if (r5 == 0) goto Laf
            java.lang.Throwable r6 = r5.cause
        Laf:
            r15.invoke(r6)
        Lb2:
            kotlinx.coroutines.NonDisposableHandle r5 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            kotlinx.coroutines.DisposableHandle r5 = (kotlinx.coroutines.DisposableHandle) r5
            return r5
    }

    @Override // kotlinx.coroutines.Job
    public boolean isActive() {
            r2 = this;
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 == 0) goto L13
            r1 = r0
            kotlinx.coroutines.Incomplete r1 = (kotlinx.coroutines.Incomplete) r1
            boolean r1 = r1.isActive()
            if (r1 == 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
            r2 = this;
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 != 0) goto L18
            boolean r1 = r0 instanceof kotlinx.coroutines.JobSupport.Finishing
            if (r1 == 0) goto L16
            r1 = r0
            kotlinx.coroutines.JobSupport$Finishing r1 = (kotlinx.coroutines.JobSupport.Finishing) r1
            boolean r1 = r1.isCancelling()
            if (r1 == 0) goto L16
            goto L18
        L16:
            r1 = 0
            goto L19
        L18:
            r1 = 1
        L19:
            return r1
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCompleted() {
            r1 = this;
            java.lang.Object r0 = r1.getState$kotlinx_coroutines_core()
            boolean r0 = r0 instanceof kotlinx.coroutines.Incomplete
            r0 = r0 ^ 1
            return r0
    }

    public final boolean isCompletedExceptionally() {
            r1 = this;
            java.lang.Object r0 = r1.getState$kotlinx_coroutines_core()
            boolean r0 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            return r0
    }

    protected boolean isScopedCoroutine() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.Job
    public final java.lang.Object join(kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r2 = this;
            boolean r0 = r2.joinInternal()
            if (r0 != 0) goto L10
            kotlin.coroutines.CoroutineContext r0 = r3.getContext()
            kotlinx.coroutines.JobKt.ensureActive(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L10:
            java.lang.Object r0 = r2.joinSuspend(r3)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L1b
            return r0
        L1b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    public final boolean makeCompleting$kotlinx_coroutines_core(java.lang.Object r8) {
            r7 = this;
            r0 = r7
            r1 = 0
        L2:
            java.lang.Object r2 = r0.getState$kotlinx_coroutines_core()
            r3 = 0
            java.lang.Object r4 = r7.tryMakeCompleting(r2, r8)
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            if (r4 != r5) goto L15
            r5 = 0
            return r5
        L15:
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            r6 = 1
            if (r4 != r5) goto L1b
            return r6
        L1b:
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()
            if (r4 == r5) goto L25
            r7.afterCompletion(r4)
            return r6
        L25:
            goto L2
    }

    public final java.lang.Object makeCompletingOnce$kotlinx_coroutines_core(java.lang.Object r9) {
            r8 = this;
            r0 = r8
            r1 = 0
        L2:
            java.lang.Object r2 = r0.getState$kotlinx_coroutines_core()
            r3 = 0
            java.lang.Object r4 = r8.tryMakeCompleting(r2, r9)
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            if (r4 == r5) goto L1b
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()
            if (r4 == r5) goto L1a
            return r4
        L1a:
            goto L2
        L1b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Job "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r7 = " is already complete or completing, but is being completed with "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r9)
            java.lang.String r6 = r6.toString()
            java.lang.Throwable r7 = r8.getExceptionOrNull(r9)
            r5.<init>(r6, r7)
            throw r5
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> r2) {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = kotlinx.coroutines.Job.DefaultImpls.minusKey(r1, r2)
            return r0
    }

    public java.lang.String nameString$kotlinx_coroutines_core() {
            r1 = this;
            java.lang.String r0 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r1)
            return r0
    }

    protected void onCancelling(java.lang.Throwable r1) {
            r0 = this;
            return
    }

    protected void onCompletionInternal(java.lang.Object r1) {
            r0 = this;
            return
    }

    protected void onStart() {
            r0 = this;
            return
    }

    @Override // kotlinx.coroutines.ChildJob
    public final void parentCancelled(kotlinx.coroutines.ParentJob r1) {
            r0 = this;
            r0.cancelImpl$kotlinx_coroutines_core(r1)
            return
    }

    @Override // kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext r2) {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = kotlinx.coroutines.Job.DefaultImpls.plus(r1, r2)
            return r0
    }

    @Override // kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    public kotlinx.coroutines.Job plus(kotlinx.coroutines.Job r2) {
            r1 = this;
            kotlinx.coroutines.Job r0 = kotlinx.coroutines.Job.DefaultImpls.plus(r1, r2)
            return r0
    }

    public final void removeNode$kotlinx_coroutines_core(kotlinx.coroutines.JobNode r7) {
            r6 = this;
            r0 = r6
            r1 = 0
        L2:
            java.lang.Object r2 = r0.getState$kotlinx_coroutines_core()
            r3 = 0
            boolean r4 = r2 instanceof kotlinx.coroutines.JobNode
            if (r4 == 0) goto L21
            if (r2 == r7) goto L10
            return
        L10:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = get_state$volatile$FU()
            kotlinx.coroutines.Empty r5 = kotlinx.coroutines.JobSupportKt.access$getEMPTY_ACTIVE$p()
            boolean r4 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r6, r2, r5)
            if (r4 == 0) goto L1f
            return
        L1f:
            goto L2
        L21:
            boolean r4 = r2 instanceof kotlinx.coroutines.Incomplete
            if (r4 == 0) goto L32
            r4 = r2
            kotlinx.coroutines.Incomplete r4 = (kotlinx.coroutines.Incomplete) r4
            kotlinx.coroutines.NodeList r4 = r4.getList()
            if (r4 == 0) goto L31
            r7.mo1711remove()
        L31:
            return
        L32:
            return
    }

    public final void setParentHandle$kotlinx_coroutines_core(kotlinx.coroutines.ChildHandle r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_parentHandle$volatile$FU()
            r0.set(r1, r2)
            return
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
            r5 = this;
            r0 = r5
            r1 = 0
        L2:
            java.lang.Object r2 = r0.getState$kotlinx_coroutines_core()
            r3 = 0
            int r4 = r5.startInternal(r2)
            switch(r4) {
                case 0: goto L13;
                case 1: goto L11;
                default: goto L10;
            }
        L10:
            goto L2
        L11:
            r4 = 1
            return r4
        L13:
            r4 = 0
            return r4
    }

    protected final java.util.concurrent.CancellationException toCancellationException(java.lang.Throwable r6, java.lang.String r7) {
            r5 = this;
            boolean r0 = r6 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L8
            r0 = r6
            java.util.concurrent.CancellationException r0 = (java.util.concurrent.CancellationException) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 != 0) goto L20
            r0 = r5
            r1 = 0
            kotlinx.coroutines.JobCancellationException r2 = new kotlinx.coroutines.JobCancellationException
            if (r7 != 0) goto L16
            java.lang.String r3 = access$cancellationExceptionMessage(r0)
            goto L17
        L16:
            r3 = r7
        L17:
            r4 = r0
            kotlinx.coroutines.Job r4 = (kotlinx.coroutines.Job) r4
            r2.<init>(r3, r6, r4)
            r0 = r2
            java.util.concurrent.CancellationException r0 = (java.util.concurrent.CancellationException) r0
        L20:
            return r0
    }

    public final java.lang.String toDebugString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.nameString$kotlinx_coroutines_core()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Object r1 = r2.getState$kotlinx_coroutines_core()
            java.lang.String r1 = r2.stateString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.toDebugString()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 64
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
