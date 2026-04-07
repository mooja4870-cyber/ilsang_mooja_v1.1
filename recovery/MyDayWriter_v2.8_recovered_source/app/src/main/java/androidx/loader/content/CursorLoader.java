package androidx.loader.content;

/* JADX INFO: loaded from: classes.dex */
public class CursorLoader extends androidx.loader.content.AsyncTaskLoader<android.database.Cursor> {
    androidx.core.os.CancellationSignal mCancellationSignal;
    android.database.Cursor mCursor;
    final androidx.loader.content.Loader<android.database.Cursor>.ForceLoadContentObserver mObserver;
    java.lang.String[] mProjection;
    java.lang.String mSelection;
    java.lang.String[] mSelectionArgs;
    java.lang.String mSortOrder;
    android.net.Uri mUri;

    public CursorLoader(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            androidx.loader.content.Loader$ForceLoadContentObserver r0 = new androidx.loader.content.Loader$ForceLoadContentObserver
            r0.<init>(r1)
            r1.mObserver = r0
            return
    }

    public CursorLoader(android.content.Context r2, android.net.Uri r3, java.lang.String[] r4, java.lang.String r5, java.lang.String[] r6, java.lang.String r7) {
            r1 = this;
            r1.<init>(r2)
            androidx.loader.content.Loader$ForceLoadContentObserver r0 = new androidx.loader.content.Loader$ForceLoadContentObserver
            r0.<init>(r1)
            r1.mObserver = r0
            r1.mUri = r3
            r1.mProjection = r4
            r1.mSelection = r5
            r1.mSelectionArgs = r6
            r1.mSortOrder = r7
            return
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public void cancelLoadInBackground() {
            r1 = this;
            super.cancelLoadInBackground()
            monitor-enter(r1)
            androidx.core.os.CancellationSignal r0 = r1.mCancellationSignal     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto Ld
            androidx.core.os.CancellationSignal r0 = r1.mCancellationSignal     // Catch: java.lang.Throwable -> Lf
            r0.cancel()     // Catch: java.lang.Throwable -> Lf
        Ld:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    public void deliverResult(android.database.Cursor r3) {
            r2 = this;
            boolean r0 = r2.isReset()
            if (r0 == 0) goto Lc
            if (r3 == 0) goto Lb
            r3.close()
        Lb:
            return
        Lc:
            android.database.Cursor r0 = r2.mCursor
            r2.mCursor = r3
            boolean r1 = r2.isStarted()
            if (r1 == 0) goto L19
            super.deliverResult(r3)
        L19:
            if (r0 == 0) goto L26
            if (r0 == r3) goto L26
            boolean r1 = r0.isClosed()
            if (r1 != 0) goto L26
            r0.close()
        L26:
            return
    }

    @Override // androidx.loader.content.Loader
    public /* bridge */ /* synthetic */ void deliverResult(java.lang.Object r1) {
            r0 = this;
            android.database.Cursor r1 = (android.database.Cursor) r1
            r0.deliverResult(r1)
            return
    }

    @Override // androidx.loader.content.AsyncTaskLoader, androidx.loader.content.Loader
    @java.lang.Deprecated
    public void dump(java.lang.String r2, java.io.FileDescriptor r3, java.io.PrintWriter r4, java.lang.String[] r5) {
            r1 = this;
            super.dump(r2, r3, r4, r5)
            r4.print(r2)
            java.lang.String r0 = "mUri="
            r4.print(r0)
            android.net.Uri r0 = r1.mUri
            r4.println(r0)
            r4.print(r2)
            java.lang.String r0 = "mProjection="
            r4.print(r0)
            java.lang.String[] r0 = r1.mProjection
            java.lang.String r0 = java.util.Arrays.toString(r0)
            r4.println(r0)
            r4.print(r2)
            java.lang.String r0 = "mSelection="
            r4.print(r0)
            java.lang.String r0 = r1.mSelection
            r4.println(r0)
            r4.print(r2)
            java.lang.String r0 = "mSelectionArgs="
            r4.print(r0)
            java.lang.String[] r0 = r1.mSelectionArgs
            java.lang.String r0 = java.util.Arrays.toString(r0)
            r4.println(r0)
            r4.print(r2)
            java.lang.String r0 = "mSortOrder="
            r4.print(r0)
            java.lang.String r0 = r1.mSortOrder
            r4.println(r0)
            r4.print(r2)
            java.lang.String r0 = "mCursor="
            r4.print(r0)
            android.database.Cursor r0 = r1.mCursor
            r4.println(r0)
            r4.print(r2)
            java.lang.String r0 = "mContentChanged="
            r4.print(r0)
            boolean r0 = r1.mContentChanged
            r4.println(r0)
            return
    }

    public java.lang.String[] getProjection() {
            r1 = this;
            java.lang.String[] r0 = r1.mProjection
            return r0
    }

    public java.lang.String getSelection() {
            r1 = this;
            java.lang.String r0 = r1.mSelection
            return r0
    }

    public java.lang.String[] getSelectionArgs() {
            r1 = this;
            java.lang.String[] r0 = r1.mSelectionArgs
            return r0
    }

    public java.lang.String getSortOrder() {
            r1 = this;
            java.lang.String r0 = r1.mSortOrder
            return r0
    }

    public android.net.Uri getUri() {
            r1 = this;
            android.net.Uri r0 = r1.mUri
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.loader.content.AsyncTaskLoader
    public android.database.Cursor loadInBackground() {
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.isLoadInBackgroundCanceled()     // Catch: java.lang.Throwable -> L51
            if (r0 != 0) goto L4b
            androidx.core.os.CancellationSignal r0 = new androidx.core.os.CancellationSignal     // Catch: java.lang.Throwable -> L51
            r0.<init>()     // Catch: java.lang.Throwable -> L51
            r9.mCancellationSignal = r0     // Catch: java.lang.Throwable -> L51
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L51
            r1 = 0
            android.content.Context r0 = r9.getContext()     // Catch: java.lang.Throwable -> L42
            android.content.ContentResolver r2 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L42
            android.net.Uri r3 = r9.mUri     // Catch: java.lang.Throwable -> L42
            java.lang.String[] r4 = r9.mProjection     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = r9.mSelection     // Catch: java.lang.Throwable -> L42
            java.lang.String[] r6 = r9.mSelectionArgs     // Catch: java.lang.Throwable -> L42
            java.lang.String r7 = r9.mSortOrder     // Catch: java.lang.Throwable -> L42
            androidx.core.os.CancellationSignal r8 = r9.mCancellationSignal     // Catch: java.lang.Throwable -> L42
            android.database.Cursor r0 = androidx.core.content.ContentResolverCompat.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L42
            r2 = r0
            if (r2 == 0) goto L39
            r2.getCount()     // Catch: java.lang.RuntimeException -> L34 java.lang.Throwable -> L42
            androidx.loader.content.Loader<android.database.Cursor>$ForceLoadContentObserver r0 = r9.mObserver     // Catch: java.lang.RuntimeException -> L34 java.lang.Throwable -> L42
            r2.registerContentObserver(r0)     // Catch: java.lang.RuntimeException -> L34 java.lang.Throwable -> L42
            goto L39
        L34:
            r0 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L42
            throw r0     // Catch: java.lang.Throwable -> L42
        L39:
            monitor-enter(r9)
            r9.mCancellationSignal = r1     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L3f
            return r2
        L3f:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L3f
            throw r0
        L42:
            r0 = move-exception
            monitor-enter(r9)
            r9.mCancellationSignal = r1     // Catch: java.lang.Throwable -> L48
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L48
            throw r0
        L48:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L48
            throw r0
        L4b:
            androidx.core.os.OperationCanceledException r0 = new androidx.core.os.OperationCanceledException     // Catch: java.lang.Throwable -> L51
            r0.<init>()     // Catch: java.lang.Throwable -> L51
            throw r0     // Catch: java.lang.Throwable -> L51
        L51:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L51
            throw r0
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public /* bridge */ /* synthetic */ android.database.Cursor loadInBackground() {
            r1 = this;
            android.database.Cursor r0 = r1.loadInBackground()
            return r0
    }

    /* JADX INFO: renamed from: onCanceled, reason: avoid collision after fix types in other method */
    public void onCanceled2(android.database.Cursor r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            boolean r0 = r2.isClosed()
            if (r0 != 0) goto Lb
            r2.close()
        Lb:
            return
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public /* bridge */ /* synthetic */ void onCanceled(android.database.Cursor r1) {
            r0 = this;
            android.database.Cursor r1 = (android.database.Cursor) r1
            r0.onCanceled2(r1)
            return
    }

    @Override // androidx.loader.content.Loader
    protected void onReset() {
            r1 = this;
            super.onReset()
            r1.onStopLoading()
            android.database.Cursor r0 = r1.mCursor
            if (r0 == 0) goto L17
            android.database.Cursor r0 = r1.mCursor
            boolean r0 = r0.isClosed()
            if (r0 != 0) goto L17
            android.database.Cursor r0 = r1.mCursor
            r0.close()
        L17:
            r0 = 0
            r1.mCursor = r0
            return
    }

    @Override // androidx.loader.content.Loader
    protected void onStartLoading() {
            r1 = this;
            android.database.Cursor r0 = r1.mCursor
            if (r0 == 0) goto L9
            android.database.Cursor r0 = r1.mCursor
            r1.deliverResult(r0)
        L9:
            boolean r0 = r1.takeContentChanged()
            if (r0 != 0) goto L13
            android.database.Cursor r0 = r1.mCursor
            if (r0 != 0) goto L16
        L13:
            r1.forceLoad()
        L16:
            return
    }

    @Override // androidx.loader.content.Loader
    protected void onStopLoading() {
            r0 = this;
            r0.cancelLoad()
            return
    }

    public void setProjection(java.lang.String[] r1) {
            r0 = this;
            r0.mProjection = r1
            return
    }

    public void setSelection(java.lang.String r1) {
            r0 = this;
            r0.mSelection = r1
            return
    }

    public void setSelectionArgs(java.lang.String[] r1) {
            r0 = this;
            r0.mSelectionArgs = r1
            return
    }

    public void setSortOrder(java.lang.String r1) {
            r0 = this;
            r0.mSortOrder = r1
            return
    }

    public void setUri(android.net.Uri r1) {
            r0 = this;
            r0.mUri = r1
            return
    }
}
