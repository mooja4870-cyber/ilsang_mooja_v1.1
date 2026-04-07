package kotlin;

/* JADX INFO: compiled from: BigDecimals.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\nH\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0087\b\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\rH\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u000b\u001a\u00020\fH\u0087\b\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\u000eH\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0087\b\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\u000fH\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0087\b\u001a\r\u0010\u0010\u001a\u00020\u0001*\u00020\u0001H\u0087\n¨\u0006\u0011"}, d2 = {"dec", "Ljava/math/BigDecimal;", "div", "other", "inc", "minus", "plus", "rem", "times", "toBigDecimal", "", "mathContext", "Ljava/math/MathContext;", "", "", "", "unaryMinus", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/NumbersKt")
class NumbersKt__BigDecimalsKt {
    public NumbersKt__BigDecimalsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final java.math.BigDecimal dec(java.math.BigDecimal r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.math.BigDecimal r0 = java.math.BigDecimal.ONE
            java.math.BigDecimal r0 = r2.subtract(r0)
            java.lang.String r1 = "subtract(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.math.BigDecimal div(java.math.BigDecimal r2, java.math.BigDecimal r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.math.RoundingMode r0 = java.math.RoundingMode.HALF_EVEN
            java.math.BigDecimal r0 = r2.divide(r3, r0)
            java.lang.String r1 = "divide(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.math.BigDecimal inc(java.math.BigDecimal r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.math.BigDecimal r0 = java.math.BigDecimal.ONE
            java.math.BigDecimal r0 = r2.add(r0)
            java.lang.String r1 = "add(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.math.BigDecimal minus(java.math.BigDecimal r2, java.math.BigDecimal r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.math.BigDecimal r0 = r2.subtract(r3)
            java.lang.String r1 = "subtract(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.math.BigDecimal plus(java.math.BigDecimal r2, java.math.BigDecimal r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.math.BigDecimal r0 = r2.add(r3)
            java.lang.String r1 = "add(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.math.BigDecimal rem(java.math.BigDecimal r2, java.math.BigDecimal r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.math.BigDecimal r0 = r2.remainder(r3)
            java.lang.String r1 = "remainder(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.math.BigDecimal times(java.math.BigDecimal r2, java.math.BigDecimal r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.math.BigDecimal r0 = r2.multiply(r3)
            java.lang.String r1 = "multiply(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.math.BigDecimal toBigDecimal(double r2) {
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = java.lang.String.valueOf(r2)
            r0.<init>(r1)
            return r0
    }

    private static final java.math.BigDecimal toBigDecimal(double r2, java.math.MathContext r4) {
            java.lang.String r0 = "mathContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = java.lang.String.valueOf(r2)
            r0.<init>(r1, r4)
            return r0
    }

    private static final java.math.BigDecimal toBigDecimal(float r2) {
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = java.lang.String.valueOf(r2)
            r0.<init>(r1)
            return r0
    }

    private static final java.math.BigDecimal toBigDecimal(float r2, java.math.MathContext r3) {
            java.lang.String r0 = "mathContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = java.lang.String.valueOf(r2)
            r0.<init>(r1, r3)
            return r0
    }

    private static final java.math.BigDecimal toBigDecimal(int r2) {
            long r0 = (long) r2
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.math.BigDecimal toBigDecimal(int r1, java.math.MathContext r2) {
            java.lang.String r0 = "mathContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1, r2)
            return r0
    }

    private static final java.math.BigDecimal toBigDecimal(long r2) {
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r2)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.math.BigDecimal toBigDecimal(long r1, java.math.MathContext r3) {
            java.lang.String r0 = "mathContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1, r3)
            return r0
    }

    private static final java.math.BigDecimal unaryMinus(java.math.BigDecimal r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.math.BigDecimal r0 = r2.negate()
            java.lang.String r1 = "negate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }
}
