package androidx.core.flagging;

/* JADX INFO: compiled from: AconfigPackageCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/core/flagging/AconfigPackageCompatApi36Impl;", "Landroidx/core/flagging/AconfigPackageCompat;", "aconfigPackageImpl", "Landroid/os/flagging/AconfigPackage;", "<init>", "(Landroid/os/flagging/AconfigPackage;)V", "getBooleanFlagValue", "", "flagName", "", "defaultValue", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class AconfigPackageCompatApi36Impl implements androidx.core.flagging.AconfigPackageCompat {
    private final android.os.flagging.AconfigPackage aconfigPackageImpl;

    public AconfigPackageCompatApi36Impl(android.os.flagging.AconfigPackage r2) {
            r1 = this;
            java.lang.String r0 = "aconfigPackageImpl"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.aconfigPackageImpl = r2
            return
    }

    @Override // androidx.core.flagging.AconfigPackageCompat
    public boolean getBooleanFlagValue(java.lang.String r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "flagName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.os.flagging.AconfigPackage r0 = r1.aconfigPackageImpl
            boolean r0 = r0.getBooleanFlagValue(r2, r3)
            return r0
    }
}
