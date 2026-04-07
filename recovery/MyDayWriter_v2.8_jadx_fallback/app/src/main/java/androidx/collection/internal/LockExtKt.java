package androidx.collection.internal;

/* JADX INFO: compiled from: LockExt.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0080\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0006"}, d2 = {"synchronized", "T", "Landroidx/collection/internal/Lock;", "block", "Lkotlin/Function0;", "(Landroidx/collection/internal/Lock;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LockExtKt {
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final <T> T m44synchronized(androidx.collection.internal.Lock r4, kotlin.jvm.functions.Function0<? extends T> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            r1 = r4
            r2 = 0
            monitor-enter(r1)
            java.lang.Object r3 = r5.invoke()     // Catch: java.lang.Throwable -> L15
            monitor-exit(r1)
            return r3
        L15:
            r3 = move-exception
            monitor-exit(r1)
            throw r3
    }
}
