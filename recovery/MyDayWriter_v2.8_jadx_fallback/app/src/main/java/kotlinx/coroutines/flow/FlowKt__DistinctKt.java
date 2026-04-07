package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Distinct.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u0007\u001aT\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u000726\u0010\t\u001a2\u0012\u0013\u0012\u0011H\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u0011H\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00030\u0001\u001a6\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u000f*\b\u0012\u0004\u0012\u0002H\b0\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u000f0\u0005\u001au\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00072\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u0002H\b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00052:\u0010\t\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00030\u0001H\u0002¢\u0006\u0002\b\u0011\"$\u0010\u0000\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001e\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"defaultAreEquivalent", "Lkotlin/Function2;", "", "", "defaultKeySelector", "Lkotlin/Function1;", "distinctUntilChanged", "Lkotlinx/coroutines/flow/Flow;", "T", "areEquivalent", "Lkotlin/ParameterName;", "name", "old", "new", "distinctUntilChangedBy", "K", "keySelector", "distinctUntilChangedBy$FlowKt__DistinctKt", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__DistinctKt {
    private static final kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> defaultAreEquivalent = null;
    private static final kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Object> defaultKeySelector = null;

    static {
            kotlinx.coroutines.flow.FlowKt__DistinctKt$defaultKeySelector$1 r0 = kotlinx.coroutines.flow.FlowKt__DistinctKt$defaultKeySelector$1.INSTANCE
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            kotlinx.coroutines.flow.FlowKt__DistinctKt.defaultKeySelector = r0
            kotlinx.coroutines.flow.FlowKt__DistinctKt$defaultAreEquivalent$1 r0 = kotlinx.coroutines.flow.FlowKt__DistinctKt$defaultAreEquivalent$1.INSTANCE
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            kotlinx.coroutines.flow.FlowKt__DistinctKt.defaultAreEquivalent = r0
            return
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> distinctUntilChanged(kotlinx.coroutines.flow.Flow<? extends T> r2) {
            boolean r0 = r2 instanceof kotlinx.coroutines.flow.StateFlow
            if (r0 == 0) goto L7
            r0 = r2
            goto Lf
        L7:
            kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Object> r0 = kotlinx.coroutines.flow.FlowKt__DistinctKt.defaultKeySelector
            kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> r1 = kotlinx.coroutines.flow.FlowKt__DistinctKt.defaultAreEquivalent
            kotlinx.coroutines.flow.Flow r0 = distinctUntilChangedBy$FlowKt__DistinctKt(r2, r0, r1)
        Lf:
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> distinctUntilChanged(kotlinx.coroutines.flow.Flow<? extends T> r2, kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Boolean> r3) {
            kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Object> r0 = kotlinx.coroutines.flow.FlowKt__DistinctKt.defaultKeySelector
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r1)
            r1 = 2
            java.lang.Object r1 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r3, r1)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            kotlinx.coroutines.flow.Flow r0 = distinctUntilChangedBy$FlowKt__DistinctKt(r2, r0, r1)
            return r0
    }

    public static final <T, K> kotlinx.coroutines.flow.Flow<T> distinctUntilChangedBy(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function1<? super T, ? extends K> r2) {
            kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> r0 = kotlinx.coroutines.flow.FlowKt__DistinctKt.defaultAreEquivalent
            kotlinx.coroutines.flow.Flow r0 = distinctUntilChangedBy$FlowKt__DistinctKt(r1, r2, r0)
            return r0
    }

    private static final <T> kotlinx.coroutines.flow.Flow<T> distinctUntilChangedBy$FlowKt__DistinctKt(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> r2, kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> r3) {
            boolean r0 = r1 instanceof kotlinx.coroutines.flow.DistinctFlowImpl
            if (r0 == 0) goto L15
            r0 = r1
            kotlinx.coroutines.flow.DistinctFlowImpl r0 = (kotlinx.coroutines.flow.DistinctFlowImpl) r0
            kotlin.jvm.functions.Function1<T, java.lang.Object> r0 = r0.keySelector
            if (r0 != r2) goto L15
            r0 = r1
            kotlinx.coroutines.flow.DistinctFlowImpl r0 = (kotlinx.coroutines.flow.DistinctFlowImpl) r0
            kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> r0 = r0.areEquivalent
            if (r0 != r3) goto L15
            r0 = r1
            goto L1c
        L15:
            kotlinx.coroutines.flow.DistinctFlowImpl r0 = new kotlinx.coroutines.flow.DistinctFlowImpl
            r0.<init>(r1, r2, r3)
            kotlinx.coroutines.flow.Flow r0 = (kotlinx.coroutines.flow.Flow) r0
        L1c:
            return r0
    }
}
