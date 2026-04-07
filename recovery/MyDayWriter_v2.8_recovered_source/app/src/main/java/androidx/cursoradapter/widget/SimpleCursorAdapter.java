package androidx.cursoradapter.widget;

/* JADX INFO: loaded from: classes.dex */
public class SimpleCursorAdapter extends androidx.cursoradapter.widget.ResourceCursorAdapter {
    private androidx.cursoradapter.widget.SimpleCursorAdapter.CursorToStringConverter mCursorToStringConverter;
    protected int[] mFrom;
    java.lang.String[] mOriginalFrom;
    private int mStringConversionColumn;
    protected int[] mTo;
    private androidx.cursoradapter.widget.SimpleCursorAdapter.ViewBinder mViewBinder;

    public interface CursorToStringConverter {
        java.lang.CharSequence convertToString(android.database.Cursor r1);
    }

    public interface ViewBinder {
        boolean setViewValue(android.view.View r1, android.database.Cursor r2, int r3);
    }

    @java.lang.Deprecated
    public SimpleCursorAdapter(android.content.Context r2, int r3, android.database.Cursor r4, java.lang.String[] r5, int[] r6) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            r0 = -1
            r1.mStringConversionColumn = r0
            r1.mTo = r6
            r1.mOriginalFrom = r5
            r1.findColumns(r4, r5)
            return
    }

    public SimpleCursorAdapter(android.content.Context r2, int r3, android.database.Cursor r4, java.lang.String[] r5, int[] r6, int r7) {
            r1 = this;
            r1.<init>(r2, r3, r4, r7)
            r0 = -1
            r1.mStringConversionColumn = r0
            r1.mTo = r6
            r1.mOriginalFrom = r5
            r1.findColumns(r4, r5)
            return
    }

    private void findColumns(android.database.Cursor r5, java.lang.String[] r6) {
            r4 = this;
            if (r5 == 0) goto L21
            int r0 = r6.length
            int[] r1 = r4.mFrom
            if (r1 == 0) goto Lc
            int[] r1 = r4.mFrom
            int r1 = r1.length
            if (r1 == r0) goto L10
        Lc:
            int[] r1 = new int[r0]
            r4.mFrom = r1
        L10:
            r1 = 0
        L11:
            if (r1 >= r0) goto L20
            int[] r2 = r4.mFrom
            r3 = r6[r1]
            int r3 = r5.getColumnIndexOrThrow(r3)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L11
        L20:
            goto L24
        L21:
            r0 = 0
            r4.mFrom = r0
        L24:
            return
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public void bindView(android.view.View r12, android.content.Context r13, android.database.Cursor r14) {
            r11 = this;
            androidx.cursoradapter.widget.SimpleCursorAdapter$ViewBinder r0 = r11.mViewBinder
            int[] r1 = r11.mTo
            int r1 = r1.length
            int[] r2 = r11.mFrom
            int[] r3 = r11.mTo
            r4 = 0
        La:
            if (r4 >= r1) goto L69
            r5 = r3[r4]
            android.view.View r5 = r12.findViewById(r5)
            if (r5 == 0) goto L66
            r6 = 0
            if (r0 == 0) goto L1d
            r7 = r2[r4]
            boolean r6 = r0.setViewValue(r5, r14, r7)
        L1d:
            if (r6 != 0) goto L66
            r7 = r2[r4]
            java.lang.String r7 = r14.getString(r7)
            if (r7 != 0) goto L29
            java.lang.String r7 = ""
        L29:
            boolean r8 = r5 instanceof android.widget.TextView
            if (r8 == 0) goto L34
            r8 = r5
            android.widget.TextView r8 = (android.widget.TextView) r8
            r11.setViewText(r8, r7)
            goto L66
        L34:
            boolean r8 = r5 instanceof android.widget.ImageView
            if (r8 == 0) goto L3f
            r8 = r5
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r11.setViewImage(r8, r7)
            goto L66
        L3f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.Class r10 = r5.getClass()
            java.lang.String r10 = r10.getName()
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r10 = " is not a "
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r10 = " view that can be bounds by this SimpleCursorAdapter"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L66:
            int r4 = r4 + 1
            goto La
        L69:
            return
    }

    public void changeCursorAndColumns(android.database.Cursor r2, java.lang.String[] r3, int[] r4) {
            r1 = this;
            r1.mOriginalFrom = r3
            r1.mTo = r4
            java.lang.String[] r0 = r1.mOriginalFrom
            r1.findColumns(r2, r0)
            super.changeCursor(r2)
            return
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public java.lang.CharSequence convertToString(android.database.Cursor r3) {
            r2 = this;
            androidx.cursoradapter.widget.SimpleCursorAdapter$CursorToStringConverter r0 = r2.mCursorToStringConverter
            if (r0 == 0) goto Lb
            androidx.cursoradapter.widget.SimpleCursorAdapter$CursorToStringConverter r0 = r2.mCursorToStringConverter
            java.lang.CharSequence r0 = r0.convertToString(r3)
            return r0
        Lb:
            int r0 = r2.mStringConversionColumn
            r1 = -1
            if (r0 <= r1) goto L17
            int r0 = r2.mStringConversionColumn
            java.lang.String r0 = r3.getString(r0)
            return r0
        L17:
            java.lang.CharSequence r0 = super.convertToString(r3)
            return r0
    }

    public androidx.cursoradapter.widget.SimpleCursorAdapter.CursorToStringConverter getCursorToStringConverter() {
            r1 = this;
            androidx.cursoradapter.widget.SimpleCursorAdapter$CursorToStringConverter r0 = r1.mCursorToStringConverter
            return r0
    }

    public int getStringConversionColumn() {
            r1 = this;
            int r0 = r1.mStringConversionColumn
            return r0
    }

    public androidx.cursoradapter.widget.SimpleCursorAdapter.ViewBinder getViewBinder() {
            r1 = this;
            androidx.cursoradapter.widget.SimpleCursorAdapter$ViewBinder r0 = r1.mViewBinder
            return r0
    }

    public void setCursorToStringConverter(androidx.cursoradapter.widget.SimpleCursorAdapter.CursorToStringConverter r1) {
            r0 = this;
            r0.mCursorToStringConverter = r1
            return
    }

    public void setStringConversionColumn(int r1) {
            r0 = this;
            r0.mStringConversionColumn = r1
            return
    }

    public void setViewBinder(androidx.cursoradapter.widget.SimpleCursorAdapter.ViewBinder r1) {
            r0 = this;
            r0.mViewBinder = r1
            return
    }

    public void setViewImage(android.widget.ImageView r3, java.lang.String r4) {
            r2 = this;
            int r0 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L8
            r3.setImageResource(r0)     // Catch: java.lang.NumberFormatException -> L8
            goto L10
        L8:
            r0 = move-exception
            android.net.Uri r1 = android.net.Uri.parse(r4)
            r3.setImageURI(r1)
        L10:
            return
    }

    public void setViewText(android.widget.TextView r1, java.lang.String r2) {
            r0 = this;
            r1.setText(r2)
            return
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public android.database.Cursor swapCursor(android.database.Cursor r2) {
            r1 = this;
            java.lang.String[] r0 = r1.mOriginalFrom
            r1.findColumns(r2, r0)
            android.database.Cursor r0 = super.swapCursor(r2)
            return r0
    }
}
