package kotlin.comparisons;

/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\u0087\bø\u0001\u0000\u001aY\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u000226\u0010\u0007\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00050\b\"\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\t\u001aZ\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0087\bø\u0001\u0000\u001a>\u0010\f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\u0087\bø\u0001\u0000\u001aZ\u0010\f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0087\bø\u0001\u0000\u001a-\u0010\r\u001a\u00020\u000e\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u000f\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0010\u001a\u0004\u0018\u0001H\u0002¢\u0006\u0002\u0010\u0011\u001aA\u0010\u0012\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001aY\u0010\u0012\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u000226\u0010\u0007\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00050\b\"\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\u0014\u001a]\u0010\u0012\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n2\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u00022\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001aG\u0010\u0016\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u00022 \u0010\u0007\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00050\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0014\u001a&\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a-\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0087\b\u001a@\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\b\b\u0000\u0010\u0002*\u00020\u001a2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003\u001a-\u0010\u001b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0087\b\u001a@\u0010\u001b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\b\b\u0000\u0010\u0002*\u00020\u001a2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003\u001a&\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a0\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\u001aO\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003H\u0086\u0004\u001aR\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\u0087\bø\u0001\u0000\u001an\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0087\bø\u0001\u0000\u001aR\u0010 \u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\u0087\bø\u0001\u0000\u001an\u0010 \u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0087\bø\u0001\u0000\u001ap\u0010!\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u000328\b\u0004\u0010\"\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u000e0#H\u0087\bø\u0001\u0000\u001aO\u0010&\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003H\u0086\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, d2 = {"compareBy", "Ljava/util/Comparator;", "T", "Lkotlin/Comparator;", "selector", "Lkotlin/Function1;", "", "selectors", "", "([Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;", "K", "comparator", "compareByDescending", "compareValues", "", "a", "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I", "compareValuesBy", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I", "(Ljava/lang/Object;Ljava/lang/Object;[Lkotlin/jvm/functions/Function1;)I", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)I", "compareValuesByImpl", "compareValuesByImpl$ComparisonsKt__ComparisonsKt", "naturalOrder", "nullsFirst", "", "nullsLast", "reverseOrder", "reversed", "then", "thenBy", "thenByDescending", "thenComparator", "comparison", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "thenDescending", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
class ComparisonsKt__ComparisonsKt {

    /* JADX INFO: renamed from: kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareBy$2, reason: invalid class name */
    /* JADX INFO: compiled from: Comparisons.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass2<T> implements java.util.Comparator {
        final /* synthetic */ kotlin.jvm.functions.Function1<T, java.lang.Comparable<?>> $selector;

        public AnonymousClass2(kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> r1) {
                r0 = this;
                r0.$selector = r1
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r3, T r4) {
                r2 = this;
                kotlin.jvm.functions.Function1<T, java.lang.Comparable<?>> r0 = r2.$selector
                java.lang.Object r1 = r0.invoke(r3)
                java.lang.Comparable r1 = (java.lang.Comparable) r1
                java.lang.Object r0 = r0.invoke(r4)
                java.lang.Comparable r0 = (java.lang.Comparable) r0
                int r0 = kotlin.comparisons.ComparisonsKt.compareValues(r1, r0)
                return r0
        }
    }


    /* JADX INFO: renamed from: kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareByDescending$1, reason: invalid class name */
    /* JADX INFO: compiled from: Comparisons.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass1<T> implements java.util.Comparator {
        final /* synthetic */ kotlin.jvm.functions.Function1<T, java.lang.Comparable<?>> $selector;

        public AnonymousClass1(kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> r1) {
                r0 = this;
                r0.$selector = r1
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r3, T r4) {
                r2 = this;
                kotlin.jvm.functions.Function1<T, java.lang.Comparable<?>> r0 = r2.$selector
                java.lang.Object r1 = r0.invoke(r4)
                java.lang.Comparable r1 = (java.lang.Comparable) r1
                java.lang.Object r0 = r0.invoke(r3)
                java.lang.Comparable r0 = (java.lang.Comparable) r0
                int r0 = kotlin.comparisons.ComparisonsKt.compareValues(r1, r0)
                return r0
        }
    }







    public static /* synthetic */ int $r8$lambda$75RqBHjEE2iU7zbZ3cBiUB4M5DE(java.util.Comparator r0, java.lang.Object r1, java.lang.Object r2) {
            int r0 = nullsLast$lambda$4$ComparisonsKt__ComparisonsKt(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$OB0mUMQVuAc-U0wu9PhfvNNbqqs, reason: not valid java name */
    public static /* synthetic */ int m1333$r8$lambda$OB0mUMQVuAcU0wu9PhfvNNbqqs(java.util.Comparator r0, java.util.Comparator r1, java.lang.Object r2, java.lang.Object r3) {
            int r0 = thenDescending$lambda$2$ComparisonsKt__ComparisonsKt(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int $r8$lambda$W8AWSBCuy65sMGWfMo6pJ3RDjRw(kotlin.jvm.functions.Function1[] r0, java.lang.Object r1, java.lang.Object r2) {
            int r0 = compareBy$lambda$0$ComparisonsKt__ComparisonsKt(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ int $r8$lambda$fFv4wzBXuBoGFl05zSxqQb7pKRU(java.util.Comparator r0, java.util.Comparator r1, java.lang.Object r2, java.lang.Object r3) {
            int r0 = then$lambda$1$ComparisonsKt__ComparisonsKt(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int $r8$lambda$tgO5p6pL1ym8xxzpZUrxHlIPkYM(java.util.Comparator r0, java.lang.Object r1, java.lang.Object r2) {
            int r0 = nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt(r0, r1, r2)
            return r0
    }

    public ComparisonsKt__ComparisonsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final <T, K> java.util.Comparator<T> compareBy(java.util.Comparator<? super K> r1, kotlin.jvm.functions.Function1<? super T, ? extends K> r2) {
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareBy$3 r0 = new kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareBy$3
            r0.<init>(r1, r2)
            java.util.Comparator r0 = (java.util.Comparator) r0
            return r0
    }

    private static final <T> java.util.Comparator<T> compareBy(kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> r1) {
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareBy$2 r0 = new kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareBy$2
            r0.<init>(r1)
            java.util.Comparator r0 = (java.util.Comparator) r0
            return r0
    }

    public static final <T> java.util.Comparator<T> compareBy(kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>>... r2) {
            java.lang.String r0 = "selectors"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.length
            if (r0 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            if (r0 == 0) goto L13
            kotlin.comparisons.ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda3 r0 = new kotlin.comparisons.ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda3
            r0.<init>(r2)
            return r0
        L13:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static final int compareBy$lambda$0$ComparisonsKt__ComparisonsKt(kotlin.jvm.functions.Function1[] r1, java.lang.Object r2, java.lang.Object r3) {
            int r0 = compareValuesByImpl$ComparisonsKt__ComparisonsKt(r2, r3, r1)
            return r0
    }

    private static final <T, K> java.util.Comparator<T> compareByDescending(java.util.Comparator<? super K> r1, kotlin.jvm.functions.Function1<? super T, ? extends K> r2) {
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareByDescending$2 r0 = new kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareByDescending$2
            r0.<init>(r1, r2)
            java.util.Comparator r0 = (java.util.Comparator) r0
            return r0
    }

    private static final <T> java.util.Comparator<T> compareByDescending(kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> r1) {
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareByDescending$1 r0 = new kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareByDescending$1
            r0.<init>(r1)
            java.util.Comparator r0 = (java.util.Comparator) r0
            return r0
    }

    public static final <T extends java.lang.Comparable<?>> int compareValues(T r1, T r2) {
            if (r1 != r2) goto L4
            r0 = 0
            return r0
        L4:
            if (r1 != 0) goto L8
            r0 = -1
            return r0
        L8:
            if (r2 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            int r0 = r1.compareTo(r2)
            return r0
    }

    private static final <T, K> int compareValuesBy(T r2, T r3, java.util.Comparator<? super K> r4, kotlin.jvm.functions.Function1<? super T, ? extends K> r5) {
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.Object r0 = r5.invoke(r2)
            java.lang.Object r1 = r5.invoke(r3)
            int r0 = r4.compare(r0, r1)
            return r0
    }

    private static final <T> int compareValuesBy(T r2, T r3, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> r4) {
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.Object r0 = r4.invoke(r2)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            java.lang.Object r1 = r4.invoke(r3)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r0 = kotlin.comparisons.ComparisonsKt.compareValues(r0, r1)
            return r0
    }

    public static final <T> int compareValuesBy(T r2, T r3, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>>... r4) {
            java.lang.String r0 = "selectors"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r4.length
            if (r0 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            if (r0 == 0) goto L12
            int r0 = compareValuesByImpl$ComparisonsKt__ComparisonsKt(r2, r3, r4)
            return r0
        L12:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static final <T> int compareValuesByImpl$ComparisonsKt__ComparisonsKt(T r7, T r8, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>>[] r9) {
            int r0 = r9.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L1d
            r3 = r9[r2]
            java.lang.Object r4 = r3.invoke(r7)
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            java.lang.Object r5 = r3.invoke(r8)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r6 = kotlin.comparisons.ComparisonsKt.compareValues(r4, r5)
            if (r6 == 0) goto L1a
            return r6
        L1a:
            int r2 = r2 + 1
            goto L3
        L1d:
            return r1
    }

    public static final <T extends java.lang.Comparable<? super T>> java.util.Comparator<T> naturalOrder() {
            kotlin.comparisons.NaturalOrderComparator r0 = kotlin.comparisons.NaturalOrderComparator.INSTANCE
            java.lang.String r1 = "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.util.Comparator r0 = (java.util.Comparator) r0
            return r0
    }

    private static final <T extends java.lang.Comparable<? super T>> java.util.Comparator<T> nullsFirst() {
            java.util.Comparator r0 = kotlin.comparisons.ComparisonsKt.naturalOrder()
            java.util.Comparator r0 = kotlin.comparisons.ComparisonsKt.nullsFirst(r0)
            return r0
    }

    public static final <T> java.util.Comparator<T> nullsFirst(java.util.Comparator<? super T> r1) {
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.comparisons.ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda4 r0 = new kotlin.comparisons.ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda4
            r0.<init>(r1)
            return r0
    }

    private static final int nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt(java.util.Comparator r1, java.lang.Object r2, java.lang.Object r3) {
            if (r2 != r3) goto L5
            r0 = 0
            goto L11
        L5:
            if (r2 != 0) goto L9
            r0 = -1
            goto L11
        L9:
            if (r3 != 0) goto Ld
            r0 = 1
            goto L11
        Ld:
            int r0 = r1.compare(r2, r3)
        L11:
            return r0
    }

    private static final <T extends java.lang.Comparable<? super T>> java.util.Comparator<T> nullsLast() {
            java.util.Comparator r0 = kotlin.comparisons.ComparisonsKt.naturalOrder()
            java.util.Comparator r0 = kotlin.comparisons.ComparisonsKt.nullsLast(r0)
            return r0
    }

    public static final <T> java.util.Comparator<T> nullsLast(java.util.Comparator<? super T> r1) {
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.comparisons.ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda0 r0 = new kotlin.comparisons.ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda0
            r0.<init>(r1)
            return r0
    }

    private static final int nullsLast$lambda$4$ComparisonsKt__ComparisonsKt(java.util.Comparator r1, java.lang.Object r2, java.lang.Object r3) {
            if (r2 != r3) goto L5
            r0 = 0
            goto L11
        L5:
            if (r2 != 0) goto L9
            r0 = 1
            goto L11
        L9:
            if (r3 != 0) goto Ld
            r0 = -1
            goto L11
        Ld:
            int r0 = r1.compare(r2, r3)
        L11:
            return r0
    }

    public static final <T extends java.lang.Comparable<? super T>> java.util.Comparator<T> reverseOrder() {
            kotlin.comparisons.ReverseOrderComparator r0 = kotlin.comparisons.ReverseOrderComparator.INSTANCE
            java.lang.String r1 = "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.util.Comparator r0 = (java.util.Comparator) r0
            return r0
    }

    public static final <T> java.util.Comparator<T> reversed(java.util.Comparator<T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r2 instanceof kotlin.comparisons.ReversedComparator
            if (r0 == 0) goto L12
            r0 = r2
            kotlin.comparisons.ReversedComparator r0 = (kotlin.comparisons.ReversedComparator) r0
            java.util.Comparator r0 = r0.getComparator()
            goto L3b
        L12:
            kotlin.comparisons.NaturalOrderComparator r0 = kotlin.comparisons.NaturalOrderComparator.INSTANCE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            java.lang.String r1 = "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }"
            if (r0 == 0) goto L24
            kotlin.comparisons.ReverseOrderComparator r0 = kotlin.comparisons.ReverseOrderComparator.INSTANCE
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.util.Comparator r0 = (java.util.Comparator) r0
            goto L3b
        L24:
            kotlin.comparisons.ReverseOrderComparator r0 = kotlin.comparisons.ReverseOrderComparator.INSTANCE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto L34
            kotlin.comparisons.NaturalOrderComparator r0 = kotlin.comparisons.NaturalOrderComparator.INSTANCE
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.util.Comparator r0 = (java.util.Comparator) r0
            goto L3b
        L34:
            kotlin.comparisons.ReversedComparator r0 = new kotlin.comparisons.ReversedComparator
            r0.<init>(r2)
            java.util.Comparator r0 = (java.util.Comparator) r0
        L3b:
            return r0
    }

    public static final <T> java.util.Comparator<T> then(java.util.Comparator<T> r1, java.util.Comparator<? super T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.comparisons.ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda2 r0 = new kotlin.comparisons.ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda2
            r0.<init>(r1, r2)
            return r0
    }

    private static final int then$lambda$1$ComparisonsKt__ComparisonsKt(java.util.Comparator r2, java.util.Comparator r3, java.lang.Object r4, java.lang.Object r5) {
            int r0 = r2.compare(r4, r5)
            if (r0 == 0) goto L8
            r1 = r0
            goto Lc
        L8:
            int r1 = r3.compare(r4, r5)
        Lc:
            return r1
    }

    private static final <T, K> java.util.Comparator<T> thenBy(java.util.Comparator<T> r1, java.util.Comparator<? super K> r2, kotlin.jvm.functions.Function1<? super T, ? extends K> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenBy$2 r0 = new kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenBy$2
            r0.<init>(r1, r2, r3)
            java.util.Comparator r0 = (java.util.Comparator) r0
            return r0
    }

    private static final <T> java.util.Comparator<T> thenBy(java.util.Comparator<T> r1, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenBy$1 r0 = new kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenBy$1
            r0.<init>(r1, r2)
            java.util.Comparator r0 = (java.util.Comparator) r0
            return r0
    }

    private static final <T, K> java.util.Comparator<T> thenByDescending(java.util.Comparator<T> r1, java.util.Comparator<? super K> r2, kotlin.jvm.functions.Function1<? super T, ? extends K> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenByDescending$2 r0 = new kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenByDescending$2
            r0.<init>(r1, r2, r3)
            java.util.Comparator r0 = (java.util.Comparator) r0
            return r0
    }

    private static final <T> java.util.Comparator<T> thenByDescending(java.util.Comparator<T> r1, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenByDescending$1 r0 = new kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenByDescending$1
            r0.<init>(r1, r2)
            java.util.Comparator r0 = (java.util.Comparator) r0
            return r0
    }

    private static final <T> java.util.Comparator<T> thenComparator(java.util.Comparator<T> r1, kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Integer> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "comparison"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenComparator$1 r0 = new kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenComparator$1
            r0.<init>(r1, r2)
            java.util.Comparator r0 = (java.util.Comparator) r0
            return r0
    }

    public static final <T> java.util.Comparator<T> thenDescending(java.util.Comparator<T> r1, java.util.Comparator<? super T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.comparisons.ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda1 r0 = new kotlin.comparisons.ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda1
            r0.<init>(r1, r2)
            return r0
    }

    private static final int thenDescending$lambda$2$ComparisonsKt__ComparisonsKt(java.util.Comparator r2, java.util.Comparator r3, java.lang.Object r4, java.lang.Object r5) {
            int r0 = r2.compare(r4, r5)
            if (r0 == 0) goto L8
            r1 = r0
            goto Lc
        L8:
            int r1 = r3.compare(r5, r4)
        Lc:
            return r1
    }
}
