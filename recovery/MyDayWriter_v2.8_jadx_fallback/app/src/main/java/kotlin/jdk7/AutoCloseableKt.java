package kotlin.jdk7;

/* JADX INFO: compiled from: AutoCloseableJVM.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\u000e\b\u0004\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0087\bø\u0001\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0001\u001aH\u0010\t\u001a\u0002H\n\"\n\b\u0000\u0010\u000b*\u0004\u0018\u00010\u0001\"\u0004\b\u0001\u0010\n*\u0002H\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\n0\rH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u000e*\u001a\b\u0007\u0010\u0000\"\u00020\u00012\u00020\u0001B\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"AutoCloseable", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeAction", "Lkotlin/Function0;", "", "closeFinally", "cause", "", "use", "R", "T", "block", "Lkotlin/Function1;", "(Ljava/lang/AutoCloseable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlin/SinceKotlin;", "version", "2.0", "kotlin-stdlib-jdk7"}, k = 2, mv = {1, 9, 0}, pn = "kotlin", xi = 48)
public final class AutoCloseableKt {


    private static final java.lang.AutoCloseable AutoCloseable(kotlin.jvm.functions.Function0<kotlin.Unit> r1) {
            java.lang.String r0 = "closeAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.jdk7.AutoCloseableKt$AutoCloseable$1 r0 = new kotlin.jdk7.AutoCloseableKt$AutoCloseable$1
            r0.<init>(r1)
            java.lang.AutoCloseable r0 = (java.lang.AutoCloseable) r0
            return r0
    }

    public static /* synthetic */ void AutoCloseable$annotations() {
            return
    }

    public static final void closeFinally(java.lang.AutoCloseable r1, java.lang.Throwable r2) {
            if (r1 == 0) goto L12
            if (r2 != 0) goto L9
            androidx.core.content.res.FontResourcesParserCompat$$ExternalSyntheticAutoCloseableDispatcher0.m(r1)
            goto L12
        L9:
            androidx.core.content.res.FontResourcesParserCompat$$ExternalSyntheticAutoCloseableDispatcher0.m(r1)     // Catch: java.lang.Throwable -> Le
            goto L12
        Le:
            r0 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r2, r0)
        L12:
            return
    }

    private static final <T extends java.lang.AutoCloseable, R> R use(T r2, kotlin.jvm.functions.Function1<? super T, ? extends R> r3) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            java.lang.Object r1 = r3.invoke(r2)     // Catch: java.lang.Throwable -> L10
            closeFinally(r2, r0)
            return r1
        L10:
            r1 = move-exception
            r0 = r1
            throw r1     // Catch: java.lang.Throwable -> L14
        L14:
            r1 = move-exception
            closeFinally(r2, r0)
            throw r1
    }
}
