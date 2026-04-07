package androidx.cursoradapter.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class CursorAdapter extends android.widget.BaseAdapter implements android.widget.Filterable, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient {

    @java.lang.Deprecated
    public static final int FLAG_AUTO_REQUERY = 1;
    public static final int FLAG_REGISTER_CONTENT_OBSERVER = 2;
    protected boolean mAutoRequery;
    protected androidx.cursoradapter.widget.CursorAdapter.ChangeObserver mChangeObserver;
    protected android.content.Context mContext;
    protected android.database.Cursor mCursor;
    protected androidx.cursoradapter.widget.CursorFilter mCursorFilter;
    protected android.database.DataSetObserver mDataSetObserver;
    protected boolean mDataValid;
    protected android.widget.FilterQueryProvider mFilterQueryProvider;
    protected int mRowIDColumn;

    private class ChangeObserver extends android.database.ContentObserver {
        final /* synthetic */ androidx.cursoradapter.widget.CursorAdapter this$0;

        ChangeObserver(androidx.cursoradapter.widget.CursorAdapter r1) {
                r0 = this;
                r0.this$0 = r1
                android.os.Handler r1 = new android.os.Handler
                r1.<init>()
                r0.<init>(r1)
                return
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean r2) {
                r1 = this;
                androidx.cursoradapter.widget.CursorAdapter r0 = r1.this$0
                r0.onContentChanged()
                return
        }
    }

    private class MyDataSetObserver extends android.database.DataSetObserver {
        final /* synthetic */ androidx.cursoradapter.widget.CursorAdapter this$0;

        MyDataSetObserver(androidx.cursoradapter.widget.CursorAdapter r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
                r2 = this;
                androidx.cursoradapter.widget.CursorAdapter r0 = r2.this$0
                r1 = 1
                r0.mDataValid = r1
                androidx.cursoradapter.widget.CursorAdapter r0 = r2.this$0
                r0.notifyDataSetChanged()
                return
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
                r2 = this;
                androidx.cursoradapter.widget.CursorAdapter r0 = r2.this$0
                r1 = 0
                r0.mDataValid = r1
                androidx.cursoradapter.widget.CursorAdapter r0 = r2.this$0
                r0.notifyDataSetInvalidated()
                return
        }
    }

    @java.lang.Deprecated
    public CursorAdapter(android.content.Context r2, android.database.Cursor r3) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.init(r2, r3, r0)
            return
    }

    public CursorAdapter(android.content.Context r1, android.database.Cursor r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.init(r1, r2, r3)
            return
    }

    public CursorAdapter(android.content.Context r2, android.database.Cursor r3, boolean r4) {
            r1 = this;
            r1.<init>()
            if (r4 == 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 2
        L8:
            r1.init(r2, r3, r0)
            return
    }

    public abstract void bindView(android.view.View r1, android.content.Context r2, android.database.Cursor r3);

    public void changeCursor(android.database.Cursor r2) {
            r1 = this;
            android.database.Cursor r0 = r1.swapCursor(r2)
            if (r0 == 0) goto L9
            r0.close()
        L9:
            return
    }

    public java.lang.CharSequence convertToString(android.database.Cursor r2) {
            r1 = this;
            if (r2 != 0) goto L5
            java.lang.String r0 = ""
            goto L9
        L5:
            java.lang.String r0 = r2.toString()
        L9:
            return r0
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r1 = this;
            boolean r0 = r1.mDataValid
            if (r0 == 0) goto Lf
            android.database.Cursor r0 = r1.mCursor
            if (r0 == 0) goto Lf
            android.database.Cursor r0 = r1.mCursor
            int r0 = r0.getCount()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    @Override // androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public android.database.Cursor getCursor() {
            r1 = this;
            android.database.Cursor r0 = r1.mCursor
            return r0
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public android.view.View getDropDownView(int r4, android.view.View r5, android.view.ViewGroup r6) {
            r3 = this;
            boolean r0 = r3.mDataValid
            if (r0 == 0) goto L1d
            android.database.Cursor r0 = r3.mCursor
            r0.moveToPosition(r4)
            if (r5 != 0) goto L14
            android.content.Context r0 = r3.mContext
            android.database.Cursor r1 = r3.mCursor
            android.view.View r0 = r3.newDropDownView(r0, r1, r6)
            goto L15
        L14:
            r0 = r5
        L15:
            android.content.Context r1 = r3.mContext
            android.database.Cursor r2 = r3.mCursor
            r3.bindView(r0, r1, r2)
            return r0
        L1d:
            r0 = 0
            return r0
    }

    @Override // android.widget.Filterable
    public android.widget.Filter getFilter() {
            r1 = this;
            androidx.cursoradapter.widget.CursorFilter r0 = r1.mCursorFilter
            if (r0 != 0) goto Lb
            androidx.cursoradapter.widget.CursorFilter r0 = new androidx.cursoradapter.widget.CursorFilter
            r0.<init>(r1)
            r1.mCursorFilter = r0
        Lb:
            androidx.cursoradapter.widget.CursorFilter r0 = r1.mCursorFilter
            return r0
    }

    public android.widget.FilterQueryProvider getFilterQueryProvider() {
            r1 = this;
            android.widget.FilterQueryProvider r0 = r1.mFilterQueryProvider
            return r0
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int r2) {
            r1 = this;
            boolean r0 = r1.mDataValid
            if (r0 == 0) goto L10
            android.database.Cursor r0 = r1.mCursor
            if (r0 == 0) goto L10
            android.database.Cursor r0 = r1.mCursor
            r0.moveToPosition(r2)
            android.database.Cursor r0 = r1.mCursor
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // android.widget.Adapter
    public long getItemId(int r4) {
            r3 = this;
            boolean r0 = r3.mDataValid
            r1 = 0
            if (r0 == 0) goto L1c
            android.database.Cursor r0 = r3.mCursor
            if (r0 == 0) goto L1c
            android.database.Cursor r0 = r3.mCursor
            boolean r0 = r0.moveToPosition(r4)
            if (r0 == 0) goto L1b
            android.database.Cursor r0 = r3.mCursor
            int r1 = r3.mRowIDColumn
            long r0 = r0.getLong(r1)
            return r0
        L1b:
            return r1
        L1c:
            return r1
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r4, android.view.View r5, android.view.ViewGroup r6) {
            r3 = this;
            boolean r0 = r3.mDataValid
            if (r0 == 0) goto L39
            android.database.Cursor r0 = r3.mCursor
            boolean r0 = r0.moveToPosition(r4)
            if (r0 == 0) goto L20
            if (r5 != 0) goto L17
            android.content.Context r0 = r3.mContext
            android.database.Cursor r1 = r3.mCursor
            android.view.View r0 = r3.newView(r0, r1, r6)
            goto L18
        L17:
            r0 = r5
        L18:
            android.content.Context r1 = r3.mContext
            android.database.Cursor r2 = r3.mCursor
            r3.bindView(r0, r1, r2)
            return r0
        L20:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "couldn't move cursor to position "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "this should only be called when the cursor is valid"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
            r1 = this;
            r0 = 1
            return r0
    }

    void init(android.content.Context r4, android.database.Cursor r5, int r6) {
            r3 = this;
            r0 = r6 & 1
            r1 = 0
            r2 = 1
            if (r0 != r2) goto Lb
            r6 = r6 | 2
            r3.mAutoRequery = r2
            goto Ld
        Lb:
            r3.mAutoRequery = r1
        Ld:
            if (r5 == 0) goto L10
            r1 = r2
        L10:
            r3.mCursor = r5
            r3.mDataValid = r1
            r3.mContext = r4
            if (r1 == 0) goto L1f
            java.lang.String r0 = "_id"
            int r0 = r5.getColumnIndexOrThrow(r0)
            goto L20
        L1f:
            r0 = -1
        L20:
            r3.mRowIDColumn = r0
            r0 = r6 & 2
            r2 = 2
            if (r0 != r2) goto L36
            androidx.cursoradapter.widget.CursorAdapter$ChangeObserver r0 = new androidx.cursoradapter.widget.CursorAdapter$ChangeObserver
            r0.<init>(r3)
            r3.mChangeObserver = r0
            androidx.cursoradapter.widget.CursorAdapter$MyDataSetObserver r0 = new androidx.cursoradapter.widget.CursorAdapter$MyDataSetObserver
            r0.<init>(r3)
            r3.mDataSetObserver = r0
            goto L3b
        L36:
            r0 = 0
            r3.mChangeObserver = r0
            r3.mDataSetObserver = r0
        L3b:
            if (r1 == 0) goto L4f
            androidx.cursoradapter.widget.CursorAdapter$ChangeObserver r0 = r3.mChangeObserver
            if (r0 == 0) goto L46
            androidx.cursoradapter.widget.CursorAdapter$ChangeObserver r0 = r3.mChangeObserver
            r5.registerContentObserver(r0)
        L46:
            android.database.DataSetObserver r0 = r3.mDataSetObserver
            if (r0 == 0) goto L4f
            android.database.DataSetObserver r0 = r3.mDataSetObserver
            r5.registerDataSetObserver(r0)
        L4f:
            return
    }

    @java.lang.Deprecated
    protected void init(android.content.Context r2, android.database.Cursor r3, boolean r4) {
            r1 = this;
            if (r4 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 2
        L5:
            r1.init(r2, r3, r0)
            return
    }

    public android.view.View newDropDownView(android.content.Context r2, android.database.Cursor r3, android.view.ViewGroup r4) {
            r1 = this;
            android.view.View r0 = r1.newView(r2, r3, r4)
            return r0
    }

    public abstract android.view.View newView(android.content.Context r1, android.database.Cursor r2, android.view.ViewGroup r3);

    protected void onContentChanged() {
            r1 = this;
            boolean r0 = r1.mAutoRequery
            if (r0 == 0) goto L18
            android.database.Cursor r0 = r1.mCursor
            if (r0 == 0) goto L18
            android.database.Cursor r0 = r1.mCursor
            boolean r0 = r0.isClosed()
            if (r0 != 0) goto L18
            android.database.Cursor r0 = r1.mCursor
            boolean r0 = r0.requery()
            r1.mDataValid = r0
        L18:
            return
    }

    public android.database.Cursor runQueryOnBackgroundThread(java.lang.CharSequence r2) {
            r1 = this;
            android.widget.FilterQueryProvider r0 = r1.mFilterQueryProvider
            if (r0 == 0) goto Lb
            android.widget.FilterQueryProvider r0 = r1.mFilterQueryProvider
            android.database.Cursor r0 = r0.runQuery(r2)
            return r0
        Lb:
            android.database.Cursor r0 = r1.mCursor
            return r0
    }

    public void setFilterQueryProvider(android.widget.FilterQueryProvider r1) {
            r0 = this;
            r0.mFilterQueryProvider = r1
            return
    }

    public android.database.Cursor swapCursor(android.database.Cursor r3) {
            r2 = this;
            android.database.Cursor r0 = r2.mCursor
            if (r3 != r0) goto L6
            r0 = 0
            return r0
        L6:
            android.database.Cursor r0 = r2.mCursor
            if (r0 == 0) goto L1c
            androidx.cursoradapter.widget.CursorAdapter$ChangeObserver r1 = r2.mChangeObserver
            if (r1 == 0) goto L13
            androidx.cursoradapter.widget.CursorAdapter$ChangeObserver r1 = r2.mChangeObserver
            r0.unregisterContentObserver(r1)
        L13:
            android.database.DataSetObserver r1 = r2.mDataSetObserver
            if (r1 == 0) goto L1c
            android.database.DataSetObserver r1 = r2.mDataSetObserver
            r0.unregisterDataSetObserver(r1)
        L1c:
            r2.mCursor = r3
            if (r3 == 0) goto L41
            androidx.cursoradapter.widget.CursorAdapter$ChangeObserver r1 = r2.mChangeObserver
            if (r1 == 0) goto L29
            androidx.cursoradapter.widget.CursorAdapter$ChangeObserver r1 = r2.mChangeObserver
            r3.registerContentObserver(r1)
        L29:
            android.database.DataSetObserver r1 = r2.mDataSetObserver
            if (r1 == 0) goto L32
            android.database.DataSetObserver r1 = r2.mDataSetObserver
            r3.registerDataSetObserver(r1)
        L32:
            java.lang.String r1 = "_id"
            int r1 = r3.getColumnIndexOrThrow(r1)
            r2.mRowIDColumn = r1
            r1 = 1
            r2.mDataValid = r1
            r2.notifyDataSetChanged()
            goto L4a
        L41:
            r1 = -1
            r2.mRowIDColumn = r1
            r1 = 0
            r2.mDataValid = r1
            r2.notifyDataSetInvalidated()
        L4a:
            return r0
    }
}
