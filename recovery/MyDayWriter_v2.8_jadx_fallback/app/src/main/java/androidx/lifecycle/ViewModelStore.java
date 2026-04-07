package androidx.lifecycle;

/* JADX INFO: compiled from: ViewModelStore.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0013\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0005H\u0087\u0002J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0007J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0006H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/ViewModelStore;", "", "()V", "map", "", "", "Landroidx/lifecycle/ViewModel;", "clear", "", "get", "key", "keys", "", "put", "viewModel", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ViewModelStore {
    private final java.util.Map<java.lang.String, androidx.lifecycle.ViewModel> map;

    public ViewModelStore() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            r1.map = r0
            return
    }

    public final void clear() {
            r2 = this;
            java.util.Map<java.lang.String, androidx.lifecycle.ViewModel> r0 = r2.map
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.lifecycle.ViewModel r1 = (androidx.lifecycle.ViewModel) r1
            r1.clear()
            goto La
        L1a:
            java.util.Map<java.lang.String, androidx.lifecycle.ViewModel> r0 = r2.map
            r0.clear()
            return
    }

    public final androidx.lifecycle.ViewModel get(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Map<java.lang.String, androidx.lifecycle.ViewModel> r0 = r1.map
            java.lang.Object r0 = r0.get(r2)
            androidx.lifecycle.ViewModel r0 = (androidx.lifecycle.ViewModel) r0
            return r0
    }

    public final java.util.Set<java.lang.String> keys() {
            r2 = this;
            java.util.HashSet r0 = new java.util.HashSet
            java.util.Map<java.lang.String, androidx.lifecycle.ViewModel> r1 = r2.map
            java.util.Set r1 = r1.keySet()
            java.util.Collection r1 = (java.util.Collection) r1
            r0.<init>(r1)
            java.util.Set r0 = (java.util.Set) r0
            return r0
    }

    public final void put(java.lang.String r2, androidx.lifecycle.ViewModel r3) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "viewModel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.Map<java.lang.String, androidx.lifecycle.ViewModel> r0 = r1.map
            java.lang.Object r0 = r0.put(r2, r3)
            androidx.lifecycle.ViewModel r0 = (androidx.lifecycle.ViewModel) r0
            if (r0 == 0) goto L17
            r0.onCleared()
        L17:
            return
    }
}
