package kotlin.comparisons;

/* JADX INFO: compiled from: _Comparisons.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\u001aG\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u00012\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00010\u0006j\n\u0012\u0006\b\u0000\u0012\u0002H\u0001`\u0007H\u0007¢\u0006\u0002\u0010\b\u001a?\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u00012\u0006\u0010\u0003\u001a\u0002H\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00010\u0006j\n\u0012\u0006\b\u0000\u0012\u0002H\u0001`\u0007H\u0007¢\u0006\u0002\u0010\t\u001aK\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u00012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\u000b\"\u0002H\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00010\u0006j\n\u0012\u0006\b\u0000\u0012\u0002H\u0001`\u0007H\u0007¢\u0006\u0002\u0010\f\u001aG\u0010\r\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u00012\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00010\u0006j\n\u0012\u0006\b\u0000\u0012\u0002H\u0001`\u0007H\u0007¢\u0006\u0002\u0010\b\u001a?\u0010\r\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u00012\u0006\u0010\u0003\u001a\u0002H\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00010\u0006j\n\u0012\u0006\b\u0000\u0012\u0002H\u0001`\u0007H\u0007¢\u0006\u0002\u0010\t\u001aK\u0010\r\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u00012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\u000b\"\u0002H\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00010\u0006j\n\u0012\u0006\b\u0000\u0012\u0002H\u0001`\u0007H\u0007¢\u0006\u0002\u0010\f¨\u0006\u000e"}, d2 = {"maxOf", "T", "a", "b", "c", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ljava/lang/Object;", "other", "", "(Ljava/lang/Object;[Ljava/lang/Object;Ljava/util/Comparator;)Ljava/lang/Object;", "minOf", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
class ComparisonsKt___ComparisonsKt extends kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt {
    public ComparisonsKt___ComparisonsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final <T> T maxOf(T r1, T r2, T r3, java.util.Comparator<? super T> r4) {
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.Object r0 = kotlin.comparisons.ComparisonsKt.maxOf(r2, r3, r4)
            java.lang.Object r0 = kotlin.comparisons.ComparisonsKt.maxOf(r1, r0, r4)
            return r0
    }

    public static final <T> T maxOf(T r1, T r2, java.util.Comparator<? super T> r3) {
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.compare(r1, r2)
            if (r0 < 0) goto Ld
            r0 = r1
            goto Le
        Ld:
            r0 = r2
        Le:
            return r0
    }

    public static final <T> T maxOf(T r5, T[] r6, java.util.Comparator<? super T> r7) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = r5
            int r1 = r6.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L1b
            r3 = r6[r2]
            int r4 = r7.compare(r0, r3)
            if (r4 >= 0) goto L18
            r0 = r3
        L18:
            int r2 = r2 + 1
            goto Ld
        L1b:
            return r0
    }

    public static final <T> T minOf(T r1, T r2, T r3, java.util.Comparator<? super T> r4) {
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.Object r0 = kotlin.comparisons.ComparisonsKt.minOf(r2, r3, r4)
            java.lang.Object r0 = kotlin.comparisons.ComparisonsKt.minOf(r1, r0, r4)
            return r0
    }

    public static final <T> T minOf(T r1, T r2, java.util.Comparator<? super T> r3) {
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.compare(r1, r2)
            if (r0 > 0) goto Ld
            r0 = r1
            goto Le
        Ld:
            r0 = r2
        Le:
            return r0
    }

    public static final <T> T minOf(T r5, T[] r6, java.util.Comparator<? super T> r7) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = r5
            int r1 = r6.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L1b
            r3 = r6[r2]
            int r4 = r7.compare(r0, r3)
            if (r4 <= 0) goto L18
            r0 = r3
        L18:
            int r2 = r2 + 1
            goto Ld
        L1b:
            return r0
    }
}
