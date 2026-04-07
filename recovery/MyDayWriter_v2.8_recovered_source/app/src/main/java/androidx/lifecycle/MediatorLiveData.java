package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public class MediatorLiveData<T> extends androidx.lifecycle.MutableLiveData<T> {
    private androidx.arch.core.internal.SafeIterableMap<androidx.lifecycle.LiveData<?>, androidx.lifecycle.MediatorLiveData.Source<?>> mSources;

    private static class Source<V> implements androidx.lifecycle.Observer<V> {
        final androidx.lifecycle.LiveData<V> mLiveData;
        final androidx.lifecycle.Observer<? super V> mObserver;
        int mVersion;

        Source(androidx.lifecycle.LiveData<V> r2, androidx.lifecycle.Observer<? super V> r3) {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.mVersion = r0
                r1.mLiveData = r2
                r1.mObserver = r3
                return
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(V r3) {
                r2 = this;
                int r0 = r2.mVersion
                androidx.lifecycle.LiveData<V> r1 = r2.mLiveData
                int r1 = r1.getVersion()
                if (r0 == r1) goto L17
                androidx.lifecycle.LiveData<V> r0 = r2.mLiveData
                int r0 = r0.getVersion()
                r2.mVersion = r0
                androidx.lifecycle.Observer<? super V> r0 = r2.mObserver
                r0.onChanged(r3)
            L17:
                return
        }

        void plug() {
                r1 = this;
                androidx.lifecycle.LiveData<V> r0 = r1.mLiveData
                r0.observeForever(r1)
                return
        }

        void unplug() {
                r1 = this;
                androidx.lifecycle.LiveData<V> r0 = r1.mLiveData
                r0.removeObserver(r1)
                return
        }
    }

    public MediatorLiveData() {
            r1 = this;
            r1.<init>()
            androidx.arch.core.internal.SafeIterableMap r0 = new androidx.arch.core.internal.SafeIterableMap
            r0.<init>()
            r1.mSources = r0
            return
    }

    public MediatorLiveData(T r2) {
            r1 = this;
            r1.<init>(r2)
            androidx.arch.core.internal.SafeIterableMap r0 = new androidx.arch.core.internal.SafeIterableMap
            r0.<init>()
            r1.mSources = r0
            return
    }

    public <S> void addSource(androidx.lifecycle.LiveData<S> r5, androidx.lifecycle.Observer<? super S> r6) {
            r4 = this;
            if (r5 == 0) goto L2b
            androidx.lifecycle.MediatorLiveData$Source r0 = new androidx.lifecycle.MediatorLiveData$Source
            r0.<init>(r5, r6)
            androidx.arch.core.internal.SafeIterableMap<androidx.lifecycle.LiveData<?>, androidx.lifecycle.MediatorLiveData$Source<?>> r1 = r4.mSources
            java.lang.Object r1 = r1.putIfAbsent(r5, r0)
            androidx.lifecycle.MediatorLiveData$Source r1 = (androidx.lifecycle.MediatorLiveData.Source) r1
            if (r1 == 0) goto L1e
            androidx.lifecycle.Observer<? super V> r2 = r1.mObserver
            if (r2 != r6) goto L16
            goto L1e
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "This source was already added with the different observer"
            r2.<init>(r3)
            throw r2
        L1e:
            if (r1 == 0) goto L21
            return
        L21:
            boolean r2 = r4.hasActiveObservers()
            if (r2 == 0) goto L2a
            r0.plug()
        L2a:
            return
        L2b:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "source cannot be null"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.lifecycle.LiveData
    protected void onActive() {
            r3 = this;
            androidx.arch.core.internal.SafeIterableMap<androidx.lifecycle.LiveData<?>, androidx.lifecycle.MediatorLiveData$Source<?>> r0 = r3.mSources
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            androidx.lifecycle.MediatorLiveData$Source r2 = (androidx.lifecycle.MediatorLiveData.Source) r2
            r2.plug()
            goto L6
        L1c:
            return
    }

    @Override // androidx.lifecycle.LiveData
    protected void onInactive() {
            r3 = this;
            androidx.arch.core.internal.SafeIterableMap<androidx.lifecycle.LiveData<?>, androidx.lifecycle.MediatorLiveData$Source<?>> r0 = r3.mSources
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            androidx.lifecycle.MediatorLiveData$Source r2 = (androidx.lifecycle.MediatorLiveData.Source) r2
            r2.unplug()
            goto L6
        L1c:
            return
    }

    public <S> void removeSource(androidx.lifecycle.LiveData<S> r2) {
            r1 = this;
            androidx.arch.core.internal.SafeIterableMap<androidx.lifecycle.LiveData<?>, androidx.lifecycle.MediatorLiveData$Source<?>> r0 = r1.mSources
            java.lang.Object r0 = r0.remove(r2)
            androidx.lifecycle.MediatorLiveData$Source r0 = (androidx.lifecycle.MediatorLiveData.Source) r0
            if (r0 == 0) goto Ld
            r0.unplug()
        Ld:
            return
    }
}
