package androidx.loader.app;

/* JADX INFO: loaded from: classes.dex */
class LoaderManagerImpl extends androidx.loader.app.LoaderManager {
    static boolean DEBUG = false;
    static final java.lang.String TAG = "LoaderManager";
    private final androidx.lifecycle.LifecycleOwner mLifecycleOwner;
    private final androidx.loader.app.LoaderManagerImpl.LoaderViewModel mLoaderViewModel;

    public static class LoaderInfo<D> extends androidx.lifecycle.MutableLiveData<D> implements androidx.loader.content.Loader.OnLoadCompleteListener<D> {
        private final android.os.Bundle mArgs;
        private final int mId;
        private androidx.lifecycle.LifecycleOwner mLifecycleOwner;
        private final androidx.loader.content.Loader<D> mLoader;
        private androidx.loader.app.LoaderManagerImpl.LoaderObserver<D> mObserver;
        private androidx.loader.content.Loader<D> mPriorLoader;

        LoaderInfo(int r2, android.os.Bundle r3, androidx.loader.content.Loader<D> r4, androidx.loader.content.Loader<D> r5) {
                r1 = this;
                r1.<init>()
                r1.mId = r2
                r1.mArgs = r3
                r1.mLoader = r4
                r1.mPriorLoader = r5
                androidx.loader.content.Loader<D> r0 = r1.mLoader
                r0.registerListener(r2, r1)
                return
        }

        androidx.loader.content.Loader<D> destroy(boolean r3) {
                r2 = this;
                boolean r0 = androidx.loader.app.LoaderManagerImpl.DEBUG
                if (r0 == 0) goto L1c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "  Destroying: "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "LoaderManager"
                android.util.Log.v(r1, r0)
            L1c:
                androidx.loader.content.Loader<D> r0 = r2.mLoader
                r0.cancelLoad()
                androidx.loader.content.Loader<D> r0 = r2.mLoader
                r0.abandon()
                androidx.loader.app.LoaderManagerImpl$LoaderObserver<D> r0 = r2.mObserver
                if (r0 == 0) goto L32
                r2.removeObserver(r0)
                if (r3 == 0) goto L32
                r0.reset()
            L32:
                androidx.loader.content.Loader<D> r1 = r2.mLoader
                r1.unregisterListener(r2)
                if (r0 == 0) goto L3f
                boolean r1 = r0.hasDeliveredData()
                if (r1 == 0) goto L41
            L3f:
                if (r3 == 0) goto L49
            L41:
                androidx.loader.content.Loader<D> r1 = r2.mLoader
                r1.reset()
                androidx.loader.content.Loader<D> r1 = r2.mPriorLoader
                return r1
            L49:
                androidx.loader.content.Loader<D> r1 = r2.mLoader
                return r1
        }

        public void dump(java.lang.String r4, java.io.FileDescriptor r5, java.io.PrintWriter r6, java.lang.String[] r7) {
                r3 = this;
                r6.print(r4)
                java.lang.String r0 = "mId="
                r6.print(r0)
                int r0 = r3.mId
                r6.print(r0)
                java.lang.String r0 = " mArgs="
                r6.print(r0)
                android.os.Bundle r0 = r3.mArgs
                r6.println(r0)
                r6.print(r4)
                java.lang.String r0 = "mLoader="
                r6.print(r0)
                androidx.loader.content.Loader<D> r0 = r3.mLoader
                r6.println(r0)
                androidx.loader.content.Loader<D> r0 = r3.mLoader
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.StringBuilder r1 = r1.append(r4)
                java.lang.String r2 = "  "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.dump(r1, r5, r6, r7)
                androidx.loader.app.LoaderManagerImpl$LoaderObserver<D> r0 = r3.mObserver
                if (r0 == 0) goto L63
                r6.print(r4)
                java.lang.String r0 = "mCallbacks="
                r6.print(r0)
                androidx.loader.app.LoaderManagerImpl$LoaderObserver<D> r0 = r3.mObserver
                r6.println(r0)
                androidx.loader.app.LoaderManagerImpl$LoaderObserver<D> r0 = r3.mObserver
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.StringBuilder r1 = r1.append(r4)
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.dump(r1, r6)
            L63:
                r6.print(r4)
                java.lang.String r0 = "mData="
                r6.print(r0)
                androidx.loader.content.Loader r0 = r3.getLoader()
                java.lang.Object r1 = r3.getValue()
                java.lang.String r0 = r0.dataToString(r1)
                r6.println(r0)
                r6.print(r4)
                java.lang.String r0 = "mStarted="
                r6.print(r0)
                boolean r0 = r3.hasActiveObservers()
                r6.println(r0)
                return
        }

