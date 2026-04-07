package androidx.core.database;

/* JADX INFO: compiled from: Cursor.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\u0007\u001a\u001c\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\n\u001a\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\f\u001a\u001c\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\u000f\u001a\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u0014*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¨\u0006\u0015"}, d2 = {"getBlobOrNull", "", "Landroid/database/Cursor;", "index", "", "getDoubleOrNull", "", "(Landroid/database/Cursor;I)Ljava/lang/Double;", "getFloatOrNull", "", "(Landroid/database/Cursor;I)Ljava/lang/Float;", "getIntOrNull", "(Landroid/database/Cursor;I)Ljava/lang/Integer;", "getLongOrNull", "", "(Landroid/database/Cursor;I)Ljava/lang/Long;", "getShortOrNull", "", "(Landroid/database/Cursor;I)Ljava/lang/Short;", "getStringOrNull", "", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CursorKt {
    public static final byte[] getBlobOrNull(android.database.Cursor r2, int r3) {
            r0 = 0
            boolean r1 = r2.isNull(r3)
            if (r1 == 0) goto L9
            r1 = 0
            goto Ld
        L9:
            byte[] r1 = r2.getBlob(r3)
        Ld:
            return r1
    }

    public static final java.lang.Double getDoubleOrNull(android.database.Cursor r3, int r4) {
            r0 = 0
            boolean r1 = r3.isNull(r4)
            if (r1 == 0) goto L9
            r1 = 0
            goto L11
        L9:
            double r1 = r3.getDouble(r4)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
        L11:
            return r1
    }

    public static final java.lang.Float getFloatOrNull(android.database.Cursor r2, int r3) {
            r0 = 0
            boolean r1 = r2.isNull(r3)
            if (r1 == 0) goto L9
            r1 = 0
            goto L11
        L9:
            float r1 = r2.getFloat(r3)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
        L11:
            return r1
    }

    public static final java.lang.Integer getIntOrNull(android.database.Cursor r2, int r3) {
            r0 = 0
            boolean r1 = r2.isNull(r3)
            if (r1 == 0) goto L9
            r1 = 0
            goto L11
        L9:
            int r1 = r2.getInt(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L11:
            return r1
    }

    public static final java.lang.Long getLongOrNull(android.database.Cursor r3, int r4) {
            r0 = 0
            boolean r1 = r3.isNull(r4)
            if (r1 == 0) goto L9
            r1 = 0
            goto L11
        L9:
            long r1 = r3.getLong(r4)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L11:
            return r1
    }

    public static final java.lang.Short getShortOrNull(android.database.Cursor r2, int r3) {
            r0 = 0
            boolean r1 = r2.isNull(r3)
            if (r1 == 0) goto L9
            r1 = 0
            goto L11
        L9:
            short r1 = r2.getShort(r3)
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
        L11:
            return r1
    }

    public static final java.lang.String getStringOrNull(android.database.Cursor r2, int r3) {
            r0 = 0
            boolean r1 = r2.isNull(r3)
            if (r1 == 0) goto L9
            r1 = 0
            goto Ld
        L9:
            java.lang.String r1 = r2.getString(r3)
        Ld:
            return r1
    }
}
