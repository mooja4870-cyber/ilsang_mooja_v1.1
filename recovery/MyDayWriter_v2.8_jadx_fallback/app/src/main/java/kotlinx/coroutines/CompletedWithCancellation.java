package kotlinx.coroutines;

/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B2\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012!\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0002\u0010\nJ\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J$\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004HÆ\u0003J:\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012#\b\u0002\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R+\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/CompletedWithCancellation;", "", "result", "onCancellation", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CompletedWithCancellation {
    public final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> onCancellation;
    public final java.lang.Object result;

    public CompletedWithCancellation(java.lang.Object r1, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r2) {
            r0 = this;
            r0.<init>()
            r0.result = r1
            r0.onCancellation = r2
            return
    }

    public static /* synthetic */ kotlinx.coroutines.CompletedWithCancellation copy$default(kotlinx.coroutines.CompletedWithCancellation r0, java.lang.Object r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.Object r1 = r0.result
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r2 = r0.onCancellation
        Lc:
            kotlinx.coroutines.CompletedWithCancellation r0 = r0.copy(r1, r2)
            return r0
    }

    public final java.lang.Object component1() {
            r1 = this;
            java.lang.Object r0 = r1.result
            return r0
    }

    public final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> component2() {
            r1 = this;
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r0 = r1.onCancellation
            return r0
    }

    public final kotlinx.coroutines.CompletedWithCancellation copy(java.lang.Object r2, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3) {
            r1 = this;
            kotlinx.coroutines.CompletedWithCancellation r0 = new kotlinx.coroutines.CompletedWithCancellation
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof kotlinx.coroutines.CompletedWithCancellation
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = r6
            kotlinx.coroutines.CompletedWithCancellation r1 = (kotlinx.coroutines.CompletedWithCancellation) r1
            java.lang.Object r3 = r5.result
            java.lang.Object r4 = r1.result
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L18
            return r2
        L18:
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r3 = r5.onCancellation
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r1 = r1.onCancellation
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
            if (r1 != 0) goto L23
            return r2
        L23:
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.Object r0 = r3.result
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            java.lang.Object r0 = r3.result
            int r0 = r0.hashCode()
        Lc:
            int r1 = r0 * 31
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r2 = r3.onCancellation
            int r2 = r2.hashCode()
            int r1 = r1 + r2
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CompletedWithCancellation(result="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Object r1 = r2.result
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", onCancellation="
            java.lang.StringBuilder r0 = r0.append(r1)
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r1 = r2.onCancellation
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