        androidx.loader.content.Loader<D> getLoader() {
                r1 = this;
                androidx.loader.content.Loader<D> r0 = r1.mLoader
                return r0
        }

        boolean isCallbackWaitingForData() {
                r2 = this;
                boolean r0 = r2.hasActiveObservers()
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                androidx.loader.app.LoaderManagerImpl$LoaderObserver<D> r0 = r2.mObserver
                if (r0 == 0) goto L15
                androidx.loader.app.LoaderManagerImpl$LoaderObserver<D> r0 = r2.mObserver
                boolean r0 = r0.hasDeliveredData()
                if (r0 != 0) goto L15
                r1 = 1
            L15:
                return r1
        }

        void markForRedelivery() {
                r2 = this;
                androidx.lifecycle.LifecycleOwner r0 = r2.mLifecycleOwner
                androidx.loader.app.LoaderManagerImpl$LoaderObserver<D> r1 = r2.mObserver
                if (r0 == 0) goto Le
                if (r1 == 0) goto Le
                super.removeObserver(r1)
                r2.observe(r0, r1)
            Le:
                return
        }

        @Override // androidx.lifecycle.LiveData
        protected void onActive() {
                r2 = this;
                boolean r0 = androidx.loader.app.LoaderManagerImpl.DEBUG
                if (r0 == 0) goto L1c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "  Starting: "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "LoaderManager"
                android.util.Log.v(r1, r0)
            L1c:
                androidx.loader.content.Loader<D> r0 = r2.mLoader
                r0.startLoading()
                return
        }

        @Override // androidx.lifecycle.LiveData
        protected void onInactive() {
                r2 = this;
                boolean r0 = androidx.loader.app.LoaderManagerImpl.DEBUG
                if (r0 == 0) goto L1c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "  Stopping: "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "LoaderManager"
                android.util.Log.v(r1, r0)
            L1c:
                androidx.loader.content.Loader<D> r0 = r2.mLoader
                r0.stopLoading()
                return
        }

        @Override // androidx.loader.content.Loader.OnLoadCompleteListener
        public void onLoadComplete(androidx.loader.content.Loader<D> r4, D r5) {
                r3 = this;
                boolean r0 = androidx.loader.app.LoaderManagerImpl.DEBUG
                java.lang.String r1 = "LoaderManager"
                if (r0 == 0) goto L1c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "onLoadComplete: "
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.StringBuilder r0 = r0.append(r3)
                java.lang.String r0 = r0.toString()
                android.util.Log.v(r1, r0)
            L1c:
                android.os.Looper r0 = android.os.Looper.myLooper()
                android.os.Looper r2 = android.os.Looper.getMainLooper()
                if (r0 != r2) goto L2a
                r3.setValue(r5)
                goto L36
            L2a:
                boolean r0 = androidx.loader.app.LoaderManagerImpl.DEBUG
                if (r0 == 0) goto L33
                java.lang.String r0 = "onLoadComplete was incorrectly called on a background thread"
                android.util.Log.w(r1, r0)
            L33:
                r3.postValue(r5)
            L36:
                return
        }

        @Override // androidx.lifecycle.LiveData
        public void removeObserver(androidx.lifecycle.Observer<? super D> r2) {
                r1 = this;
                super.removeObserver(r2)
                r0 = 0
                r1.mLifecycleOwner = r0
                r1.mObserver = r0
                return
        }

