package kotlinx.coroutines.internal;

import kotlinx.coroutines.internal.Segment;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0004\u0092\u0001\u0004\u0018\u00010\u0003¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/internal/SegmentOrClosed;", "S", "Lkotlinx/coroutines/internal/Segment;", "", "value", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "isClosed", "", "isClosed-impl", "(Ljava/lang/Object;)Z", "segment", "getSegment$annotations", "()V", "getSegment-impl", "(Ljava/lang/Object;)Lkotlinx/coroutines/internal/Segment;", "equals", "other", "equals-impl", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/Object;)I", "toString", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.JvmInline
public final class SegmentOrClosed<S extends kotlinx.coroutines.internal.Segment<S>> {
    private final java.lang.Object value;

    private /* synthetic */ SegmentOrClosed(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlinx.coroutines.internal.SegmentOrClosed m1714boximpl(java.lang.Object r1) {
            kotlinx.coroutines.internal.SegmentOrClosed r0 = new kotlinx.coroutines.internal.SegmentOrClosed
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <S extends kotlinx.coroutines.internal.Segment<S>> java.lang.Object m1715constructorimpl(java.lang.Object r0) {
            return r0
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1716equalsimpl(java.lang.Object r2, java.lang.Object r3) {
            boolean r0 = r3 instanceof kotlinx.coroutines.internal.SegmentOrClosed
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r3
            kotlinx.coroutines.internal.SegmentOrClosed r0 = (kotlinx.coroutines.internal.SegmentOrClosed) r0
            java.lang.Object r0 = r0.m1722unboximpl()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 != 0) goto L14
            return r1
        L14:
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1717equalsimpl0(java.lang.Object r1, java.lang.Object r2) {
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            return r0
    }

    public static /* synthetic */ void getSegment$annotations() {
            return
    }

    /* JADX INFO: renamed from: getSegment-impl, reason: not valid java name */
    public static final S m1718getSegmentimpl(java.lang.Object r2) {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.access$getCLOSED$p()
            if (r2 == r0) goto Lf
            java.lang.String r0 = "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r0)
            r0 = r2
            kotlinx.coroutines.internal.Segment r0 = (kotlinx.coroutines.internal.Segment) r0
            return r0
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Does not contain segment"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1719hashCodeimpl(java.lang.Object r1) {
            if (r1 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            int r0 = r1.hashCode()
        L8:
            return r0
    }

    /* JADX INFO: renamed from: isClosed-impl, reason: not valid java name */
    public static final boolean m1720isClosedimpl(java.lang.Object r1) {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.access$getCLOSED$p()
            if (r1 != r0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m1721toStringimpl(java.lang.Object r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SegmentOrClosed(value="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.value
            boolean r0 = m1716equalsimpl(r0, r2)
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.value
            int r0 = m1719hashCodeimpl(r0)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.Object r0 = r1.value
            java.lang.String r0 = m1721toStringimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ java.lang.Object m1722unboximpl() {
            r1 = this;
            java.lang.Object r0 = r1.value
            return r0
    }
}
