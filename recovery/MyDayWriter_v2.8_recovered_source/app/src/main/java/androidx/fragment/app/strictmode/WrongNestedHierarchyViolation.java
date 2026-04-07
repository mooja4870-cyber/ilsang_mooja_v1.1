package androidx.fragment.app.strictmode;

/* JADX INFO: compiled from: WrongNestedHierarchyViolation.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/fragment/app/strictmode/WrongNestedHierarchyViolation;", "Landroidx/fragment/app/strictmode/Violation;", "fragment", "Landroidx/fragment/app/Fragment;", "expectedParentFragment", "containerId", "", "(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;I)V", "getContainerId", "()I", "getExpectedParentFragment", "()Landroidx/fragment/app/Fragment;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WrongNestedHierarchyViolation extends androidx.fragment.app.strictmode.Violation {
    private final int containerId;
    private final androidx.fragment.app.Fragment expectedParentFragment;

    public WrongNestedHierarchyViolation(androidx.fragment.app.Fragment r3, androidx.fragment.app.Fragment r4, int r5) {
            r2 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "expectedParentFragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Attempting to nest fragment "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = " within the view of parent fragment "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = " via container with ID "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r1 = " without using parent's childFragmentManager"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r3, r0)
            r2.expectedParentFragment = r4
            r2.containerId = r5
            return
    }

    public final int getContainerId() {
            r1 = this;
            int r0 = r1.containerId
            return r0
    }

    public final androidx.fragment.app.Fragment getExpectedParentFragment() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.expectedParentFragment
            return r0
    }
}
