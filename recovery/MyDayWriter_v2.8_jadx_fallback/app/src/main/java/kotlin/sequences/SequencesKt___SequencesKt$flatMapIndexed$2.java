package kotlin.sequences;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: _Sequences.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* synthetic */ class SequencesKt___SequencesKt$flatMapIndexed$2<R> extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.sequences.Sequence<? extends R>, java.util.Iterator<? extends R>> {
    public static final kotlin.sequences.SequencesKt___SequencesKt$flatMapIndexed$2 INSTANCE = null;

    static {
            kotlin.sequences.SequencesKt___SequencesKt$flatMapIndexed$2 r0 = new kotlin.sequences.SequencesKt___SequencesKt$flatMapIndexed$2
            r0.<init>()
            kotlin.sequences.SequencesKt___SequencesKt$flatMapIndexed$2.INSTANCE = r0
            return
    }

    SequencesKt___SequencesKt$flatMapIndexed$2() {
            r6 = this;
            java.lang.Class<kotlin.sequences.Sequence> r2 = kotlin.sequences.Sequence.class
            java.lang.String r4 = "iterator()Ljava/util/Iterator;"
            r5 = 0
            r1 = 1
            java.lang.String r3 = "iterator"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            r0 = r2
            kotlin.sequences.Sequence r0 = (kotlin.sequences.Sequence) r0
            java.util.Iterator r0 = r1.invoke(r0)
            return r0
    }

    public final java.util.Iterator<R> invoke(kotlin.sequences.Sequence<? extends R> r2) {
            r1 = this;
            java.lang.String r0 = "p0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Iterator r0 = r2.iterator()
            return r0
    }
}
