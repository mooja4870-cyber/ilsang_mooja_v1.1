package kotlin.io;

/* JADX INFO: compiled from: Closeable.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0001\u001aH\u0010\u0005\u001a\u0002H\u0006\"\n\b\u0000\u0010\u0007*\u0004\u0018\u00010\u0002\"\u0004\b\u0001\u0010\u0006*\u0002H\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u00060\tH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"closeFinally", "", "Ljava/io/Closeable;", "cause", "", "use", "R", "T", "block", "Lkotlin/Function1;", "(Ljava/io/Closeable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CloseableKt {
    public static final void closeFinally(java.io.Closeable r1, java.lang.Throwable r2) {
            if (r1 == 0) goto L12
            if (r2 != 0) goto L9
            r1.close()
            goto L12
        L9:
            r1.close()     // Catch: java.lang.Throwable -> Le
            goto L12
        Le:
            r0 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r2, r0)
        L12:
            return
    }

    private static final <T extends java.io.Closeable, R> R use(T r4, kotlin.jvm.functions.Function1<? super T, ? extends R> r5) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            r1 = 0
            r2 = 1
            java.lang.Object r3 = r5.invoke(r4)     // Catch: java.lang.Throwable -> L20
            boolean r1 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r2, r2, r1)
            if (r1 == 0) goto L19
            closeFinally(r4, r0)
            goto L1e
        L19:
            if (r4 == 0) goto L1e
            r4.close()
        L1e:
            return r3
        L20:
            r3 = move-exception
            r0 = r3
            throw r3     // Catch: java.lang.Throwable -> L24
        L24:
            r3 = move-exception
            boolean r1 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r2, r2, r1)
            if (r1 != 0) goto L35
            if (r4 == 0) goto L38
        L2f:
            r4.close()     // Catch: java.lang.Throwable -> L33
            goto L38
        L33:
            r1 = move-exception
            goto L38
        L35:
            closeFinally(r4, r0)
        L38:
            throw r3
    }
}
