package androidx.cursoradapter.widget;

/* JADX INFO: loaded from: classes.dex */
class CursorFilter extends android.widget.Filter {
    androidx.cursoradapter.widget.CursorFilter.CursorFilterClient mClient;

    interface CursorFilterClient {
        void changeCursor(android.database.Cursor r1);

        java.lang.CharSequence convertToString(android.database.Cursor r1);

        android.database.Cursor getCursor();

        android.database.Cursor runQueryOnBackgroundThread(java.lang.CharSequence r1);
    }

    CursorFilter(androidx.cursoradapter.widget.CursorFilter.CursorFilterClient r1) {
            r0 = this;
            r0.<init>()
            r0.mClient = r1
            return
    }

    @Override // android.widget.Filter
    public java.lang.CharSequence convertResultToString(java.lang.Object r3) {
            r2 = this;
            androidx.cursoradapter.widget.CursorFilter$CursorFilterClient r0 = r2.mClient
            r1 = r3
            android.database.Cursor r1 = (android.database.Cursor) r1
            java.lang.CharSequence r0 = r0.convertToString(r1)
            return r0
    }

    @Override // android.widget.Filter
    protected android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r4) {
            r3 = this;
            androidx.cursoradapter.widget.CursorFilter$CursorFilterClient r0 = r3.mClient
            android.database.Cursor r0 = r0.runQueryOnBackgroundThread(r4)
            android.widget.Filter$FilterResults r1 = new android.widget.Filter$FilterResults
            r1.<init>()
            if (r0 == 0) goto L16
            int r2 = r0.getCount()
            r1.count = r2
            r1.values = r0
            goto L1c
        L16:
            r2 = 0
            r1.count = r2
            r2 = 0
            r1.values = r2
        L1c:
            return r1
    }

    @Override // android.widget.Filter
    protected void publishResults(java.lang.CharSequence r4, android.widget.Filter.FilterResults r5) {
            r3 = this;
            androidx.cursoradapter.widget.CursorFilter$CursorFilterClient r0 = r3.mClient
            android.database.Cursor r0 = r0.getCursor()
            java.lang.Object r1 = r5.values
            if (r1 == 0) goto L17
            java.lang.Object r1 = r5.values
            if (r1 == r0) goto L17
            androidx.cursoradapter.widget.CursorFilter$CursorFilterClient r1 = r3.mClient
            java.lang.Object r2 = r5.values
            android.database.Cursor r2 = (android.database.Cursor) r2
            r1.changeCursor(r2)
        L17:
            return
    }
}
