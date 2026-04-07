package androidx.core.os;

/* JADX INFO: compiled from: PersistableBundle.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\u001a=\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003\"\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0007¢\u0006\u0002\u0010\u0007\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001a\u001a\u0010\b\u001a\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\tH\u0007¨\u0006\n"}, d2 = {"persistableBundleOf", "Landroid/os/PersistableBundle;", "pairs", "", "Lkotlin/Pair;", "", "", "([Lkotlin/Pair;)Landroid/os/PersistableBundle;", "toPersistableBundle", "", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PersistableBundleKt {
    public static final android.os.PersistableBundle persistableBundleOf() {
            r0 = 0
            android.os.PersistableBundle r0 = androidx.core.os.PersistableBundleApi21ImplKt.createPersistableBundle(r0)
            return r0
    }

    public static final android.os.PersistableBundle persistableBundleOf(kotlin.Pair<java.lang.String, ? extends java.lang.Object>... r9) {
            int r0 = r9.length
            android.os.PersistableBundle r0 = androidx.core.os.PersistableBundleApi21ImplKt.createPersistableBundle(r0)
            r1 = r9
            r2 = 0
            int r3 = r1.length
            r4 = 0
        L9:
            if (r4 >= r3) goto L20
            r5 = r1[r4]
            r6 = 0
            java.lang.Object r7 = r5.component1()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r5.component2()
            androidx.core.os.PersistableBundleApi21ImplKt.putValue(r0, r7, r8)
            int r4 = r4 + 1
            goto L9
        L20:
            return r0
    }

    public static final android.os.PersistableBundle toPersistableBundle(java.util.Map<java.lang.String, ? extends java.lang.Object> r4) {
            int r0 = r4.size()
            android.os.PersistableBundle r0 = androidx.core.os.PersistableBundleApi21ImplKt.createPersistableBundle(r0)
            java.util.Set r1 = r4.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L10:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            androidx.core.os.PersistableBundleApi21ImplKt.putValue(r0, r3, r2)
            goto L10
        L2a:
            return r0
    }
}
