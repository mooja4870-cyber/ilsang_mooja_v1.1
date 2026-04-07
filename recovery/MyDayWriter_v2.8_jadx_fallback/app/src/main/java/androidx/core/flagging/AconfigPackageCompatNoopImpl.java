package androidx.core.flagging;

/* JADX INFO: compiled from: AconfigPackageCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"Landroidx/core/flagging/AconfigPackageCompatNoopImpl;", "Landroidx/core/flagging/AconfigPackageCompat;", "<init>", "()V", "getBooleanFlagValue", "", "flagName", "", "defaultValue", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class AconfigPackageCompatNoopImpl implements androidx.core.flagging.AconfigPackageCompat {
    public AconfigPackageCompatNoopImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.core.flagging.AconfigPackageCompat
    public boolean getBooleanFlagValue(java.lang.String r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "flagName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            return r3
    }
}
