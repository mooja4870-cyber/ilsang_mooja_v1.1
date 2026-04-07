package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
public interface Predicate<T> {
    static <T> androidx.core.util.Predicate<T> isEqual(java.lang.Object r1) {
            if (r1 != 0) goto L8
            androidx.core.util.Predicate$$ExternalSyntheticLambda1 r0 = new androidx.core.util.Predicate$$ExternalSyntheticLambda1
            r0.<init>()
            goto Ld
        L8:
            androidx.core.util.Predicate$$ExternalSyntheticLambda2 r0 = new androidx.core.util.Predicate$$ExternalSyntheticLambda2
            r0.<init>(r1)
        Ld:
            return r0
    }

    static /* synthetic */ boolean lambda$and$0(androidx.core.util.Predicate r1, androidx.core.util.Predicate r2, java.lang.Object r3) {
            boolean r0 = r1.test(r3)
            if (r0 == 0) goto Le
            boolean r0 = r2.test(r3)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    static /* synthetic */ boolean lambda$isEqual$3(java.lang.Object r1) {
            boolean r0 = java.util.Objects.isNull(r1)
            return r0
    }

    static /* synthetic */ boolean lambda$isEqual$4(java.lang.Object r1, java.lang.Object r2) {
            boolean r0 = r1.equals(r2)
            return r0
    }

    static /* synthetic */ boolean lambda$negate$1(androidx.core.util.Predicate r1, java.lang.Object r2) {
            boolean r0 = r1.test(r2)
            r0 = r0 ^ 1
            return r0
    }

    static /* synthetic */ boolean lambda$or$2(androidx.core.util.Predicate r1, androidx.core.util.Predicate r2, java.lang.Object r3) {
            boolean r0 = r1.test(r3)
            if (r0 != 0) goto Lf
            boolean r0 = r2.test(r3)
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    static <T> androidx.core.util.Predicate<T> not(androidx.core.util.Predicate<? super T> r1) {
            java.util.Objects.requireNonNull(r1)
            androidx.core.util.Predicate r0 = r1.negate()
            return r0
    }

    default androidx.core.util.Predicate<T> and(androidx.core.util.Predicate<? super T> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            androidx.core.util.Predicate$$ExternalSyntheticLambda3 r0 = new androidx.core.util.Predicate$$ExternalSyntheticLambda3
            r0.<init>(r1, r2)
            return r0
    }

    default androidx.core.util.Predicate<T> negate() {
            r1 = this;
            androidx.core.util.Predicate$$ExternalSyntheticLambda4 r0 = new androidx.core.util.Predicate$$ExternalSyntheticLambda4
            r0.<init>(r1)
            return r0
    }

    default androidx.core.util.Predicate<T> or(androidx.core.util.Predicate<? super T> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            androidx.core.util.Predicate$$ExternalSyntheticLambda0 r0 = new androidx.core.util.Predicate$$ExternalSyntheticLambda0
            r0.<init>(r1, r2)
            return r0
    }

    boolean test(T r1);
}
