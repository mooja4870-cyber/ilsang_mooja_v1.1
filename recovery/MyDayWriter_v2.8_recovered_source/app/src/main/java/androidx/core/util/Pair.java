package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
public class Pair<F, S> {
    public final F first;
    public final S second;

    public Pair(F r1, S r2) {
            r0 = this;
            r0.<init>()
            r0.first = r1
            r0.second = r2
            return
    }

    public static <A, B> androidx.core.util.Pair<A, B> create(A r1, B r2) {
            androidx.core.util.Pair r0 = new androidx.core.util.Pair
            r0.<init>(r1, r2)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof androidx.core.util.Pair
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r5
            androidx.core.util.Pair r0 = (androidx.core.util.Pair) r0
            F r2 = r0.first
            F r3 = r4.first
            boolean r2 = androidx.core.util.ObjectsCompat.equals(r2, r3)
            if (r2 == 0) goto L1e
            S r2 = r0.second
            S r3 = r4.second
            boolean r2 = androidx.core.util.ObjectsCompat.equals(r2, r3)
            if (r2 == 0) goto L1e
            r1 = 1
        L1e:
            return r1
    }

    public int hashCode() {
            r3 = this;
            F r0 = r3.first
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Ld
        L7:
            F r0 = r3.first
            int r0 = r0.hashCode()
        Ld:
            S r2 = r3.second
            if (r2 != 0) goto L12
            goto L18
        L12:
            S r1 = r3.second
            int r1 = r1.hashCode()
        L18:
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Pair{"
            java.lang.StringBuilder r0 = r0.append(r1)
            F r1 = r2.first
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            S r1 = r2.second
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "}"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
