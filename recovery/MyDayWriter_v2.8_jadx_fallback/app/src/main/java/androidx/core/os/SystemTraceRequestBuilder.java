package androidx.core.os;

/* JADX INFO: compiled from: Profiling.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0015J\b\u0010\u0007\u001a\u00020\bH\u0015J\b\u0010\t\u001a\u00020\u0000H\u0015J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/core/os/SystemTraceRequestBuilder;", "Landroidx/core/os/ProfilingRequestBuilder;", "<init>", "()V", "mParams", "Landroid/os/Bundle;", "getParams", "getProfilingType", "", "getThis", "setBufferSizeKb", "bufferSizeKb", "setDurationMs", "durationMs", "setBufferFillPolicy", "bufferFillPolicy", "Landroidx/core/os/BufferFillPolicy;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SystemTraceRequestBuilder extends androidx.core.os.ProfilingRequestBuilder<androidx.core.os.SystemTraceRequestBuilder> {
    private final android.os.Bundle mParams;

    public SystemTraceRequestBuilder() {
            r1 = this;
            r1.<init>()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.mParams = r0
            return
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    protected android.os.Bundle getParams() {
            r1 = this;
            android.os.Bundle r0 = r1.mParams
            return r0
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    protected int getProfilingType() {
            r1 = this;
            r0 = 4
            return r0
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    public /* bridge */ /* synthetic */ androidx.core.os.ProfilingRequestBuilder getThis() {
            r1 = this;
            androidx.core.os.SystemTraceRequestBuilder r0 = r1.getThis()
            androidx.core.os.ProfilingRequestBuilder r0 = (androidx.core.os.ProfilingRequestBuilder) r0
            return r0
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    protected androidx.core.os.SystemTraceRequestBuilder getThis() {
            r0 = this;
            return r0
    }

    public final androidx.core.os.SystemTraceRequestBuilder setBufferFillPolicy(androidx.core.os.BufferFillPolicy r4) {
            r3 = this;
            java.lang.String r0 = "bufferFillPolicy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.os.Bundle r0 = r3.mParams
            java.lang.String r1 = "KEY_BUFFER_FILL_POLICY"
            int r2 = r4.getValue$core_release()
            r0.putInt(r1, r2)
            return r3
    }

    public final androidx.core.os.SystemTraceRequestBuilder setBufferSizeKb(int r3) {
            r2 = this;
            android.os.Bundle r0 = r2.mParams
            java.lang.String r1 = "KEY_SIZE_KB"
            r0.putInt(r1, r3)
            return r2
    }

    public final androidx.core.os.SystemTraceRequestBuilder setDurationMs(int r3) {
            r2 = this;
            android.os.Bundle r0 = r2.mParams
            java.lang.String r1 = "KEY_DURATION_MS"
            r0.putInt(r1, r3)
            return r2
    }
}
