package kotlin;

/* JADX INFO: compiled from: Synchronized.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a:\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0005H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"synchronized", "R", "lock", "", "block", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/StandardKt")
class StandardKt__SynchronizedKt extends kotlin.StandardKt__StandardKt {
    public StandardKt__SynchronizedKt() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    private static final <R> R m163synchronized(java.lang.Object r2, kotlin.jvm.functions.Function0<? extends R> r3) {
            java.lang.String r0 = "lock"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            monitor-enter(r0)
            java.lang.Object r1 = r3.invoke()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)
            return r1
        L14:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}
