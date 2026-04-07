package androidx.core.os;

/* JADX INFO: compiled from: Bundle.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\"\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\rH\u0007¨\u0006\u000e"}, d2 = {"Landroidx/core/os/BundleApi21ImplKt;", "", "<init>", "()V", "putSize", "", "bundle", "Landroid/os/Bundle;", "key", "", "value", "Landroid/util/Size;", "putSizeF", "Landroid/util/SizeF;", "core-ktx_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class BundleApi21ImplKt {
    public static final androidx.core.os.BundleApi21ImplKt INSTANCE = null;

    static {
            androidx.core.os.BundleApi21ImplKt r0 = new androidx.core.os.BundleApi21ImplKt
            r0.<init>()
            androidx.core.os.BundleApi21ImplKt.INSTANCE = r0
            return
    }

    private BundleApi21ImplKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    public static final void putSize(android.os.Bundle r0, java.lang.String r1, android.util.Size r2) {
            r0.putSize(r1, r2)
            return
    }

    @kotlin.jvm.JvmStatic
    public static final void putSizeF(android.os.Bundle r0, java.lang.String r1, android.util.SizeF r2) {
            r0.putSizeF(r1, r2)
            return
    }
}
