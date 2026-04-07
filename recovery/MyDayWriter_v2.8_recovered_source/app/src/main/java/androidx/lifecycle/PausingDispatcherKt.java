package androidx.lifecycle;

/* JADX INFO: compiled from: PausingDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aD\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022'\u0010\u0003\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001aD\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\n2'\u0010\u0003\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001aD\u0010\f\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022'\u0010\u0003\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001aD\u0010\f\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\n2'\u0010\u0003\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001aD\u0010\r\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022'\u0010\u0003\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001aD\u0010\r\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\n2'\u0010\u0003\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001aL\u0010\u000e\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102'\u0010\u0003\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"whenCreated", "T", "Landroidx/lifecycle/Lifecycle;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/lifecycle/Lifecycle;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "whenResumed", "whenStarted", "whenStateAtLeast", "minState", "Landroidx/lifecycle/Lifecycle$State;", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lifecycle-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PausingDispatcherKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2, reason: invalid class name */
    /* JADX INFO: compiled from: PausingDispatcher.kt */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", i = {0}, l = {203}, m = "invokeSuspend", n = {"controller"}, s = {"L$0"})
    static final class AnonymousClass2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> $block;
        final /* synthetic */ androidx.lifecycle.Lifecycle.State $minState;
        final /* synthetic */ androidx.lifecycle.Lifecycle $this_whenStateAtLeast;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        AnonymousClass2(androidx.lifecycle.Lifecycle r2, androidx.lifecycle.Lifecycle.State r3, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r4, kotlin.coroutines.Continuation<? super androidx.lifecycle.PausingDispatcherKt.AnonymousClass2> r5) {
                r1 = this;
                r1.$this_whenStateAtLeast = r2
                r1.$minState = r3
                r1.$block = r4
                r0 = 2
                r1.<init>(r0, r5)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r5, kotlin.coroutines.Continuation<?> r6) {
                r4 = this;
                androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2 r0 = new androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2
                androidx.lifecycle.Lifecycle r1 = r4.$this_whenStateAtLeast
                androidx.lifecycle.Lifecycle$State r2 = r4.$minState
                kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> r3 = r4.$block
                r0.<init>(r1, r2, r3, r6)
                r0.L$0 = r5
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r2, java.lang.Object r3) {
                r1 = this;
                kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r3, kotlin.coroutines.Continuation<? super T> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2 r0 = (androidx.lifecycle.PausingDispatcherKt.AnonymousClass2) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.label
                switch(r1) {
                    case 0: goto L1f;
                    case 1: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L11:
                r0 = r8
                java.lang.Object r1 = r0.L$0
                androidx.lifecycle.LifecycleController r1 = (androidx.lifecycle.LifecycleController) r1
                kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L1d
                r4 = r1
                r1 = r0
                r0 = r9
                goto L5f
            L1d:
                r2 = move-exception
                goto L67
            L1f:
                kotlin.ResultKt.throwOnFailure(r9)
                r1 = r8
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
                kotlin.coroutines.CoroutineContext r3 = r2.getCoroutineContext()
                kotlinx.coroutines.Job$Key r4 = kotlinx.coroutines.Job.Key
                kotlin.coroutines.CoroutineContext$Key r4 = (kotlin.coroutines.CoroutineContext.Key) r4
                kotlin.coroutines.CoroutineContext$Element r3 = r3.get(r4)
                kotlinx.coroutines.Job r3 = (kotlinx.coroutines.Job) r3
                if (r3 == 0) goto L6b
                androidx.lifecycle.PausingDispatcher r2 = new androidx.lifecycle.PausingDispatcher
                r2.<init>()
                androidx.lifecycle.LifecycleController r4 = new androidx.lifecycle.LifecycleController
                androidx.lifecycle.Lifecycle r5 = r1.$this_whenStateAtLeast
                androidx.lifecycle.Lifecycle$State r6 = r1.$minState
                androidx.lifecycle.DispatchQueue r7 = r2.dispatchQueue
                r4.<init>(r5, r6, r7, r3)
                r3 = r2
                kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3     // Catch: java.lang.Throwable -> L64
                kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> r5 = r1.$block     // Catch: java.lang.Throwable -> L64
                r6 = r1
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6     // Catch: java.lang.Throwable -> L64
                r1.L$0 = r4     // Catch: java.lang.Throwable -> L64
                r7 = 1
                r1.label = r7     // Catch: java.lang.Throwable -> L64
                java.lang.Object r3 = kotlinx.coroutines.BuildersKt.withContext(r3, r5, r6)     // Catch: java.lang.Throwable -> L64
                if (r3 != r0) goto L5d
                return r0
            L5d:
                r0 = r9
                r9 = r3
            L5f:
                r4.finish()
                return r9
            L64:
                r2 = move-exception
                r0 = r1
                r1 = r4
            L67:
                r1.finish()
                throw r2
            L6b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "when[State] methods should have a parent job"
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
        }
    }

    @kotlin.Deprecated(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> java.lang.Object whenCreated(androidx.lifecycle.Lifecycle r1, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super T> r3) {
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.CREATED
            java.lang.Object r0 = whenStateAtLeast(r1, r0, r2, r3)
            return r0
    }

    @kotlin.Deprecated(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> java.lang.Object whenCreated(androidx.lifecycle.LifecycleOwner r1, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super T> r3) {
            androidx.lifecycle.Lifecycle r0 = r1.getLifecycle()
            java.lang.Object r0 = whenCreated(r0, r2, r3)
            return r0
    }

    @kotlin.Deprecated(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> java.lang.Object whenResumed(androidx.lifecycle.Lifecycle r1, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super T> r3) {
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.RESUMED
            java.lang.Object r0 = whenStateAtLeast(r1, r0, r2, r3)
            return r0
    }

    @kotlin.Deprecated(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> java.lang.Object whenResumed(androidx.lifecycle.LifecycleOwner r1, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super T> r3) {
            androidx.lifecycle.Lifecycle r0 = r1.getLifecycle()
            java.lang.Object r0 = whenResumed(r0, r2, r3)
            return r0
    }

    @kotlin.Deprecated(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> java.lang.Object whenStarted(androidx.lifecycle.Lifecycle r1, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super T> r3) {
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.STARTED
            java.lang.Object r0 = whenStateAtLeast(r1, r0, r2, r3)
            return r0
    }

    @kotlin.Deprecated(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> java.lang.Object whenStarted(androidx.lifecycle.LifecycleOwner r1, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super T> r3) {
            androidx.lifecycle.Lifecycle r0 = r1.getLifecycle()
            java.lang.Object r0 = whenStarted(r0, r2, r3)
            return r0
    }

    @kotlin.Deprecated(message = "whenStateAtLeast has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStateAtLeast for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> java.lang.Object whenStateAtLeast(androidx.lifecycle.Lifecycle r3, androidx.lifecycle.Lifecycle.State r4, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r5, kotlin.coroutines.Continuation<? super T> r6) {
            kotlinx.coroutines.MainCoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getMain()
            kotlinx.coroutines.MainCoroutineDispatcher r0 = r0.getImmediate()
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2 r1 = new androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2
            r2 = 0
            r1.<init>(r3, r4, r5, r2)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r0, r1, r6)
            return r0
    }
}
