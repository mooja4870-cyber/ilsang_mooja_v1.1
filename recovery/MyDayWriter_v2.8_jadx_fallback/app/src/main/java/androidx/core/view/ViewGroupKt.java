package androidx.core.view;

/* JADX INFO: compiled from: ViewGroup.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\u0002\u001a\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\n\u001a\r\u0010\u000e\u001a\u00020\u0006*\u00020\u0002H\u0086\b\u001a\r\u0010\u000f\u001a\u00020\u0006*\u00020\u0002H\u0086\b\u001a0\u0010\u0010\u001a\u00020\t*\u00020\u00022!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\t0\u0012H\u0086\b\u001aE\u0010\u0015\u001a\u00020\t*\u00020\u000226\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\t0\u0016H\u0086\b\u001a\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c*\u00020\u0002H\u0086\u0002\u001a\u0017\u0010#\u001a\u00020\t*\u00020$2\b\b\u0001\u0010\u000b\u001a\u00020\u0004H\u0086\b\u001a5\u0010%\u001a\u00020\t*\u00020$2\b\b\u0003\u0010&\u001a\u00020\u00042\b\b\u0003\u0010'\u001a\u00020\u00042\b\b\u0003\u0010(\u001a\u00020\u00042\b\b\u0003\u0010)\u001a\u00020\u0004H\u0086\b\u001a5\u0010*\u001a\u00020\t*\u00020$2\b\b\u0003\u0010+\u001a\u00020\u00042\b\b\u0003\u0010'\u001a\u00020\u00042\b\b\u0003\u0010,\u001a\u00020\u00042\b\b\u0003\u0010)\u001a\u00020\u0004H\u0086\b\"\u0016\u0010\u000b\u001a\u00020\u0004*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0016\u0010\u0017\u001a\u00020\u0018*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u001e*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u001e*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010 ¨\u0006-"}, d2 = {"get", "Landroid/view/View;", "Landroid/view/ViewGroup;", "index", "", "contains", "", "view", "plusAssign", "", "minusAssign", "size", "getSize", "(Landroid/view/ViewGroup;)I", "isEmpty", "isNotEmpty", "forEach", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "forEachIndexed", "Lkotlin/Function2;", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "(Landroid/view/ViewGroup;)Lkotlin/ranges/IntRange;", "iterator", "", "children", "Lkotlin/sequences/Sequence;", "getChildren", "(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;", "descendants", "getDescendants", "setMargins", "Landroid/view/ViewGroup$MarginLayoutParams;", "updateMargins", "left", "top", "right", "bottom", "updateMarginsRelative", "start", "end", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ViewGroupKt {

    /* JADX INFO: renamed from: androidx.core.view.ViewGroupKt$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: ViewGroup.kt */
    @kotlin.Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"androidx/core/view/ViewGroupKt$iterator$1", "", "Landroid/view/View;", "index", "", "hasNext", "", "next", "remove", "", "core-ktx_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 implements java.util.Iterator<android.view.View>, kotlin.jvm.internal.markers.KMutableIterator {
        final /* synthetic */ android.view.ViewGroup $this_iterator;
        private int index;

        AnonymousClass1(android.view.ViewGroup r1) {
                r0 = this;
                r0.$this_iterator = r1
                r0.<init>()
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.index
                android.view.ViewGroup r1 = r2.$this_iterator
                int r1 = r1.getChildCount()
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public android.view.View next() {
                r3 = this;
                android.view.ViewGroup r0 = r3.$this_iterator
                int r1 = r3.index
                int r2 = r1 + 1
                r3.index = r2
                android.view.View r0 = r0.getChildAt(r1)
                if (r0 == 0) goto Lf
                return r0
            Lf:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ android.view.View next() {
                r1 = this;
                android.view.View r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                android.view.ViewGroup r0 = r2.$this_iterator
                int r1 = r2.index
                int r1 = r1 + (-1)
                r2.index = r1
                int r1 = r2.index
                r0.removeViewAt(r1)
                return
        }
    }

    public static final boolean contains(android.view.ViewGroup r3, android.view.View r4) {
            r0 = 0
            int r1 = r3.indexOfChild(r4)
            r2 = -1
            if (r1 == r2) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    public static final void forEach(android.view.ViewGroup r4, kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> r5) {
            r0 = 0
            r1 = 0
            int r2 = r4.getChildCount()
        L6:
            if (r1 >= r2) goto L12
            android.view.View r3 = r4.getChildAt(r1)
            r5.invoke(r3)
            int r1 = r1 + 1
            goto L6
        L12:
            return
    }

    public static final void forEachIndexed(android.view.ViewGroup r5, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super android.view.View, kotlin.Unit> r6) {
            r0 = 0
            r1 = 0
            int r2 = r5.getChildCount()
        L6:
            if (r1 >= r2) goto L16
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            android.view.View r4 = r5.getChildAt(r1)
            r6.invoke(r3, r4)
            int r1 = r1 + 1
            goto L6
        L16:
            return
    }

    public static final android.view.View get(android.view.ViewGroup r3, int r4) {
            android.view.View r0 = r3.getChildAt(r4)
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Index: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = ", Size: "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r3.getChildCount()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final kotlin.sequences.Sequence<android.view.View> getChildren(android.view.ViewGroup r1) {
            androidx.core.view.ViewGroupKt$children$1 r0 = new androidx.core.view.ViewGroupKt$children$1
            r0.<init>(r1)
            kotlin.sequences.Sequence r0 = (kotlin.sequences.Sequence) r0
            return r0
    }

    public static final kotlin.sequences.Sequence<android.view.View> getDescendants(android.view.ViewGroup r1) {
            androidx.core.view.ViewGroupKt$special$$inlined$Sequence$1 r0 = new androidx.core.view.ViewGroupKt$special$$inlined$Sequence$1
            r0.<init>(r1)
            kotlin.sequences.Sequence r0 = (kotlin.sequences.Sequence) r0
            return r0
    }

    public static final kotlin.ranges.IntRange getIndices(android.view.ViewGroup r3) {
            r0 = 0
            r1 = 0
            int r2 = r3.getChildCount()
            kotlin.ranges.IntRange r1 = kotlin.ranges.RangesKt.until(r1, r2)
            return r1
    }

    public static final int getSize(android.view.ViewGroup r2) {
            r0 = 0
            int r1 = r2.getChildCount()
            return r1
    }

    public static final boolean isEmpty(android.view.ViewGroup r2) {
            r0 = 0
            int r1 = r2.getChildCount()
            if (r1 != 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    public static final boolean isNotEmpty(android.view.ViewGroup r2) {
            r0 = 0
            int r1 = r2.getChildCount()
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    public static final java.util.Iterator<android.view.View> iterator(android.view.ViewGroup r1) {
            androidx.core.view.ViewGroupKt$iterator$1 r0 = new androidx.core.view.ViewGroupKt$iterator$1
            r0.<init>(r1)
            java.util.Iterator r0 = (java.util.Iterator) r0
            return r0
    }

    public static final void minusAssign(android.view.ViewGroup r1, android.view.View r2) {
            r0 = 0
            r1.removeView(r2)
            return
    }

    public static final void plusAssign(android.view.ViewGroup r1, android.view.View r2) {
            r0 = 0
            r1.addView(r2)
            return
    }

    public static final void setMargins(android.view.ViewGroup.MarginLayoutParams r1, int r2) {
            r0 = 0
            r1.setMargins(r2, r2, r2, r2)
            return
    }

    public static final void updateMargins(android.view.ViewGroup.MarginLayoutParams r1, int r2, int r3, int r4, int r5) {
            r0 = 0
            r1.setMargins(r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ void updateMargins$default(android.view.ViewGroup.MarginLayoutParams r0, int r1, int r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            int r1 = r0.leftMargin
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            int r2 = r0.topMargin
        Lc:
            r6 = r5 & 4
            if (r6 == 0) goto L12
            int r3 = r0.rightMargin
        L12:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            int r4 = r0.bottomMargin
        L18:
            r5 = 0
            r0.setMargins(r1, r2, r3, r4)
            return
    }

    public static final void updateMarginsRelative(android.view.ViewGroup.MarginLayoutParams r1, int r2, int r3, int r4, int r5) {
            r0 = 0
            r1.setMarginStart(r2)
            r1.topMargin = r3
            r1.setMarginEnd(r4)
            r1.bottomMargin = r5
            return
    }

    public static /* synthetic */ void updateMarginsRelative$default(android.view.ViewGroup.MarginLayoutParams r0, int r1, int r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L8
            int r1 = r0.getMarginStart()
        L8:
            r6 = r5 & 2
            if (r6 == 0) goto Le
            int r2 = r0.topMargin
        Le:
            r6 = r5 & 4
            if (r6 == 0) goto L16
            int r3 = r0.getMarginEnd()
        L16:
            r5 = r5 & 8
            if (r5 == 0) goto L1c
            int r4 = r0.bottomMargin
        L1c:
            r5 = 0
            r0.setMarginStart(r1)
            r0.topMargin = r2
            r0.setMarginEnd(r3)
            r0.bottomMargin = r4
            return
    }
}