        androidx.loader.content.Loader<D> setCallback(androidx.lifecycle.LifecycleOwner r3, androidx.loader.app.LoaderManager.LoaderCallbacks<D> r4) {
                r2 = this;
                androidx.loader.app.LoaderManagerImpl$LoaderObserver r0 = new androidx.loader.app.LoaderManagerImpl$LoaderObserver
                androidx.loader.content.Loader<D> r1 = r2.mLoader
                r0.<init>(r1, r4)
                r2.observe(r3, r0)
                androidx.loader.app.LoaderManagerImpl$LoaderObserver<D> r1 = r2.mObserver
                if (r1 == 0) goto L13
                androidx.loader.app.LoaderManagerImpl$LoaderObserver<D> r1 = r2.mObserver
                r2.removeObserver(r1)
            L13:
                r2.mLifecycleOwner = r3
                r2.mObserver = r0
                androidx.loader.content.Loader<D> r1 = r2.mLoader
                return r1
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(D r2) {
                r1 = this;
                super.setValue(r2)
                androidx.loader.content.Loader<D> r0 = r1.mPriorLoader
                if (r0 == 0) goto Lf
                androidx.loader.content.Loader<D> r0 = r1.mPriorLoader
                r0.reset()
                r0 = 0
                r1.mPriorLoader = r0
            Lf:
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 64
                r0.<init>(r1)
                java.lang.String r1 = "LoaderInfo{"
                r0.append(r1)
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r1 = " #"
                r0.append(r1)
                int r1 = r2.mId
                r0.append(r1)
                java.lang.String r1 = " : "
                r0.append(r1)
                androidx.loader.content.Loader<D> r1 = r2.mLoader
                androidx.core.util.DebugUtils.buildShortClassTag(r1, r0)
                java.lang.String r1 = "}}"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
                return r1
        }
    }

    static class LoaderObserver<D> implements androidx.lifecycle.Observer<D> {
        private final androidx.loader.app.LoaderManager.LoaderCallbacks<D> mCallback;
        private boolean mDeliveredData;
        private final androidx.loader.content.Loader<D> mLoader;

        LoaderObserver(androidx.loader.content.Loader<D> r2, androidx.loader.app.LoaderManager.LoaderCallbacks<D> r3) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mDeliveredData = r0
                r1.mLoader = r2
                r1.mCallback = r3
                return
        }

        public void dump(java.lang.String r2, java.io.PrintWriter r3) {
                r1 = this;
                r3.print(r2)
                java.lang.String r0 = "mDeliveredData="
                r3.print(r0)
                boolean r0 = r1.mDeliveredData
                r3.println(r0)
                return
        }

