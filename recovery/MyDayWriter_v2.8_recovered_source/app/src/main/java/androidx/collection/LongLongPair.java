package androidx.collection;

/* JADX INFO: compiled from: LongLongPair.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u0086\nJ\t\u0010\n\u001a\u00020\u0003H\u0086\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Landroidx/collection/LongLongPair;", "", "first", "", "second", "(JJ)V", "getFirst", "()J", "getSecond", "component1", "component2", "equals", "", "other", "hashCode", "", "toString", "", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LongLongPair {
    private final long first;
    private final long second;

    public LongLongPair(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.first = r1
            r0.second = r3
            return
    }

    public final long component1() {
            r3 = this;
            r0 = 0
            long r1 = r3.getFirst()
            return r1
    }

    public final long component2() {
            r3 = this;
            r0 = 0
            long r1 = r3.getSecond()
            return r1
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof androidx.collection.LongLongPair
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r7
            androidx.collection.LongLongPair r0 = (androidx.collection.LongLongPair) r0
            long r2 = r0.first
            long r4 = r6.first
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L1d
            r0 = r7
            androidx.collection.LongLongPair r0 = (androidx.collection.LongLongPair) r0
            long r2 = r0.second
            long r4 = r6.second
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L1d
            r1 = 1
        L1d:
            return r1
    }

    public final long getFirst() {
            r2 = this;
            long r0 = r2.first
            return r0
    }

    public final long getSecond() {
            r2 = this;
            long r0 = r2.second
            return r0
    }

    public int hashCode() {
            r3 = this;
            long r0 = r3.first
            int r0 = java.lang.Long.hashCode(r0)
            long r1 = r3.second
            int r1 = java.lang.Long.hashCode(r1)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 40
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r3.first
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r3.second
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
