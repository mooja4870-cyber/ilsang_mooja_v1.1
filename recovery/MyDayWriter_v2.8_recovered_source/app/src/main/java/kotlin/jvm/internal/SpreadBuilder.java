package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes.dex */
public class SpreadBuilder {
    private final java.util.ArrayList<java.lang.Object> list;

    public SpreadBuilder(int r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.list = r0
            return
    }

    public void add(java.lang.Object r2) {
            r1 = this;
            java.util.ArrayList<java.lang.Object> r0 = r1.list
            r0.add(r2)
            return
    }

    public void addSpread(java.lang.Object r5) {
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            boolean r0 = r5 instanceof java.lang.Object[]
            if (r0 == 0) goto L22
            r0 = r5
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r1 = r0.length
            if (r1 <= 0) goto L21
            java.util.ArrayList<java.lang.Object> r1 = r4.list
            java.util.ArrayList<java.lang.Object> r2 = r4.list
            int r2 = r2.size()
            int r3 = r0.length
            int r2 = r2 + r3
            r1.ensureCapacity(r2)
            java.util.ArrayList<java.lang.Object> r1 = r4.list
            java.util.Collections.addAll(r1, r0)
        L21:
            goto L63
        L22:
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L2f
            java.util.ArrayList<java.lang.Object> r0 = r4.list
            r1 = r5
            java.util.Collection r1 = (java.util.Collection) r1
            r0.addAll(r1)
            goto L63
        L2f:
            boolean r0 = r5 instanceof java.lang.Iterable
            if (r0 == 0) goto L4b
            r0 = r5
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L3a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r0.next()
            java.util.ArrayList<java.lang.Object> r2 = r4.list
            r2.add(r1)
            goto L3a
        L4a:
            goto L63
        L4b:
            boolean r0 = r5 instanceof java.util.Iterator
            if (r0 == 0) goto L64
            r0 = r5
            java.util.Iterator r0 = (java.util.Iterator) r0
        L52:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L62
            java.util.ArrayList<java.lang.Object> r1 = r4.list
            java.lang.Object r2 = r0.next()
            r1.add(r2)
            goto L52
        L62:
        L63:
            return
        L64:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Don't know how to spread "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.Class r2 = r5.getClass()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public int size() {
            r1 = this;
            java.util.ArrayList<java.lang.Object> r0 = r1.list
            int r0 = r0.size()
            return r0
    }

    public java.lang.Object[] toArray(java.lang.Object[] r2) {
            r1 = this;
            java.util.ArrayList<java.lang.Object> r0 = r1.list
            java.lang.Object[] r0 = r0.toArray(r2)
            return r0
    }
}
