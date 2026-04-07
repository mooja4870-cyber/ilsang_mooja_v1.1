package androidx.core.database;

/* JADX INFO: loaded from: classes.dex */
public final class CursorWindowCompat {

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.database.CursorWindow createCursorWindow(java.lang.String r1, long r2) {
                android.database.CursorWindow r0 = new android.database.CursorWindow
                r0.<init>(r1, r2)
                return r0
        }
    }

    private CursorWindowCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.database.CursorWindow create(java.lang.String r2, long r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.database.CursorWindow r0 = androidx.core.database.CursorWindowCompat.Api28Impl.createCursorWindow(r2, r3)
            return r0
        Lb:
            android.database.CursorWindow r0 = new android.database.CursorWindow
            r0.<init>(r2)
            return r0
    }
}
