package kotlin.ranges;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a@\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0007*\u00020\b\"\u0018\b\u0001\u0010\t*\b\u0012\u0004\u0012\u0002H\u00070\n*\b\u0012\u0004\u0012\u0002H\u00070\u000b*\u0002H\t2\b\u0010\f\u001a\u0004\u0018\u0001H\u0007H\u0087\n¢\u0006\u0002\u0010\r\u001a@\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0007*\u00020\b\"\u0018\b\u0001\u0010\t*\b\u0012\u0004\u0012\u0002H\u00070\u000e*\b\u0012\u0004\u0012\u0002H\u00070\u000b*\u0002H\t2\b\u0010\f\u001a\u0004\u0018\u0001H\u0007H\u0087\n¢\u0006\u0002\u0010\u000f\u001a0\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00070\n\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u0011*\u0002H\u00072\u0006\u0010\u0012\u001a\u0002H\u0007H\u0086\u0002¢\u0006\u0002\u0010\u0013\u001a\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0015H\u0087\u0002\u001a\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00160\u0014*\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0016H\u0087\u0002\u001a0\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000e\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u0011*\u0002H\u00072\u0006\u0010\u0012\u001a\u0002H\u0007H\u0087\u0002¢\u0006\u0002\u0010\u0018\u001a\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e*\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0015H\u0087\u0002\u001a\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e*\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0016H\u0087\u0002¨\u0006\u0019"}, d2 = {"checkStepIsPositive", "", "isPositive", "", "step", "", "contains", "T", "", "R", "Lkotlin/ranges/ClosedRange;", "", "element", "(Lkotlin/ranges/ClosedRange;Ljava/lang/Object;)Z", "Lkotlin/ranges/OpenEndRange;", "(Lkotlin/ranges/OpenEndRange;Ljava/lang/Object;)Z", "rangeTo", "", "that", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lkotlin/ranges/ClosedRange;", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "", "rangeUntil", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lkotlin/ranges/OpenEndRange;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/ranges/RangesKt")
class RangesKt__RangesKt {
    public RangesKt__RangesKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final void checkStepIsPositive(boolean r3, java.lang.Number r4) {
            java.lang.String r0 = "step"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            if (r3 == 0) goto L8
            return
        L8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Step must be positive, was: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            r2 = 46
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lkotlin/ranges/ClosedRange<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    private static final boolean contains(kotlin.ranges.ClosedRange r1, java.lang.Object r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            if (r2 == 0) goto L12
            r0 = r2
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lkotlin/ranges/OpenEndRange<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    private static final boolean contains(kotlin.ranges.OpenEndRange r1, java.lang.Object r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            if (r2 == 0) goto L12
            r0 = r2
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public static final kotlin.ranges.ClosedFloatingPointRange<java.lang.Double> rangeTo(double r1, double r3) {
            kotlin.ranges.ClosedDoubleRange r0 = new kotlin.ranges.ClosedDoubleRange
            r0.<init>(r1, r3)
            kotlin.ranges.ClosedFloatingPointRange r0 = (kotlin.ranges.ClosedFloatingPointRange) r0
            return r0
    }

    public static final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> rangeTo(float r1, float r2) {
            kotlin.ranges.ClosedFloatRange r0 = new kotlin.ranges.ClosedFloatRange
            r0.<init>(r1, r2)
            kotlin.ranges.ClosedFloatingPointRange r0 = (kotlin.ranges.ClosedFloatingPointRange) r0
            return r0
    }

    public static final <T extends java.lang.Comparable<? super T>> kotlin.ranges.ClosedRange<T> rangeTo(T r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "that"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.ranges.ComparableRange r0 = new kotlin.ranges.ComparableRange
            r0.<init>(r1, r2)
            kotlin.ranges.ClosedRange r0 = (kotlin.ranges.ClosedRange) r0
            return r0
    }

    public static final kotlin.ranges.OpenEndRange<java.lang.Double> rangeUntil(double r1, double r3) {
            kotlin.ranges.OpenEndDoubleRange r0 = new kotlin.ranges.OpenEndDoubleRange
            r0.<init>(r1, r3)
            kotlin.ranges.OpenEndRange r0 = (kotlin.ranges.OpenEndRange) r0
            return r0
    }

    public static final kotlin.ranges.OpenEndRange<java.lang.Float> rangeUntil(float r1, float r2) {
            kotlin.ranges.OpenEndFloatRange r0 = new kotlin.ranges.OpenEndFloatRange
            r0.<init>(r1, r2)
            kotlin.ranges.OpenEndRange r0 = (kotlin.ranges.OpenEndRange) r0
            return r0
    }

    public static final <T extends java.lang.Comparable<? super T>> kotlin.ranges.OpenEndRange<T> rangeUntil(T r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "that"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.ranges.ComparableOpenEndRange r0 = new kotlin.ranges.ComparableOpenEndRange
            r0.<init>(r1, r2)
            kotlin.ranges.OpenEndRange r0 = (kotlin.ranges.OpenEndRange) r0
            return r0
    }
}