        boolean hasDeliveredData() {
                r1 = this;
                boolean r0 = r1.mDeliveredData
                return r0
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(D r3) {
                r2 = this;
                boolean r0 = androidx.loader.app.LoaderManagerImpl.DEBUG
                if (r0 == 0) goto L2e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "  onLoadFinished in "
                java.lang.StringBuilder r0 = r0.append(r1)
                androidx.loader.content.Loader<D> r1 = r2.mLoader
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ": "
                java.lang.StringBuilder r0 = r0.append(r1)
                androidx.loader.content.Loader<D> r1 = r2.mLoader
                java.lang.String r1 = r1.dataToString(r3)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "LoaderManager"
                android.util.Log.v(r1, r0)
            L2e:
                androidx.loader.app.LoaderManager$LoaderCallbacks<D> r0 = r2.mCallback
                androidx.loader.content.Loader<D> r1 = r2.mLoader
                r0.onLoadFinished(r1, r3)
                r0 = 1
                r2.mDeliveredData = r0
                return
        }

        void reset() {
                r2 = this;
                boolean r0 = r2.mDeliveredData
                if (r0 == 0) goto L29
                boolean r0 = androidx.loader.app.LoaderManagerImpl.DEBUG
                if (r0 == 0) goto L22
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "  Resetting: "
                java.lang.StringBuilder r0 = r0.append(r1)
                androidx.loader.content.Loader<D> r1 = r2.mLoader
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "LoaderManager"
                android.util.Log.v(r1, r0)
            L22:
                androidx.loader.app.LoaderManager$LoaderCallbacks<D> r0 = r2.mCallback
                androidx.loader.content.Loader<D> r1 = r2.mLoader
                r0.onLoaderReset(r1)
            L29:
                return
        }

        public java.lang.String toString() {
                r1 = this;
                androidx.loader.app.LoaderManager$LoaderCallbacks<D> r0 = r1.mCallback
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static class LoaderViewModel extends androidx.lifecycle.ViewModel {
        private static final androidx.lifecycle.ViewModelProvider.Factory FACTORY = null;
        private boolean mCreatingLoader;
        private androidx.collection.SparseArrayCompat<androidx.loader.app.LoaderManagerImpl.LoaderInfo> mLoaders;


        static {
                androidx.loader.app.LoaderManagerImpl$LoaderViewModel$1 r0 = new androidx.loader.app.LoaderManagerImpl$LoaderViewModel$1
                r0.<init>()
                androidx.loader.app.LoaderManagerImpl.LoaderViewModel.FACTORY = r0
                return
        }

        LoaderViewModel() {
                r1 = this;
                r1.<init>()
                androidx.collection.SparseArrayCompat r0 = new androidx.collection.SparseArrayCompat
                r0.<init>()
                r1.mLoaders = r0
                r0 = 0
                r1.mCreatingLoader = r0
                return
        }

        static androidx.loader.app.LoaderManagerImpl.LoaderViewModel getInstance(androidx.lifecycle.ViewModelStore r2) {
                androidx.lifecycle.ViewModelProvider r0 = new androidx.lifecycle.ViewModelProvider
                androidx.lifecycle.ViewModelProvider$Factory r1 = androidx.loader.app.LoaderManagerImpl.LoaderViewModel.FACTORY
                r0.<init>(r2, r1)
                java.lang.Class<androidx.loader.app.LoaderManagerImpl$LoaderViewModel> r1 = androidx.loader.app.LoaderManagerImpl.LoaderViewModel.class
                androidx.lifecycle.ViewModel r0 = r0.get(r1)
                androidx.loader.app.LoaderManagerImpl$LoaderViewModel r0 = (androidx.loader.app.LoaderManagerImpl.LoaderViewModel) r0
                return r0
        }

        public void dump(java.lang.String r5, java.io.FileDescriptor r6, java.io.PrintWriter r7, java.lang.String[] r8) {
                r4 = this;
                androidx.collection.SparseArrayCompat<androidx.loader.app.LoaderManagerImpl$LoaderInfo> r0 = r4.mLoaders
                int r0 = r0.size()
                if (r0 <= 0) goto L57
                r7.print(r5)
                java.lang.String r0 = "Loaders:"
                r7.println(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.StringBuilder r0 = r0.append(r5)
                java.lang.String r1 = "    "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
            L24:
                androidx.collection.SparseArrayCompat<androidx.loader.app.LoaderManagerImpl$LoaderInfo> r2 = r4.mLoaders
                int r2 = r2.size()
                if (r1 >= r2) goto L57
                androidx.collection.SparseArrayCompat<androidx.loader.app.LoaderManagerImpl$LoaderInfo> r2 = r4.mLoaders
                java.lang.Object r2 = r2.valueAt(r1)
                androidx.loader.app.LoaderManagerImpl$LoaderInfo r2 = (androidx.loader.app.LoaderManagerImpl.LoaderInfo) r2
                r7.print(r5)
                java.lang.String r3 = "  #"
                r7.print(r3)
                androidx.collection.SparseArrayCompat<androidx.loader.app.LoaderManagerImpl$LoaderInfo> r3 = r4.mLoaders
                int r3 = r3.keyAt(r1)
                r7.print(r3)
                java.lang.String r3 = ": "
                r7.print(r3)
                java.lang.String r3 = r2.toString()
                r7.println(r3)
                r2.dump(r0, r6, r7, r8)
                int r1 = r1 + 1
                goto L24
            L57:
                return
        }

        void finishCreatingLoader() {
                r1 = this;
                r0 = 0
                r1.mCreatingLoader = r0
                return
        }

        <D> androidx.loader.app.LoaderManagerImpl.LoaderInfo<D> getLoader(int r2) {
                r1 = this;
                androidx.collection.SparseArrayCompat<androidx.loader.app.LoaderManagerImpl$LoaderInfo> r0 = r1.mLoaders
                java.lang.Object r0 = r0.get(r2)
                androidx.loader.app.LoaderManagerImpl$LoaderInfo r0 = (androidx.loader.app.LoaderManagerImpl.LoaderInfo) r0
                return r0
        }

        boolean hasRunningLoaders() {
                r4 = this;
                androidx.collection.SparseArrayCompat<androidx.loader.app.LoaderManagerImpl$LoaderInfo> r0 = r4.mLoaders
                int r0 = r0.size()
                r1 = 0
            L7:
                if (r1 >= r0) goto L1c
                androidx.collection.SparseArrayCompat<androidx.loader.app.LoaderManagerImpl$LoaderInfo> r2 = r4.mLoaders
                java.lang.Object r2 = r2.valueAt(r1)
                androidx.loader.app.LoaderManagerImpl$LoaderInfo r2 = (androidx.loader.app.LoaderManagerImpl.LoaderInfo) r2
                boolean r3 = r2.isCallbackWaitingForData()
                if (r3 == 0) goto L19
                r3 = 1
                return r3
            L19:
                int r1 = r1 + 1
                goto L7
            L1c:
                r1 = 0
                return r1
        }

        boolean isCreatingLoader() {
                r1 = this;
                boolean r0 = r1.mCreatingLoader
                return r0
        }

        void markForRedelivery() {
                r3 = this;
                androidx.collection.SparseArrayCompat<androidx.loader.app.LoaderManagerImpl$LoaderInfo> r0 = r3.mLoaders
                int r0 = r0.size()
                r1 = 0
            L7:
                if (r1 >= r0) goto L17
                androidx.collection.SparseArrayCompat<androidx.loader.app.LoaderManagerImpl$LoaderInfo> r2 = r3.mLoaders
                java.lang.Object r2 = r2.valueAt(r1)
                androidx.loader.app.LoaderManagerImpl$LoaderInfo r2 = (androidx.loader.app.LoaderManagerImpl.LoaderInfo) r2
                r2.markForRedelivery()
                int r1 = r1 + 1
                goto L7
            L17:
                return
        }

        @Override // androidx.lifecycle.ViewModel
        protected void onCleared() {
                r4 = this;
                super.onCleared()
                androidx.collection.SparseArrayCompat<androidx.loader.app.LoaderManagerImpl$LoaderInfo> r0 = r4.mLoaders
                int r0 = r0.size()
                r1 = 0
            La:
                if (r1 >= r0) goto L1b
                androidx.collection.SparseArrayCompat<androidx.loader.app.LoaderManagerImpl$LoaderInfo> r2 = r4.mLoaders
                java.lang.Object r2 = r2.valueAt(r1)
                androidx.loader.app.LoaderManagerImpl$LoaderInfo r2 = (androidx.loader.app.LoaderManagerImpl.LoaderInfo) r2
                r3 = 1
                r2.destroy(r3)
                int r1 = r1 + 1
                goto La
            L1b:
                androidx.collection.SparseArrayCompat<androidx.loader.app.LoaderManagerImpl$LoaderInfo> r1 = r4.mLoaders
                r1.clear()
                return
        }

        void putLoader(int r2, androidx.loader.app.LoaderManagerImpl.LoaderInfo r3) {
                r1 = this;
                androidx.collection.SparseArrayCompat<androidx.loader.app.LoaderManagerImpl$LoaderInfo> r0 = r1.mLoaders
                r0.put(r2, r3)
                return
        }

        void removeLoader(int r2) {
                r1 = this;
                androidx.collection.SparseArrayCompat<androidx.loader.app.LoaderManagerImpl$LoaderInfo> r0 = r1.mLoaders
                r0.remove(r2)
                return
        }

        void startCreatingLoader() {
                r1 = this;
                r0 = 1
                r1.mCreatingLoader = r0
                return
        }
    }

    static {
            r0 = 0
            androidx.loader.app.LoaderManagerImpl.DEBUG = r0
            return
    }

    LoaderManagerImpl(androidx.lifecycle.LifecycleOwner r2, androidx.lifecycle.ViewModelStore r3) {
            r1 = this;
            r1.<init>()
            r1.mLifecycleOwner = r2
            androidx.loader.app.LoaderManagerImpl$LoaderViewModel r0 = androidx.loader.app.LoaderManagerImpl.LoaderViewModel.getInstance(r3)
            r1.mLoaderViewModel = r0
            return
    }

    private <D> androidx.loader.content.Loader<D> createAndInstallLoader(int r6, android.os.Bundle r7, androidx.loader.app.LoaderManager.LoaderCallbacks<D> r8, androidx.loader.content.Loader<D> r9) {
            r5 = this;
            r0 = 0
            androidx.loader.app.LoaderManagerImpl$LoaderViewModel r1 = r5.mLoaderViewModel     // Catch: java.lang.Throwable -> L7c
            r1.startCreatingLoader()     // Catch: java.lang.Throwable -> L7c
            androidx.loader.content.Loader r1 = r8.onCreateLoader(r6, r7)     // Catch: java.lang.Throwable -> L7c
            if (r1 == 0) goto L74
            java.lang.Class r2 = r1.getClass()     // Catch: java.lang.Throwable -> L7c
            boolean r2 = r2.isMemberClass()     // Catch: java.lang.Throwable -> L7c
            if (r2 == 0) goto L3e
            java.lang.Class r2 = r1.getClass()     // Catch: java.lang.Throwable -> L7c
            int r2 = r2.getModifiers()     // Catch: java.lang.Throwable -> L7c
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)     // Catch: java.lang.Throwable -> L7c
            if (r2 == 0) goto L25
            goto L3e
        L25:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L7c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r3.<init>()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r4 = "Object returned from onCreateLoader must not be a non-static inner member class: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L7c
            java.lang.StringBuilder r3 = r3.append(r1)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L7c
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L7c
            throw r2     // Catch: java.lang.Throwable -> L7c
        L3e:
            androidx.loader.app.LoaderManagerImpl$LoaderInfo r2 = new androidx.loader.app.LoaderManagerImpl$LoaderInfo     // Catch: java.lang.Throwable -> L7c
            r2.<init>(r6, r7, r1, r9)     // Catch: java.lang.Throwable -> L7c
            r0 = r2
            boolean r2 = androidx.loader.app.LoaderManagerImpl.DEBUG     // Catch: java.lang.Throwable -> L72
            if (r2 == 0) goto L60
            java.lang.String r2 = "LoaderManager"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L72
            r3.<init>()     // Catch: java.lang.Throwable -> L72
            java.lang.String r4 = "  Created new loader "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L72
            java.lang.StringBuilder r3 = r3.append(r0)     // Catch: java.lang.Throwable -> L72
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L72
            android.util.Log.v(r2, r3)     // Catch: java.lang.Throwable -> L72
        L60:
            androidx.loader.app.LoaderManagerImpl$LoaderViewModel r2 = r5.mLoaderViewModel     // Catch: java.lang.Throwable -> L72
            r2.putLoader(r6, r0)     // Catch: java.lang.Throwable -> L72
            androidx.loader.app.LoaderManagerImpl$LoaderViewModel r1 = r5.mLoaderViewModel
            r1.finishCreatingLoader()
            androidx.lifecycle.LifecycleOwner r1 = r5.mLifecycleOwner
            androidx.loader.content.Loader r1 = r0.setCallback(r1, r8)
            return r1
        L72:
            r1 = move-exception
            goto L7d
        L74:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = "Object returned from onCreateLoader must not be null"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L7c
            throw r2     // Catch: java.lang.Throwable -> L7c
        L7c:
            r1 = move-exception
        L7d:
            androidx.loader.app.LoaderManagerImpl$LoaderViewModel r2 = r5.mLoaderViewModel
            r2.finishCreatingLoader()
            throw r1
    }

    @Override // androidx.loader.app.LoaderManager
    public void destroyLoader(int r3) {
            r2 = this;
            androidx.loader.app.LoaderManagerImpl$LoaderViewModel r0 = r2.mLoaderViewModel
            boolean r0 = r0.isCreatingLoader()
            if (r0 != 0) goto L52
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r0 != r1) goto L4a
            boolean r0 = androidx.loader.app.LoaderManagerImpl.DEBUG
            if (r0 == 0) goto L38
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "destroyLoader in "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = " of "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "LoaderManager"
            android.util.Log.v(r1, r0)
        L38:
            androidx.loader.app.LoaderManagerImpl$LoaderViewModel r0 = r2.mLoaderViewModel
            androidx.loader.app.LoaderManagerImpl$LoaderInfo r0 = r0.getLoader(r3)
            if (r0 == 0) goto L49
            r1 = 1
            r0.destroy(r1)
            androidx.loader.app.LoaderManagerImpl$LoaderViewModel r1 = r2.mLoaderViewModel
            r1.removeLoader(r3)
        L49:
            return
        L4a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "destroyLoader must be called on the main thread"
            r0.<init>(r1)
            throw r0
        L52:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Called while creating a loader"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.loader.app.LoaderManager
    @java.lang.Deprecated
    public void dump(java.lang.String r2, java.io.FileDescriptor r3, java.io.PrintWriter r4, java.lang.String[] r5) {
            r1 = this;
            androidx.loader.app.LoaderManagerImpl$LoaderViewModel r0 = r1.mLoaderViewModel
            r0.dump(r2, r3, r4, r5)
            return
    }

    @Override // androidx.loader.app.LoaderManager
    public <D> androidx.loader.content.Loader<D> getLoader(int r3) {
            r2 = this;
            androidx.loader.app.LoaderManagerImpl$LoaderViewModel r0 = r2.mLoaderViewModel
            boolean r0 = r0.isCreatingLoader()
            if (r0 != 0) goto L17
            androidx.loader.app.LoaderManagerImpl$LoaderViewModel r0 = r2.mLoaderViewModel
            androidx.loader.app.LoaderManagerImpl$LoaderInfo r0 = r0.getLoader(r3)
            if (r0 == 0) goto L15
            androidx.loader.content.Loader r1 = r0.getLoader()
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Called while creating a loader"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.loader.app.LoaderManager
    public boolean hasRunningLoaders() {
            r1 = this;
            androidx.loader.app.LoaderManagerImpl$LoaderViewModel r0 = r1.mLoaderViewModel
            boolean r0 = r0.hasRunningLoaders()
            return r0
    }

    @Override // androidx.loader.app.LoaderManager
    public <D> androidx.loader.content.Loader<D> initLoader(int r5, android.os.Bundle r6, androidx.loader.app.LoaderManager.LoaderCallbacks<D> r7) {
            r4 = this;
            androidx.loader.app.LoaderManagerImpl$LoaderViewModel r0 = r4.mLoaderViewModel
            boolean r0 = r0.isCreatingLoader()
            if (r0 != 0) goto L6f
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r0 != r1) goto L67
            androidx.loader.app.LoaderManagerImpl$LoaderViewModel r0 = r4.mLoaderViewModel
            androidx.loader.app.LoaderManagerImpl$LoaderInfo r0 = r0.getLoader(r5)
            boolean r1 = androidx.loader.app.LoaderManagerImpl.DEBUG
            java.lang.String r2 = "LoaderManager"
            if (r1 == 0) goto L3e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "initLoader in "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r3 = ": args="
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L3e:
            if (r0 != 0) goto L46
            r1 = 0
            androidx.loader.content.Loader r1 = r4.createAndInstallLoader(r5, r6, r7, r1)
            return r1
        L46:
            boolean r1 = androidx.loader.app.LoaderManagerImpl.DEBUG
            if (r1 == 0) goto L60
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "  Re-using existing loader "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L60:
            androidx.lifecycle.LifecycleOwner r1 = r4.mLifecycleOwner
            androidx.loader.content.Loader r1 = r0.setCallback(r1, r7)
            return r1
        L67:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "initLoader must be called on the main thread"
            r0.<init>(r1)
            throw r0
        L6f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Called while creating a loader"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.loader.app.LoaderManager
    public void markForRedelivery() {
            r1 = this;
            androidx.loader.app.LoaderManagerImpl$LoaderViewModel r0 = r1.mLoaderViewModel
            r0.markForRedelivery()
            return
    }

    @Override // androidx.loader.app.LoaderManager
    public <D> androidx.loader.content.Loader<D> restartLoader(int r4, android.os.Bundle r5, androidx.loader.app.LoaderManager.LoaderCallbacks<D> r6) {
            r3 = this;
            androidx.loader.app.LoaderManagerImpl$LoaderViewModel r0 = r3.mLoaderViewModel
            boolean r0 = r0.isCreatingLoader()
            if (r0 != 0) goto L53
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r0 != r1) goto L4b
            boolean r0 = androidx.loader.app.LoaderManagerImpl.DEBUG
            if (r0 == 0) goto L38
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "restartLoader in "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = ": args="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "LoaderManager"
            android.util.Log.v(r1, r0)
        L38:
            androidx.loader.app.LoaderManagerImpl$LoaderViewModel r0 = r3.mLoaderViewModel
            androidx.loader.app.LoaderManagerImpl$LoaderInfo r0 = r0.getLoader(r4)
            r1 = 0
            if (r0 == 0) goto L46
            r2 = 0
            androidx.loader.content.Loader r1 = r0.destroy(r2)
        L46:
            androidx.loader.content.Loader r2 = r3.createAndInstallLoader(r4, r5, r6, r1)
            return r2
        L4b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "restartLoader must be called on the main thread"
            r0.<init>(r1)
            throw r0
        L53:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Called while creating a loader"
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "LoaderManager{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            androidx.lifecycle.LifecycleOwner r1 = r2.mLifecycleOwner
            androidx.core.util.DebugUtils.buildShortClassTag(r1, r0)
            java.lang.String r1 = "}}"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }
}
