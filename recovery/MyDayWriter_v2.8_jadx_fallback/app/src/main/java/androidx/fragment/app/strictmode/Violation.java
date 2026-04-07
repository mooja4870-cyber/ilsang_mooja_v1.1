package androidx.fragment.app.strictmode;

/* JADX INFO: compiled from: Violation.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/fragment/app/strictmode/Violation;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "fragment", "Landroidx/fragment/app/Fragment;", "violationMessage", "", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Violation extends java.lang.RuntimeException {
    private final androidx.fragment.app.Fragment fragment;

    public Violation(androidx.fragment.app.Fragment r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>(r3)
            r1.fragment = r2
            return
    }

    public /* synthetic */ Violation(androidx.fragment.app.Fragment r1, java.lang.String r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    public final androidx.fragment.app.Fragment getFragment() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.fragment
            return r0
    }
}
