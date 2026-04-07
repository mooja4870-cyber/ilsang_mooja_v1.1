package kotlinx.coroutines.selects;

/* JADX INFO: compiled from: OnTimeout.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0002R\u0017\u0010\u0005\u001a\u00020\u00068F¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/selects/OnTimeout;", "", "timeMillis", "", "(J)V", "selectClause", "Lkotlinx/coroutines/selects/SelectClause0;", "getSelectClause$annotations", "()V", "getSelectClause", "()Lkotlinx/coroutines/selects/SelectClause0;", "register", "", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "ignoredParam", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class OnTimeout {
    private final long timeMillis;

    public OnTimeout(long r1) {
            r0 = this;
            r0.<init>()
            r0.timeMillis = r1
            return
    }

    public static final /* synthetic */ void access$register(kotlinx.coroutines.selects.OnTimeout r0, kotlinx.coroutines.selects.SelectInstance r1, java.lang.Object r2) {
            r0.register(r1, r2)
            return
    }

    public static /* synthetic */ void getSelectClause$annotations() {
            return
    }

    private final void register(kotlinx.coroutines.selects.SelectInstance<?> r6, java.lang.Object r7) {
            r5 = this;
            long r0 = r5.timeMillis
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto Le
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r6.selectInRegistrationPhase(r0)
            return
        Le:
            r0 = 0
            kotlinx.coroutines.selects.OnTimeout$register$$inlined$Runnable$1 r1 = new kotlinx.coroutines.selects.OnTimeout$register$$inlined$Runnable$1
            r1.<init>(r6, r5)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r0)
            r0 = r6
            kotlinx.coroutines.selects.SelectImplementation r0 = (kotlinx.coroutines.selects.SelectImplementation) r0
            kotlin.coroutines.CoroutineContext r0 = r6.getContext()
            kotlinx.coroutines.Delay r2 = kotlinx.coroutines.DelayKt.getDelay(r0)
            long r3 = r5.timeMillis
            kotlinx.coroutines.DisposableHandle r2 = r2.invokeOnTimeout(r3, r1, r0)
            r6.disposeOnCompletion(r2)
            return
    }

    public final kotlinx.coroutines.selects.SelectClause0 getSelectClause() {
            r6 = this;
            kotlinx.coroutines.selects.SelectClause0Impl r0 = new kotlinx.coroutines.selects.SelectClause0Impl
            kotlinx.coroutines.selects.OnTimeout$selectClause$1 r1 = kotlinx.coroutines.selects.OnTimeout$selectClause$1.INSTANCE
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
}
