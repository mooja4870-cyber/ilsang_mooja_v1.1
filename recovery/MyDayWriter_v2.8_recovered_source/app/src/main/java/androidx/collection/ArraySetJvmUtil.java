package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
class ArraySetJvmUtil {
    private ArraySetJvmUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static <T> T[] resizeForToArray(T[] r1, int r2) {
            int r0 = r1.length
            if (r0 >= r2) goto L12
            java.lang.Class r0 = r1.getClass()
            java.lang.Class r0 = r0.getComponentType()
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r2)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            return r0
        L12:
            int r0 = r1.length
            if (r0 <= r2) goto L18
            r0 = 0
            r1[r2] = r0
        L18:
            return r1
    }
}
