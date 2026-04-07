package kotlin.coroutines;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0007¨\u0006\b"}, d2 = {"getPolymorphicElement", "E", "Lkotlin/coroutines/CoroutineContext$Element;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusPolymorphicKey", "Lkotlin/coroutines/CoroutineContext;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CoroutineContextImplKt {
    public static final <E extends kotlin.coroutines.CoroutineContext.Element> E getPolymorphicElement(kotlin.coroutines.CoroutineContext.Element r3, kotlin.coroutines.CoroutineContext.Key<E> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r4 instanceof kotlin.coroutines.AbstractCoroutineContextKey
            r1 = 0
            if (r0 == 0) goto L29
            r0 = r4
            kotlin.coroutines.AbstractCoroutineContextKey r0 = (kotlin.coroutines.AbstractCoroutineContextKey) r0
            kotlin.coroutines.CoroutineContext$Key r2 = r3.getKey()
            boolean r0 = r0.isSubKey$kotlin_stdlib(r2)
            if (r0 == 0) goto L28
            r0 = r4
            kotlin.coroutines.AbstractCoroutineContextKey r0 = (kotlin.coroutines.AbstractCoroutineContextKey) r0
            kotlin.coroutines.CoroutineContext$Element r0 = r0.tryCast$kotlin_stdlib(r3)
            boolean r2 = r0 instanceof kotlin.coroutines.CoroutineContext.Element
            if (r2 == 0) goto L28
            r1 = r0
        L28:
            return r1
        L29:
            kotlin.coroutines.CoroutineContext$Key r0 = r3.getKey()
            if (r0 != r4) goto L30
            r1 = r3
        L30:
            return r1
    }

    public static final kotlin.coroutines.CoroutineContext minusPolymorphicKey(kotlin.coroutines.CoroutineContext.Element r2, kotlin.coroutines.CoroutineContext.Key<?> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r3 instanceof kotlin.coroutines.AbstractCoroutineContextKey
            if (r0 == 0) goto L2d
            r0 = r3
            kotlin.coroutines.AbstractCoroutineContextKey r0 = (kotlin.coroutines.AbstractCoroutineContextKey) r0
            kotlin.coroutines.CoroutineContext$Key r1 = r2.getKey()
            boolean r0 = r0.isSubKey$kotlin_stdlib(r1)
            if (r0 == 0) goto L29
            r0 = r3
            kotlin.coroutines.AbstractCoroutineContextKey r0 = (kotlin.coroutines.AbstractCoroutineContextKey) r0
            kotlin.coroutines.CoroutineContext$Element r0 = r0.tryCast$kotlin_stdlib(r2)
            if (r0 == 0) goto L29
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            goto L2c
        L29:
            r0 = r2
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
        L2c:
            return r0
        L2d:
            kotlin.coroutines.CoroutineContext$Key r0 = r2.getKey()
            if (r0 != r3) goto L38
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            goto L3b
        L38:
            r0 = r2
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
        L3b:
            return r0
    }
}
