package androidx.core.util;

/* JADX INFO: compiled from: Range.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u0002H\u0087\f¢\u0006\u0002\u0010\u0005\u001a6\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0007\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010\b\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0087\n\u001a7\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0087\f\u001a(\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0007\u001a(\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\fH\u0007¨\u0006\u000e"}, d2 = {"rangeTo", "Landroid/util/Range;", "T", "", "that", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Landroid/util/Range;", "plus", "value", "(Landroid/util/Range;Ljava/lang/Comparable;)Landroid/util/Range;", "other", "and", "toClosedRange", "Lkotlin/ranges/ClosedRange;", "toRange", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RangeKt {


    public static final <T extends java.lang.Comparable<? super T>> android.util.Range<T> and(android.util.Range<T> r2, android.util.Range<T> r3) {
            r0 = 0
            android.util.Range r1 = r2.intersect(r3)
            return r1
    }

    public static final <T extends java.lang.Comparable<? super T>> android.util.Range<T> plus(android.util.Range<T> r2, android.util.Range<T> r3) {
            r0 = 0
            android.util.Range r1 = r2.extend(r3)
            return r1
    }

    public static final <T extends java.lang.Comparable<? super T>> android.util.Range<T> plus(android.util.Range<T> r2, T r3) {
            r0 = 0
            android.util.Range r1 = r2.extend(r3)
            return r1
    }

    public static final <T extends java.lang.Comparable<? super T>> android.util.Range<T> rangeTo(T r2, T r3) {
            r0 = 0
            android.util.Range r1 = new android.util.Range
            r1.<init>(r2, r3)
            return r1
    }

    public static final <T extends java.lang.Comparable<? super T>> kotlin.ranges.ClosedRange<T> toClosedRange(android.util.Range<T> r1) {
            androidx.core.util.RangeKt$toClosedRange$1 r0 = new androidx.core.util.RangeKt$toClosedRange$1
            r0.<init>(r1)
            kotlin.ranges.ClosedRange r0 = (kotlin.ranges.ClosedRange) r0
            return r0
    }

    public static final <T extends java.lang.Comparable<? super T>> android.util.Range<T> toRange(kotlin.ranges.ClosedRange<T> r3) {
            android.util.Range r0 = new android.util.Range
            java.lang.Comparable r1 = r3.getStart()
            java.lang.Comparable r2 = r3.getEndInclusive()
            r0.<init>(r1, r2)
            return r0
    }
}
