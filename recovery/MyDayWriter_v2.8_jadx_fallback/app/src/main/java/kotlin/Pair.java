package kotlin;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0002\u0010\u0007J\u000e\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\tJ\u000e\u0010\r\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\tJ.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, d2 = {"Lkotlin/Pair;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "second", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getFirst", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSecond", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Pair<A, B> implements java.io.Serializable {
    private final A first;
    private final B second;

    public Pair(A r1, B r2) {
            r0 = this;
            r0.<init>()
            r0.first = r1
            r0.second = r2
            return
    }

    public static /* synthetic */ kotlin.Pair copy$default(kotlin.Pair r0, java.lang.Object r1, java.lang.Object r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            A r1 = r0.first
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            B r2 = r0.second
        Lc:
            kotlin.Pair r0 = r0.copy(r1, r2)
            return r0
    }

    public final A component1() {
            r1 = this;
            A r0 = r1.first
            return r0
    }

    public final B component2() {
            r1 = this;
            B r0 = r1.second
            return r0
    }

    public final kotlin.Pair<A, B> copy(A r2, B r3) {
            r1 = this;
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof kotlin.Pair
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = r6
            kotlin.Pair r1 = (kotlin.Pair) r1
            A r3 = r5.first
            A r4 = r1.first
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L18
            return r2
        L18:
            B r3 = r5.second
            B r1 = r1.second
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
            if (r1 != 0) goto L23
            return r2
        L23:
            return r0
    }

    public final A getFirst() {
            r1 = this;
            A r0 = r1.first
            return r0
    }

    public final B getSecond() {
            r1 = this;
            B r0 = r1.second
            return r0
    }

    public int hashCode() {
            r4 = this;
            A r0 = r4.first
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Ld
        L7:
            A r0 = r4.first
            int r0 = r0.hashCode()
        Ld:
            int r2 = r0 * 31
            B r3 = r4.second
            if (r3 != 0) goto L14
            goto L1a
        L14:
            B r1 = r4.second
            int r1 = r1.hashCode()
        L1a:
            int r2 = r2 + r1
            return r2
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 40
            java.lang.StringBuilder r0 = r0.append(r1)
            A r1 = r2.first
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            B r1 = r2.second
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
