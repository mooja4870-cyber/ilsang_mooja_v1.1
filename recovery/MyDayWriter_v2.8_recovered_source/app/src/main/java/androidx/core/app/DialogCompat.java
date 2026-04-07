package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public class DialogCompat {

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static <T> T requireViewById(android.app.Dialog r1, int r2) {
                android.view.View r0 = r1.requireViewById(r2)
                return r0
        }
    }

    private DialogCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.view.View requireViewById(android.app.Dialog r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            java.lang.Object r0 = androidx.core.app.DialogCompat.Api28Impl.requireViewById(r3, r4)
            android.view.View r0 = (android.view.View) r0
            return r0
        Ld:
            android.view.View r0 = r3.findViewById(r4)
            if (r0 == 0) goto L14
            return r0
        L14:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "ID does not reference a View inside this Dialog"
            r1.<init>(r2)
            throw r1
    }
}
