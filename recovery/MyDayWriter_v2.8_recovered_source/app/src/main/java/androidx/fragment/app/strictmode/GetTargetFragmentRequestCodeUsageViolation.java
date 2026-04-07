package androidx.fragment.app.strictmode;

/* JADX INFO: compiled from: GetTargetFragmentRequestCodeUsageViolation.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/fragment/app/strictmode/GetTargetFragmentRequestCodeUsageViolation;", "Landroidx/fragment/app/strictmode/TargetFragmentUsageViolation;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetTargetFragmentRequestCodeUsageViolation extends androidx.fragment.app.strictmode.TargetFragmentUsageViolation {
    public GetTargetFragmentRequestCodeUsageViolation(androidx.fragment.app.Fragment r3) {
            r2 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Attempting to get target request code from fragment "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r3, r0)
            return
    }
}
