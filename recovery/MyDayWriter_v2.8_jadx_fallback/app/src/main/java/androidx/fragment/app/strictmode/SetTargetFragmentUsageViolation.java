package androidx.fragment.app.strictmode;

/* JADX INFO: compiled from: SetTargetFragmentUsageViolation.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/fragment/app/strictmode/SetTargetFragmentUsageViolation;", "Landroidx/fragment/app/strictmode/TargetFragmentUsageViolation;", "fragment", "Landroidx/fragment/app/Fragment;", "targetFragment", "requestCode", "", "(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;I)V", "getRequestCode", "()I", "getTargetFragment", "()Landroidx/fragment/app/Fragment;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SetTargetFragmentUsageViolation extends androidx.fragment.app.strictmode.TargetFragmentUsageViolation {
    private final int requestCode;
    private final androidx.fragment.app.Fragment targetFragment;

    public SetTargetFragmentUsageViolation(androidx.fragment.app.Fragment r3, androidx.fragment.app.Fragment r4, int r5) {
            r2 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "targetFragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Attempting to set target fragment "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = " with request code "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r1 = " for fragment "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r3, r0)
            r2.targetFragment = r4
            r2.requestCode = r5
            return
    }

    public final int getRequestCode() {
            r1 = this;
            int r0 = r1.requestCode
            return r0
    }

    public final androidx.fragment.app.Fragment getTargetFragment() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.targetFragment
            return r0
    }
}
