package kotlin;

/* JADX INFO: compiled from: Result.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001\u001a+\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\bH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\t\u001a\u0084\u0001\u0010\n\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u00052!\u0010\f\u001a\u001d\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u0002H\u00060\r2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u0002H\u00060\rH\u0087\bø\u0001\u0000\u0082\u0002\u0014\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000¢\u0006\u0002\u0010\u0012\u001a0\u0010\u0013\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u0006\"\b\b\u0001\u0010\u000b*\u0002H\u0006*\b\u0012\u0004\u0012\u0002H\u000b0\u00052\u0006\u0010\u0014\u001a\u0002H\u0006H\u0087\b¢\u0006\u0002\u0010\u0015\u001a[\u0010\u0016\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u0006\"\b\b\u0001\u0010\u000b*\u0002H\u0006*\b\u0012\u0004\u0012\u0002H\u000b0\u00052!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u0002H\u00060\rH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010\u0017\u001a\u001e\u0010\u0018\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u0005H\u0087\b¢\u0006\u0002\u0010\u0019\u001a]\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u00052!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u0002H\u00060\rH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010\u0017\u001aP\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u00052!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u0002H\u00060\rH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001aW\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0005\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u00052!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u001e0\rH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010\u0017\u001aW\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0005\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u00052!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u001e0\rH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010\u0017\u001aa\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u0006\"\b\b\u0001\u0010\u000b*\u0002H\u0006*\b\u0012\u0004\u0012\u0002H\u000b0\u00052!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u0002H\u00060\rH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010\u0017\u001aT\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u0006\"\b\b\u0001\u0010\u000b*\u0002H\u0006*\b\u0012\u0004\u0012\u0002H\u000b0\u00052!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u0002H\u00060\rH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001a@\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0006*\u0002H\u000b2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\u00060\r¢\u0006\u0002\b!H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001a\u0015\u0010\"\u001a\u00020\u001e*\u0006\u0012\u0002\b\u00030\u0005H\u0001¢\u0006\u0002\u0010#\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006$"}, d2 = {"createFailure", "", "exception", "", "runCatching", "Lkotlin/Result;", "R", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "fold", "T", "onSuccess", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "value", "onFailure", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "getOrDefault", "defaultValue", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "getOrElse", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "getOrThrow", "(Ljava/lang/Object;)Ljava/lang/Object;", "map", "transform", "mapCatching", "action", "", "recover", "recoverCatching", "Lkotlin/ExtensionFunctionType;", "throwOnFailure", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ResultKt {
    public static final java.lang.Object createFailure(java.lang.Throwable r1) {
            java.lang.String r0 = "exception"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.Result$Failure r0 = new kotlin.Result$Failure
            r0.<init>(r1)
            return r0
    }

    private static final <R, T> R fold(java.lang.Object r2, kotlin.jvm.functions.Function1<? super T, ? extends R> r3, kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends R> r4) {
            java.lang.String r0 = "onSuccess"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "onFailure"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.Throwable r0 = kotlin.Result.m156exceptionOrNullimpl(r2)
            if (r0 != 0) goto L16
            java.lang.Object r1 = r3.invoke(r2)
            goto L1a
        L16:
            java.lang.Object r1 = r4.invoke(r0)
        L1a:
            return r1
    }

    private static final <R, T extends R> R getOrDefault(java.lang.Object r1, R r2) {
            boolean r0 = kotlin.Result.m159isFailureimpl(r1)
            if (r0 == 0) goto L7
            return r2
        L7:
            return r1
    }

    private static final <R, T extends R> R getOrElse(java.lang.Object r2, kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends R> r3) {
            java.lang.String r0 = "onFailure"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.Throwable r0 = kotlin.Result.m156exceptionOrNullimpl(r2)
            if (r0 != 0) goto Le
            r1 = r2
            goto L12
        Le:
            java.lang.Object r1 = r3.invoke(r0)
        L12:
            return r1
    }

    private static final <T> T getOrThrow(java.lang.Object r0) {
            throwOnFailure(r0)
            return r0
    }

    private static final <R, T> java.lang.Object map(java.lang.Object r1, kotlin.jvm.functions.Function1<? super T, ? extends R> r2) {
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = kotlin.Result.m160isSuccessimpl(r1)
            if (r0 == 0) goto L18
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r0 = r2.invoke(r1)
            java.lang.Object r0 = kotlin.Result.m153constructorimpl(r0)
            goto L1c
        L18:
            java.lang.Object r0 = kotlin.Result.m153constructorimpl(r1)
        L1c:
            return r0
    }

    private static final <R, T> java.lang.Object mapCatching(java.lang.Object r3, kotlin.jvm.functions.Function1<? super T, ? extends R> r4) {
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = kotlin.Result.m160isSuccessimpl(r3)
            if (r0 == 0) goto L25
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L19
            r0 = r3
            r1 = 0
            java.lang.Object r2 = r4.invoke(r0)     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = kotlin.Result.m153constructorimpl(r2)     // Catch: java.lang.Throwable -> L19
            goto L29
        L19:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m153constructorimpl(r0)
            goto L29
        L25:
            java.lang.Object r0 = kotlin.Result.m153constructorimpl(r3)
        L29:
            return r0
    }

    private static final <T> java.lang.Object onFailure(java.lang.Object r2, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3) {
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.Throwable r0 = kotlin.Result.m156exceptionOrNullimpl(r2)
            if (r0 == 0) goto L10
            r1 = 0
            r3.invoke(r0)
        L10:
            return r2
    }

    private static final <T> java.lang.Object onSuccess(java.lang.Object r1, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r2) {
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = kotlin.Result.m160isSuccessimpl(r1)
            if (r0 == 0) goto Lf
            r2.invoke(r1)
        Lf:
            return r1
    }

    private static final <R, T extends R> java.lang.Object recover(java.lang.Object r2, kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends R> r3) {
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.Throwable r0 = kotlin.Result.m156exceptionOrNullimpl(r2)
            if (r0 != 0) goto Le
            r1 = r2
            goto L18
        Le:
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r1 = r3.invoke(r0)
            java.lang.Object r1 = kotlin.Result.m153constructorimpl(r1)
        L18:
            return r1
    }

    private static final <R, T extends R> java.lang.Object recoverCatching(java.lang.Object r4, kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends R> r5) {
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.Throwable r0 = kotlin.Result.m156exceptionOrNullimpl(r4)
            if (r0 != 0) goto Ld
            r1 = r4
            goto L25
        Ld:
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L1a
            r1 = r4
            r2 = 0
            java.lang.Object r3 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = kotlin.Result.m153constructorimpl(r3)     // Catch: java.lang.Throwable -> L1a
            goto L25
        L1a:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r1 = createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m153constructorimpl(r1)
        L25:
            return r1
    }

    private static final <T, R> java.lang.Object runCatching(T r2, kotlin.jvm.functions.Function1<? super T, ? extends R> r3) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L11
            java.lang.Object r0 = r3.invoke(r2)     // Catch: java.lang.Throwable -> L11
            java.lang.Object r0 = kotlin.Result.m153constructorimpl(r0)     // Catch: java.lang.Throwable -> L11
            goto L1d
        L11:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r1 = createFailure(r0)
            java.lang.Object r1 = kotlin.Result.m153constructorimpl(r1)
            r0 = r1
        L1d:
            return r0
    }

    private static final <R> java.lang.Object runCatching(kotlin.jvm.functions.Function0<? extends R> r2) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L11
            java.lang.Object r0 = r2.invoke()     // Catch: java.lang.Throwable -> L11
            java.lang.Object r0 = kotlin.Result.m153constructorimpl(r0)     // Catch: java.lang.Throwable -> L11
            goto L1d
        L11:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r1 = createFailure(r0)
            java.lang.Object r1 = kotlin.Result.m153constructorimpl(r1)
            r0 = r1
        L1d:
            return r0
    }

    public static final void throwOnFailure(java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlin.Result.Failure
            if (r0 != 0) goto L5
            return
        L5:
            r0 = r1
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0
            java.lang.Throwable r0 = r0.exception
            throw r0
    }
}
