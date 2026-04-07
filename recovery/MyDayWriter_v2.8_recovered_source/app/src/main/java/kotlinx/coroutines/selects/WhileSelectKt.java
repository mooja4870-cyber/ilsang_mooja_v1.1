package kotlinx.coroutines.selects;

/* JADX INFO: compiled from: WhileSelect.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\u001f\b\u0004\u0010\u0002\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0006H\u0087H¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"whileSelect", "", "builder", "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/SelectBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class WhileSelectKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.WhileSelectKt$whileSelect$1, reason: invalid class name */
    /* JADX INFO: compiled from: WhileSelect.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.selects.WhileSelectKt", f = "WhileSelect.kt", i = {0}, l = {37}, m = "whileSelect", n = {"builder"}, s = {"L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.selects.WhileSelectKt.AnonymousClass1> r1) {
                r0 = this;
                r0.<init>(r1)
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
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.selects.WhileSelectKt.whileSelect(r0, r1)
                return r0
        }
    }

    public static final java.lang.Object whileSelect(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.SelectBuilder<? super java.lang.Boolean>, kotlin.Unit> r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
            boolean r0 = r9 instanceof kotlinx.coroutines.selects.WhileSelectKt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r9
            kotlinx.coroutines.selects.WhileSelectKt$whileSelect$1 r0 = (kotlinx.coroutines.selects.WhileSelectKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            kotlinx.coroutines.selects.WhileSelectKt$whileSelect$1 r0 = new kotlinx.coroutines.selects.WhileSelectKt$whileSelect$1
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L3c;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2c:
            r8 = 0
            r2 = 0
            r3 = 0
            java.lang.Object r4 = r0.L$0
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            kotlin.ResultKt.throwOnFailure(r9)
            r5 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r9
            goto L63
        L3c:
            kotlin.ResultKt.throwOnFailure(r9)
            r2 = 0
            r4 = r8
            r8 = r2
        L42:
            r2 = 0
            kotlinx.coroutines.selects.SelectImplementation r3 = new kotlinx.coroutines.selects.SelectImplementation
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()
            r3.<init>(r5)
            r5 = 0
            r4.invoke(r3)
            r0.L$0 = r4
            r6 = 1
            r0.label = r6
            java.lang.Object r3 = r3.doSelect(r0)
            if (r3 != r1) goto L5d
            return r1
        L5d:
            r7 = r0
            r0 = r9
            r9 = r3
            r3 = r2
            r2 = r1
            r1 = r7
        L63:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L70
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L70:
            r9 = r0
            r0 = r1
            r1 = r2
            goto L42
    }

    private static final java.lang.Object whileSelect$$forInline(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.SelectBuilder<? super java.lang.Boolean>, kotlin.Unit> r0, kotlin.coroutines.Continuation<? super kotlin.Unit> r1) {
            kotlinx.coroutines.selects.SelectImplementation r0 = new kotlinx.coroutines.selects.SelectImplementation
            r0 = 0
            r0.getContext()
            throw r0
    }
}
