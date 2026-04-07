package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
public class ObjectsCompat {
    private ObjectsCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean equals(java.lang.Object r1, java.lang.Object r2) {
            boolean r0 = java.util.Objects.equals(r1, r2)
            return r0
    }

    public static int hash(java.lang.Object... r1) {
            int r0 = java.util.Objects.hash(r1)
            return r0
    }

    public static int hashCode(java.lang.Object r1) {
            if (r1 == 0) goto L7
            int r0 = r1.hashCode()
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public static <T> T requireNonNull(T r1) {
            if (r1 == 0) goto L3
            return r1
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
    }

    public static <T> T requireNonNull(T r1, java.lang.String r2) {
            if (r1 == 0) goto L3
            return r1
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r2)
            throw r0
    }

    public static java.lang.String toString(java.lang.Object r1, java.lang.String r2) {
            if (r1 == 0) goto L7
            java.lang.String r0 = r1.toString()
            goto L8
        L7:
            r0 = r2
        L8:
            return r0
    }
}
