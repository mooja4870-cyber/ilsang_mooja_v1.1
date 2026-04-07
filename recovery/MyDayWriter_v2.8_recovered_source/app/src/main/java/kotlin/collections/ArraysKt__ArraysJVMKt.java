package kotlin.collections;

/* JADX INFO: compiled from: ArraysJVM.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¢\u0006\u0002\u0010\u0006\u001a\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a#\u0010\n\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a,\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u0001H\u0086\b¢\u0006\u0002\u0010\u000e\u001a\u0015\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0087\b\u001a&\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u0015H\u0086\b¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"arrayOfNulls", "", "T", "reference", "size", "", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "copyOfRangeToIndexCheck", "", "toIndex", "contentDeepHashCodeImpl", "contentDeepHashCode", "([Ljava/lang/Object;)I", "orEmpty", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toString", "", "", "charset", "Ljava/nio/charset/Charset;", "toTypedArray", "", "(Ljava/util/Collection;)[Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
class ArraysKt__ArraysJVMKt {
    public ArraysKt__ArraysJVMKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final <T> T[] arrayOfNulls(T[] r2, int r3) {
            java.lang.String r0 = "reference"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r0 = r0.getComponentType()
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r3)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            return r0
    }

    public static final <T> int contentDeepHashCode(T[] r1) {
            int r0 = java.util.Arrays.deepHashCode(r1)
            return r0
    }

    public static final void copyOfRangeToIndexCheck(int r3, int r4) {
            if (r3 > r4) goto L3
            return
        L3:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "toIndex ("
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = ") is greater than size ("
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = ")."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final /* synthetic */ <T> T[] orEmpty(T[] r3) {
            r0 = 0
            if (r3 != 0) goto Lc
            java.lang.String r1 = "T"
            r2 = 0
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r2, r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            goto Ld
        Lc:
            r1 = r3
        Ld:
            return r1
    }

    private static final java.lang.String toString(byte[] r1, java.nio.charset.Charset r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2)
            return r0
    }

    public static final /* synthetic */ <T> T[] toTypedArray(java.util.Collection<? extends T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            r1 = r4
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.String r2 = "T?"
            r3 = 0
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r3, r2)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Object[] r2 = r1.toArray(r2)
            return r2
    }
}
