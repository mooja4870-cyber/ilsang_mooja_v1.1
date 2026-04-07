package androidx.activity;

/* JADX INFO: compiled from: FullyDrawnReporter.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u001c\u0010\u0003\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0086H¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"reportWhenComplete", "", "Landroidx/activity/FullyDrawnReporter;", "reporter", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Landroidx/activity/FullyDrawnReporter;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activity_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FullyDrawnReporterKt {

    /* JADX INFO: renamed from: androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1, reason: invalid class name */
    /* JADX INFO: compiled from: FullyDrawnReporter.kt */
    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.activity.FullyDrawnReporterKt", f = "FullyDrawnReporter.kt", i = {0}, l = {173}, m = "reportWhenComplete", n = {"$this$reportWhenComplete"}, s = {"L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super androidx.activity.FullyDrawnReporterKt.AnonymousClass1> r1) {
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
                java.lang.Object r0 = androidx.activity.FullyDrawnReporterKt.reportWhenComplete(r0, r0, r1)
                return r0
        }
    }

    public static final java.lang.Object reportWhenComplete(androidx.activity.FullyDrawnReporter r5, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            boolean r0 = r7 instanceof androidx.activity.FullyDrawnReporterKt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r7
            androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 r0 = (androidx.activity.FullyDrawnReporterKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 r0 = new androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1
            r0.<init>(r7)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L37;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2c:
            r5 = 0
            java.lang.Object r6 = r0.L$0
            androidx.activity.FullyDrawnReporter r6 = (androidx.activity.FullyDrawnReporter) r6
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Throwable -> L35
            goto L56
        L35:
            r2 = move-exception
            goto L61
        L37:
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = 0
            r5.addReporter()
            boolean r4 = r5.isFullyDrawnReported()
            if (r4 == 0) goto L47
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L47:
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L5e
            r4 = 1
            r0.label = r4     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r4 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L5e
            if (r4 != r2) goto L54
            return r2
        L54:
            r6 = r5
            r5 = r3
        L56:
            r6.removeReporter()
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L5e:
            r2 = move-exception
            r6 = r5
            r5 = r3
        L61:
            r6.removeReporter()
            throw r2
    }

    private static final java.lang.Object reportWhenComplete$$forInline(androidx.activity.FullyDrawnReporter r2, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r0 = 0
            r2.addReporter()
            boolean r1 = r2.isFullyDrawnReported()
            if (r1 == 0) goto Ld
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        Ld:
            r3.invoke(r4)     // Catch: java.lang.Throwable -> L18
            r2.removeReporter()
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L18:
            r1 = move-exception
            r2.removeReporter()
            throw r1
    }
}
