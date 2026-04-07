package kotlin.coroutines;

/* JADX INFO: compiled from: ContinuationInterceptor.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ(\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u0096\u0002¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\bH&J\u0014\u0010\u000b\u001a\u00020\f2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¨\u0006\u0010"}, d2 = {"Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlin/coroutines/CoroutineContext$Element;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "interceptContinuation", "Lkotlin/coroutines/Continuation;", "T", "continuation", "minusKey", "Lkotlin/coroutines/CoroutineContext;", "releaseInterceptedContinuation", "", "Key", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ContinuationInterceptor extends kotlin.coroutines.CoroutineContext.Element {
    public static final kotlin.coroutines.ContinuationInterceptor.Key Key = null;

    /* JADX INFO: compiled from: ContinuationInterceptor.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <R> R fold(kotlin.coroutines.ContinuationInterceptor r1, R r2, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> r3) {
                java.lang.String r0 = "operation"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = r1
                kotlin.coroutines.CoroutineContext$Element r0 = (kotlin.coroutines.CoroutineContext.Element) r0
                java.lang.Object r0 = kotlin.coroutines.CoroutineContext.Element.DefaultImpls.fold(r0, r2, r3)
                return r0
        }

        public static <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.ContinuationInterceptor r3, kotlin.coroutines.CoroutineContext.Key<E> r4) {
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                boolean r0 = r4 instanceof kotlin.coroutines.AbstractCoroutineContextKey
                r1 = 0
                if (r0 == 0) goto L27
                r0 = r4
                kotlin.coroutines.AbstractCoroutineContextKey r0 = (kotlin.coroutines.AbstractCoroutineContextKey) r0
                kotlin.coroutines.CoroutineContext$Key r2 = r3.getKey()
                boolean r0 = r0.isSubKey$kotlin_stdlib(r2)
                if (r0 == 0) goto L26
                r0 = r4
                kotlin.coroutines.AbstractCoroutineContextKey r0 = (kotlin.coroutines.AbstractCoroutineContextKey) r0
                r2 = r3
                kotlin.coroutines.CoroutineContext$Element r2 = (kotlin.coroutines.CoroutineContext.Element) r2
                kotlin.coroutines.CoroutineContext$Element r0 = r0.tryCast$kotlin_stdlib(r2)
                boolean r2 = r0 instanceof kotlin.coroutines.CoroutineContext.Element
                if (r2 == 0) goto L26
                r1 = r0
            L26:
                return r1
            L27:
                kotlin.coroutines.ContinuationInterceptor$Key r0 = kotlin.coroutines.ContinuationInterceptor.Key
                if (r0 != r4) goto L33
                java.lang.String r0 = "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r0)
                r1 = r3
                kotlin.coroutines.CoroutineContext$Element r1 = (kotlin.coroutines.CoroutineContext.Element) r1
            L33:
                return r1
        }

        public static kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.ContinuationInterceptor r2, kotlin.coroutines.CoroutineContext.Key<?> r3) {
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                boolean r0 = r3 instanceof kotlin.coroutines.AbstractCoroutineContextKey
                if (r0 == 0) goto L2b
                r0 = r3
                kotlin.coroutines.AbstractCoroutineContextKey r0 = (kotlin.coroutines.AbstractCoroutineContextKey) r0
                kotlin.coroutines.CoroutineContext$Key r1 = r2.getKey()
                boolean r0 = r0.isSubKey$kotlin_stdlib(r1)
                if (r0 == 0) goto L27
                r0 = r3
                kotlin.coroutines.AbstractCoroutineContextKey r0 = (kotlin.coroutines.AbstractCoroutineContextKey) r0
                r1 = r2
                kotlin.coroutines.CoroutineContext$Element r1 = (kotlin.coroutines.CoroutineContext.Element) r1
                kotlin.coroutines.CoroutineContext$Element r0 = r0.tryCast$kotlin_stdlib(r1)
                if (r0 == 0) goto L27
                kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
                kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
                goto L2a
            L27:
                r0 = r2
                kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            L2a:
                return r0
            L2b:
                kotlin.coroutines.ContinuationInterceptor$Key r0 = kotlin.coroutines.ContinuationInterceptor.Key
                if (r0 != r3) goto L34
                kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
                kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
                goto L37
            L34:
                r0 = r2
                kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            L37:
                return r0
        }

        public static kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.ContinuationInterceptor r1, kotlin.coroutines.CoroutineContext r2) {
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = r1
                kotlin.coroutines.CoroutineContext$Element r0 = (kotlin.coroutines.CoroutineContext.Element) r0
                kotlin.coroutines.CoroutineContext r0 = kotlin.coroutines.CoroutineContext.Element.DefaultImpls.plus(r0, r2)
                return r0
        }

        public static void releaseInterceptedContinuation(kotlin.coroutines.ContinuationInterceptor r1, kotlin.coroutines.Continuation<?> r2) {
                java.lang.String r0 = "continuation"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                return
        }
    }

    /* JADX INFO: compiled from: ContinuationInterceptor.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/ContinuationInterceptor$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlin/coroutines/ContinuationInterceptor;", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Key implements kotlin.coroutines.CoroutineContext.Key<kotlin.coroutines.ContinuationInterceptor> {
        static final /* synthetic */ kotlin.coroutines.ContinuationInterceptor.Key $$INSTANCE = null;

        static {
                kotlin.coroutines.ContinuationInterceptor$Key r0 = new kotlin.coroutines.ContinuationInterceptor$Key
                r0.<init>()
                kotlin.coroutines.ContinuationInterceptor.Key.$$INSTANCE = r0
                return
        }

        private Key() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlin.coroutines.ContinuationInterceptor$Key r0 = kotlin.coroutines.ContinuationInterceptor.Key.$$INSTANCE
            kotlin.coroutines.ContinuationInterceptor.Key = r0
            return
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> r1);

    <T> kotlin.coroutines.Continuation<T> interceptContinuation(kotlin.coroutines.Continuation<? super T> r1);

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> r1);

    void releaseInterceptedContinuation(kotlin.coroutines.Continuation<?> r1);
}
