package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class ViewModel {
    private final java.util.Map<java.lang.String, java.lang.Object> mBagOfTags;
    private volatile boolean mCleared;
    private final java.util.Set<java.io.Closeable> mCloseables;

    public ViewModel() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mBagOfTags = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.mCloseables = r0
            r0 = 0
            r1.mCleared = r0
            return
    }

    public ViewModel(java.io.Closeable... r3) {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mBagOfTags = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r2.mCloseables = r0
            r0 = 0
            r2.mCleared = r0
            java.util.Set<java.io.Closeable> r0 = r2.mCloseables
            java.util.List r1 = java.util.Arrays.asList(r3)
            r0.addAll(r1)
            return
    }

    private static void closeWithRuntimeException(java.lang.Object r2) {
            boolean r0 = r2 instanceof java.io.Closeable
            if (r0 == 0) goto L12
            r0 = r2
            java.io.Closeable r0 = (java.io.Closeable) r0     // Catch: java.io.IOException -> Lb
            r0.close()     // Catch: java.io.IOException -> Lb
            goto L12
        Lb:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L12:
            return
    }

    public void addCloseable(java.io.Closeable r3) {
            r2 = this;
            java.util.Set<java.io.Closeable> r0 = r2.mCloseables
            if (r0 == 0) goto L11
            java.util.Set<java.io.Closeable> r0 = r2.mCloseables
            monitor-enter(r0)
            java.util.Set<java.io.Closeable> r1 = r2.mCloseables     // Catch: java.lang.Throwable -> Le
            r1.add(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            return
    }

    final void clear() {
            r3 = this;
            r0 = 1
            r3.mCleared = r0
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.mBagOfTags
            if (r0 == 0) goto L27
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.mBagOfTags
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.mBagOfTags     // Catch: java.lang.Throwable -> L24
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L24
        L14:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L22
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L24
            closeWithRuntimeException(r2)     // Catch: java.lang.Throwable -> L24
            goto L14
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r1
        L27:
            java.util.Set<java.io.Closeable> r0 = r3.mCloseables
            if (r0 == 0) goto L49
            java.util.Set<java.io.Closeable> r0 = r3.mCloseables
            monitor-enter(r0)
            java.util.Set<java.io.Closeable> r1 = r3.mCloseables     // Catch: java.lang.Throwable -> L46
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L46
        L34:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L44
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L46
            java.io.Closeable r2 = (java.io.Closeable) r2     // Catch: java.lang.Throwable -> L46
            closeWithRuntimeException(r2)     // Catch: java.lang.Throwable -> L46
            goto L34
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            goto L49
        L46:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            throw r1
        L49:
            r3.onCleared()
            return
    }

    <T> T getTag(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.mBagOfTags
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.mBagOfTags
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r2.mBagOfTags     // Catch: java.lang.Throwable -> L11
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    protected void onCleared() {
            r0 = this;
            return
    }

    <T> T setTagIfAbsent(java.lang.String r4, T r5) {
            r3 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.mBagOfTags
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.mBagOfTags     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L10
            java.util.Map<java.lang.String, java.lang.Object> r2 = r3.mBagOfTags     // Catch: java.lang.Throwable -> L1e
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> L1e
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L15
            r0 = r5
            goto L16
        L15:
            r0 = r1
        L16:
            boolean r2 = r3.mCleared
            if (r2 == 0) goto L1d
            closeWithRuntimeException(r0)
        L1d:
            return r0
        L1e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r1
    }
}
