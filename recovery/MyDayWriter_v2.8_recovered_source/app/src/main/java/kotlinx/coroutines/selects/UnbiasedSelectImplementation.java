package kotlinx.coroutines.selects;

/* JADX INFO: compiled from: SelectUnbiased.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0000H\u0091@¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0002J0\u0010\r\u001a\u00020\f*\u00020\u000e2\u001c\u0010\u000f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010H\u0096\u0002¢\u0006\u0002\u0010\u0013JB\u0010\r\u001a\u00020\f\"\u0004\b\u0001\u0010\u0014*\b\u0012\u0004\u0012\u0002H\u00140\u00152\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0016H\u0096\u0002¢\u0006\u0002\u0010\u0017JV\u0010\r\u001a\u00020\f\"\u0004\b\u0001\u0010\u0018\"\u0004\b\u0002\u0010\u0014*\u000e\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u00140\u00192\u0006\u0010\u001a\u001a\u0002H\u00182\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0016H\u0096\u0002¢\u0006\u0002\u0010\u001bR\u001e\u0010\u0006\u001a\u0012\u0012\u000e\u0012\f0\bR\b\u0012\u0004\u0012\u00028\u00000\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/selects/UnbiasedSelectImplementation;", "R", "Lkotlinx/coroutines/selects/SelectImplementation;", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "clausesToRegister", "", "Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;", "doSelect", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shuffleAndRegisterClauses", "", "invoke", "Lkotlinx/coroutines/selects/SelectClause0;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/selects/SelectClause0;Lkotlin/jvm/functions/Function1;)V", "Q", "Lkotlinx/coroutines/selects/SelectClause1;", "Lkotlin/Function2;", "(Lkotlinx/coroutines/selects/SelectClause1;Lkotlin/jvm/functions/Function2;)V", "P", "Lkotlinx/coroutines/selects/SelectClause2;", "param", "(Lkotlinx/coroutines/selects/SelectClause2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class UnbiasedSelectImplementation<R> extends kotlinx.coroutines.selects.SelectImplementation<R> {
    private final java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData> clausesToRegister;

    public UnbiasedSelectImplementation(kotlin.coroutines.CoroutineContext r2) {
            r1 = this;
            r1.<init>(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r1.clausesToRegister = r0
            return
    }

    static /* synthetic */ <R> java.lang.Object doSelect$suspendImpl(kotlinx.coroutines.selects.UnbiasedSelectImplementation<R> r1, kotlin.coroutines.Continuation<? super R> r2) {
            r1.shuffleAndRegisterClauses()
            java.lang.Object r0 = super.doSelect(r2)
            return r0
    }

    private final void shuffleAndRegisterClauses() {
            r10 = this;
            java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>$ClauseData> r0 = r10.clausesToRegister     // Catch: java.lang.Throwable -> L2f
            java.util.Collections.shuffle(r0)     // Catch: java.lang.Throwable -> L2f
            java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>$ClauseData> r0 = r10.clausesToRegister     // Catch: java.lang.Throwable -> L2f
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L2f
            r1 = 0
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L2f
        Lf:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L28
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2f
            r4 = r3
            kotlinx.coroutines.selects.SelectImplementation$ClauseData r4 = (kotlinx.coroutines.selects.SelectImplementation.ClauseData) r4     // Catch: java.lang.Throwable -> L2f
            r5 = 0
            r6 = r10
            kotlinx.coroutines.selects.SelectImplementation r6 = (kotlinx.coroutines.selects.SelectImplementation) r6     // Catch: java.lang.Throwable -> L2f
            r7 = 1
            r8 = 0
            r9 = 0
            kotlinx.coroutines.selects.SelectImplementation.register$default(r6, r4, r9, r7, r8)     // Catch: java.lang.Throwable -> L2f
            goto Lf
        L28:
            java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>$ClauseData> r0 = r10.clausesToRegister
            r0.clear()
            return
        L2f:
            r0 = move-exception
            java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>$ClauseData> r1 = r10.clausesToRegister
            r1.clear()
            throw r0
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation
    public java.lang.Object doSelect(kotlin.coroutines.Continuation<? super R> r2) {
            r1 = this;
            java.lang.Object r0 = doSelect$suspendImpl(r1, r2)
            return r0
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation, kotlinx.coroutines.selects.SelectBuilder
    public void invoke(kotlinx.coroutines.selects.SelectClause0 r10, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r11) {
            r9 = this;
            java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>$ClauseData> r0 = r9.clausesToRegister
            java.util.Collection r0 = (java.util.Collection) r0
            kotlinx.coroutines.selects.SelectImplementation$ClauseData r1 = new kotlinx.coroutines.selects.SelectImplementation$ClauseData
            r2 = r9
            kotlinx.coroutines.selects.SelectImplementation r2 = (kotlinx.coroutines.selects.SelectImplementation) r2
            java.lang.Object r3 = r10.getClauseObject()
            kotlin.jvm.functions.Function3 r4 = r10.getRegFunc()
            kotlin.jvm.functions.Function3 r5 = r10.getProcessResFunc()
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.selects.SelectKt.getPARAM_CLAUSE_0()
            kotlin.jvm.functions.Function3 r8 = r10.getOnCancellationConstructor()
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.add(r1)
            return
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation, kotlinx.coroutines.selects.SelectBuilder
    public <Q> void invoke(kotlinx.coroutines.selects.SelectClause1<? extends Q> r10, kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r11) {
            r9 = this;
            java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>$ClauseData> r0 = r9.clausesToRegister
            java.util.Collection r0 = (java.util.Collection) r0
            kotlinx.coroutines.selects.SelectImplementation$ClauseData r1 = new kotlinx.coroutines.selects.SelectImplementation$ClauseData
            r2 = r9
            kotlinx.coroutines.selects.SelectImplementation r2 = (kotlinx.coroutines.selects.SelectImplementation) r2
            java.lang.Object r3 = r10.getClauseObject()
            kotlin.jvm.functions.Function3 r4 = r10.getRegFunc()
            kotlin.jvm.functions.Function3 r5 = r10.getProcessResFunc()
            r6 = 0
            kotlin.jvm.functions.Function3 r8 = r10.getOnCancellationConstructor()
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.add(r1)
            return
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation, kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(kotlinx.coroutines.selects.SelectClause2<? super P, ? extends Q> r10, P r11, kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r12) {
            r9 = this;
            java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>$ClauseData> r0 = r9.clausesToRegister
            java.util.Collection r0 = (java.util.Collection) r0
            kotlinx.coroutines.selects.SelectImplementation$ClauseData r1 = new kotlinx.coroutines.selects.SelectImplementation$ClauseData
            r2 = r9
            kotlinx.coroutines.selects.SelectImplementation r2 = (kotlinx.coroutines.selects.SelectImplementation) r2
            java.lang.Object r3 = r10.getClauseObject()
            kotlin.jvm.functions.Function3 r4 = r10.getRegFunc()
            kotlin.jvm.functions.Function3 r5 = r10.getProcessResFunc()
            kotlin.jvm.functions.Function3 r8 = r10.getOnCancellationConstructor()
            r6 = r11
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.add(r1)
            return
    }
}
