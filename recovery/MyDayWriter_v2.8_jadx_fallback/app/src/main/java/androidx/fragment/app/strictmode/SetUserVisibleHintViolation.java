package androidx.fragment.app.strictmode;

/* JADX INFO: compiled from: SetUserVisibleHintViolation.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/fragment/app/strictmode/SetUserVisibleHintViolation;", "Landroidx/fragment/app/strictmode/Violation;", "fragment", "Landroidx/fragment/app/Fragment;", "isVisibleToUser", "", "(Landroidx/fragment/app/Fragment;Z)V", "()Z", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SetUserVisibleHintViolation extends androidx.fragment.app.strictmode.Violation {
    private final boolean isVisibleToUser;

    public SetUserVisibleHintViolation(androidx.fragment.app.Fragment r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Attempting to set user visible hint to "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = " for fragment "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r3, r0)
            r2.isVisibleToUser = r4
            return
    }

    public final boolean isVisibleToUser() {
            r1 = this;
            boolean r0 = r1.isVisibleToUser
            return r0
    }
}
