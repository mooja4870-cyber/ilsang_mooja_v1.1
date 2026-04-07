package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public final class ParcelCompat {

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static <T extends android.os.Parcelable> java.util.List<T> readParcelableList(android.os.Parcel r1, java.util.List<T> r2, java.lang.ClassLoader r3) {
                java.util.List r0 = r1.readParcelableList(r2, r3)
                return r0
        }

        static void writeBoolean(android.os.Parcel r0, boolean r1) {
                r0.writeBoolean(r1)
                return
        }
    }

    static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.os.Parcelable.Creator<?> readParcelableCreator(android.os.Parcel r1, java.lang.ClassLoader r2) {
                android.os.Parcelable$Creator r0 = r1.readParcelableCreator(r2)
                return r0
        }
    }

    static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static <T> T[] readArray(android.os.Parcel r1, java.lang.ClassLoader r2, java.lang.Class<T> r3) {
                java.lang.Object[] r0 = r1.readArray(r2, r3)
                return r0
        }

        static <T> java.util.ArrayList<T> readArrayList(android.os.Parcel r1, java.lang.ClassLoader r2, java.lang.Class<? extends T> r3) {
                java.util.ArrayList r0 = r1.readArrayList(r2, r3)
                return r0
        }

        static <V, K> java.util.HashMap<K, V> readHashMap(android.os.Parcel r1, java.lang.ClassLoader r2, java.lang.Class<? extends K> r3, java.lang.Class<? extends V> r4) {
                java.util.HashMap r0 = r1.readHashMap(r2, r3, r4)
                return r0
        }

        static <T> void readList(android.os.Parcel r0, java.util.List<? super T> r1, java.lang.ClassLoader r2, java.lang.Class<T> r3) {
                r0.readList(r1, r2, r3)
                return
        }

        static <K, V> void readMap(android.os.Parcel r0, java.util.Map<? super K, ? super V> r1, java.lang.ClassLoader r2, java.lang.Class<K> r3, java.lang.Class<V> r4) {
                r0.readMap(r1, r2, r3, r4)
                return
        }

        static <T extends android.os.Parcelable> T readParcelable(android.os.Parcel r1, java.lang.ClassLoader r2, java.lang.Class<T> r3) {
                java.lang.Object r0 = r1.readParcelable(r2, r3)
                android.os.Parcelable r0 = (android.os.Parcelable) r0
                return r0
        }

        static <T> T[] readParcelableArray(android.os.Parcel r1, java.lang.ClassLoader r2, java.lang.Class<T> r3) {
                java.lang.Object[] r0 = r1.readParcelableArray(r2, r3)
                return r0
        }

        static <T> android.os.Parcelable.Creator<T> readParcelableCreator(android.os.Parcel r1, java.lang.ClassLoader r2, java.lang.Class<T> r3) {
                android.os.Parcelable$Creator r0 = r1.readParcelableCreator(r2, r3)
                return r0
        }

        static <T> java.util.List<T> readParcelableList(android.os.Parcel r1, java.util.List<T> r2, java.lang.ClassLoader r3, java.lang.Class<T> r4) {
                java.util.List r0 = r1.readParcelableList(r2, r3, r4)
                return r0
        }

        static <T extends java.io.Serializable> T readSerializable(android.os.Parcel r1, java.lang.ClassLoader r2, java.lang.Class<T> r3) {
                java.lang.Object r0 = r1.readSerializable(r2, r3)
                java.io.Serializable r0 = (java.io.Serializable) r0
                return r0
        }

        static <T> android.util.SparseArray<T> readSparseArray(android.os.Parcel r1, java.lang.ClassLoader r2, java.lang.Class<? extends T> r3) {
                android.util.SparseArray r0 = r1.readSparseArray(r2, r3)
                return r0
        }
    }

    private ParcelCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> java.lang.Object[] readArray(android.os.Parcel r2, java.lang.ClassLoader r3, java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.lang.Object[] r0 = androidx.core.os.ParcelCompat.Api33Impl.readArray(r2, r3, r4)
            return r0
        Lb:
            java.lang.Object[] r0 = r2.readArray(r3)
            return r0
    }

    public static <T> java.util.ArrayList<T> readArrayList(android.os.Parcel r2, java.lang.ClassLoader r3, java.lang.Class<? extends T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.util.ArrayList r0 = androidx.core.os.ParcelCompat.Api33Impl.readArrayList(r2, r3, r4)
            return r0
        Lb:
            java.util.ArrayList r0 = r2.readArrayList(r3)
            return r0
    }

    public static boolean readBoolean(android.os.Parcel r1) {
            int r0 = r1.readInt()
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static <K, V> java.util.HashMap<K, V> readHashMap(android.os.Parcel r2, java.lang.ClassLoader r3, java.lang.Class<? extends K> r4, java.lang.Class<? extends V> r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.util.HashMap r0 = androidx.core.os.ParcelCompat.Api33Impl.readHashMap(r2, r3, r4, r5)
            return r0
        Lb:
            java.util.HashMap r0 = r2.readHashMap(r3)
            return r0
    }

    public static <T> void readList(android.os.Parcel r2, java.util.List<? super T> r3, java.lang.ClassLoader r4, java.lang.Class<T> r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto La
            androidx.core.os.ParcelCompat.Api33Impl.readList(r2, r3, r4, r5)
            goto Ld
        La:
            r2.readList(r3, r4)
        Ld:
            return
    }

    public static <K, V> void readMap(android.os.Parcel r2, java.util.Map<? super K, ? super V> r3, java.lang.ClassLoader r4, java.lang.Class<K> r5, java.lang.Class<V> r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto La
            androidx.core.os.ParcelCompat.Api33Impl.readMap(r2, r3, r4, r5, r6)
            goto Ld
        La:
            r2.readMap(r3, r4)
        Ld:
            return
    }

    public static <T extends android.os.Parcelable> T readParcelable(android.os.Parcel r4, java.lang.ClassLoader r5, java.lang.Class<T> r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            android.os.Parcelable r0 = androidx.core.os.ParcelCompat.Api33Impl.readParcelable(r4, r5, r6)
            return r0
        Lb:
            android.os.Parcelable r0 = r4.readParcelable(r5)
            if (r0 == 0) goto L49
            boolean r1 = r6.isInstance(r0)
            if (r1 == 0) goto L18
            goto L49
        L18:
            android.os.BadParcelableException r1 = new android.os.BadParcelableException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Parcelable "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " is not a subclass of required class "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r6.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " provided in the parameter"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L49:
            return r0
    }

    @java.lang.Deprecated
    public static <T> T[] readParcelableArray(android.os.Parcel r7, java.lang.ClassLoader r8, java.lang.Class<T> r9) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.lang.Object[] r0 = androidx.core.os.ParcelCompat.Api33Impl.readParcelableArray(r7, r8, r9)
            return r0
        Lb:
            android.os.Parcelable[] r0 = r7.readParcelableArray(r8)
            java.lang.Class<android.os.Parcelable> r1 = android.os.Parcelable.class
            boolean r1 = r9.isAssignableFrom(r1)
            if (r1 == 0) goto L1b
            r1 = r0
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            return r1
        L1b:
            int r1 = r0.length
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r9, r1)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r2 = 0
        L23:
            int r3 = r0.length
            if (r2 >= r3) goto L60
            r3 = r0[r2]     // Catch: java.lang.ClassCastException -> L32
            java.lang.Object r3 = r9.cast(r3)     // Catch: java.lang.ClassCastException -> L32
            r1[r2] = r3     // Catch: java.lang.ClassCastException -> L32
            int r2 = r2 + 1
            goto L23
        L32:
            r3 = move-exception
            android.os.BadParcelableException r4 = new android.os.BadParcelableException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Parcelable at index "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r6 = " is not a subclass of required class "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = r9.getName()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = " provided in the parameter"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L60:
            return r1
    }

    public static <T> android.os.Parcelable[] readParcelableArrayTyped(android.os.Parcel r2, java.lang.ClassLoader r3, java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Ld
            java.lang.Object[] r0 = androidx.core.os.ParcelCompat.Api33Impl.readParcelableArray(r2, r3, r4)
            android.os.Parcelable[] r0 = (android.os.Parcelable[]) r0
            return r0
        Ld:
            android.os.Parcelable[] r0 = r2.readParcelableArray(r3)
            return r0
    }

    public static <T> android.os.Parcelable.Creator<T> readParcelableCreator(android.os.Parcel r2, java.lang.ClassLoader r3, java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            android.os.Parcelable$Creator r0 = androidx.core.os.ParcelCompat.Api33Impl.readParcelableCreator(r2, r3, r4)
            return r0
        Lb:
            android.os.Parcelable$Creator r0 = androidx.core.os.ParcelCompat.Api30Impl.readParcelableCreator(r2, r3)
            return r0
    }

    public static <T> java.util.List<T> readParcelableList(android.os.Parcel r2, java.util.List<T> r3, java.lang.ClassLoader r4, java.lang.Class<T> r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.util.List r0 = androidx.core.os.ParcelCompat.Api33Impl.readParcelableList(r2, r3, r4, r5)
            return r0
        Lb:
            java.util.List r0 = androidx.core.os.ParcelCompat.Api29Impl.readParcelableList(r2, r3, r4)
            return r0
    }

    public static <T extends java.io.Serializable> T readSerializable(android.os.Parcel r2, java.lang.ClassLoader r3, java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Lb
            java.io.Serializable r0 = androidx.core.os.ParcelCompat.Api33Impl.readSerializable(r2, r3, r4)
            return r0
        Lb:
            java.io.Serializable r0 = r2.readSerializable()
            return r0
    }

    public static <T> android.util.SparseArray<T> readSparseArray(android.os.Parcel r2, java.lang.ClassLoader r3, java.lang.Class<? extends T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            android.util.SparseArray r0 = androidx.core.os.ParcelCompat.Api33Impl.readSparseArray(r2, r3, r4)
            return r0
        Lb:
            android.util.SparseArray r0 = r2.readSparseArray(r3)
            return r0
    }

    public static void writeBoolean(android.os.Parcel r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto La
            androidx.core.os.ParcelCompat.Api29Impl.writeBoolean(r2, r3)
            goto Ld
        La:
            r2.writeInt(r3)
        Ld:
            return
    }
}
