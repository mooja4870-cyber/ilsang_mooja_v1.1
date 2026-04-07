package androidx.lifecycle;

/* JADX INFO: compiled from: Transformations.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class Transformations$sam$androidx_lifecycle_Observer$0 implements androidx.lifecycle.Observer, kotlin.jvm.internal.FunctionAdapter {
    private final /* synthetic */ kotlin.jvm.functions.Function1 function;

    Transformations$sam$androidx_lifecycle_Observer$0(kotlin.jvm.functions.Function1 r2) {
            r1 = this;
            java.lang.String r0 = "function"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.function = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof androidx.lifecycle.Observer
            r1 = 0
            if (r0 == 0) goto L18
            boolean r0 = r3 instanceof kotlin.jvm.internal.FunctionAdapter
            if (r0 == 0) goto L18
            kotlin.Function r0 = r2.getFunctionDelegate()
            r1 = r3
            kotlin.jvm.internal.FunctionAdapter r1 = (kotlin.jvm.internal.FunctionAdapter) r1
            kotlin.Function r1 = r1.getFunctionDelegate()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
        L18:
            return r1
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final kotlin.Function<?> getFunctionDelegate() {
            r1 = this;
            kotlin.jvm.functions.Function1 r0 = r1.function
            kotlin.Function r0 = (kotlin.Function) r0
            return r0
    }

    public final int hashCode() {
            r1 = this;
            kotlin.Function r0 = r1.getFunctionDelegate()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(java.lang.Object r2) {
            r1 = this;
            kotlin.jvm.functions.Function1 r0 = r1.function
            r0.invoke(r2)
            return
    }
}
