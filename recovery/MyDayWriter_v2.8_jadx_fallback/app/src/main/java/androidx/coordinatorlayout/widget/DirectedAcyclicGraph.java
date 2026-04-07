package androidx.coordinatorlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public final class DirectedAcyclicGraph<T> {
    private final androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> mGraph;
    private final androidx.core.util.Pools.Pool<java.util.ArrayList<T>> mListPool;
    private final java.util.ArrayList<T> mSortResult;
    private final java.util.HashSet<T> mSortTmpMarked;

    public DirectedAcyclicGraph() {
            r2 = this;
            r2.<init>()
            androidx.core.util.Pools$SimplePool r0 = new androidx.core.util.Pools$SimplePool
            r1 = 10
            r0.<init>(r1)
            r2.mListPool = r0
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            r2.mGraph = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mSortResult = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.mSortTmpMarked = r0
            return
    }

    private void dfs(T r5, java.util.ArrayList<T> r6, java.util.HashSet<T> r7) {
            r4 = this;
            boolean r0 = r6.contains(r5)
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r7.contains(r5)
            if (r0 != 0) goto L32
            r7.add(r5)
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r0 = r4.mGraph
            java.lang.Object r0 = r0.get(r5)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L2b
            r1 = 0
            int r2 = r0.size()
        L1f:
            if (r1 >= r2) goto L2b
            java.lang.Object r3 = r0.get(r1)
            r4.dfs(r3, r6, r7)
            int r1 = r1 + 1
            goto L1f
        L2b:
            r7.remove(r5)
            r6.add(r5)
            return
        L32:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "This graph contains cyclic dependencies"
            r0.<init>(r1)
            throw r0
    }

    private java.util.ArrayList<T> getEmptyList() {
            r2 = this;
            androidx.core.util.Pools$Pool<java.util.ArrayList<T>> r0 = r2.mListPool
            java.lang.Object r0 = r0.acquire()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L10
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0 = r1
        L10:
            return r0
    }

    private void poolList(java.util.ArrayList<T> r2) {
            r1 = this;
            r2.clear()
            androidx.core.util.Pools$Pool<java.util.ArrayList<T>> r0 = r1.mListPool
            r0.release(r2)
            return
    }

    public void addEdge(T r3, T r4) {
            r2 = this;
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r0 = r2.mGraph
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L27
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r0 = r2.mGraph
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L27
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r0 = r2.mGraph
            java.lang.Object r0 = r0.get(r3)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L23
            java.util.ArrayList r0 = r2.getEmptyList()
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r1 = r2.mGraph
            r1.put(r3, r0)
        L23:
            r0.add(r4)
            return
        L27:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "All nodes must be present in the graph before being added as an edge"
            r0.<init>(r1)
            throw r0
    }

    public void addNode(T r3) {
            r2 = this;
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r0 = r2.mGraph
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto Le
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r0 = r2.mGraph
            r1 = 0
            r0.put(r3, r1)
        Le:
            return
    }

    public void clear() {
            r3 = this;
            r0 = 0
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r1 = r3.mGraph
            int r1 = r1.size()
        L7:
            if (r0 >= r1) goto L19
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r2 = r3.mGraph
            java.lang.Object r2 = r2.valueAt(r0)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 == 0) goto L16
            r3.poolList(r2)
        L16:
            int r0 = r0 + 1
            goto L7
        L19:
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r0 = r3.mGraph
            r0.clear()
            return
    }

    public boolean contains(T r2) {
            r1 = this;
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r0 = r1.mGraph
            boolean r0 = r0.containsKey(r2)
            return r0
    }

    public java.util.List<T> getIncomingEdges(T r3) {
            r2 = this;
            java.util.ArrayList r0 = r2.getIncomingEdgesInternal(r3)
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            return r1
    }

    java.util.ArrayList<T> getIncomingEdgesInternal(T r2) {
            r1 = this;
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r0 = r1.mGraph
            java.lang.Object r0 = r0.get(r2)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            return r0
    }

    public java.util.List<T> getOutgoingEdges(T r6) {
            r5 = this;
            r0 = 0
            r1 = 0
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r2 = r5.mGraph
            int r2 = r2.size()
        L8:
            if (r1 >= r2) goto L2e
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r3 = r5.mGraph
            java.lang.Object r3 = r3.valueAt(r1)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 == 0) goto L2b
            boolean r4 = r3.contains(r6)
            if (r4 == 0) goto L2b
            if (r0 != 0) goto L22
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0 = r4
        L22:
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r4 = r5.mGraph
            java.lang.Object r4 = r4.keyAt(r1)
            r0.add(r4)
        L2b:
            int r1 = r1 + 1
            goto L8
        L2e:
            return r0
    }

    public java.util.ArrayList<T> getSortedList() {
            r5 = this;
            java.util.ArrayList<T> r0 = r5.mSortResult
            r0.clear()
            java.util.HashSet<T> r0 = r5.mSortTmpMarked
            r0.clear()
            r0 = 0
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r1 = r5.mGraph
            int r1 = r1.size()
        L11:
            if (r0 >= r1) goto L23
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r2 = r5.mGraph
            java.lang.Object r2 = r2.keyAt(r0)
            java.util.ArrayList<T> r3 = r5.mSortResult
            java.util.HashSet<T> r4 = r5.mSortTmpMarked
            r5.dfs(r2, r3, r4)
            int r0 = r0 + 1
            goto L11
        L23:
            java.util.ArrayList<T> r0 = r5.mSortResult
            return r0
    }

    public boolean hasOutgoingEdges(T r5) {
            r4 = this;
            r0 = 0
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r1 = r4.mGraph
            int r1 = r1.size()
        L7:
            if (r0 >= r1) goto L1e
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r2 = r4.mGraph
            java.lang.Object r2 = r2.valueAt(r0)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 == 0) goto L1b
            boolean r3 = r2.contains(r5)
            if (r3 == 0) goto L1b
            r3 = 1
            return r3
        L1b:
            int r0 = r0 + 1
            goto L7
        L1e:
            r0 = 0
            return r0
    }

    int size() {
            r1 = this;
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r0 = r1.mGraph
            int r0 = r0.size()
            return r0
    }
}
