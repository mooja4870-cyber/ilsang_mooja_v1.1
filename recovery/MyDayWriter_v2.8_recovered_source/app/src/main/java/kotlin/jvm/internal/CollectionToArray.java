package kotlin.jvm.internal;

/* JADX INFO: compiled from: CollectionToArray.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\t\u0010\f\u001a~\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u000f2\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u00112(\u0010\u0012\u001a$\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0013H\u0082\b¢\u0006\u0002\u0010\u0014\"\u0018\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"EMPTY", "", "", "[Ljava/lang/Object;", "MAX_SIZE", "", "collectionToArray", "collection", "", "toArray", "(Ljava/util/Collection;)[Ljava/lang/Object;", "a", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "toArrayImpl", "empty", "Lkotlin/Function0;", "alloc", "Lkotlin/Function1;", "trim", "Lkotlin/Function2;", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)[Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CollectionToArray {
    private static final java.lang.Object[] EMPTY = null;
    private static final int MAX_SIZE = 2147483645;

    static {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            kotlin.jvm.internal.CollectionToArray.EMPTY = r0
            return
    }

    @kotlin.Deprecated(message = "This function will be made internal in a future release")
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.9")
    public static final java.lang.Object[] toArray(java.util.Collection<?> r10) {
            java.lang.String r0 = "collection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            int r1 = r10.size()
            if (r1 != 0) goto L10
            r2 = 0
            java.lang.Object[] r2 = kotlin.jvm.internal.CollectionToArray.EMPTY
            goto L6d
        L10:
            java.util.Iterator r2 = r10.iterator()
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L1f
            r3 = 0
            java.lang.Object[] r3 = kotlin.jvm.internal.CollectionToArray.EMPTY
            r2 = r3
            goto L6d
        L1f:
            r3 = r1
            r4 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
        L25:
            int r5 = r4 + 1
            java.lang.Object r6 = r2.next()
            r3[r4] = r6
            int r4 = r3.length
            java.lang.String r6 = "copyOf(...)"
            if (r5 < r4) goto L5c
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L3b
            r2 = r3
            goto L6d
        L3b:
            int r4 = r5 * 3
            int r4 = r4 + 1
            int r4 = r4 >>> 1
            if (r4 > r5) goto L52
            r7 = 2147483645(0x7ffffffd, float:NaN)
            if (r5 >= r7) goto L4c
            r4 = 2147483645(0x7ffffffd, float:NaN)
            goto L52
        L4c:
            java.lang.OutOfMemoryError r6 = new java.lang.OutOfMemoryError
            r6.<init>()
            throw r6
        L52:
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r3, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            r3 = r7
            r4 = r5
            goto L25
        L5c:
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L6e
            r4 = r3
            r7 = r5
            r8 = 0
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r4, r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r6)
            r2 = r9
        L6d:
            return r2
        L6e:
            r4 = r5
            goto L25
    }

    @kotlin.Deprecated(message = "This function will be made internal in a future release")
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.9")
    public static final java.lang.Object[] toArray(java.util.Collection<?> r10, java.lang.Object[] r11) {
            java.lang.String r0 = "collection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            if (r11 == 0) goto L99
            r0 = 0
            int r1 = r10.size()
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L18
            r4 = 0
            int r5 = r11.length
            if (r5 <= 0) goto L16
            r11[r2] = r3
        L16:
            goto L2a
        L18:
            java.util.Iterator r4 = r10.iterator()
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L2d
            r5 = 0
            int r6 = r11.length
            if (r6 <= 0) goto L28
            r11[r2] = r3
        L28:
        L2a:
            r6 = r11
            goto L96
        L2d:
            r2 = r1
            r5 = 0
            int r6 = r11.length
            if (r2 > r6) goto L34
            r6 = r11
            goto L47
        L34:
            java.lang.Class r6 = r11.getClass()
            java.lang.Class r6 = r6.getComponentType()
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r6, r2)
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r7)
            java.lang.Object[] r6 = (java.lang.Object[]) r6
        L47:
            r2 = 0
        L49:
            int r5 = r2 + 1
            java.lang.Object r7 = r4.next()
            r6[r2] = r7
            int r2 = r6.length
            java.lang.String r7 = "copyOf(...)"
            if (r5 < r2) goto L7f
            boolean r2 = r4.hasNext()
            if (r2 != 0) goto L5e
            goto L96
        L5e:
            int r2 = r5 * 3
            int r2 = r2 + 1
            int r2 = r2 >>> 1
            if (r2 > r5) goto L75
            r8 = 2147483645(0x7ffffffd, float:NaN)
            if (r5 >= r8) goto L6f
            r2 = 2147483645(0x7ffffffd, float:NaN)
            goto L75
        L6f:
            java.lang.OutOfMemoryError r3 = new java.lang.OutOfMemoryError
            r3.<init>()
            throw r3
        L75:
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r6, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            r6 = r8
            r2 = r5
            goto L49
        L7f:
            boolean r2 = r4.hasNext()
            if (r2 != 0) goto L97
            r2 = r6
            r8 = r5
            r9 = 0
            if (r2 != r11) goto L8e
            r11[r8] = r3
            r3 = r11
            goto L95
        L8e:
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r2, r8)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r7)
        L95:
            r6 = r3
        L96:
            return r6
        L97:
            r2 = r5
            goto L49
        L99:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
    }

    private static final java.lang.Object[] toArrayImpl(java.util.Collection<?> r8, kotlin.jvm.functions.Function0<java.lang.Object[]> r9, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Object[]> r10, kotlin.jvm.functions.Function2<? super java.lang.Object[], ? super java.lang.Integer, java.lang.Object[]> r11) {
            r0 = 0
            int r1 = r8.size()
            if (r1 != 0) goto Le
            java.lang.Object r2 = r9.invoke()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            return r2
        Le:
            java.util.Iterator r2 = r8.iterator()
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L1f
            java.lang.Object r3 = r9.invoke()
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            return r3
        L1f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.Object r3 = r10.invoke(r3)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r4 = 0
        L2a:
            int r5 = r4 + 1
            java.lang.Object r6 = r2.next()
            r3[r4] = r6
            int r4 = r3.length
            if (r5 < r4) goto L60
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L3d
            return r3
        L3d:
            int r4 = r5 * 3
            int r4 = r4 + 1
            int r4 = r4 >>> 1
            if (r4 > r5) goto L54
            r6 = 2147483645(0x7ffffffd, float:NaN)
            if (r5 >= r6) goto L4e
            r4 = 2147483645(0x7ffffffd, float:NaN)
            goto L54
        L4e:
            java.lang.OutOfMemoryError r6 = new java.lang.OutOfMemoryError
            r6.<init>()
            throw r6
        L54:
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r3, r4)
            java.lang.String r7 = "copyOf(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r3 = r6
            r4 = r5
            goto L2a
        L60:
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L71
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            java.lang.Object r4 = r11.invoke(r3, r4)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            return r4
        L71:
            r4 = r5
            goto L2a
    }
}
