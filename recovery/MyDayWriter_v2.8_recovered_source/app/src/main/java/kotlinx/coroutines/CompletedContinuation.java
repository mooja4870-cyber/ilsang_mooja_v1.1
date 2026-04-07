package kotlinx.coroutines;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001BZ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012%\b\u0002\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J&\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J`\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042%\b\u0002\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u001a\u0010\u001d\u001a\u00020\u000b2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001f2\u0006\u0010\n\u001a\u00020\u0007J\t\u0010 \u001a\u00020!HÖ\u0001R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R-\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lkotlinx/coroutines/CompletedContinuation;", "", "result", "cancelHandler", "Lkotlinx/coroutines/CancelHandler;", "onCancellation", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "idempotentResume", "cancelCause", "(Ljava/lang/Object;Lkotlinx/coroutines/CancelHandler;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Throwable;)V", "cancelled", "", "getCancelled", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "invokeHandlers", "cont", "Lkotlinx/coroutines/CancellableContinuationImpl;", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class CompletedContinuation {
    public final java.lang.Throwable cancelCause;
    public final kotlinx.coroutines.CancelHandler cancelHandler;
    public final java.lang.Object idempotentResume;
    public final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> onCancellation;
    public final java.lang.Object result;

    public CompletedContinuation(java.lang.Object r1, kotlinx.coroutines.CancelHandler r2, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3, java.lang.Object r4, java.lang.Throwable r5) {
            r0 = this;
            r0.<init>()
            r0.result = r1
            r0.cancelHandler = r2
            r0.onCancellation = r3
            r0.idempotentResume = r4
            r0.cancelCause = r5
            return
    }

    public /* synthetic */ CompletedContinuation(java.lang.Object r2, kotlinx.coroutines.CancelHandler r3, kotlin.jvm.functions.Function1 r4, java.lang.Object r5, java.lang.Throwable r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
            r1 = this;
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto L6
            r3 = r0
        L6:
            r8 = r7 & 4
            if (r8 == 0) goto Lb
            r4 = r0
        Lb:
            r8 = r7 & 8
            if (r8 == 0) goto L10
            r5 = r0
        L10:
            r7 = r7 & 16
            if (r7 == 0) goto L16
            r7 = r0
            goto L17
        L16:
            r7 = r6
        L17:
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            return
    }

    public static /* synthetic */ kotlinx.coroutines.CompletedContinuation copy$default(kotlinx.coroutines.CompletedContinuation r0, java.lang.Object r1, kotlinx.coroutines.CancelHandler r2, kotlin.jvm.functions.Function1 r3, java.lang.Object r4, java.lang.Throwable r5, int r6, java.lang.Object r7) {
            r7 = r6 & 1
            if (r7 == 0) goto L6
            java.lang.Object r1 = r0.result
        L6:
            r7 = r6 & 2
            if (r7 == 0) goto Lc
            kotlinx.coroutines.CancelHandler r2 = r0.cancelHandler
        Lc:
            r7 = r6 & 4
            if (r7 == 0) goto L12
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r3 = r0.onCancellation
        L12:
            r7 = r6 & 8
            if (r7 == 0) goto L18
            java.lang.Object r4 = r0.idempotentResume
        L18:
            r6 = r6 & 16
            if (r6 == 0) goto L1e
            java.lang.Throwable r5 = r0.cancelCause
        L1e:
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r2 = r0
            r3 = r1
            kotlinx.coroutines.CompletedContinuation r0 = r2.copy(r3, r4, r5, r6, r7)
            return r0
    }

    public final java.lang.Object component1() {
            r1 = this;
            java.lang.Object r0 = r1.result
            return r0
    }

    public final kotlinx.coroutines.CancelHandler component2() {
            r1 = this;
            kotlinx.coroutines.CancelHandler r0 = r1.cancelHandler
            return r0
    }

    public final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> component3() {
            r1 = this;
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r0 = r1.onCancellation
            return r0
    }

    public final java.lang.Object component4() {
            r1 = this;
            java.lang.Object r0 = r1.idempotentResume
            return r0
    }

    public final java.lang.Throwable component5() {
            r1 = this;
            java.lang.Throwable r0 = r1.cancelCause
            return r0
    }

    public final kotlinx.coroutines.CompletedContinuation copy(java.lang.Object r7, kotlinx.coroutines.CancelHandler r8, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r9, java.lang.Object r10, java.lang.Throwable r11) {
            r6 = this;
            kotlinx.coroutines.CompletedContinuation r0 = new kotlinx.coroutines.CompletedContinuation
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof kotlinx.coroutines.CompletedContinuation
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = r6
            kotlinx.coroutines.CompletedContinuation r1 = (kotlinx.coroutines.CompletedContinuation) r1
            java.lang.Object r3 = r5.result
            java.lang.Object r4 = r1.result
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L18
            return r2
        L18:
            kotlinx.coroutines.CancelHandler r3 = r5.cancelHandler
            kotlinx.coroutines.CancelHandler r4 = r1.cancelHandler
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L23
            return r2
        L23:
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r3 = r5.onCancellation
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r4 = r1.onCancellation
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L2e
            return r2
        L2e:
            java.lang.Object r3 = r5.idempotentResume
            java.lang.Object r4 = r1.idempotentResume
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L39
            return r2
        L39:
            java.lang.Throwable r3 = r5.cancelCause
            java.lang.Throwable r1 = r1.cancelCause
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
            if (r1 != 0) goto L44
            return r2
        L44:
            return r0
    }

    public final boolean getCancelled() {
            r1 = this;
            java.lang.Throwable r0 = r1.cancelCause
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.Object r0 = r4.result
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Ld
        L7:
            java.lang.Object r0 = r4.result
            int r0 = r0.hashCode()
        Ld:
            int r2 = r0 * 31
            kotlinx.coroutines.CancelHandler r3 = r4.cancelHandler
            if (r3 != 0) goto L15
            r3 = r1
            goto L1b
        L15:
            kotlinx.coroutines.CancelHandler r3 = r4.cancelHandler
            int r3 = r3.hashCode()
        L1b:
            int r2 = r2 + r3
            int r0 = r2 * 31
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r3 = r4.onCancellation
            if (r3 != 0) goto L24
            r3 = r1
            goto L2a
        L24:
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r3 = r4.onCancellation
            int r3 = r3.hashCode()
        L2a:
            int r0 = r0 + r3
            int r2 = r0 * 31
            java.lang.Object r3 = r4.idempotentResume
            if (r3 != 0) goto L33
            r3 = r1
            goto L39
        L33:
            java.lang.Object r3 = r4.idempotentResume
            int r3 = r3.hashCode()
        L39:
            int r2 = r2 + r3
            int r0 = r2 * 31
            java.lang.Throwable r3 = r4.cancelCause
            if (r3 != 0) goto L41
            goto L47
        L41:
            java.lang.Throwable r1 = r4.cancelCause
            int r1 = r1.hashCode()
        L47:
            int r0 = r0 + r1
            return r0
    }

    public final void invokeHandlers(kotlinx.coroutines.CancellableContinuationImpl<?> r3, java.lang.Throwable r4) {
            r2 = this;
            kotlinx.coroutines.CancelHandler r0 = r2.cancelHandler
            if (r0 == 0) goto L8
            r1 = 0
            r3.callCancelHandler(r0, r4)
        L8:
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r0 = r2.onCancellation
            if (r0 == 0) goto L10
            r1 = 0
            r3.callOnCancellation(r0, r4)
        L10:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CompletedContinuation(result="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Object r1 = r2.result
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", cancelHandler="
            java.lang.StringBuilder r0 = r0.append(r1)
            kotlinx.coroutines.CancelHandler r1 = r2.cancelHandler
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", onCancellation="
            java.lang.StringBuilder r0 = r0.append(r1)
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r1 = r2.onCancellation
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", idempotentResume="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Object r1 = r2.idempotentResume
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", cancelCause="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Throwable r1 = r2.cancelCause
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
