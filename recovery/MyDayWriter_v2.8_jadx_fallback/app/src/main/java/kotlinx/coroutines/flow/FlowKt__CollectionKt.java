package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Collection.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010#\n\u0002\b\u0002\u001a8\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0010\b\u0001\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0001H\u0086@¢\u0006\u0002\u0010\u0006\u001a4\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0086@¢\u0006\u0002\u0010\n\u001a4\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\rH\u0086@¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"toCollection", "C", "T", "", "Lkotlinx/coroutines/flow/Flow;", "destination", "(Lkotlinx/coroutines/flow/Flow;Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toList", "", "", "(Lkotlinx/coroutines/flow/Flow;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toSet", "", "", "(Lkotlinx/coroutines/flow/Flow;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__CollectionKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1, reason: invalid class name */
    /* JADX INFO: compiled from: Collection.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", i = {0}, l = {22}, m = "toCollection", n = {"destination"}, s = {"L$0"})
    static final class AnonymousClass1<T, C extends java.util.Collection<? super T>> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__CollectionKt.AnonymousClass1> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.toCollection(r0, r0, r1)
                return r0
        }
    }


    public static final <T, C extends java.util.Collection<? super T>> java.lang.Object toCollection(kotlinx.coroutines.flow.Flow<? extends T> r4, C r5, kotlin.coroutines.Continuation<? super C> r6) {
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__CollectionKt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1 r0 = (kotlinx.coroutines.flow.FlowKt__CollectionKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1 r0 = new kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L34;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2c:
            java.lang.Object r4 = r0.L$0
            java.util.Collection r4 = (java.util.Collection) r4
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4b
        L34:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$2 r2 = new kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$2
            r2.<init>(r5)
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            r0.L$0 = r5
            r3 = 1
            r0.label = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L4a
            return r1
        L4a:
            r4 = r5
        L4b:
            return r4
    }

    public static final <T> java.lang.Object toList(kotlinx.coroutines.flow.Flow<? extends T> r1, java.util.List<T> r2, kotlin.coroutines.Continuation<? super java.util.List<? extends T>> r3) {
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.toCollection(r1, r0, r3)
            return r0
    }

    public static /* synthetic */ java.lang.Object toList$default(kotlinx.coroutines.flow.Flow r0, java.util.List r1, kotlin.coroutines.Continuation r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto Lb
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r1 = (java.util.List) r1
        Lb:
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.toList(r0, r1, r2)
            return r0
    }

    public static final <T> java.lang.Object toSet(kotlinx.coroutines.flow.Flow<? extends T> r1, java.util.Set<T> r2, kotlin.coroutines.Continuation<? super java.util.Set<? extends T>> r3) {
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.toCollection(r1, r0, r3)
            return r0
    }

    public static /* synthetic */ java.lang.Object toSet$default(kotlinx.coroutines.flow.Flow r0, java.util.Set r1, kotlin.coroutines.Continuation r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto Lb
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.Set r1 = (java.util.Set) r1
        Lb:
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.toSet(r0, r1, r2)
            return r0
    }
}
