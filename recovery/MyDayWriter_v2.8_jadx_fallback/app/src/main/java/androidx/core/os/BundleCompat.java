package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public final class BundleCompat {

    static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static <T> T getParcelable(android.os.Bundle r1, java.lang.String r2, java.lang.Class<T> r3) {
                java.lang.Object r0 = r1.getParcelable(r2, r3)
                return r0
        }

        static <T> T[] getParcelableArray(android.os.Bundle r1, java.lang.String r2, java.lang.Class<T> r3) {
                java.lang.Object[] r0 = r1.getParcelableArray(r2, r3)
                return r0
        }

        static <T> java.util.ArrayList<T> getParcelableArrayList(android.os.Bundle r1, java.lang.String r2, java.lang.Class<? extends T> r3) {
                java.util.ArrayList r0 = r1.getParcelableArrayList(r2, r3)
                return r0
        }

        static <T extends java.io.Serializable> T getSerializable(android.os.Bundle r1, java.lang.String r2, java.lang.Class<T> r3) {
                java.io.Serializable r0 = r1.getSerializable(r2, r3)
                return r0
        }

        static <T> android.util.SparseArray<T> getSparseParcelableArray(android.os.Bundle r1, java.lang.String r2, java.lang.Class<? extends T> r3) {
                android.util.SparseArray r0 = r1.getSparseParcelableArray(r2, r3)
                return r0
        }
    }

    private BundleCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.ReplaceWith(expression = "bundle.getBinder(key)")
    @java.lang.Deprecated
    public static android.os.IBinder getBinder(android.os.Bundle r1, java.lang.String r2) {
            android.os.IBinder r0 = r1.getBinder(r2)
            return r0
    }

    public static <T> T getParcelable(android.os.Bundle r2, java.lang.String r3, java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.lang.Object r0 = androidx.core.os.BundleCompat.Api33Impl.getParcelable(r2, r3, r4)
            return r0
        Lb:
            android.os.Parcelable r0 = r2.getParcelable(r3)
            boolean r1 = r4.isInstance(r0)
            if (r1 == 0) goto L17
            r1 = r0
            goto L18
        L17:
            r1 = 0
        L18:
            return r1
    }

    public static android.os.Parcelable[] getParcelableArray(android.os.Bundle r2, java.lang.String r3, java.lang.Class<? extends android.os.Parcelable> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Ld
            java.lang.Object[] r0 = androidx.core.os.BundleCompat.Api33Impl.getParcelableArray(r2, r3, r4)
            android.os.Parcelable[] r0 = (android.os.Parcelable[]) r0
            return r0
        Ld:
            android.os.Parcelable[] r0 = r2.getParcelableArray(r3)
            return r0
    }

    public static <T> java.util.ArrayList<T> getParcelableArrayList(android.os.Bundle r2, java.lang.String r3, java.lang.Class<? extends T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.util.ArrayList r0 = androidx.core.os.BundleCompat.Api33Impl.getParcelableArrayList(r2, r3, r4)
            return r0
        Lb:
            java.util.ArrayList r0 = r2.getParcelableArrayList(r3)
            return r0
    }

    public static <T extends java.io.Serializable> T getSerializable(android.os.Bundle r2, java.lang.String r3, java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.io.Serializable r0 = androidx.core.os.BundleCompat.Api33Impl.getSerializable(r2, r3, r4)
            return r0
        Lb:
            java.io.Serializable r0 = r2.getSerializable(r3)
            boolean r1 = r4.isInstance(r0)
            if (r1 == 0) goto L17
            r1 = r0
            goto L18
        L17:
            r1 = 0
        L18:
            return r1
    }

    public static <T> android.util.SparseArray<T> getSparseParcelableArray(android.os.Bundle r2, java.lang.String r3, java.lang.Class<? extends T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            android.util.SparseArray r0 = androidx.core.os.BundleCompat.Api33Impl.getSparseParcelableArray(r2, r3, r4)
            return r0
        Lb:
            android.util.SparseArray r0 = r2.getSparseParcelableArray(r3)
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "bundle.putBinder(key, binder)")
    @java.lang.Deprecated
    public static void putBinder(android.os.Bundle r0, java.lang.String r1, android.os.IBinder r2) {
            r0.putBinder(r1, r2)
            return
    }
}
