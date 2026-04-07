package kotlin.streams.jdk8;

/* JADX INFO: compiled from: Streams.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u0005H\u0007\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0007H\u0007\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\b0\u0001\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\tH\u0007\u001a\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\t\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u0001H\u0007\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f*\u00020\u0003H\u0007\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f*\u00020\u0005H\u0007\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\u00020\u0007H\u0007\u001a\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\f\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\tH\u0007¨\u0006\r"}, d2 = {"asSequence", "Lkotlin/sequences/Sequence;", "", "Ljava/util/stream/DoubleStream;", "", "Ljava/util/stream/IntStream;", "", "Ljava/util/stream/LongStream;", "T", "Ljava/util/stream/Stream;", "asStream", "toList", "", "kotlin-stdlib-jdk8"}, k = 2, mv = {1, 9, 0}, pn = "kotlin.streams", xi = 48)
public final class StreamsKt {
    /* JADX INFO: renamed from: $r8$lambda$jBRaOqrA5A8aZRswyILQO-7uCm8, reason: not valid java name */
    public static /* synthetic */ java.util.Spliterator m1444$r8$lambda$jBRaOqrA5A8aZRswyILQO7uCm8(kotlin.sequences.Sequence r0) {
            java.util.Spliterator r0 = asStream$lambda$4(r0)
            return r0
    }

    public static final kotlin.sequences.Sequence<java.lang.Double> asSequence(java.util.stream.DoubleStream r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$4 r0 = new kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$4
            r0.<init>(r1)
            kotlin.sequences.Sequence r0 = (kotlin.sequences.Sequence) r0
            return r0
    }

    public static final kotlin.sequences.Sequence<java.lang.Integer> asSequence(java.util.stream.IntStream r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$2 r0 = new kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$2
            r0.<init>(r1)
            kotlin.sequences.Sequence r0 = (kotlin.sequences.Sequence) r0
            return r0
    }

    public static final kotlin.sequences.Sequence<java.lang.Long> asSequence(java.util.stream.LongStream r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$3 r0 = new kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$3
            r0.<init>(r1)
            kotlin.sequences.Sequence r0 = (kotlin.sequences.Sequence) r0
            return r0
    }

    public static final <T> kotlin.sequences.Sequence<T> asSequence(java.util.stream.Stream<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$1 r0 = new kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$1
            r0.<init>(r1)
            kotlin.sequences.Sequence r0 = (kotlin.sequences.Sequence) r0
            return r0
    }

    public static final <T> java.util.stream.Stream<T> asStream(kotlin.sequences.Sequence<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.streams.jdk8.StreamsKt$$ExternalSyntheticLambda0 r0 = new kotlin.streams.jdk8.StreamsKt$$ExternalSyntheticLambda0
            r0.<init>(r3)
            r1 = 16
            r2 = 0
            java.util.stream.Stream r0 = java.util.stream.StreamSupport.stream(r0, r1, r2)
            java.lang.String r1 = "stream(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.util.Spliterator asStream$lambda$4(kotlin.sequences.Sequence r2) {
            java.util.Iterator r0 = r2.iterator()
            r1 = 16
            java.util.Spliterator r0 = java.util.Spliterators.spliteratorUnknownSize(r0, r1)
            return r0
    }

    public static final java.util.List<java.lang.Double> toList(java.util.stream.DoubleStream r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            double[] r0 = r2.toArray()
            java.lang.String r1 = "toArray(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.List r0 = kotlin.collections.ArraysKt.asList(r0)
            return r0
    }

    public static final java.util.List<java.lang.Integer> toList(java.util.stream.IntStream r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int[] r0 = r2.toArray()
            java.lang.String r1 = "toArray(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.List r0 = kotlin.collections.ArraysKt.asList(r0)
            return r0
    }

    public static final java.util.List<java.lang.Long> toList(java.util.stream.LongStream r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            long[] r0 = r2.toArray()
            java.lang.String r1 = "toArray(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.List r0 = kotlin.collections.ArraysKt.asList(r0)
            return r0
    }

    public static final <T> java.util.List<T> toList(java.util.stream.Stream<T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.stream.Collector r0 = java.util.stream.Collectors.toList()
            java.lang.Object r0 = r2.collect(r0)
            java.lang.String r1 = "collect(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.List r0 = (java.util.List) r0
            return r0
    }
}
