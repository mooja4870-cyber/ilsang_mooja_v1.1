package kotlin.jvm.optionals;

/* JADX INFO: compiled from: Optionals.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0000\u001a$\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0004H\u0007\u001a,\u0010\u0005\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\f\u0012\b\b\u0001\u0012\u0004\b\u0002H\u00020\u00042\u0006\u0010\u0006\u001a\u0002H\u0002H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001aC\u0010\b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\f\u0012\b\b\u0001\u0012\u0004\b\u0002H\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0087\bø\u0001\u0001ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010\n\u001a#\u0010\u000b\u001a\u0004\u0018\u0001H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0007¢\u0006\u0002\u0010\f\u001a;\u0010\r\u001a\u0002H\u000e\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0010\b\u0001\u0010\u000e*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u000f*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0010\u001a\u0002H\u000eH\u0007¢\u0006\u0002\u0010\u0011\u001a$\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0013\"\b\b\u0000\u0010\u0002*\u00020\u0003*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0004H\u0007\u001a$\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0015\"\b\b\u0000\u0010\u0002*\u00020\u0003*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0004H\u0007\u0082\u0002\u000b\n\u0002\b9\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"asSequence", "Lkotlin/sequences/Sequence;", "T", "", "Ljava/util/Optional;", "getOrDefault", "defaultValue", "(Ljava/util/Optional;Ljava/lang/Object;)Ljava/lang/Object;", "getOrElse", "Lkotlin/Function0;", "(Ljava/util/Optional;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getOrNull", "(Ljava/util/Optional;)Ljava/lang/Object;", "toCollection", "C", "", "destination", "(Ljava/util/Optional;Ljava/util/Collection;)Ljava/util/Collection;", "toList", "", "toSet", "", "kotlin-stdlib-jdk8"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class OptionalsKt {
    public static final <T> kotlin.sequences.Sequence<T> asSequence(java.util.Optional<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.isPresent()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r1.get()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.sequenceOf(r0)
            goto L1c
        L18:
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.emptySequence()
        L1c:
            return r0
    }

    public static final <T> T getOrDefault(java.util.Optional<? extends T> r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.isPresent()
            if (r0 == 0) goto L10
            java.lang.Object r0 = r1.get()
            goto L11
        L10:
            r0 = r2
        L11:
            return r0
    }

    public static final <T> T getOrElse(java.util.Optional<? extends T> r2, kotlin.jvm.functions.Function0<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            boolean r1 = r2.isPresent()
            if (r1 == 0) goto L17
            java.lang.Object r1 = r2.get()
            goto L1b
        L17:
            java.lang.Object r1 = r3.invoke()
        L1b:
            return r1
    }

    public static final <T> T getOrNull(java.util.Optional<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 0
            java.lang.Object r0 = r1.orElse(r0)
            return r0
    }

    public static final <T, C extends java.util.Collection<? super T>> C toCollection(java.util.Optional<T> r2, C r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r2.isPresent()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r2.get()
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r3.add(r0)
        L1c:
            return r3
    }

    public static final <T> java.util.List<T> toList(java.util.Optional<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.isPresent()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r1.get()
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            goto L18
        L14:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L18:
            return r0
    }

    public static final <T> java.util.Set<T> toSet(java.util.Optional<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.isPresent()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r1.get()
            java.util.Set r0 = kotlin.collections.SetsKt.setOf(r0)
            goto L18
        L14:
            java.util.Set r0 = kotlin.collections.SetsKt.emptySet()
        L18:
            return r0
    }
}
