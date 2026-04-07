package androidx.core.os;

/* JADX INFO: compiled from: Profiling.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/core/os/ProfilingRequest;", "", "profilingType", "", "params", "Landroid/os/Bundle;", "tag", "", "cancellationSignal", "Landroid/os/CancellationSignal;", "<init>", "(ILandroid/os/Bundle;Ljava/lang/String;Landroid/os/CancellationSignal;)V", "getProfilingType", "()I", "getParams", "()Landroid/os/Bundle;", "getTag", "()Ljava/lang/String;", "getCancellationSignal", "()Landroid/os/CancellationSignal;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProfilingRequest {
    private final android.os.CancellationSignal cancellationSignal;
    private final android.os.Bundle params;
    private final int profilingType;
    private final java.lang.String tag;

    public ProfilingRequest(int r2, android.os.Bundle r3, java.lang.String r4, android.os.CancellationSignal r5) {
            r1 = this;
            java.lang.String r0 = "params"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.profilingType = r2
            r1.params = r3
            r1.tag = r4
            r1.cancellationSignal = r5
            return
    }

    public final android.os.CancellationSignal getCancellationSignal() {
            r1 = this;
            android.os.CancellationSignal r0 = r1.cancellationSignal
            return r0
    }

    public final android.os.Bundle getParams() {
            r1 = this;
            android.os.Bundle r0 = r1.params
            return r0
    }

    public final int getProfilingType() {
            r1 = this;
            int r0 = r1.profilingType
            return r0
    }

    public final java.lang.String getTag() {
            r1 = this;
            java.lang.String r0 = r1.tag
            return r0
    }
}
